package com.dissolucion.indicadoreseconomicos.di

import android.util.Log
import com.dissolucion.indicadoreseconomicos.core.utils.Constants.BASE_URL
import com.dissolucion.indicadoreseconomicos.data.api.IndicadoresApi
import com.dissolucion.indicadoreseconomicos.data.repository.IndicadoresRepositoryImpl
import com.dissolucion.indicadoreseconomicos.doamin.repository.IndicadoresRepository
import com.dissolucion.indicadoreseconomicos.doamin.usecase.GetIndicadoresUseCase
import com.dissolucion.indicadoreseconomicos.doamin.usecase.UseCases
import com.google.gson.Gson
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Protocol
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun getBaseUrl() = BASE_URL

    @Provides
    @Singleton
    fun getGson(): Gson = Gson()
        .newBuilder()
        .serializeNulls()
        .setLenient()
        .create()

    @Provides
    @Singleton
    fun getMoshi(): Moshi = Moshi
        .Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @Provides
    @Singleton
    fun getInterceptor(): Interceptor {
        return Interceptor {
            val request = it.request().newBuilder()
            val actualRequest = request.build()
            it.proceed(actualRequest)
        }
    }

    @Provides
    @Singleton
    fun getOkHttpClient(interceptor: Interceptor): OkHttpClient {
        val httpBuilder = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(50, TimeUnit.SECONDS)

        return httpBuilder
            .protocols(mutableListOf(Protocol.HTTP_1_1))
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(
        okHttpClient: OkHttpClient,
        gson: Gson,
        moshi: Moshi,
        baseUrl: String
    ): Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create(moshi).asLenient())
            .client(okHttpClient)
            .build()
        Log.e("Retrofit", "Retrofit instance created")
        return retrofit
    }

    @Provides
    @Singleton
    fun provideIndicadoresApi(retrofit: Retrofit): IndicadoresApi {
        val result = retrofit.create(IndicadoresApi::class.java)
        Log.e("Retrofit", "IndicadoresApi instance created")
        return result
    }

    @Provides
    @Singleton
    fun provideIndicadoresRepository(indicadoresApi: IndicadoresApi): IndicadoresRepository {
        val result = IndicadoresRepositoryImpl(indicadoresApi)
        Log.e("Retrofit", "IndicadoresRepository instance created")
        return result
    }

    @Provides
    @Singleton
    fun provideIndicadoresUseCase(repository: IndicadoresRepository): UseCases {
        return UseCases(
            GetIndicadoresUseCase(repository)
        )
    }
}

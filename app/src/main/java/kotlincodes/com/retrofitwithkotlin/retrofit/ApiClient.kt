package kotlincodes.com.retrofitwithkotlin.retrofit

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {


    val clientVerification: ApiInterface
        get() {

            val gson = GsonBuilder()
                    .setLenient()
                    .create()
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

            val retrofit = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()

            return retrofit.create(ApiInterface::class.java)

        }

}
package kotlincodes.com.retrofitwithkotlin.retrofit

import kotlincodes.com.retrofitwithkotlin.model.DataModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @GET("photos")
    fun getPhotos(): Call<List<DataModel>>

}
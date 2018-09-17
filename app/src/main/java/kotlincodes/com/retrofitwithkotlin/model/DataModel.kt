package kotlincodes.com.retrofitwithkotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class DataModel(


        @SerializedName("albumId")
        var albumId: kotlin.Int,
        @SerializedName("id")
        var id: kotlin.Int,
        @SerializedName("title")
        val title: String,
        @SerializedName("url")
        val url: String,
        @SerializedName("thumbnailUrl")
        val thumbnailUrl: String)
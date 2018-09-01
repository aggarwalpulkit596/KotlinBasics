package maxx.com.kotlinbasics.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Client  {

    val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val api = retrofit.create(JsonPlaceholderApi::class.java)

}

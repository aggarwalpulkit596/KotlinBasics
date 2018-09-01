package maxx.com.kotlinbasics.API

import java.util.ArrayList

import maxx.com.kotlinbasics.Models.Album
import maxx.com.kotlinbasics.Models.Post
import maxx.com.kotlinbasics.Models.Todo
import maxx.com.kotlinbasics.Models.User
import retrofit2.Call
import retrofit2.http.GET

interface JsonPlaceholderApi {
    @get:GET("/users")
    val users: Call<ArrayList<User>>

    @get:GET("/posts")
    val posts: Call<ArrayList<Post>>

    @get:GET("/albums")
    val albums: Call<ArrayList<Album>>

    @get:GET("/todos")
    val todos: Call<ArrayList<Todo>>
}
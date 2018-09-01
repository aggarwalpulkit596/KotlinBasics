package maxx.com.kotlinbasics.API;

import java.util.ArrayList;

import maxx.com.kotlinbasics.Models.Album;
import maxx.com.kotlinbasics.Models.Post;
import maxx.com.kotlinbasics.Models.Todo;
import maxx.com.kotlinbasics.Models.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderApi {
    @GET("/users")
    Call<ArrayList<User>> getUsers();

    @GET("/posts")
    Call<ArrayList<Post>> getPosts();

    @GET("/albums")
    Call<ArrayList<Album>> getAlbums();

    @GET("/todos")
    Call<ArrayList<Todo>> getTodos();
}
package maxx.com.kotlinbasics.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_post.*
import maxx.com.kotlinbasics.Adapters.PostsAdapter
import maxx.com.kotlinbasics.Models.Post
import maxx.com.kotlinbasics.R

class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        val postsAdapter = PostsAdapter(ArrayList<Post>())

        rvPostsList.layoutManager = LinearLayoutManager(this);
        rvPostsList.adapter = postsAdapter
    }
}

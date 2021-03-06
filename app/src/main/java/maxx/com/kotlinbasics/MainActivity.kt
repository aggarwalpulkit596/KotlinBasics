package maxx.com.kotlinbasics

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import maxx.com.kotlinbasics.Activities.AlbumsActivity
import maxx.com.kotlinbasics.Activities.PostActivity
import maxx.com.kotlinbasics.Activities.TodosActivity
import maxx.com.kotlinbasics.Activities.UsersActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onButtonClickListener = View.OnClickListener { view ->
            var i: Intent? = null
            when (view.id) {
                R.id.btnAlbums -> i = Intent(this@MainActivity, AlbumsActivity::class.java)
                R.id.btnPosts -> i = Intent(this@MainActivity, PostActivity::class.java)
                R.id.btnTodos -> i = Intent(this@MainActivity, TodosActivity::class.java)
                R.id.btnUsers -> i = Intent(this@MainActivity, UsersActivity::class.java)
            }
            startActivity(i)
        }

        btnTodos.setOnClickListener(onButtonClickListener);
        btnAlbums.setOnClickListener(onButtonClickListener);
        btnPosts.setOnClickListener(onButtonClickListener);
        btnUsers.setOnClickListener(onButtonClickListener);
    }
}

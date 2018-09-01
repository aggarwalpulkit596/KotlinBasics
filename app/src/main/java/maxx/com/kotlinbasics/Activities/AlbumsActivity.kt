package maxx.com.kotlinbasics.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_albums.*
import maxx.com.kotlinbasics.Adapters.AlbumsAdapter
import maxx.com.kotlinbasics.Models.Album
import maxx.com.kotlinbasics.R

class AlbumsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_albums)

        val albumsAdapter = AlbumsAdapter(ArrayList<Album>())

        rvAlbumsList.layoutManager = LinearLayoutManager(this);
        rvAlbumsList.adapter = albumsAdapter
    }
}

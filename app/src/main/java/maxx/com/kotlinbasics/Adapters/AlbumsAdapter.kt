package maxx.com.kotlinbasics.Adapters


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_album.view.*
import maxx.com.kotlinbasics.Models.Album
import maxx.com.kotlinbasics.R
import java.util.*



class AlbumsAdapter(private var albums: ArrayList<Album>?) : RecyclerView.Adapter<AlbumsAdapter.AlbumViewHolder>() {

    fun setAlbums(albums: ArrayList<Album>) {
        this.albums = albums
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        return AlbumViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_album, parent, false))
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.bindView(albums!![position])  //!! not null Operator also albums.get(position equivalent)
    }

    override fun getItemCount(): Int {
        return (albums?.size) ?: 0
    }

    inner class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(album: Album?) {
            itemView.tvAlbumTitle.text = album?.title
        }
    }
}

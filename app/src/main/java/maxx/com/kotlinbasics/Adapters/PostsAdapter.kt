package maxx.com.kotlinbasics.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_post.view.*
import maxx.com.kotlinbasics.Models.Post
import maxx.com.kotlinbasics.R
import java.util.ArrayList



class PostsAdapter(private var posts: ArrayList<Post>?) : RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {

    fun setPosts(posts: ArrayList<Post>) {
        this.posts = posts
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_post, parent, false))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bindView(posts!![position])
    }

    override fun getItemCount(): Int {
        return (posts?.size) ?: 0
    }

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(post: Post?) {
            itemView.tvPostTitle.text = post?.title
            itemView.tvPostBody.text = post?.body
        }
    }
}

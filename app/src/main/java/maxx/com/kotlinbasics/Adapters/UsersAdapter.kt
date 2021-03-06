package maxx.com.kotlinbasics.Adapters


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_user.view.*
import maxx.com.kotlinbasics.Models.User
import maxx.com.kotlinbasics.R
import java.util.*

class UsersAdapter(private var users: ArrayList<User>?) : RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {

    fun setUsers(users: ArrayList<User>) {
        this.users = users
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_user, parent, false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindView(users!![position])
    }

    override fun getItemCount(): Int {
        return (users?.size) ?: 0
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindView(user: User) {
            itemView.tvUserPhone.text = user.phone
            itemView.tvUserEmail.text = user.email
            itemView.tvUserUsername.text = user.username
            itemView.tvUserName.text = user.name
        }
    }
}

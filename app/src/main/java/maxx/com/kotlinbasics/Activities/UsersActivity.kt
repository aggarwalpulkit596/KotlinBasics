package maxx.com.kotlinbasics.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_users.*
import maxx.com.kotlinbasics.API.Client
import maxx.com.kotlinbasics.Adapters.UsersAdapter
import maxx.com.kotlinbasics.Models.User
import maxx.com.kotlinbasics.R
import maxx.com.kotlinbasics.Utils.retrofitcallback

class UsersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)

        val usersAdapter = UsersAdapter(ArrayList<User>())

        rvUsersList.layoutManager = LinearLayoutManager(this);
        rvUsersList.adapter = usersAdapter
        Client.api.users.enqueue(retrofitcallback { t, resp ->
            resp?.body()?.let {
                usersAdapter.setUsers(it)

            }

        })
    }
}

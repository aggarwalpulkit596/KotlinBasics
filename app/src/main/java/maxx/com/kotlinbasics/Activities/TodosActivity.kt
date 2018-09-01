package maxx.com.kotlinbasics.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_todos.*
import maxx.com.kotlinbasics.Adapters.TodosAdapter
import maxx.com.kotlinbasics.Models.Todo
import maxx.com.kotlinbasics.R

class TodosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todos)

        val todosAdapter = TodosAdapter(ArrayList<Todo>())

        rvTodosList.layoutManager = LinearLayoutManager(this);
        rvTodosList.adapter = todosAdapter

    }
}

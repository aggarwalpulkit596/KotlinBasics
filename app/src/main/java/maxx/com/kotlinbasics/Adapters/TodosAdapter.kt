package maxx.com.kotlinbasics.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import java.util.ArrayList
import kotlinx.android.synthetic.main.list_item_todo.view.*
import maxx.com.kotlinbasics.Models.Todo
import maxx.com.kotlinbasics.R


class TodosAdapter(private var todos: ArrayList<Todo>?) : RecyclerView.Adapter<TodosAdapter.TodoViewHolder>() {

    fun setTodos(todos: ArrayList<Todo>) {
        this.todos = todos
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_todo, parent, false))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bindView(todos!![position])
    }

    override fun getItemCount(): Int {
        return (todos?.size) ?: 0
    }

    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(todo: Todo) {
            itemView.cbTodoTitle.text = todo.title
            itemView.cbTodoTitle.isChecked = todo.completed
        }
    }
}

package ru.gruzd.databindingresyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewManager = LinearLayoutManager(this)
        viewAdapter = Adapter(listOf(
            Person("kjdfhjds", "21"),
            Person("kjddsffhjds", "212"),
            Person("kjdfhjddsfsds", "213")
        ))

        recyclerView = findViewById<RecyclerView>(R.id.recycler).apply {
            layoutManager = viewManager
            adapter = viewAdapter
            setHasFixedSize(false)

        }


    }
}

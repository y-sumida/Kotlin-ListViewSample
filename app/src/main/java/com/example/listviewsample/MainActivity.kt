package com.example.listviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timezones = TimeZone.getAvailableIDs()

        val adapter = ArrayAdapter<String>(this,
                R.layout.list_timezone_row,
                R.id.timezone,
                timezones)

        timezoneList.adapter = adapter

        timezoneList.setOnItemClickListener { parente, view, position, id ->
            val timezone = adapter.getItem(position)
            Toast.makeText(this, timezone, Toast.LENGTH_SHORT).show()
        }
    }
}

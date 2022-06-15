package com.example.vollydatabaseftechingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.Volley
import com.android.volley.toolbox.JsonArrayRequest as JsonArrayRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textview2:TextView=findViewById(R.id.textview1)
        var jsonarrayrequest: JsonArrayRequest = JsonArrayRequest("https://jackwebsite1248.000webhostapp.com/databaseFetch.php",Response.Listener {
        }, Response.ErrorListener {

        })

        var requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        requestQueue.add(jsonarrayrequest)

    }
}
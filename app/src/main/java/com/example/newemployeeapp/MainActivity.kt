package com.example.newemployeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginevent(view: View) {
        var getCode=findViewById<EditText>(R.id.code)
        var getPass=findViewById<EditText>(R.id.pass)
        Toast.makeText(this,getCode.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPass.text.toString(),Toast.LENGTH_LONG).show()
    }

    fun registerevent(view: View) {}
}
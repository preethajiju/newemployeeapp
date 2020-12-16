package com.example.newemployeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun registerclickevent(view: View) {
        var getName=findViewById<EditText>(R.id.name)
        var getPlace=findViewById<EditText>(R.id.place)
        var getDesig=findViewById<EditText>(R.id.desig)
        var getSal=findViewById<EditText>(R.id.sal)
        var getCode=findViewById<EditText>(R.id.code)
        var getPass=findViewById<EditText>(R.id.pass)
        var getCpass=findViewById<EditText>(R.id.cpass)
        Toast.makeText(this,getName.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPlace.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getDesig.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getSal.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getCode.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPass.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getCpass.text.toString(),Toast.LENGTH_LONG).show()
    }


    fun loginevent(view: View) {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
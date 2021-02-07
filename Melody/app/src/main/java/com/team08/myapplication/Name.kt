package com.team08.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_name.*

var name = "Anonymous"

class Name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        val proceedButton = findViewById<Button>(R.id.ProceedButton)
        if (savedInstanceState != null)
        {
            EnterName.text = savedInstanceState.getString("name")
        }
        proceedButton.setOnClickListener(){
            if (EnterName.text.toString() != "") {
                name = NameHolder.editText?.text.toString()
            }
            val intent = Intent(this, ThemeChange::class.java)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("name", NameHolder.editText?.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            name = savedInstanceState?.getString("name").toString()
        }
        Log.d("NameActivity", savedInstanceState?.getString("name").toString())
    }

    override fun onResume() {
        super.onResume()
        NameHolder.editText?.setText(name)
    }

}
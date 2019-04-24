package com.harris.utsapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clayout.setOnClickListener{
            val intent = Intent(this,constraint::class.java)
            startActivity(intent)
        }
        rlayout.setOnClickListener{
            val intent = Intent (this, relative::class.java)
            startActivity(intent)
        }
        llayout.setOnClickListener{
            val intent = Intent (this, linear::class.java)
            startActivity(intent)
        }
    }
}

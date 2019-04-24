package com.harris.utsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.view.View
import kotlinx.android.synthetic.main.activity_constraint.*
import kotlinx.android.synthetic.main.activity_main.*


class constraint : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)
        take.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        choose.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("content://media/external/images/media/")
            startActivity(intent)
        }
        val nama=intent.getStringExtra("Haris Setyawan")
        val npm=intent.getIntExtra("NPM",16670085)
        tv_data_received.setText("Nama ="+ nama + ",\nNPM ="+npm)
    }
}

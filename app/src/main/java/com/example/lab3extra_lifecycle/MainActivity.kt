package com.example.lab3extra_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate() 1ra Actividad", Toast.LENGTH_SHORT).show()
        Log.d("act", "onCreate() 1da Actividad")

        findViewById<Button>(R.id.btnActivity1).setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart(){
        super.onStart()
        Toast.makeText(this,"onStart() 1ra Actividad", Toast.LENGTH_SHORT).show()
        Log.d("act", "onStart() 1da Actividad")
    }

    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume() 1ra Actividad", Toast.LENGTH_SHORT).show()
        Log.d("act", "onResume() 1da Actividad")
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(this, "onPause() 1ra Actividad", Toast.LENGTH_SHORT).show()
        Log.d("act", "onPause() 1da Actividad")
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(this, "onStop() 1ra Actividad", Toast.LENGTH_SHORT).show()
        Log.d("act", "onStop() 1da Actividad")
    }

    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this, "onDestroy() 1ra Actividad", Toast.LENGTH_SHORT).show()
        Log.d("act", "onDestroy() 1da Actividad")
    }
}
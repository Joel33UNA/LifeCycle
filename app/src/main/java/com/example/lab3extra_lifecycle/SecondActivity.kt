package com.example.lab3extra_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        findViewById<Button>(R.id.btnActivity2).setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onStart(){
        super.onStart()
        Toast.makeText(this,"onStart() 2da Actividad", Toast.LENGTH_SHORT).show()
    }

    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume() 2da Actividad", Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(this, "onPause() 2da Actividad", Toast.LENGTH_SHORT).show()
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(this, "onStop() 2da Actividad", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this, "onDestroy() 2da Actividad", Toast.LENGTH_SHORT).show()
    }
}
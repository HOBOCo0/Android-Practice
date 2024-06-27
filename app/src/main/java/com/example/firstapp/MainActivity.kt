package com.example.firstapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Tag","onCreate running")
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Tag","onStart running")
        Toast.makeText(this,"OnStart()",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Tag","onResume running")
        Toast.makeText(this,"OnResume()",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Tag","onPause running")
        Toast.makeText(this,"OnPause()",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Tag","onStop running")
        Toast.makeText(this,"OnStop()",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Tag","onRestart running")
        Toast.makeText(this,"OnRestart()",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag","onDestroy running")
        Toast.makeText(this,"OnDestroy()",Toast.LENGTH_SHORT).show()
    }
}
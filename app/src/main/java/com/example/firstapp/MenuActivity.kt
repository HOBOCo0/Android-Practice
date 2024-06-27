package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {

    val customMenu = com.example.firstapp.CustomMenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val showPopUp = findViewById<Button>(R.id.button)

        showPopUp.setOnClickListener {
            customMenu.showMenu(this,it)
        }
        val mAlertButton = findViewById<Button>(R.id.button2)


        mAlertButton.setOnClickListener {
            val dialog = AlertDialog.Builder(this)

            dialog.setTitle("Delete File")
            dialog.setMessage(R.string.description)
            dialog.setIcon(R.drawable.baseline_delete_24)

            dialog.setPositiveButton("yes"){dialogInterface,which ->
                Toast.makeText(this,"Clicked yes",Toast.LENGTH_SHORT).show()
            }
            dialog.setNegativeButton("No"){dialogInterface,which->
                Toast.makeText(this,"Clicked No",Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton("Cancle"){dialogInterface,which ->
                Toast.makeText(this,"Clicked Cancle",Toast.LENGTH_SHORT).show()
            }

            val alertDialog:AlertDialog = dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}
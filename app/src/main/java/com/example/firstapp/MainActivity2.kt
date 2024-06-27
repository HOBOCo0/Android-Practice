package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cn.pedant.SweetAlert.SweetAlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1 = findViewById<Button>(R.id.button4)
        val btn2 = findViewById<Button>(R.id.button5)
        val btn3 = findViewById<Button>(R.id.button6)

        btn1.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success SweetAlert")
                .setContentText("This is success SweetAlertDialog Box")
                .show()
        }

        btn2.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error SweetAlert")
                .setContentText("This is success SweetAlertDialog Box")
                .show()
        }
        btn3.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Warning SweetAlert")
                .setContentText("This is success SweetAlertDialog Box")
                .show()
        }
    }
}
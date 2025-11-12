package com.example.mod3demo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.et_name)
        val etAge = findViewById<EditText>(R.id.et_age)
        val button = findViewById<Button>(R.id.btn_save)

        button.setOnClickListener {
            val name: String = etName.text.toString()
            val age = etAge.text.toString()
            Toast.makeText(this, "Bonjour $name, vous avez $age ans !", Toast.LENGTH_LONG).show()
        }

    }
}
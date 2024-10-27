package com.example.davaleba_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.davaleba_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()

    }

    private fun init() {
        binding.apply {
            sendButton.setOnClickListener {

                if (!emailEditText.text.contains("@") || emailEditText.text.toString().isEmpty() || messageEditText.text.toString()
                        .isEmpty()
                ) {
                    Toast.makeText(this@MainActivity, "Error!", Toast.LENGTH_SHORT).show()
                } else {
                    var email = emailEditText.text.toString()
                    var message = messageEditText.text.toString()
                    intent = Intent(this@MainActivity, ResultActivity::class.java)
                    intent.putExtra("email", email)
                    intent.putExtra("message", message)
                    startActivity(intent)
                    finish()
                }
            }

        }
    }

}
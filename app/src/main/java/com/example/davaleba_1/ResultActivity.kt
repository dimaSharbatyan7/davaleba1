package com.example.davaleba_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.davaleba_1.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()

    }

    private fun init() {
        binding.apply {
            val email = intent.getStringExtra("email")
            val message = intent.getStringExtra("message")
            emailTextView.text = email
            messageTextView.text = message

            clearBtn.setOnClickListener {
                emailTextView.text = ""
                messageTextView.text = ""
            }
        }
    }

}
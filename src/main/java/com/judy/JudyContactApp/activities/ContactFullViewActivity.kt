package com.judy.JudyContactApp.activities

import android.os.Build.VERSION_CODES.O
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bishop.JudyContactApp.databinding.ActivityContactFullViewBinding
import com.judy.JudyContactApp.databinding.ActivityContactFullViewBinding

class ContactFullViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactFullViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactFullViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.run {
            idShowFull.text = intent.getIntExtra("id", O).toString()
            NameShowFull.text = intent.getStringExtra("FullName")
            phoneShowFull.text = intent.getStringExtra("phoneNumber").toString()
        }
    }
}


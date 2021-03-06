package com.kr.savephoto2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kr.savephoto2.databinding.ActivitySavePhotoInstructionsBinding

class SavePhotoInstructionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySavePhotoInstructionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavePhotoInstructionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar2.setNavigationOnClickListener {
            finish()
        }
    }
}
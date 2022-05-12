package com.sardorbek.eg1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sardorbek.eg1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        val mediaplayer = MediaPlayer.create(this,R.raw.splashmusic)

        binding.musicstop.setOnClickListener {
            if (!mediaplayer.isLooping)
                mediaplayer.pause()
        }
        binding.cardView2.setOnClickListener {
            startActivity(Intent(this,Eg2::class.java))
           }
            binding.cardView5.setOnClickListener {
                startActivity(Intent(this,Eg5::class.java))
                }
                binding.cardView7.setOnClickListener {
                    startActivity(Intent(this,Eg7::class.java))
        }

    }}
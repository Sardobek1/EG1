package com.sardorbek.eg1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sardorbek.eg1.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val mediaplayer = MediaPlayer.create(this, R.raw.splashmusic)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }


        binding.splashgo.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        binding.splashgo.setOnClickListener {
            if (!mediaplayer.isPlaying())
                mediaplayer.start()
        }
        }



    }

/*pausemusic.setOnClickListener {
    if (!mediaplayer.isPlaying){
        mediaplayer.start()
    pausemusic.setImageResource(R.drawable.ic_baseline_pause_24)
}else {
            mediaplayer.pause()
            pausemusic.setImageResource(R.drawable.ic_baseline_play_arrow_24)

        }

    }*/
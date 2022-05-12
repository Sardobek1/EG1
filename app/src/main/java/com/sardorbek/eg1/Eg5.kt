package com.sardorbek.eg1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.annotation.RequiresApi
import com.sardorbek.eg1.databinding.ActivityEg5Binding

class Eg5 : AppCompatActivity() {
    var isResendable = false
    private lateinit var binding : ActivityEg5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEg5Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
            startTimer()

            binding.timeclock5.setOnClickListener {
                if (isResendable) {
                    startTimer()
                    isResendable = false
                }
            }

        }

        title = "KotlinApp"

    }
    private fun startTimer() {

        val timer = object: CountDownTimer(300000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val seconds = millisUntilFinished / 1000
                binding.timeclock5.text = timeConversion(seconds.toInt())
            }

            @RequiresApi(Build.VERSION_CODES.M)
            override fun onFinish() {
                binding.timeclock5.text = "Resend"
                isResendable = true
                binding.timeclock5.setTextColor(getColor(R.color.purple_500))
            }
        }
        timer.start()


    }

    private fun timeConversion(totalSeconds: Int): String? {
        val MINUTES_IN_AN_HOUR = 60
        val SECONDS_IN_A_MINUTE = 60
        val seconds = totalSeconds % SECONDS_IN_A_MINUTE
        val totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE
        val minutes = totalMinutes % MINUTES_IN_AN_HOUR
        return  "$minutes : $seconds"
    }
}
package com.sardorbek.eg1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView

class Eg2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eg2)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN

        }

        title = "KotlinApp"
    }
   fun startTimeCounter(view: View) {
        val timeclock: TextView = findViewById(R.id.timeclock)
        object : CountDownTimer(50000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val counter = 12000
                timeclock.text = counter.toString()
                val counter = counter ++
            }
            override fun onFinish() {
                timeclock.text = "Finished"
            }
        }.start()
    }
}

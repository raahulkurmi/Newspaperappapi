package com.example.newspaperappapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.newspaperappapi.databinding.ActivitySplashscreenBinding

class splashscreen : AppCompatActivity() {
    private val binding by lazy {
        ActivitySplashscreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        binding.animationView.visibility=View.
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.splashanim)
//        binding.imageView.startAnimation(animation)
binding.animationView.startAnimation(animation)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },4000)
    }
}
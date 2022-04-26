package com.example.android_finding_views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_finding_views.R

import kotlinx.android.synthetic.main.activity_kotlin_synthentics.*

class KotlinSyntheticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_synthentics)
        initViews()
    }

    private fun initViews() {
        b_synthetics.setOnClickListener {
            tv_synthetics.text = "Kotlin Synthetics"
        }
    }
}
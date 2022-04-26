package com.example.android_finding_views.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android_finding_views.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        var bn_butterknife = findViewById<Button>(R.id.bn_butterknife)
        var bn_kotlin_synthentics = findViewById<Button>(R.id.bn_kotlin_synthentics)
        var bn_view_binding = findViewById<Button>(R.id.bn_view_binding)
        var bn_data_binding = findViewById<Button>(R.id.bn_data_binding)


        bn_butterknife.setOnClickListener {
            callButterKnifeActivity()
        }
        bn_kotlin_synthentics.setOnClickListener {
            callKotlinSyntheticsActivity()
        }
        bn_view_binding.setOnClickListener {
            callViewBindingActivity()
        }
        bn_data_binding.setOnClickListener {
            callDataBindingActivity()
        }

    }

    private fun callViewBindingActivity() {
        val intent = Intent(this, ViewBindingActivity::class.java)
        startActivity(intent)
    }

    private fun callKotlinSyntheticsActivity() {
        val intent = Intent(this, KotlinSyntheticsActivity::class.java)
        startActivity(intent)
    }

    private fun callButterKnifeActivity() {
        val intent = Intent(this, ButterKnifeActivity::class.java)
        startActivity(intent)
    }

    private fun callDataBindingActivity() {
        val intent = Intent(this, DataBindingActivity::class.java)
        startActivity(intent)
    }
}
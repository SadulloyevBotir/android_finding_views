package com.example.android_finding_views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.android_finding_views.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.apply {
            bViewbinding.setOnClickListener {
                tvViewbinding.text = "View Binding"
            }
        }
    }
}
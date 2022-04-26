package com.example.android_finding_views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android_finding_views.R
import com.example.android_finding_views.databinding.ActivityDataBindingBinding
import com.example.android_finding_views.model.User

class DataBindingActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)

        val user = User("PDP",6)
        binding.user = user
    }
}
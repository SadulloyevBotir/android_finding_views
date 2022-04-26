package com.example.android_finding_views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.android_finding_views.R

class ButterKnifeActivity : AppCompatActivity() {
    @BindView(R.id.bn_butter) lateinit var bn_butter :Button
    @BindView(R.id.tv_butter) lateinit var tv_butter :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_knife)
        ButterKnife.bind(this)
        initViews()
    }

    private fun initViews() {
        bn_butter.setOnClickListener {
            tv_butter.text = "Butter Knife"
        }
    }
}
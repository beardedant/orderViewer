package com.gbhomework.orderviewer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gbhomework.orderviewer.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, OrderStatusFragment.newInstance())
                .commit()
        }
    }
}
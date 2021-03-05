package com.example.dynamicfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragment1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, FirstFragment()).addToBackStack(null)
                .commit()
        }

        fragment2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, SecondFragment()).addToBackStack(null)
                .commit()
        }
    }
}
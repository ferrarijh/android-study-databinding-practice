package com.jonathan.practice.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jonathan.practice.databindingpractice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(){
    private val binding: ActivityMainBinding by lazy{ DataBindingUtil.setContentView(this, R.layout.activity_main)}
    private val mViewModel by lazy{ ViewModelProvider(this).get(MainViewModel::class.java)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply{
            viewmodel = mViewModel
            lifecycleOwner = this@MainActivity
        }
    }
}
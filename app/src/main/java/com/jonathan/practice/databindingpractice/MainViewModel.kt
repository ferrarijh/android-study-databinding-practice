package com.jonathan.practice.databindingpractice

import android.widget.TextView
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    var strObservable = ObservableField("")
    val strLive = MutableLiveData("")
}
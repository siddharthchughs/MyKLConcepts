package com.example.mynavigationconcept.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainViewModelFactory(private val starting:Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(MyCustomMainViewModel::class.java)){
            return MyCustomMainViewModel(starting) as T
        }
        throw IllegalArgumentException("Unknow view model class")
    }
}
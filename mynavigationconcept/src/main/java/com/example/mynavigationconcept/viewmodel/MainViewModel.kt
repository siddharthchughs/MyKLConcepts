package com.example.mynavigationconcept.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var count:Int = 0


    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdateCurrentCount(input:Int) {
         count+=input
    }


}
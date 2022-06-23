package com.example.mynavigationconcept.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCustomMainViewModel(val startingPoint:Int): ViewModel() {


      var userName = MutableLiveData<String>()
//          val resultUsername : LiveData<String>
//        get() = userName


   private var totalCount = MutableLiveData<Int>()
    val resultTotal : LiveData<Int>
    get() = totalCount
    init {
        totalCount.value = startingPoint
    }
//    init {
//        userName.value  = startingPoint
//    }

//    fun getCurrentTotal():Int{
//        return total
//    }

//    fun getCurrentUsername(){
//        userName.value = userName.value.toString()
//    }


//    fun getUpdate(input:Int){
//        totalCount.value =input.plus(totalCount.value.toString().toInt())
//    }

    fun getCountUpdate(){
   totalCount.value = totalCount.value?.plus(1)
    }

}
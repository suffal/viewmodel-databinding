package com.example.databindingviewmodel.viewmodels

import androidx.lifecycle.ViewModel

class viewmodelmainactivityviewmodel(private var inputvalue:Int):ViewModel( ) {

var _count:Int=0


   init {
       _count = inputvalue
   }

    fun updatecount(){

        _count+10
    }



}
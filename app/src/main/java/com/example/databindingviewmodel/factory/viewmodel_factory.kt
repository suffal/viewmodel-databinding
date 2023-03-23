package com.example.databindingviewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.databindingviewmodel.viewmodels.viewmodelmainactivityviewmodel

class viewmodel_factory(private var input:Int ): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(viewmodelmainactivityviewmodel::class.java)) {

            return viewmodelmainactivityviewmodel(input)as T
        }

          throw IllegalArgumentException("unknown view modelclass")
    }


}

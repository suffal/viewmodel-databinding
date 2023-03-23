package com.example.databindingviewmodel

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingviewmodel.databinding.ActivityMainBinding
import com.example.databindingviewmodel.factory.viewmodel_factory
import com.example.databindingviewmodel.viewmodels.viewmodelmainactivityviewmodel
import kotlinx.coroutines.Job
import java.security.Key
import java.security.KeyFactory
import java.security.KeyStore

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
     lateinit var viewmodel:viewmodelmainactivityviewmodel
  lateinit var factory: viewmodel_factory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        factory= viewmodel_factory(125)




        viewmodel = ViewModelProvider(this,factory).get(viewmodelmainactivityviewmodel::class.java)

           binding.tvCount.text=viewmodel._count.toString()


        binding.btncount.setOnClickListener {
            viewmodel.updatecount()

            binding.tvCount.text=viewmodel._count.toString()



        }

        }
    }
 







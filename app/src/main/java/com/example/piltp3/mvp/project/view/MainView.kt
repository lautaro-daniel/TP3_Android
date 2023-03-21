package com.example.piltp3.mvp.project.view

import android.app.Activity
import android.widget.Toast
import com.example.piltp3.R
import com.example.piltp3.databinding.ActivityMainBinding
import com.example.piltp3.mvp.project.contract.MainContract

class MainView (activity:Activity):ActivityView(activity) , MainContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun setMessage(text:String) {
        Toast.makeText(activity, text, Toast.LENGTH_SHORT).show()
    }

    override fun getInputMessage(): String {
        return binding.editText.text.toString()
    }

    override fun getErrorMessage(){
        Toast.makeText(activity, activity?.resources?.getString(R.string.error_message), Toast.LENGTH_SHORT).show()
    }

    override fun clickButton(function: () -> Unit) {
        binding.buttonShowText.setOnClickListener{ function() }
    }


}
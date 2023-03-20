package com.example.piltp3.mvp.project.view

import android.app.Activity
import android.widget.Toast
import com.example.piltp3.R
import com.example.piltp3.mvp.project.component.ViewContract
import com.example.piltp3.databinding.ActivityMainBinding

class MainView (private var activity:Activity): ViewContract {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun setMessage() {
        Toast.makeText(activity, binding.etText.text, Toast.LENGTH_SHORT).show()
    }

    override fun getInputMessage(): String {
        return binding.etText.text.toString()
    }

    override fun getErrorMessage(){
        Toast.makeText(activity, activity.resources.getString(R.string.error_message), Toast.LENGTH_SHORT).show()
    }

    override fun clickButton(function: () -> Unit) {
        binding.showText.setOnClickListener{function()}
    }


}
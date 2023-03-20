package com.example.piltp3.mvp.project.component

interface ViewContract {
    fun setMessage()
    fun getInputMessage(): String
    fun getErrorMessage()
    fun clickButton(function: () -> Unit)
}
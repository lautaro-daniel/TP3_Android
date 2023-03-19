package com.example.piltp3.component

interface ViewInterface {
    fun setMessage()
    fun getInputMessage(): String
    fun getErrorMessage()
    fun clickButton(function: () -> Unit)
}
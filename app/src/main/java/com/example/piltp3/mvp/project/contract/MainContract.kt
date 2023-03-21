package com.example.piltp3.mvp.project.contract

class MainContract {
    interface Presenter {
        fun onClickButton(text:String)
    }

    interface View {
        fun setMessage(text:String)
        fun getInputMessage(): String
        fun getErrorMessage()
        fun clickButton(function: () -> Unit)
    }
}
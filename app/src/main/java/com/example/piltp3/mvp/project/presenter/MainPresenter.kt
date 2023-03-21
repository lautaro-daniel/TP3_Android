package com.example.piltp3.mvp.project.presenter

import com.example.piltp3.mvp.project.contract.MainContract

class MainPresenter(private var mainView: MainContract.View) : MainContract.Presenter {

    init {
        this.mainView.clickButton {
            onClickButton(mainView.getInputMessage())
        }
    }
    override fun onClickButton(text:String) {
        val getMessage = mainView.getInputMessage()
        if (getMessage.isEmpty()){
            mainView.getErrorMessage()
        }else{
            mainView.setMessage(text)
        }
    }

}
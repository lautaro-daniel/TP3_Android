package com.example.piltp3.mainpresenter
import com.example.piltp3.component.PresenterInterface
import com.example.piltp3.component.ViewInterface

class MainPresenter(private var mainView: ViewInterface) : PresenterInterface {

    init {
        mainView.clickButton { onClickButton() }
    }
    override fun onClickButton() {
        val getMessage = mainView.getInputMessage()
        if (getMessage.isEmpty()){
            mainView.getErrorMessage()
        }else{
            mainView.setMessage()
        }
    }

}
package com.example.piltp3.mvp.project.mainpresenter
import com.example.piltp3.mvp.project.component.PresenterContract
import com.example.piltp3.mvp.project.component.ViewContract

class MainPresenter(private var mainView: ViewContract) : PresenterContract {

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
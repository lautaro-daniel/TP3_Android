package com.example.piltp3.activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.piltp3.mvp.project.mainpresenter.MainPresenter
import com.example.piltp3.mvp.project.view.MainView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainView(this))
     }
}

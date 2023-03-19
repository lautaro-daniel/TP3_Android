package com.example.piltp3
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.piltp3.mainpresenter.MainPresenter
import com.example.piltp3.mainview.MainView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainPresenter(MainView(this))
     }
}

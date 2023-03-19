package com.example.piltp3.mainactivitypresenter


import com.example.piltp3.mainpresenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: PresenterComponentContract.Presenter

    @MockK
    private lateinit var mainView: ViewComponentContract.View

   /* @MockK
    private lateinit var mainModel: ComponentContract.Model*/

    @Before
    fun onBefore(){
        MockKAnnotations.init(this, relaxed = true)
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun `on click button should show an error message`(){
        val errorMessage = "There is an error"
        every { mainView.getErrorMessage() } returns mainView.getErrorMessage()
        mainPresenter.onClickButton()
        verify { mainView.setMessage() }
    }

    @Test
    fun `on click button should show an message`(){
        val message = "Hello"
        every { mainView.getInputMessage() } returns "Pepe"
        mainPresenter.onClickButton()
        verify { mainView.setMessage()}
    }
}
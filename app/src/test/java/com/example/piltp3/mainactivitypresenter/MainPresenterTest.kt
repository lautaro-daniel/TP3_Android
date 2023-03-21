package com.example.piltp3.mainactivitypresenter
import com.example.piltp3.mvp.project.contract.MainContract
import com.example.piltp3.mvp.project.presenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: MainContract.Presenter

    @MockK
    private lateinit var mainView: MainContract.View

    @Before
    fun onBefore(){
        MockKAnnotations.init(this, relaxed = true)
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun `on click button should show an error message`(){
        val nullMessage = ""
        every { mainView.getInputMessage() } returns nullMessage
        mainPresenter.onClickButton(mainView.getInputMessage())
        verify { mainView.getErrorMessage() }
    }

    @Test
    fun `on click button should show an message`(){
        val message = "Hello"
        every { mainView.getInputMessage() } returns message
        mainPresenter.onClickButton(mainView.getInputMessage())
        verify { mainView.setMessage(message)}
    }
}
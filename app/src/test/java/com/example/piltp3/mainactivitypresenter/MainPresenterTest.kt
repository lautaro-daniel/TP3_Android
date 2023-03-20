package com.example.piltp3.mainactivitypresenter
import com.example.piltp3.component.PresenterInterface
import com.example.piltp3.component.ViewInterface
import com.example.piltp3.mainpresenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: PresenterInterface

    @MockK
    private lateinit var mainView: ViewInterface

    @Before
    fun onBefore(){
        MockKAnnotations.init(this, relaxed = true)
        mainPresenter = MainPresenter(mainView)
    }

    @Test
    fun `on click button should show an error message`(){
        val nullMessage = ""
        every { mainView.getInputMessage() } returns nullMessage
        mainPresenter.onClickButton()
        verify { mainView.getErrorMessage() }
    }

    @Test
    fun `on click button should show an message`(){
        val message = "Hello"
        every { mainView.getInputMessage() } returns message
        mainPresenter.onClickButton()
        verify { mainView.setMessage()}
    }
}
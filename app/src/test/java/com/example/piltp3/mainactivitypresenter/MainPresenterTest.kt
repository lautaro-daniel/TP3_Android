package com.example.piltp3.mainactivitypresenter
import com.example.piltp3.mvp.project.component.PresenterContract
import com.example.piltp3.mvp.project.component.ViewContract
import com.example.piltp3.mvp.project.mainpresenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {
    private lateinit var mainPresenter: PresenterContract

    @MockK
    private lateinit var mainView: ViewContract

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
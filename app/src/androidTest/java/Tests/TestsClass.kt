package Tests

import Model.ModelClass
import androidx.test.rule.ActivityTestRule
import com.example.myapplication.MainActivity
import org.junit.Rule
import org.junit.Test

class TestsClass {

    private val modelFun = ModelClass()

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun verifyTextIsNull(){
        modelFun.verifyTextIsNull()
    }

    @Test
    fun verifyText(){
        modelFun.verifyText()
    }

    @Test
    fun clickButton() {
        modelFun.clickShowAnotherButton()
    }
}
package Model

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.myapplication.R

class ModelClass {
    private val text = onView(withId(R.id.textData)) //locators
    private val showAnotherFactButton = onView(withId(R.id.showFactButton))

    fun verifyTextIsNull() {
        if (text != null) {
            println("TextView is not null")
        } else
            println("TextView is null")
    }

    fun verifyText() {
        text.check(ViewAssertions.matches(withText("Did you know?")))
    }

    fun clickShowAnotherButton() {
        showAnotherFactButton.perform(click())
            .check(ViewAssertions.matches(isClickable()))
    }


}
package de.nenick.example

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KotlinBasedInstrumentedTest {

    @Rule
    @JvmField
    val mActivityRule = ActivityTestRule(MainActivity_::class.java)

    @Test
    fun useGeneratedClass() {
        // tries to start original activity instead of generated
    }
}

package com.example.helloworld

import org.hamcrest.core.Is.`is`
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class HelloWorldViewModelTest {
    private lateinit var sut: HelloWorldViewModel
    @Before
    fun setUp() {
        sut = HelloWorldViewModel()
    }

    @Test
    fun onGreetActionClicked() {
        assertThat(sut.greetingText.get(), `is`(""))

        sut.personText.set("General Kenobi")
        sut.onGreetActionClicked()

        assertThat(sut.greetingText.get(), `is`("Hello there General Kenobi"))
    }

    @Test
    fun onFarewellActionClicked() {
        assertThat(sut.greetingText.get(), `is`(""))

        sut.personText.set("bee")
        sut.onFarewellActionClicked()

        assertThat(sut.greetingText.get(), `is`("Get out my face bee"))
    }


}
package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.helloworld.databinding.ActivityMain2Binding


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this).get(HelloWorldViewModel::class.java)
        val binding = DataBindingUtil.setContentView<ActivityMain2Binding>(this, R.layout.activity_main2)
        binding.viewModel = viewModel
    }

}


class HelloWorldViewModel : ViewModel() {
    val greetingText = ObservableField<String>("")
    val personText = ObservableField<String>("")

    fun onGreetActionClicked() {
        greetingText.set("Hello there ${personText.get()}")
    }

    fun onFarewellActionClicked() {
        greetingText.set("Get out my face ${personText.get()}")
    }
}
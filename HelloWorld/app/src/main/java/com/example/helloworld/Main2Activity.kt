package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //var~=let in js
        //val~= const in js
        val greetingText = findViewById<TextView>(R.id.greeting_text)
        val personName= findViewById<EditText>(R.id.person_name)
        val greetButton= findViewById<Button>(R.id.action_greet)
        val farewellButton= findViewById<Button>(R.id.action_goodbye)

        greetButton.setOnClickListener{btn -> greetingText.text="Hello ${personName.text}"}

        farewellButton.setOnClickListener{btn -> greetingText.text="Get out of my face ${personName.text}" }


    }

}

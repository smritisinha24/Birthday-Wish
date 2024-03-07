package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.TextView

class Birthday_greeting_activity : AppCompatActivity() {
        companion object{
            const val NAME_EXTRA = "name_extra"
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_birthday_greeting)

            // finding the edit text
            val birthdayGreeting = findViewById<TextView>(R.id.BirthdayGreeting);

            val name = intent.getStringExtra(NAME_EXTRA)
            birthdayGreeting.text = "Happy Birthday \n$name"
        }
//    companion object{
//        const val NAME_EXTRA = "name_extra";
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_birthday_greeting)
//
//        val name = intent.getStringExtra(NAME_EXTRA).toString();
//
//        val birthdayGreeting = findViewById<TextView>(R.id.BirthdayGreeting);
//        birthdayGreeting.setText( "Happy Birthday $name");
//    }
}
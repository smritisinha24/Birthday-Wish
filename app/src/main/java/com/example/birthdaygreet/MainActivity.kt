package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name = nameInput.editableText.toString()

        val intent = Intent(this, Birthday_greeting_activity::class.java)
        intent.putExtra(Birthday_greeting_activity.NAME_EXTRA, name)
        startActivity(intent)

//        Toast.makeText(this,"name is ${name.text}", Toast.LENGTH_LONG).show()
    }
}
package com.example.revision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val gender = intent.getStringExtra("Gender")
        val lang = intent.getStringExtra("Languages")

        val nameTV = findViewById<TextView>(R.id.name_TextView)
        val emailTV = findViewById<TextView>(R.id.email_TextView)
        val genderTV = findViewById<TextView>(R.id.gender_TextView)
        val langTV = findViewById<TextView>(R.id.PL_TextView)

        nameTV.text = "Name: " + name
        emailTV.text = "\nEmail: " + email
        genderTV.text = "\nGender: " +gender
        langTV.text = "\nLanguage: " + lang
    }
}
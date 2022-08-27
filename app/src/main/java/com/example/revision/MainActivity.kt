package com.example.revision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEt = findViewById<EditText>(R.id.name_EditText)
        val emailEt = findViewById<EditText>(R.id.email_EditText)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val languages = resources.getStringArray(R.array.Languages)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        val spinner = findViewById<Spinner>(R.id.Spinner)
       //if (spinner != null){
       //    val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,languages)
       //    spinner.adapter = adapter
       //}

        saveBtn.setOnClickListener{
            val name = nameEt.text.toString()
            val email = emailEt.text.toString()
            val intSelectButton:Int = radioGroup!!.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(intSelectButton)
            val gender = radioButton.text.toString()
            val lang = spinner.selectedItem.toString()

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Email",email)
            intent.putExtra("Gender",gender)
            intent.putExtra("Languages",lang)
            intent.putExtra("Name",name)
            startActivity(intent)
        }
    }
}
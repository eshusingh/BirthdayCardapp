package com.example.birthdaycardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makecard(view: android.view.View) {
        val name = userinput.editableText.toString()
        val intent = Intent(this,card::class.java)
        intent.putExtra(card.NAME_EXTRA,name)
        startActivity(intent)
    }
}
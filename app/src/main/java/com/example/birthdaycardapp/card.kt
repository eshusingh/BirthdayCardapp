package com.example.birthdaycardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_card.*

class card : AppCompatActivity() {
    companion object{
         const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)


        val name = intent.getStringExtra(NAME_EXTRA)
        wish.text = "Happy Birthday \n $name"
    }
}
package com.androidmadhav.wishmebirthday

import android.content.Intent
import android.content.Intent.*
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{

        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

//        val name = intent.getStringExtra(NAME_EXTRA)
//        birthdayGreeting.setText("Happy Birthday\n$name!")
//
//        val intent: Intent = Intent(ACTION_VIEW, Uri.parse(""))
//        startActivity(intent)
    }
}
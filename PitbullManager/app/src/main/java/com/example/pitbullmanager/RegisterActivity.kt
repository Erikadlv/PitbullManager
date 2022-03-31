package com.example.pitbullmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val actionbar = supportActionBar
        actionbar!!.title= "Register"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}
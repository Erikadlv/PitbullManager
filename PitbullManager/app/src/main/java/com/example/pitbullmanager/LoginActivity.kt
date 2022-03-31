package com.example.pitbullmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val actionbar = supportActionBar
        actionbar!!.title= "Login"
        actionbar.setDisplayHomeAsUpEnabled(true)

        text_activity_registrar.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        text_activity_forgotpassword.setOnClickListener{
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        btn_registrar.setOnClickListener{
            val intent = Intent (this, AdministratorActivity::class.java)
            startActivity(intent)
        }
    }
}
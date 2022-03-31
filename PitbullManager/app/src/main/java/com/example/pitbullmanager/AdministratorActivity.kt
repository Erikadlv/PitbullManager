package com.example.pitbullmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.pitbullmanager.fragments.ClasesFragment
import com.example.pitbullmanager.fragments.ItemperfilesFragment
import com.example.pitbullmanager.fragments.PagoFragment
import kotlinx.android.synthetic.main.activity_administrator.*

class AdministratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrator)
        val perfileFragment = ItemperfilesFragment()
        val pagoFragment = PagoFragment()
        val clasesFragment = ClasesFragment()
        makeCurrentFragment(perfileFragment)

        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_perfiles -> makeCurrentFragment(perfileFragment)
                R.id.ic_pagos -> makeCurrentFragment(pagoFragment)
                R.id.ic_clases -> makeCurrentFragment(clasesFragment)
            }
        }
    }

    private fun makeCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper,fragment)
            commit()
        }

}
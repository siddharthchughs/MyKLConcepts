package com.example.mynavigationconcept.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.mynavigationconcept.R
import com.example.mynavigationconcept.fragments.DashboardFragment
import com.example.mynavigationconcept.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this@MainActivity,R.id.fragmentContainerView)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        Thread.sleep(1000)
//        val intent = Intent(this,SecondActivity::class.java)
//        startActivity(intent)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
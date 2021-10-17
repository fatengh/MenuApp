package com.example.menuapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mi_home -> {
                changeScreen(Home())
                return true
            }
            R.id.mi_about -> {
                changeScreen(About())
                return true
            }
            R.id.mi_help -> {
                changeScreen(Help())
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    private fun changeScreen(activity: Activity){
        val intent = Intent(this@MainActivity, activity::class.java)
        startActivity(intent)
    }


}
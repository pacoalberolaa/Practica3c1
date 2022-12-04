package com.example.practica3c1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /**
     * Añadimos el activity_menu al MainActivity
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_menu,menu)
        return true
    }

    /**
     * Funciones del menu
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.add -> {
                Toast.makeText(this,"add", Toast.LENGTH_LONG).show()
                true
            }
            R.id.delete ->{
                Toast.makeText(this,"delete", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_settings ->{
                Toast.makeText(this,"action setting", Toast.LENGTH_LONG).show()
                true
            }
            R.id.search ->{
                Toast.makeText(this,"search", Toast.LENGTH_LONG).show()
                true
            }
            R.id.edit -> {
                Toast.makeText(this, "edit", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
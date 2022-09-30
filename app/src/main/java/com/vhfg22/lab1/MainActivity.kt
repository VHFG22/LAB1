package com.vhfg22.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d( "TAG","onCreate")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d( "TAG","onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d( "TAG","onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy")
    }

    fun clickbotao(view: View) {
        Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show()
    }

}
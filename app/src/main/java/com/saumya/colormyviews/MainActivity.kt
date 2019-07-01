package com.saumya.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        makeColored()
    }
    private fun makeColored(view :View){
    when(view.id){
        R.id.txtOne-> view.setBackgroundColor(Color.BLUE)
        R.id.txtTwo-> view.setBackgroundColor(Color.MAGENTA)
        R.id.txtThree-> view.setBackgroundColor(Color.GRAY)
        R.id.txtFour-> view.setBackgroundColor(Color.DKGRAY)
        else->view.setBackgroundColor(Color.LTGRAY)
    }
    }
}

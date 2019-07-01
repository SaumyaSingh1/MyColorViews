package com.saumya.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }
    private fun makeColored(view :View){
    when(view.id){
        R.id.txtOne-> view.setBackgroundResource(R.drawable.j)
        R.id.txtTwo-> view.setBackgroundResource(R.drawable.e)
        R.id.txtThree-> view.setBackgroundResource(R.drawable.images)
        R.id.txtFour-> view.setBackgroundResource(R.drawable.b)
        R.id.txtFive->view.setBackgroundResource(R.drawable.a)
        R.id.txtSix->view.setBackgroundResource(R.drawable.c)
        else->view.setBackgroundResource(R.drawable.d)
    }
    }
    private fun setListeners(){
        val txtOne=findViewById<ImageView>(R.id.txtOne)
        val txtTwo=findViewById<ImageView>(R.id.txtTwo)
        val txtThree=findViewById<ImageView>(R.id.txtThree)
        val txtFour=findViewById<ImageView>(R.id.txtFour)
        val txtFive=findViewById<ImageView>(R.id.txtFive)
        val txtSix=findViewById<ImageView>(R.id.txtSix)
        val constraint=findViewById<View>(R.id.constraint)
        val clickableViews:List<View> = listOf(txtOne,txtTwo,txtThree,txtFour,txtFive,txtSix,constraint)
        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }
}

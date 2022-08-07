package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListenters()
    }

    private fun setListenters() {
        val boxOne: View = findViewById<View>(R.id.box_one_text)
        val boxTwo: View = findViewById<View>(R.id.box_two_text)
        val boxThree: View = findViewById<View>(R.id.box_three_text)
        val boxFour: View = findViewById<View>(R.id.box_four_text)
        val boxFive: View = findViewById<View>(R.id.box_five_text)
        val constraintLayout: View = findViewById(R.id.constraint_layout)
        val buttonTeal: View = findViewById<View>(R.id.teal_button)
        val buttonPurple: View = findViewById<View>(R.id.purple_button)
        val buttonBlack: View = findViewById<View>(R.id.black_button)
        val clickableViews: List<View> = //same click listener on each view so we use a list of views
            listOf(boxOne,boxTwo,boxThree,boxFour,boxFive,constraintLayout,buttonTeal,buttonPurple,buttonBlack)
        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.BLUE)


            // Boxes using Android color resources for background
            R.id.box_two_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_light)

            R.id.teal_button -> findViewById<View>( R.id.box_three_text).setBackgroundResource(R.color.teal_700)
            R.id.purple_button -> findViewById<View>( R.id.box_four_text).setBackgroundResource(R.color.purple_500)
            R.id.black_button -> findViewById<View>( R.id.box_five_text).setBackgroundResource(R.color.black)

            else -> view.setBackgroundColor(Color.LTGRAY) // user touches background

        }

    }
}
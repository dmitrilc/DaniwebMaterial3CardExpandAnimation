package com.hoang.daniwebmaterial3cardexpandanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.transition.TransitionManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card = findViewById<CardView>(R.id.cardView)
        val textView = findViewById<TextView>(R.id.textView_large)
        val button = findViewById<Button>(R.id.button_sizeToggle)

        button.setOnClickListener {
            if (textView.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(card)
                button.text = getString(R.string.collapse)
                textView.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(card)
                button.text = getString(R.string.expand)
                textView.visibility = View.GONE
            }
        }
    }
}
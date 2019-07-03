package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val factBook= FactBook()
    private val colorWheel= ColorWheel()
    private var mFactTextView: TextView?=null
    private var mFactButton: Button?=null
    private var linearLayout: LinearLayout?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFactTextView=findViewById(R.id.factTextView);
        mFactButton=findViewById(R.id.showFactButton);
        linearLayout=findViewById(R.id.linearLayout)

        showFactButton.setOnClickListener(){
            val fact=factBook.getFacts()
            factTextView.text= fact
            val color=colorWheel.getColors()
            linearLayout!!.setBackgroundColor(color)
            mFactButton!!.setTextColor(color)
        }

        Toast.makeText(this,"Yay!!Our activity was created!!",Toast.LENGTH_SHORT).show()
        Log.d("MainActivity","We're logging from onCreate activity")
    }
}

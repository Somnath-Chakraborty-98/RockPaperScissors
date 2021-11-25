package com.crumlabs.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val who_won = intent.getStringExtra("who_won")

        val result=findViewById<TextView>(R.id.result)

        if(who_won.equals("0"))
            result.setText("Player Won")

        else(who_won.equals("1"))
            result.setText("Computer Won")
    }
}



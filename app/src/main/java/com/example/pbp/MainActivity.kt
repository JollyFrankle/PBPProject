package com.example.pbp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /// PUJI TUHAN AKHIRNYA BISA

        val actionbar = supportActionBar

        // disable actionbar
        actionbar!!.hide()

        // set statusbar color
        window.statusBarColor = resources.getColor(R.color.color_secondary_variant, theme)

        // set actionbar title
        actionbar!!.title = "Home"

        // set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}
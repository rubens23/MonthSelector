package com.rubens.monthselectorlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rubens.month_selector.MonthSelectorHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ms = MonthSelectorHelper()
        ms.addOneMonth()

    }
}
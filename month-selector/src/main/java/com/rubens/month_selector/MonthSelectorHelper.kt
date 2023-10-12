package com.rubens.month_selector

import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MonthSelectorHelper {
    fun getCurrentMonth(): String {
        val calendar = Calendar.getInstance()
        val formato = SimpleDateFormat("MMMM", Locale.getDefault())
        return formato.format(calendar.time).toLowerCase(Locale.getDefault())
    }

    fun getCurrentYear(): String {
        val calendar = Calendar.getInstance()
        return calendar.get(Calendar.YEAR).toString()
    }

    fun addOneMonth(monthTextView: TextView, yearTextView: TextView): ArrayList<String> {
        val calendar = Calendar.getInstance()
        val monthName = monthTextView.text.toString()
        var year = yearTextView.text.toString().toInt()

        val dateFormat = SimpleDateFormat("MMMM", Locale.getDefault())
        calendar.time = dateFormat.parse(monthName)!!

        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER) {
            calendar.set(Calendar.MONTH, Calendar.JANUARY)
            year++
        } else {
            calendar.add(Calendar.MONTH, 1)
        }

        val newMonth = dateFormat.format(calendar.time)

        return arrayListOf(newMonth, year.toString())



    }

    fun subtractOneMonth(monthTextView: TextView, yearTextView: TextView): ArrayList<String> {
        val calendar = Calendar.getInstance()
        val monthName = monthTextView.text.toString()
        var year = yearTextView.text.toString().toInt()

        val dateFormat = SimpleDateFormat("MMMM", Locale.getDefault())
        calendar.time = dateFormat.parse(monthName)!!

        if (calendar.get(Calendar.MONTH) == Calendar.JANUARY) {
            calendar.set(Calendar.MONTH, Calendar.DECEMBER)
            year--
        } else {
            calendar.add(Calendar.MONTH, -1)
        }

        val newMonth = dateFormat.format(calendar.time)


        return arrayListOf(newMonth, year.toString())
    }
}
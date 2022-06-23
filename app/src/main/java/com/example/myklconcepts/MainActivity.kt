package com.example.myklconcepts

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myklconcepts.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvSelectDate.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                Toast.makeText(applicationContext, "hey ", Toast.LENGTH_SHORT).show()
                showDatePicker()
            }
        })
//        ShowoutpitDateSelection("Hello",object :MyDateSelection{
//            override fun showSelectDate(s: String): String {
//
//            }
//
//        })

    }


//    private fun showDatePOICKER(){
//
//        val myCalendar = Calendar.getInstance()
//        val yr = myCalendar.get(Calendar.YEAR)
//        val month = myCalendar.get(Calendar.MONTH+1)
//        val date = myCalendar.get(Calendar.DAY_OF_WEEK)
//
//        DatePickerDialog(this,{view,yr,month,date->
//
//
//        },
//        yr,
//        month,
//        date).show()
//
//    }


    private fun showDatePicker() {

        // making an instance of calender to fetch various services like getting the current year, date and
        // much more.
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val date = myCalender.get(Calendar.DAY_OF_MONTH)

        val datePic = DatePickerDialog(
            this,
            { view, year, month, date ->
                Toast.makeText(
                    applicationContext,
                    "Selected:${month}::${date}::${year}",
                    Toast.LENGTH_SHORT
                ).show()
                val selectedDate = "${month + 1}/${date}/${year}"
                binding.tvDateSelected.setText(selectedDate)
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val dateFormat = sdf.parse(selectedDate)
                val selectedDateinminutes = (dateFormat?.time ?: 0) / 60000
                val currentConversion = sdf.parse(sdf.format(System.currentTimeMillis()))
                val currentDateInMinutes = (currentConversion?.time ?: 0) / 60000
                val difference = currentDateInMinutes - selectedDateinminutes
                binding.tvLabelMinutes.setText("$difference")
            },
            year,
            month,
            date
        )
        datePic.datePicker.maxDate = System.currentTimeMillis() - 86400000
        datePic.show()
    }

 /*   interface MyDateSelection {
        fun showSelectDate(s: String): String
    }

    fun ShowoutpitDateSelection(s: String, myDateSelection: MyDateSelection) {
        myDateSelection.showSelectDate(myDateSelection.showSelectDate(s))
    }
*/
}
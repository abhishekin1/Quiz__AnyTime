package com.example.quizanytime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA= "name_extra"
        const val SCORE = "score"
        const val WRONGQUE = "que"
        const val TOPIC = "topic"
        const val TOPICf = "topicf"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                start_button.setOnClickListener {
                    val selectedItem= adapterView?.getItemAtPosition(position).toString()
                    if (selectedItem == "\uD83C\uDFAF Select Topic") {
                        Toast.makeText(
                            this@MainActivity,
                            "Please Select The Topic 😅",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    else {

                        val intent = Intent(this@MainActivity, QuizPage::class.java)
                        intent.putExtra(NAME_EXTRA, selectedItem)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}
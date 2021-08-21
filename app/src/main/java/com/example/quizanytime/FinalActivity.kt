package com.example.quizanytime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val score1 = intent?.extras?.getString(MainActivity.SCORE).toString()
        val WrongQue = intent?.extras?.getString(MainActivity.WRONGQUE).toString()
        val topic = intent?.extras?.getString(MainActivity.TOPIC).toString()
        fscore.text =  "Your Score Is $score1 Out of 10"
        fwrong.text = "Question no. $WrongQue are wrong, Please review"

        tryAgain.text= "try $topic quiz again"
        tryAgain.setOnClickListener{
            val intent = Intent(this, QuizPage::class.java)
            intent.putExtra(MainActivity.TOPICf, topic)
            startActivity(intent)
        }

        homePage.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
    override fun onBackPressed(){}

}
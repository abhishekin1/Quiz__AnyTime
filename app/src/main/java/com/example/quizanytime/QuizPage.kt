package com.example.quizanytime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizanytime.DataSet.dataset
import com.example.quizanytime.correctlist.correctLclass
import kotlinx.android.synthetic.main.quiz_page.*

class QuizPage : AppCompatActivity() {
    var isfinished = false
    var count: Int = 0
    var score: Int = 0
    var myDataset = dataset().loadList("")
    var wrongAns :  MutableList<Int> = mutableListOf()
    var selectOptonsList :  MutableList<Int> = mutableListOf(0,0,0,0,0,0,0,0,0,0)
    var correctOptionList = listOf<Int>(1)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_page)
        var selectedQuiz = intent?.extras?.getString(MainActivity.NAME_EXTRA).toString()
        //var selctedQuiz  = intent?.extras?.getString(MainActivity.TOPICf).toString()
        setRespectiveImage(selectedQuiz)
        op_group.clearCheck()

        myDataset = dataset().loadList(selectedQuiz)
        correctOptionList = correctLclass().corrLfun(selectedQuiz)
        Toast.makeText(this, "$selectedQuiz", Toast.LENGTH_SHORT).show()



        question.text= resources.getString(myDataset[0].queStrstringId).toString()
        op1.text= resources.getString(myDataset[0].op1Id).toString()
        op2.text= resources.getString(myDataset[0].op2Id).toString()
        op3.text= resources.getString(myDataset[0].op3Id).toString()
        op4.text= resources.getString(myDataset[0].op4Id).toString()

        next.setOnClickListener{
            if (isfinished==true){
                selectOptonsList[count] = op_group.checkedRadioButtonId
                op_group.clearCheck()
                score(selectedQuiz)
            }
            nextfun()
        }
        previous.setOnClickListener{
            previousfun()

        }

    }
    fun nextfun(){
        selectOptonsList[count] = op_group.checkedRadioButtonId

        if (count <= (myDataset.size)-2 ) {
            count++
            question.text = resources.getString(myDataset[count].queStrstringId).toString()
            op1.text = resources.getString(myDataset[count].op1Id).toString()
            op2.text = resources.getString(myDataset[count].op2Id).toString()
            op3.text = resources.getString(myDataset[count].op3Id).toString()
            op4.text = resources.getString(myDataset[count].op4Id).toString()
            when (selectOptonsList[count]) {
                R.id.op1 -> op1.setChecked(true)
                R.id.op2 -> op2.setChecked(true)
                R.id.op3 -> op3.setChecked(true)
                R.id.op4 -> op4.setChecked(true)
                else -> {
                    op_group.clearCheck()

                }

            }
        }
        if (count == (myDataset.size)-1 )
        {
            next.text= "Submit Answers"
            isfinished = true

        }
    }
    fun previousfun(){
        isfinished = false
        if (count==0){
            Toast.makeText(this, "Sorry, you are already at  1st question 🙄 ", Toast.LENGTH_SHORT).show()
        }
        selectOptonsList[count] = op_group.checkedRadioButtonId

        if(count > 0){
            count--
            question.text = resources.getString(myDataset[count].queStrstringId).toString()
            op1.text = resources.getString(myDataset[count].op1Id).toString()
            op2.text = resources.getString(myDataset[count].op2Id).toString()
            op3.text = resources.getString(myDataset[count].op3Id).toString()
            op4.text = resources.getString(myDataset[count].op4Id).toString()
            when (selectOptonsList[count]) {
                R.id.op1 -> op1.setChecked(true)
                R.id.op2 -> op2.setChecked(true)
                R.id.op3 -> op3.setChecked(true)
                R.id.op4 -> op4.setChecked(true)
                else -> {
                    op_group.clearCheck()
                }

            }

        }
        if (count == (myDataset.size)-2 ){
            next.text= "next"
        }



    }
    fun score(selctedQuiz: String){

        var i = 0
        while (i< selectOptonsList.size){
            if (selectOptonsList[i]==correctOptionList[i]){
                score +=1
            }
            else{
                wrongAns.add(i+1)
            }
            i += 1
        }

        val separator = ", "

        val wrongQueStr = wrongAns.joinToString(separator)
        val intent = Intent(this, FinalActivity::class.java)
        intent.putExtra(MainActivity.SCORE, score.toString())
        intent.putExtra(MainActivity.WRONGQUE, wrongQueStr)
        intent.putExtra(MainActivity.TOPIC, selctedQuiz )
        startActivity(intent)
    }

    private fun setRespectiveImage(selectedQuiz: String) {
        when(selectedQuiz){
            "🖱 Python" -> imageView2.setImageResource(R.drawable.python)
            "🖱 Kotlin" -> imageView2.setImageResource(R.drawable.kotlinicon)
            else -> imageView2.setImageResource(R.drawable.javaicon)

        }
    }


}
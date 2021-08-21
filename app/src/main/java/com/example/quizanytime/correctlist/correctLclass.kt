package com.example.quizanytime.correctlist

import com.example.quizanytime.R

class correctLclass {
    fun corrLfun(correctFun: String) : List<Int>{
        if (correctFun == "\uD83D\uDDB1 Python") {
            return listOf<Int>(
                R.id.op1,
                R.id.op4,
                R.id.op4,
                R.id.op2,
                R.id.op1,
                R.id.op1,
                R.id.op4,
                R.id.op1,
                R.id.op2,
                R.id.op2
            )
        }
        else if (correctFun == "\uD83D\uDDB1 Java") {
            return listOf<Int>(
                R.id.op2,
                R.id.op1,
                R.id.op4,
                R.id.op1,
                R.id.op2,
                R.id.op3,
                R.id.op3,
                R.id.op4,
                R.id.op3,
                R.id.op1
            )

        }
        else if (correctFun == "\uD83D\uDDB1 Kotlin") {
            return listOf<Int>(
                R.id.op2,
                R.id.op3,
                R.id.op3,
                R.id.op2,
                R.id.op3,
                R.id.op1,
                R.id.op2,
                R.id.op3,
                R.id.op1,
                R.id.op3
            )

        }
        else
            return listOf<Int>()

    }
}
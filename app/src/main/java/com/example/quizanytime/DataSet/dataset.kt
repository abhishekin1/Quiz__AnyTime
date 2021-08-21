package com.example.quizanytime.DataSet

import com.example.quizanytime.R
import com.example.quizanytime.model.QueFormat

class dataset {
    fun loadList(selectedTopic : String) : List<QueFormat>{

        if (selectedTopic == "\uD83D\uDDB1 Python") {
            return listOf<QueFormat>(
                QueFormat(
                    R.string.py_q1,
                    R.string.py_q1_1,
                    R.string.py_q1_2,
                    R.string.py_q1_3,
                    R.string.py_q1_4,
                ),
                QueFormat(
                    R.string.py_q2,
                    R.string.py_q2_1,
                    R.string.py_q2_2,
                    R.string.py_q2_3,
                    R.string.py_q2_4,
                ),
                QueFormat(
                    R.string.py_q3,
                    R.string.py_q3_1,
                    R.string.py_q3_2,
                    R.string.py_q3_3,
                    R.string.py_q3_4,
                ),
                QueFormat(
                    R.string.py_q4,
                    R.string.py_q4_1,
                    R.string.py_q4_2,
                    R.string.py_q4_3,
                    R.string.py_q4_4,
                ),
                QueFormat(
                    R.string.py_q5,
                    R.string.py_q5_1,
                    R.string.py_q5_2,
                    R.string.py_q5_3,
                    R.string.py_q5_4,

                    ),
                QueFormat(
                    R.string.py_q6,
                    R.string.py_q6_1,
                    R.string.py_q6_2,
                    R.string.py_q6_3,
                    R.string.py_q6_4,

                    ),
                QueFormat(
                    R.string.py_q7,
                    R.string.py_q7_1,
                    R.string.py_q7_2,
                    R.string.py_q7_3,
                    R.string.py_q7_4,

                    ),
                QueFormat(
                    R.string.py_q8,
                    R.string.py_q8_1,
                    R.string.py_q8_2,
                    R.string.py_q8_3,
                    R.string.py_q8_4,

                    ),
                QueFormat(
                    R.string.py_q9,
                    R.string.py_q9_1,
                    R.string.py_q9_2,
                    R.string.py_q9_3,
                    R.string.py_q9_4,

                    ),
                QueFormat(
                    R.string.py_q10,
                    R.string.py_q10_1,
                    R.string.py_q10_2,
                    R.string.py_q10_3,
                    R.string.py_q10_4,

                    )
            )
        }
        else if (selectedTopic == "\uD83D\uDDB1 Java"){
            return listOf<QueFormat>(
                QueFormat(
                    R.string.java_q1,
                    R.string.java_q1_1,
                    R.string.java_q1_2,
                    R.string.java_q1_3,
                    R.string.java_q1_4,
                ),
                QueFormat(
                    R.string.java_q2,
                    R.string.java_q2_1,
                    R.string.java_q2_2,
                    R.string.java_q2_3,
                    R.string.java_q2_4,
                ),
                QueFormat(
                    R.string.java_q3,
                    R.string.java_q3_1,
                    R.string.java_q3_2,
                    R.string.java_q3_3,
                    R.string.java_q3_4,
                ),
                QueFormat(
                    R.string.java_q4,
                    R.string.java_q4_1,
                    R.string.java_q4_2,
                    R.string.java_q4_3,
                    R.string.java_q4_4,
                ),
                QueFormat(
                    R.string.java_q5,
                    R.string.java_q5_1,
                    R.string.java_q5_2,
                    R.string.java_q5_3,
                    R.string.java_q5_4,

                    ),
                QueFormat(
                    R.string.java_q6,
                    R.string.java_q6_1,
                    R.string.java_q6_2,
                    R.string.java_q6_3,
                    R.string.java_q6_4,

                    ),
                QueFormat(
                    R.string.java_q7,
                    R.string.java_q7_1,
                    R.string.java_q7_2,
                    R.string.java_q7_3,
                    R.string.java_q7_4,

                    ),
                QueFormat(
                    R.string.java_q8,
                    R.string.java_q8_1,
                    R.string.java_q8_2,
                    R.string.java_q8_3,
                    R.string.java_q8_4,

                    ),
                QueFormat(
                    R.string.java_q9,
                    R.string.java_q9_1,
                    R.string.java_q9_2,
                    R.string.java_q9_3,
                    R.string.java_q9_4,

                    ),
                QueFormat(
                    R.string.java_q10,
                    R.string.java_q10_1,
                    R.string.java_q10_2,
                    R.string.java_q10_3,
                    R.string.java_q10_4,
                )
            )

        }

        else if (selectedTopic == "\uD83D\uDDB1 Kotlin"){
            return listOf<QueFormat>(
                QueFormat(
                    R.string.kotlin_q1,
                    R.string.kotlin_q1_1,
                    R.string.kotlin_q1_2,
                    R.string.kotlin_q1_3,
                    R.string.kotlin_q1_4,
                ),
                QueFormat(
                    R.string.kotlin_q2,
                    R.string.kotlin_q2_1,
                    R.string.kotlin_q2_2,
                    R.string.kotlin_q2_3,
                    R.string.kotlin_q2_4,
                ),
                QueFormat(
                    R.string.kotlin_q3,
                    R.string.kotlin_q3_1,
                    R.string.kotlin_q3_2,
                    R.string.kotlin_q3_3,
                    R.string.kotlin_q3_4,
                ),
                QueFormat(
                    R.string.kotlin_q4,
                    R.string.kotlin_q4_1,
                    R.string.kotlin_q4_2,
                    R.string.kotlin_q4_3,
                    R.string.kotlin_q4_4,
                ),
                QueFormat(
                    R.string.kotlin_q5,
                    R.string.kotlin_q5_1,
                    R.string.kotlin_q5_2,
                    R.string.kotlin_q5_3,
                    R.string.kotlin_q5_4,

                    ),
                QueFormat(
                    R.string.kotlin_q6,
                    R.string.kotlin_q6_1,
                    R.string.kotlin_q6_2,
                    R.string.kotlin_q6_3,
                    R.string.kotlin_q6_4,

                    ),
                QueFormat(
                    R.string.kotlin_q7,
                    R.string.kotlin_q7_1,
                    R.string.kotlin_q7_2,
                    R.string.kotlin_q7_3,
                    R.string.kotlin_q7_4,

                    ),
                QueFormat(
                    R.string.kotlin_q8,
                    R.string.kotlin_q8_1,
                    R.string.kotlin_q8_2,
                    R.string.kotlin_q8_3,
                    R.string.kotlin_q8_4,

                    ),
                QueFormat(
                    R.string.kotlin_q9,
                    R.string.kotlin_q9_1,
                    R.string.kotlin_q9_2,
                    R.string.kotlin_q9_3,
                    R.string.kotlin_q9_4,

                    ),
                QueFormat(
                    R.string.kotlin_q10,
                    R.string.kotlin_q10_1,
                    R.string.kotlin_q10_2,
                    R.string.kotlin_q10_3,
                    R.string.kotlin_q10_4,
                )
            )

        }
        else
            return listOf<QueFormat>()
    }
}
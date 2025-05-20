package vcmsa.ci.flashcard20

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Welcome:AppCompatActivity(){

    private val questions = arrayOf(
        "The Earth is the third planet from the Sun?",
        "Venus has no moons?",
        "The sky is blue",
        "Fish can live without water",
    )

    private val answers = arrayOf(true,false,true,false)

    private var index = 0
    private var score = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

       val questionTextView = findViewById<TextView>(R.id.questionTextView)
        val feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        fun showQuestion () {
            questionTextView.text = questions[index]
            feedbackTextView.text = ""

        }

        showQuestion()

        fun checkAnswer(userAnswer:Boolean){
            val correct = answers[index]
            if (userAnswer == correct){

                score++
                feedbackTextView.text = "Correct!"

            } else {
                feedbackTextView.text = "Incorrect"
            }

        }

        trueButton.setOnClickListener{(checkAnswer(true))}
        falseButton.setOnClickListener{(checkAnswer(false))}

        nextButton.setOnClickListener{
            index++
            if (index < questions.size){
                showQuestion()

            } else {
                val intent = Intent(this,Reviews::class.java)

                intent.putExtra("score",score)

                startActivity(intent)
                finish()

            }

        }

    }
}



















































































































































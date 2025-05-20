package vcmsa.ci.flashcard20

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        val title = findViewById<TextView>(R.id.title)
        val exitButton = findViewById<Button>(R.id.exitButton)

            title.text = "Welcome to Flashcard"


        startButton.setOnClickListener{
            val intent = (Intent(this,Welcome::class.java))
            startActivity(intent)
        }

        exitButton.setOnClickListener{
            finishAffinity()
            exitProcess(status = 0)
        }
    }
}







































































































































































































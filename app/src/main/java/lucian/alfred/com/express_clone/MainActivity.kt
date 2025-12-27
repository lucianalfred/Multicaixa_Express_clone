package lucian.alfred.com.express_clone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PinActivity : AppCompatActivity() {

    private val pinBuilder = StringBuilder()
    private lateinit var dots: List<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin)

        dots = listOf(
            findViewById(R.id.dot1),
            findViewById(R.id.dot2),
            findViewById(R.id.dot3),
            findViewById(R.id.dot4),
            findViewById(R.id.dot5),
            findViewById(R.id.dot6)
        )

        val numberButtons = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        )

        numberButtons.forEach { id ->
            findViewById<Button>(id).setOnClickListener {
                addDigit((it as Button).text.toString())
            }
        }

        findViewById<Button>(R.id.btnDel).setOnClickListener {
            removeDigit()
        }
    }

    private fun addDigit(digit: String) {
        if (pinBuilder.length == 6) return
        pinBuilder.append(digit)
        updateDots()
        if (pinBuilder.length == 6) {
            val pin = pinBuilder.toString()

        }
    }

    private fun removeDigit() {
        if (pinBuilder.isNotEmpty()) {
            pinBuilder.deleteCharAt(pinBuilder.length - 1)
            updateDots()
        }
    }

    private fun updateDots() {
        dots.forEachIndexed { index, view ->
            val drawable = if (index < pinBuilder.length)
                R.drawable.dot_filled
            else
                R.drawable.dot_empty
            view.setBackgroundResource(drawable)
        }
    }
}

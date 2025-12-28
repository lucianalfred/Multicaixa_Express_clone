package lucian.alfred.com.express_clone

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity: AppCompatActivity() {

    private lateinit var txtTitulo: TextView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn0: Button
    private lateinit var btnDel: Button

    // Adicione referências para os dots
    private lateinit var dot1: View
    private lateinit var dot2: View
    private lateinit var dot3: View
    private lateinit var dot4: View
    private lateinit var dot5: View
    private lateinit var dot6: View

    private val pinBuilder = StringBuilder()
    private val pinLength = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setupButtonListeners()
    }

    private fun initViews() {
        txtTitulo = findViewById(R.id.txtTitulo)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)
        btnDel = findViewById(R.id.btnDel)


        dot1 = findViewById(R.id.dot1)
        dot2 = findViewById(R.id.dot2)
        dot3 = findViewById(R.id.dot3)
        dot4 = findViewById(R.id.dot4)
        dot5 = findViewById(R.id.dot5)
        dot6 = findViewById(R.id.dot6)
    }

    private fun setupButtonListeners() {
        val numberButtons = listOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0)

        numberButtons.forEach { button ->
            button.setOnClickListener {
                if (pinBuilder.length < pinLength) {
                    pinBuilder.append(button.text)
                    updatePinDisplay()
                    updateDots()
                    checkPinComplete()
                }
            }
        }

        btnDel.setOnClickListener {
            if (pinBuilder.isNotEmpty()) {
                pinBuilder.deleteCharAt(pinBuilder.length - 1)
                updatePinDisplay()
                updateDots()
            }
        }
    }

    private fun updatePinDisplay() {
        txtTitulo.text = "PIN: ${"•".repeat(pinBuilder.length)}${"_".repeat(pinLength - pinBuilder.length)}"
    }

    private fun updateDots() {

        val dots = listOf(dot1, dot2, dot3, dot4, dot5, dot6)


        for (i in 0 until pinLength) {
            if (i < pinBuilder.length) {

                dots[i].background = ContextCompat.getDrawable(this, R.drawable.dot_filled)
            } else {
                // Dot vazio
                dots[i].background = ContextCompat.getDrawable(this, R.drawable.dot_empty)
            }
        }
    }

    private fun checkPinComplete() {
        if (pinBuilder.length == pinLength) {
            val pin = pinBuilder.toString()
            txtTitulo.text = "PIN completo: $pin"


        }
    }
}
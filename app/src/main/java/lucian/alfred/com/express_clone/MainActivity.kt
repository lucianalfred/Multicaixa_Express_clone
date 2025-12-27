package lucian.alfred.com.express_clone

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

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
    }

    private fun setupButtonListeners() {
        val numberButtons = listOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0)

        numberButtons.forEach { button ->
            button.setOnClickListener {
                if (pinBuilder.length < pinLength) {
                    pinBuilder.append(button.text)
                    updatePinDisplay()
                    checkPinComplete()
                }
            }
        }

        btnDel.setOnClickListener {
            if (pinBuilder.isNotEmpty()) {
                pinBuilder.deleteCharAt(pinBuilder.length - 1)
                updatePinDisplay()
            }
        }
    }

    private fun updatePinDisplay() {
        txtTitulo.text = "PIN: ${"•".repeat(pinBuilder.length)}${"_".repeat(pinLength - pinBuilder.length)}"
    }

    private fun checkPinComplete() {
        if (pinBuilder.length == pinLength) {
            val pin = pinBuilder.toString()
            txtTitulo.text = "PIN completo: $pin"
        }
    }
}
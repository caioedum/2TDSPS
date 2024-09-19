package com.example.applanchonete

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Declaração de variáveis
    private lateinit var coxinhaEditText: EditText
    private lateinit var bebidaEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        coxinhaEditText = findViewById(R.id.editTextCoxinha)
        bebidaEditText = findViewById(R.id.editTextBebida)

        val calculateButton : Button = findViewById(R.id.calculateButton)
        calculateButton.setOnClickListener {
            calculateAndShowResult()
        }
    }

        private fun calculateAndShowResult() {
            val coxinhaInput = coxinhaEditText.text.toString()
            val bebidaInput = bebidaEditText.text.toString()

            if (coxinhaInput.isNotEmpty() && bebidaInput.isNotEmpty()) {
                val coxinhaQuantity = coxinhaInput.toInt()
                val bebidaQuantity = bebidaInput.toInt()

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(ResultActivity.lblCoxinha, coxinhaQuantity)
                intent.putExtra(ResultActivity.lblBebida, bebidaQuantity)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }

        }

}
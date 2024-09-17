package br.com.caioedum.android_160924

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Define o layout da tela usando o arquivo de layout que é o activity_main.xml
        setContentView(R.layout.activity_main)

        // Encontra o botão na interface do usuário utilizando o Id do Button
        val button = findViewById<Button>(R.id.button)


        // Encontra o TextView
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {

                val message = "Você clicou no botão."
                // Ação a ser executada quando o botão for clicado
                textView.text = message

                showToast(message)
            }
        })

    }

    // Função que exibe uma mensagem em um toast
    private fun showToast(message : String) {
        // Criar um objeto Toast para exibir a mensagem
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
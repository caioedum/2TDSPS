package br.com.caioedum.appdino

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Variável para armazenar as referências das Views (ImageView e Buttons)
    private lateinit var imagem: ImageView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Inicializando as Views usando findViewById

        imagem  = findViewById(R.id.imageView)

        btn1 = findViewById(R.id.btn1)

        btn2= findViewById(R.id.btn2)

        btn3 = findViewById(R.id.btn3)

        //Associando os botões à função cliqueBotao
        btn1.setOnClickListener { cliqueBotao(it)}
        btn2.setOnClickListener { cliqueBotao(it)}
        btn3.setOnClickListener { cliqueBotao(it)}
    }
        // Função que chamada quando algum botão é clicado
        fun cliqueBotao(view : View) {
            when(view.id) {

                R.id.btn1 -> imagem.setImageResource(R.drawable.dino1)
                R.id.btn2 -> imagem.setImageResource(R.drawable.dino2)
                R.id.btn3 -> imagem.setImageResource(R.drawable.dino3)
            }
        }


}
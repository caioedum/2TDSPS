package br.com.caioedum.appjogodedados

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageJ1 = findViewById<ImageView>(R.id.imagemJ1)
        val imageJ2 = findViewById<ImageView>(R.id.imagemJ2)
        val btnJogar = findViewById<Button>(R.id.btnJogar)

        //função jogar
        btnJogar.setOnClickListener {
            val j1 = Random.nextInt(1, 7)
            val j2 = Random.nextInt(1, 7)

            imageJ1.setImageResource(idImagemDado(j1))
            imageJ2.setImageResource(idImagemDado(j2))

            var msg = ""
            if (j1 > j2) {
                msg = "Vencedor: Gustavo"
            } else if (j2 > j1) {
                msg = "Vencedor: Sara"
            } else {
                msg = "Empate"
            }
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }
    }

    fun idImagemDado(valor: Int) : Int {
        return when (valor){
            1 -> R.drawable.face1
            2 -> R.drawable.face2
            3 -> R.drawable.face3
            4 -> R.drawable.face4
            5 -> R.drawable.face5
            6 -> R.drawable.face6
            else -> R.drawable.face1
        }

    }
}
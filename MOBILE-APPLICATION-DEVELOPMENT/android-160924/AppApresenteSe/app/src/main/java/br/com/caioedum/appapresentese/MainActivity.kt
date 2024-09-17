package br.com.caioedum.appapresentese

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    // Declarando as propriedades para as views que serão utilizadas na atividade
    private lateinit var nomeEmpresa: TextView
    private lateinit var atuacaoEmpresa: TextView
    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Inicializando as propriedades com as views correspondentes
        nomeEmpresa = findViewById(R.id.nomeEmpresa)
        atuacaoEmpresa = findViewById(R.id.atuacaoEmpresa)
        resultado = findViewById(R.id.resultado)

        // Definindo textos ao iniciar as views nomeEmpresa e atuação Empresa
        nomeEmpresa.text = "FIAP"
        atuacaoEmpresa.text = "Android Development"
        resultado.text = ""
    }

    fun combinarTextos(view: View){
        //Ciar uma string combinando o texto das views nomeEmpresa e atuacaoEmpresa
        val textoFinal = "${nomeEmpresa.text} - ${atuacaoEmpresa.text}"

        //Definindo o texto da view resultado com o texto combinado
        resultado.text = textoFinal
    }
}
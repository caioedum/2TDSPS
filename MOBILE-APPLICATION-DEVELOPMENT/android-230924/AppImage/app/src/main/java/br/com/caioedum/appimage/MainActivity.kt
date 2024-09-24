package br.com.caioedum.appimage

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageView : ImageView = findViewById(R.id.imageView)

        val btnAddImage : Button = findViewById(R.id.btnAddImage)

        btnAddImage.setOnClickListener{
            imageView.setImageResource(R.drawable.ic_launcher_foreground)
        }

    }
}
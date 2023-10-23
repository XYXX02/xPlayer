package dev.abg.xplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musicURI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI

        val text1 = findViewById<TextView>(R.id.textView1)
        text1.text = musicURI.toString()

        val text2 = findViewById<TextView>(R.id.textView2)
        text2.text = "23.10.2023"

        val list :RecyclerView = findViewById(R.id.recyclerView)

    }
}
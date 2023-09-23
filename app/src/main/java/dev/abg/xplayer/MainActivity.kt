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

        val text = findViewById<TextView>(R.id.textView)
        text.text = musicURI.toString()

        val list :RecyclerView = findViewById(R.id.recyclerView)

    }
}
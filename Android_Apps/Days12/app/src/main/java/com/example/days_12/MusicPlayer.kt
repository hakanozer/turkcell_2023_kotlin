package com.example.days_12

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar

class MusicPlayer : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer
    lateinit var volSeekBar: SeekBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)
        volSeekBar = findViewById(R.id.volSeekBar)

        val url = "https://samplelib.com/lib/preview/mp3/sample-9s.mp3"
        //mediaPlayer = MediaPlayer.create(this, R.raw.music)
        mediaPlayer = MediaPlayer.create(this, Uri.parse(url))
        mediaPlayer.start()

        mediaPlayer.setVolume(0.5f, 0.5f)
        volSeekBar.progress = 50
        volSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Log.d("Int", p1.toString())
                Log.d("Boolean", p2.toString())

                val f1 = p1.toFloat() / 100
                mediaPlayer.setVolume(f1, f1)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

    }

    override fun onBackPressed() {
        mediaPlayer.stop()
        finish()
    }

}
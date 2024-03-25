package com.example.video_player

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import com.example.video_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//video view
        val videoView = findViewById<VideoView>(binding.testView.id)
// media controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
//media location
        val uri:Uri = Uri.parse(
            "android.resource://" + packageName
                    + "/raw/test"
        )

//Serring mediacontroller and Uri then starting videoview
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

    }
}
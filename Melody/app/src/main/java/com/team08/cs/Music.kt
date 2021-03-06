package com.team08.cs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Music : AppCompatActivity() {
//    var mMediaPlayer : MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.onActivityCreateSetTheme(this)
        setContentView(R.layout.activity_music)

       val themeNo = savedInstanceState?.getInt("ThemeNo", 0)
        if (themeNo != null) {
            Utils.changeToTheme(this, themeNo)
        }
//    val musicCardText1: TextView = findViewById(R.id.musicCardText1) as TextView
//    val song1: String = musicCardText1.text.toString()
    }

    fun chatBttnFn(view: View) {
        val intent1 = Intent(this, ChatActivity::class.java)
        startActivity(intent1)
    }

    fun quoteBttnFn(view: View) {
        val intent2 = Intent(this, Quotes::class.java)
       startActivity(intent2)
    }

    fun musicBttnFn(view: View) {
        val intent3 = Intent(this, Music::class.java)
        startActivity(intent3)
    }

    fun helplineBttnFn(view: View) {
       val intent4 = Intent(this, HelplineActivity::class.java)
        startActivity(intent4)
    }

    fun PlayBackgroundSound1(view: View) {
        val intent = Intent(this, BackgroundSoundService::class.java)
        intent.setAction("slowmotion")
        startService(intent)
    }

    fun PlayBackgroundSound2(view: View) {
        val intent = Intent(this, BackgroundSoundService::class.java)
        intent.setAction("november")
        startService(intent)
    }

    fun PlayBackgroundSound3(view: View) {
        val intent = Intent(this, BackgroundSoundService::class.java)
        intent.setAction("adventure")
        startService(intent)
    }
//    fun PlayBackgroundSound(view: View?) {
//        if (mMediaPlayer == null) {
//            mMediaPlayer = MediaPlayer.create(this, R.raw.slowmotion)
//            mMediaPlayer!!.isLooping = true
//            mMediaPlayer!!.start()
//        } else mMediaPlayer!!.start()
//    }
//    override fun onStop() {
//        super.onStop()
//        if (mMediaPlayer != null) {
//            mMediaPlayer!!.release()
//            mMediaPlayer = null
//        }
//    }
}
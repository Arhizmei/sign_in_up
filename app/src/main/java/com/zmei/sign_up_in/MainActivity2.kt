package com.zmei.sign_up_in

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.sign_up_in.databinding.ActivityMain2Binding
import com.zmei.sign_up_in.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var bind : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
    }
    fun onClick(view: View){
        bind.AvatarLoad.visibility = View.VISIBLE
    }
}
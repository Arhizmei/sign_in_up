package com.zmei.sign_up_in

import Constance.constance
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
        val proverka = intent.getStringExtra(constance.SIGN_STATE)
        bind.btOK.text = proverka


    }
    fun onClickAva(view: View){
        bind.AvatarLoad.visibility = View.VISIBLE
    }

    fun onClickOk(view: View){

    }
}
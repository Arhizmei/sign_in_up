package com.zmei.sign_up_in

import Constance.constance
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.sign_up_in.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    val login = data?.getStringExtra(constance.LOGIN)
        bind.textView.text = login
    }

    fun onClickSignIn (view: View){
       val intent = Intent(this, MainActivity2::class.java)
       intent.putExtra(constance.SIGN_STATE, constance.SIGN_IN )
        startActivityForResult(intent, constance.REQUEST_COD_SIGN_IN)


    }
}
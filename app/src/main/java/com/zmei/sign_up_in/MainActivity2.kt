package com.zmei.sign_up_in

import Constance.constance
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.zmei.sign_up_in.databinding.ActivityMain2Binding
import com.zmei.sign_up_in.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var bind : ActivityMain2Binding
    private  var sign_state = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)



        sign_state = intent.getStringExtra(constance.SIGN_STATE)!!
        if (sign_state == constance.SIGN_UP){
            bind.Name.visibility = View.VISIBLE
            bind.Name2.visibility = View.VISIBLE
            bind.Surname.visibility = View.VISIBLE
            bind.btAva.visibility = View.VISIBLE
    }}
    fun onClickAva(view: View){
        bind.AvatarLoad.visibility = View.VISIBLE
    }

    fun onClickOk(view: View){
        if (sign_state == constance.SIGN_UP){
            intent.putExtra(constance.LOGIN, bind.Login.text)
            intent.putExtra(constance.PASSWORD, bind.Password.text)
            intent.putExtra(constance.NAME, bind.Name.text)
            intent.putExtra(constance.NAME2, bind.Name2.text)
            intent.putExtra(constance.SERNAME, bind.Surname.text)
            if (bind.AvatarLoad.isVisible) intent.putExtra(constance.AVATARID, R.drawable.face)
            setResult(RESULT_OK, intent)
            finish()
            else if (sign_state == constance.SIGN_IN) {
                intent.putExtra(constance.LOGIN, bind.Login.text)
                intent.putExtra(constance.PASSWORD, bind.Password.text)}
            setResult(RESULT_OK, intent)
            finish()

            }
        }

    }
}
package com.zmei.sign_up_in

import Constance.constance
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.sign_up_in.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding
    private var avatarId = 0
    private var name = ""
    private var name2 = ""
    private var sername = ""
    private var login = ""
    private var password = ""
    private var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == constance.REQUEST_COD_SIGN_UP){
        login = data?.getStringExtra(constance.LOGIN)!!
        password = data?.getStringExtra(constance.PASSWORD)!!
        name = data?.getStringExtra(constance.NAME)!!
        name2 = data?.getStringExtra(constance.NAME2)!!
        sername = data?.getStringExtra(constance.SERNAME)!!
        bind.textView.text = "Приветствую " + "$name " + "$name2 " + "$sername"
        bind.Avatar.visibility = View.VISIBLE
        avatarId = data.getIntExtra(constance.AVATARID, 0)
        bind.Avatar.setImageResource(avatarId)
            bind.btSignUp.visibility = View.INVISIBLE
            bind.btSignIn.text ="Exit"}
        else if (requestCode == constance.REQUEST_COD_SIGN_IN){
            val l = data?.getStringExtra(constance.LOGIN)
            val p = data?.getStringExtra(constance.PASSWORD)
            if (l == login && p == password){
                bind.Avatar.visibility = View.VISIBLE
                bind.Avatar.setImageResource(avatarId)
                bind.btSignUp.visibility = View.GONE
                bind.btSignIn.text = "Exit"
            }else bind.textView.text = "Не верный логин и пароль"}
        }



    fun onClickSignIn (view: View){
       val intent = Intent(this, MainActivity2::class.java)
       intent.putExtra(constance.SIGN_STATE, constance.SIGN_IN )
        startActivityForResult(intent, constance.REQUEST_COD_SIGN_IN)


    }

    fun OnClickSignUp(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(constance.SIGN_STATE, constance.SIGN_UP)
        startActivityForResult(intent, constance.REQUEST_COD_SIGN_UP)

    }
}
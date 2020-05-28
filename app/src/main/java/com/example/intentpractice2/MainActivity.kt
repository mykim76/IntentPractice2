package com.example.intentpractice2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_MESSAGE = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFourthBtn.setOnClickListener{

            val myIntent= Intent(this,FourthActivity::class.java)
            startActivityForResult(myIntent,REQ_FOR_MESSAGE)

        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.d("맥티비티 복귀","결과를 가지고 돌아옴")
        if(requestCode == REQ_FOR_MESSAGE)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                val msg = data?.getStringExtra("message")
                resultTxt.text = msg
            }
        }
    }
}

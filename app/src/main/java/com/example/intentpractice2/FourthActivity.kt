package com.example.intentpractice2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        goBackBtn.setOnClickListener{
            val content = goBackEdt.text.toString()
            val goBackIntent = Intent(); /// 기존과 다름. 출발과 도착지를 지정하지 않았음 왕복일때는 넣지 않음
            goBackIntent.putExtra("message", content)
            setResult(Activity.RESULT_OK, goBackIntent)
            finish()
        }
    }

}

package com.example.a0510

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondIntent = Intent(this, MainActivity2::class.java) // 인텐트를 생성

            this.goto_personlist.setOnClickListener { // 버튼 클릭시 할 행동
            startActivity(secondIntent)  // 화면 전환하기

        }
    }
}


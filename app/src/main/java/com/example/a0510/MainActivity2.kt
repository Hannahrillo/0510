package com.example.a0510

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val firstIntent = Intent(this, MainActivity::class.java) // 인텐트를 생성

        this.go_back_btn.setOnClickListener { // 버튼 클릭시 할 행동
            startActivity(firstIntent)  // 화면 전환하기

        }

        val list = ArrayList<person>()
            list.add(person("손승완", "2","안녕하세용!","wendy"))
            list.add(person("이태민","3","6v6","rosie"))
            list.add(person("박채영","1","Hiii Blinks", "taem"))

        val adapter = MyAdapter(this, list)

        recyclerview_person.adapter = adapter
        recyclerview_person.layoutManager = LinearLayoutManager(this)
        recyclerview_person.setHasFixedSize(true)
    }




}


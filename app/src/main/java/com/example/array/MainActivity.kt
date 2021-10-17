package com.example.array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var edn: EditText
    lateinit var ed1:EditText
    lateinit var swmem: Button
    lateinit var addmem:Button
    var mem=arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        addmem.setOnClickListener {
            if (edn.text.isNotEmpty()){
                mem.add(edn.text.toString())
                tv.hint=(mem.size+1).toString()
            }
        }
        swmem.setOnClickListener{
            if (ed1.text.isNotEmpty()&&(ed1.text.toString().toInt()-1<mem.size)){
                tv.text=mem[ed1.text.toString().toInt()-1]
            }
        }
        ed1.setOnFocusChangeListener { _, _ -> tv.text="" }
    }
    fun init() {
        tv = findViewById(R.id.tvmem)
        edn = findViewById(R.id.edn)
        ed1 = findViewById(R.id.ed1)
        swmem = findViewById(R.id.swmem)
        addmem = findViewById(R.id.addmem)
    }
}
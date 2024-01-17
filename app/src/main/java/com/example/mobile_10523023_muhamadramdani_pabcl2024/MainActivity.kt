package com.example.mobile_10523023_muhamadramdani_pabcl2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var berat : Button
private lateinit var panjang : Button
private lateinit var jarak : Button
private lateinit var suhu : Button

class MainActivity : AppCompatActivity() {

    private fun initComponents(){
        berat = findViewById(R.id.berat)
        panjang = findViewById(R.id.panjang)
        jarak = findViewById(R.id.jarak)
        suhu = findViewById(R.id.suhu)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()

        berat.setOnClickListener({
            val pindah = Intent(this, BeratActivity::class.java)
            startActivity(pindah)
        })

        panjang.setOnClickListener({
            val pindah = Intent(this, PanjangActivity::class.java)
            startActivity(pindah)
        })

        jarak.setOnClickListener({
            val pindah = Intent(this, JarakActivity::class.java)
            startActivity(pindah)
        })

        suhu.setOnClickListener({
            val pindah = Intent(this, SuhunActivity::class.java)
            startActivity(pindah)
        })
    }
}
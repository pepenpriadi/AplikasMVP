package com.mobile.aplikasmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityMVP : AppCompatActivity(), MainView {
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var etKelilingPersegi: EditText
    private lateinit var etLuasPersegi: EditText
    private lateinit var btHitungLuas: Button
    private lateinit var btHitungKeliling: Button
    private lateinit var btHitungKelilingPersegi: Button
    private lateinit var btHitungLuasPersegi: Button
    private lateinit var tvHasil: TextView
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)
        etPanjang = findViewById(R.id.etpanjang)
        etLebar = findViewById(R.id.etlebar)
        etKelilingPersegi = findViewById(R.id.etKeliling)
        etLuasPersegi = findViewById(R.id.etLuas2)
        btHitungLuas = findViewById(R.id.btluas)
        btHitungKeliling = findViewById(R.id.btkeliling)
        btHitungKelilingPersegi = findViewById(R.id.btKeliling)
        btHitungLuasPersegi = findViewById(R.id.btluas2)
        tvHasil = findViewById(R.id.tvhasil)

        btHitungLuas.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPanjang(panjang, lebar)
        }

        btHitungKeliling.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPanjang(panjang, lebar)
        }
        btHitungKelilingPersegi.setOnClickListener {
            val Kelilingpersegi = etKelilingPersegi.text.toString().toFloat()
            val LuasPersegi = etLuasPersegi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(Kelilingpersegi, LuasPersegi)
        }
        btHitungLuasPersegi.setOnClickListener {
            val Kelilingpersegi = etKelilingPersegi.text.toString().toFloat()
            val LuasPersegi = etLuasPersegi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(Kelilingpersegi, LuasPersegi)
        }
    }

    override fun updateLuas(luas: Float) {
       tvHasil.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        tvHasil.text = keliling.toString()
    }

    override fun updateKelilingPersegi(Kelilingpersegi: Float) {
        tvHasil.text = Kelilingpersegi.toString()
    }

    override fun updateLuasPersegi(LuasPersegi: Float) {
        tvHasil.text = LuasPersegi.toString()
    }

    override fun showError(errorMsg: String) {
        tvHasil.text = errorMsg
    }
}
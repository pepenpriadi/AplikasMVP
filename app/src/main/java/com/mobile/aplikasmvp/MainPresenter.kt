package com.mobile.aplikasmvp

class MainPresenter (private val mainView: MainView) {
    fun hitungLuasPersegiPanjang(panjang: Float, lebar : Float){
        if (panjang == 0F){
            mainView.showError("Panjang tidak boleh 0")
            return }
        if (lebar== 0F){
            mainView.showError("Lebar tidak boleh 0")
            return }
        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }
    fun hitungKelilingPersegiPanjang(panjang: Float, lebar : Float) {
        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val Keliling = 2 * (panjang + lebar)
        mainView.updateKeliling(Keliling)
    }
    fun hitungKelilingPersegi(keliling: Float, sisi : Float) {
        if (keliling == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (sisi == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val KelilingPersegi = keliling * sisi
        mainView.updateKelilingPersegi(keliling)
    }
    fun hitungLuasPersegi(sisi: Float, sisi2 : Float) {
        if (sisi == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (sisi2 == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val KelilingPersegi = sisi * sisi
        mainView.updateLuasPersegi(sisi)

    }
}
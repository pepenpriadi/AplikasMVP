package com.mobile.aplikasmvp

interface MainView {
    fun updateLuas(luas : Float)
    fun updateKeliling(keliling : Float)
    fun updateKelilingPersegi(Kelilingpersegi : Float)
    fun updateLuasPersegi(LuasPersegi : Float)
    fun showError(errorMsg : String)
}
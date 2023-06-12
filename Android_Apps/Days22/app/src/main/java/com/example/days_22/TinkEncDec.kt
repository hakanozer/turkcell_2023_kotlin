package com.example.days_22

import android.util.Log
import com.google.crypto.tink.subtle.AesGcmJce
import com.google.crypto.tink.subtle.Base64

class TinkEncDec {

    val key128Bit = "TjWnZr4u7x!A%D*G";
    val extraKey = "key123";

    fun encrypt( plainText: String) : String {
        var cipherText = "";
        try {
            val aesGcmJce = AesGcmJce(key128Bit.toByteArray())
            val byteEncrypt = aesGcmJce.encrypt(plainText.toByteArray(), extraKey.toByteArray() )
            cipherText = String(byteEncrypt, Charsets.ISO_8859_1)
        }catch (ex:Exception) {
           Log.e("Error", ex.toString() )
        }
        cipherText = Base64.encode(cipherText.toByteArray())
        return cipherText;
    }

    fun decrypt(cipherText: String): String {
        var planText: String = ""
        try {
            val cipherText = String(Base64.decode(cipherText))
            val convertEncode = cipherText.toByteArray(charset("ISO-8859-1"))
            val aesGcmJce = AesGcmJce(key128Bit.toByteArray())
            val descBytes = aesGcmJce.decrypt(convertEncode, extraKey.toByteArray())
            planText = String(descBytes)
        } catch (e: java.lang.Exception) {
            System.err.println("decrypt Error : $e")
        }
        return planText
    }

}
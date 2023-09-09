package com.example.codeforces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Contest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contest)
        val Contest= findViewById<WebView>(R.id.Contest)
        webViewSetup(Contest)
    }
    private fun webViewSetup(Contest:WebView)
    {
        Contest.webViewClient= WebViewClient()
        Contest.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://codeforces.com/contests")
        }
    }



}
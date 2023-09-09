package com.example.codeforces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val webViewVariable=findViewById<WebView>(R.id.Profile)
        webViewSetup(webViewVariable)
    }
    private fun webViewSetup(webViewVariable: WebView) {

        webViewVariable.webViewClient= WebViewClient()
        webViewVariable.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://codeforces.com/profile/rachitkatiyar869")
        }
    }
}
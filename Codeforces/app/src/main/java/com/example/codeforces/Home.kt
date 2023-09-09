
package com.example.codeforces

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val WebViewVariable=findViewById<WebView>(R.id.Home)
        webViewSetup(WebViewVariable)
    }

//    private fun webViewSetup(webViewVariable: WebView)
//    {
//        webViewVariable.webViewClient= WebViewClient()
//        webViewVariable.apply {
//            settings.javaScriptEnabled=true
//            settings.safeBrowsingEnabled=true
//            loadUrl("https://my.ine.com")
//        }
//    }
private fun webViewSetup(webViewVariable: WebView) {

    webViewVariable.webViewClient= WebViewClient()
    webViewVariable.apply {
        settings.javaScriptEnabled=true
        settings.safeBrowsingEnabled=true
        loadUrl("https://codeforces.com/")
    }
}
}
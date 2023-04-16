package com.example.days_7

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var detailWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        detailWebView = findViewById(R.id.detailWebView)

        // WebView Url open page
        //val url = "https://youtu.be/ktyJIj6i4Qw";
        //detailWebView.settings.javaScriptEnabled = true
        //detailWebView.webViewClient = customWebViewClient()
        //detailWebView.loadUrl(url)

        // WebView data open page
        val data = "Araba parasına, her özellik mevcut. O kadar ki; tost makinesine ihtiyacınız kalmayacak! Geliştiriciler için oldukça kıymetli diyebiliriz.!!\n" +
                "<br>\n" +
                "<table  class=\"table table-hover\" ><thead><tr><th>Marka</th><th>Model</th><th>Fiyat</th></tr></thead><tbody><tr><td>iPhone</td><td>XS</td><td>10000</td></tr><tr><td>iPhone</td><td>11</td><td>15000</td></tr></tbody></table>"
        var accordion = "<div class=\"accordion\" id=\"accordionExample\"> <div class=\"accordion-item\"> <h2 class=\"accordion-header\"> <button class=\"accordion-button\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\"> Accordion Item #1 </button> </h2> <div id=\"collapseOne\" class=\"accordion-collapse collapse show\" data-bs-parent=\"#accordionExample\"> <div class=\"accordion-body\"> <strong>This is the first item's accordion body.</strong> It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow. </div> </div> </div> <div class=\"accordion-item\"> <h2 class=\"accordion-header\"> <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\"> Accordion Item #2 </button> </h2> <div id=\"collapseTwo\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionExample\"> <div class=\"accordion-body\"> <strong>This is the second item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow. </div> </div> </div> <div class=\"accordion-item\"> <h2 class=\"accordion-header\"> <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\"> Accordion Item #3 </button> </h2> <div id=\"collapseThree\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionExample\"> <div class=\"accordion-body\"> <strong>This is the third item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow. </div> </div> </div> </div>"
        val html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "$data" +
                "<div class=\"ratio ratio-16x9\"> <iframe src=\"https://www.youtube.com/embed/1WEAJ-DFkHE?rel=0\" title=\"YouTube video\" allowfullscreen></iframe> </div>"
                    "</div>\n" +
                "</body>\n" +
                "</html>"
        detailWebView.settings.javaScriptEnabled = true
        detailWebView.loadData(html, "text/html", "utf-8")
    }

    class customWebViewClient : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            Log.d("shouldOverrideUrlLoading", "Loading")
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            Log.d("onPageFinished", "Finish")
            super.onPageFinished(view, url)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            Log.d("onPageStarted", "Start")
            super.onPageStarted(view, url, favicon)
        }

    }

}
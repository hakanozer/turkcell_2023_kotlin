package com.example.days_9

import android.util.Log
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

class XmlResult {

    fun xmlCatalog () : List<PLANT> {
        val arr = mutableListOf<PLANT>()
        val url = "https://www.w3schools.com/xml/plant_catalog.xml"
        val doc:Document = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get()
        val elements:Elements = doc.getElementsByTag("PLANT")
        for ( item in elements ) {
            val COMMON = item.getElementsByTag("COMMON").text()
            val BOTANICAL = item.getElementsByTag("BOTANICAL").text()
            val ZONE = item.getElementsByTag("ZONE").text()
            val LIGHT = item.getElementsByTag("LIGHT").text()
            val PRICE = item.getElementsByTag("PRICE").text()

            val plant = PLANT(COMMON, BOTANICAL, ZONE, LIGHT, PRICE)
            arr.add(plant)
        }
        return arr
    }


}
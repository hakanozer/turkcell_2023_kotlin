package com.gultendogan.gulten_dogan_odev5

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

    fun xmlCurrency() : List<Currency> {
        val arr = mutableListOf<Currency>()
        val url = "https://www.tcmb.gov.tr/kurlar/today.xml"
        val doc:Document = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get()
        val elements:Elements = doc.getElementsByTag("Currency")
        for( item in elements ) {
            val Isim = item.getElementsByTag("Isim").text()
            val ForexBuying = item.getElementsByTag("ForexBuying").text()
            val ForexSelling = item.getElementsByTag("ForexSelling").text()
            val BanknoteBuying = item.getElementsByTag("BanknoteBuying").text()
            val BanknoteSelling = item.getElementsByTag("BanknoteSelling").text()

            val currency = Currency(Isim, ForexBuying, ForexSelling, BanknoteBuying, BanknoteSelling);
            arr.add(currency)
        }
        return arr
    }


}
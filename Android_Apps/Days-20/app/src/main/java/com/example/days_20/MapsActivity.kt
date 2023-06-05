package com.example.days_20

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.days_20.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val perpa = LatLng(41.0605167, 28.9654046)
        mMap.addMarker(MarkerOptions()
            .position(perpa)
            .title("Perpa İş Merkezi")
            .snippet("Her türlü ev ve iş eşyası")
        )
        mMap.moveCamera(CameraUpdateFactory.newLatLng(perpa))


        val adliye = LatLng(41.0692404, 28.9779002)
        mMap.addMarker(MarkerOptions().position(adliye).title("Çağlayan Adliyesi")
            .snippet("Adelet mülkün temelidir."))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(adliye))

        // Marker set click listener
        mMap.setOnInfoWindowClickListener {
            Log.d("id", it.id)
            if ( it.title == "Perpa İş Merkezi" ) {
                val strUri = "http://maps.google.com/maps?q=loc:${perpa.latitude},${perpa.longitude}"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(strUri))
                startActivity(intent)
            }else if ( it.title == "Çağlayan Adliyesi" ) {
                // val strUri = "http://maps.google.com/maps?q=loc:${adliye.latitude},${adliye.longitude}"
                // val strUri = "tel://5435556677"
                val strUri = "sms:5435556677"
                //val intent = Intent(Intent.ACTION_VIEW, Uri.parse(strUri))
                val intent = Intent(Intent.ACTION_SENDTO, Uri.parse(strUri))
                intent.putExtra("sms_body", "New Message")
                startActivity(intent)
            }
        }

        mMap.moveCamera(CameraUpdateFactory.zoomTo(13f))
    }
}
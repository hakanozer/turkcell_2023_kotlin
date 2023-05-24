package com.example.days_17.ui.aboutus

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.days_17.R
import com.example.days_17.databinding.FragmentAboutusBinding
import com.example.days_17.databinding.FragmentGalleryBinding
import com.example.days_17.ui.gallery.GalleryViewModel

class Aboutus : Fragment() {

    companion object {
        fun newInstance() = Aboutus()
    }

    private var _binding: FragmentAboutusBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var viewModel: AboutusViewModel
    private lateinit var text_aboutus: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this).get(AboutusViewModel::class.java)
        _binding = FragmentAboutusBinding.inflate(inflater, container, false)
        //val view = inflater.inflate(R.layout.fragment_aboutus, container, false)
        val view = binding.root
        text_aboutus = binding.textAboutus
        viewModel.text.observe(viewLifecycleOwner) {
            text_aboutus.setText(it)
        }
        return view
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
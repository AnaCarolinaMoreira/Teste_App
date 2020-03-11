package com.example.myapplication.ui.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.myapplication.R
import com.example.myapplication.viewmodel.ArtigosViewModel

class artigosFragment : Fragment() {

    companion object {
        fun newInstance() = artigosFragment()
    }

    private lateinit var viewModel: ArtigosViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.artigos_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ArtigosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
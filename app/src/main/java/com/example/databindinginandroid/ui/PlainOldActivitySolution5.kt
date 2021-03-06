package com.example.databindinginandroid.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.databindinginandroid.R
import com.example.databindinginandroid.data.SimpleViewModelSolution
import com.example.databindinginandroid.databinding.PlainActivitySolution5Binding

class PlainOldActivitySolution5 : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolution5Binding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution_5)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}
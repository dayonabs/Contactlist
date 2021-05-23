package com.example.contact_list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.contact_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAdapter(binding)
    }

    private fun setupAdapter(binding: ActivityMainBinding) {
        val categoryList = listOf("Family", "Friend", "School", "Work", "Church")
        val adapter = CategoryAdapter(categoryList)
        binding.categoryRecyclerView.adapter = adapter
    }
}
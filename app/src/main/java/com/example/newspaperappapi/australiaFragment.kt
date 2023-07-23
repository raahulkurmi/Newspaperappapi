package com.example.newspaperappapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newspaperappapi.databinding.FragmentAustraliaBinding

class australiaFragment : Fragment() {
    private val binding by lazy {
        FragmentAustraliaBinding.inflate(layoutInflater)
    }
    private val lists = ArrayList<Article>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.animationView.visibility=View.VISIBLE
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val apiService = apiobject.apiService
        val country = "nz"
        val category = "technology"
        val apiKey = getString(R.string.api_key)
        jsonresponse.getdata(country, category, apiKey) { articles ->
            binding.animationView.visibility=View.GONE
            // Data fetched successfully, do something with the list of articles
            lists.addAll(articles)
            setupRecyclerView()
        }
    }
    private fun setupRecyclerView() {
        binding.recylerview.layoutManager = LinearLayoutManager(requireContext())
        binding.recylerview.adapter = recylerviewadpater(lists)
        binding.recylerview.setHasFixedSize(true)
    }
    companion object {


    }
}
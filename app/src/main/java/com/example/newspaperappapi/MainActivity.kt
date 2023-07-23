package com.example.newspaperappapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newspaperappapi.apiobject.apiService
import com.example.newspaperappapi.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val lists = ArrayList<Article>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        val apiService = apiobject.apiService
//        val country = "us"
//        val category = "technology"
//        val apiKey = getString(R.string.api_key)
        val navHostFragment=findNavController(R.id.fragmentContainerView)
        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setupWithNavController(navHostFragment)






//        jsonresponse.getdata(country, category, apiKey) { articles ->
//            // Data fetched successfully, do something with the list of articles
//            lists.addAll(articles)
//            setupRecyclerView()
//        }
    }

//    private fun setupRecyclerView() {
//        binding.recylerview.layoutManager = LinearLayoutManager(this@MainActivity)
//        binding.recylerview.adapter = recylerviewadpater(lists)
//        binding.recylerview.setHasFixedSize(true)
//    }

//    private fun getdata(country: String, category: String, apiKey: String) {
//        apiService.getData(country, category, apiKey).enqueue(object : Callback<newdataclass> {
//            override fun onResponse(call: Call<newdataclass>, response: Response<newdataclass>) {
//                val item = response.body()
//                if (item != null) {
//                    Toast.makeText(this@MainActivity, "not null", Toast.LENGTH_SHORT).show()
//                    val list=item.articles
//                    for(items in list){
////                        binding.textView3.text=items.title
//
//                        lists.add(items)
//                        binding.recylerview.layoutManager=LinearLayoutManager(this@MainActivity)
//                        binding.recylerview.adapter=recylerviewadpater(lists)
//                        binding.recylerview.setHasFixedSize(true)
//
//
//
//
//                    }
//
//                }
//                else{
//                    Toast.makeText(this@MainActivity, " null", Toast.LENGTH_SHORT).show()
//
//                }
//            }
//
//            override fun onFailure(call: Call<newdataclass>, t: Throwable) {
////                TODO("Not yet implemented")
//                Toast.makeText(this@MainActivity, " erroor null", Toast.LENGTH_SHORT).show()
//
//            }
//        })


//    private fun setupRecyclerView() {
//        binding.recylerview.layoutManager = LinearLayoutManager(this@MainActivity)
//        binding.recylerview.adapter = recylerviewadpater(lists)
//        binding.recylerview.setHasFixedSize(true)
//    }
}












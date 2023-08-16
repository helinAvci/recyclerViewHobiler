//hobi recyclerview project

package com.helinavci.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.helinavci.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter : rvAdapter
    private lateinit var hobiler : ArrayList<hobiler>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        hobiler = ArrayList<hobiler>()
        val h1 = hobiler("dağcılık" , "spor")
        val h2 = hobiler("resim" , "sanat")
        val h3 = hobiler("tasarım" , "moda")
        val h4 = hobiler("kayak" , "spor")
        val h5 = hobiler("robotik" , "yazılım")
        hobiler.add(h1)
        hobiler.add(h2)
        hobiler.add(h3)
        hobiler.add(h4)
        hobiler.add(h5)
        adapter = rvAdapter(this , hobiler)
        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = StaggeredGridLayoutManager(1 ,StaggeredGridLayoutManager.VERTICAL)
        binding.rv.adapter = adapter

    }
}
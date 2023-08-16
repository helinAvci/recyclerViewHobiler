package com.helinavci.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.helinavci.recyclerview.databinding.CardviewBinding

class rvAdapter(val mContext : Context, val hobiler : List<hobiler>): RecyclerView.Adapter<rvAdapter.cardViewHolder>() {
    inner class cardViewHolder(val binding : CardviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewHolder {
        val binding = CardviewBinding.inflate(LayoutInflater.from(parent.context) , parent ,false)
        return cardViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return hobiler.size
    }

    override fun onBindViewHolder(holder: cardViewHolder, position: Int) {
        val hobi = hobiler[position]
        val binding = holder.binding
        binding.textViewName.text = hobi.name
        binding.textViewCategory.text = hobi.catagory
    }
}
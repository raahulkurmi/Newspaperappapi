package com.example.newspaperappapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newspaperappapi.databinding.RecyvlerviewnewsBinding

class recylerviewadpater(val list: ArrayList<Article>): RecyclerView.Adapter<recylerviewadpater.customviewholder>() {
    class customviewholder(val binding: RecyvlerviewnewsBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): customviewholder {
        return customviewholder(RecyvlerviewnewsBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: customviewholder, position: Int) {

            holder.binding.textView.text=list[position].title
            holder.binding.textView2.text=list[position].author
            if(list[position]!=null) {
                Glide.with(holder.itemView.context).load(list[position].urlToImage)
                    .into(holder.binding.newimage);
            }
        holder.binding.textView.isSelected=true
        holder.binding.textView2.isSelected=true

        }



    }

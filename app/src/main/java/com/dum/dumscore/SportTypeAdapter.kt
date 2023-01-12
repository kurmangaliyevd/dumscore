package com.dum.dumscore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dum.dumscore.databinding.ItemSportTypeBinding

class SportTypeAdapter(
    private val list: List<SportType>
) : RecyclerView.Adapter<SportTypeAdapter.SportTypeVh>() {


    inner class SportTypeVh(private val binding: ItemSportTypeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setSportType(sportType: SportType) {
            binding.sportTypeIcon.setImageResource(sportType.icon)
            binding.sportTypeName.text = sportType.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportTypeVh {
        val binding = ItemSportTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SportTypeVh(binding)
    }

    override fun onBindViewHolder(holder: SportTypeVh, position: Int) {
        holder.setSportType(list[position])
    }

    override fun getItemCount(): Int = list.size
}
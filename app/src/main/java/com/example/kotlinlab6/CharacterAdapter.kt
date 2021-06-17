package com.example.kotlinlab6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CharacterAdapter : RecyclerView.Adapter<CharacterViewHolder>() {
    private var characterList: List<CharactersData> = emptyList()

    fun changeList(list: List<CharactersData>) {
        characterList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.character_item,parent,false)
        return CharacterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characterList[position]
        holder.nameTextView?.text = "Character name: " + character.name
        holder.nicknameTextView?.text = "Character nickname: " + character.nickname
        Picasso.get().load(character.img).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return characterList.size
    }
}

package com.example.kotlinlab6

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var nameTextView: TextView? = null
    var nicknameTextView: TextView? = null
    var imageView: ImageView? = null

    init {
        nameTextView = itemView.findViewById(R.id.name)
        nicknameTextView = itemView.findViewById(R.id.nickname)
        imageView = itemView.findViewById(R.id.image)
    }
}
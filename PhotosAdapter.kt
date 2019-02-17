package com.elenakozachenko.instaphoto

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

class PhotosAdapter (
        private val photos: List<Photo>): RecyclerView.Adapter<PhotosAdapter.Holder>() {
    override fun onBindViewHolder(holder: Holder, position: Int) {
val photo = photos[position]
Glide.with(holder.itemView)
        .load(photo.image)
        .into(holder.image)
    }

    override fun getItemCount(): Int {
   return photos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Holder {
       val view = LayoutInflater
               .from(parent.context)
               .inflate(R.layout.item_photo, parent,false)
        return Holder(view)
    }

    class Holder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById<ImageView>(R.id.image)

    }
}
package com.kyawt.shopapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.shopapp.R
import com.kyawt.shopapp.model.LatestModel

class LatestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var name = itemView.findViewById<TextView>(R.id.txt_name)
    var image = itemView.findViewById<ImageView>(R.id.img_latest)
    var brand = itemView.findViewById<TextView>(R.id.txt_brand)
    var old_price = itemView.findViewById<TextView>(R.id.txt_latest_old_price)
    var new_price = itemView.findViewById<TextView>(R.id.latest_new_price)
}

class LatestAdapter(var latestList: ArrayList<LatestModel>) :
    RecyclerView.Adapter<LatestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_latest, parent, false)
        return LatestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestList.size
    }

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.name.text = latestList[position].name
        holder.image.setImageResource(latestList[position].image)
        holder.brand.text = latestList[position].brand
        holder.new_price.text = latestList[position].new_price.toString()
        holder.old_price.text = latestList[position].old_price.toString()
    }

}
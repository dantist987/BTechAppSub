package com.example.btechapp.presentation.fragments.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.btechapp.databinding.ItemNewsHorizontalBinding
import com.example.btechapp.presentation.fragments.models.HorizontalNewsModel

class NewsAdapter() :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    private val horizontalNewsModel = mutableListOf<HorizontalNewsModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemNewsHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(horizontalNewsModel[position])
    }

    override fun getItemCount(): Int {
        return horizontalNewsModel.size
    }

    class ViewHolder(private val binding: ItemNewsHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(horizontalCartModel: HorizontalNewsModel) {
            binding.imageViewAdCard1.load(horizontalCartModel.cartBackground1)
            binding.imageViewAdCard2.load(horizontalCartModel.cartBackground2)
            binding.imageViewCart.load(horizontalCartModel.cartImage)
            binding.textViewAd.text = horizontalCartModel.adText
        }
    }
}
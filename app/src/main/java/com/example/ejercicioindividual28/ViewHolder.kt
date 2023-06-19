package com.example.ejercicioindividual28

import android.content.ClipData.Item
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ejercicioindividual28.databinding.ListItemBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class ViewHolder (view: View): RecyclerView.ViewHolder(view){

    val binding = ListItemBinding.bind(view)

    fun render(item: ItemList){
        binding.txtNombre.text=item.nombre
        Glide.with(binding.iconItem.context).load(item.icon).into(binding.iconItem)

        binding.card.setOnClickListener {

            MaterialAlertDialogBuilder(binding.txtNombre.context)
                .setTitle(item.nombre)
                .setMessage("Tiene ${item.habitantes} habitantes.")
                .setPositiveButton("Aceptar") { dialog, which ->
                    // Respond to positive button press
                }
                .show()

        }
    }
}
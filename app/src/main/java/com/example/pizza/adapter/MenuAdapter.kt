package com.example.pizza.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pizza.R
import com.example.pizzeria.PizzaModel
import kotlinx.android.synthetic.main.item.view.*

class MenuAdapter (val pizzas: ArrayList<PizzaModel>, val listener: RecyclerViewClickListener) :
    RecyclerView.Adapter<MenuAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemLayoutView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, null)

        return ViewHolder(itemLayoutView, listener)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.setName(pizzas[position].name)

    }


    override fun getItemCount(): Int {

        return pizzas.size

    }


    inner class ViewHolder(itemView: View, private val listener: RecyclerViewClickListener) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {

        init {

            itemView.button_show.setOnClickListener(this)
        }


        fun setName(name: String) {
            itemView.textView_pizza.text = name
        }

        override fun onClick(view: View) {

            listener.onClick(view, adapterPosition, itemView.textView_pizza.text.toString())

        }

    }

}
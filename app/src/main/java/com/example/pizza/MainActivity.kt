package com.example.pizza

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import butterknife.ButterKnife
import com.example.pizza.adapter.MenuAdapter
import com.example.pizza.adapter.RecyclerViewClickListener
import com.example.pizza.decorators.PineappleDecorator
import com.example.pizza.model.AbstractPizza
import com.example.pizzeria.CheeseDecorator
import com.example.pizzeria.HamDecorator
import com.example.pizzeria.Pizza
import com.example.pizzeria.PizzaModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var menuAdapter: MenuAdapter? = null
    var pizzas = ArrayList<PizzaModel>()
    private var apizza: AbstractPizza? = Pizza()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        val layoutManager = LinearLayoutManager(this)
        recyclerView_menu.layoutManager = layoutManager

        pizzas.add(PizzaModel("Brak"))
        pizzas.add(PizzaModel("Szynka"))
        pizzas.add(PizzaModel("Ser"))
        pizzas.add(PizzaModel("Ananas"))

        val listener = object : RecyclerViewClickListener {
            override fun onClick(view: View, position: Int, name: String) {

                if (position == 0) {
                    apizza = Pizza()
                    tv.text = apizza?.getPrice().toString()
                }
                if (position == 1) {
                    apizza = HamDecorator(apizza!!)
                    tv.text = apizza?.getPrice().toString()
                }
                if (position == 2) {
                    apizza = CheeseDecorator(apizza!!)
                    tv.text = apizza?.getPrice().toString()
                }
                if (position == 3) {
                    apizza = PineappleDecorator(apizza!!)
                    tv.text = apizza?.getPrice().toString()
                }
            }

        }
        menuAdapter = MenuAdapter(pizzas, listener)
        recyclerView_menu.adapter = menuAdapter

        button_order.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            val message = tv!!.text.toString()
            intent.putExtra("key", message)
            startActivity(intent)

        }
    }
}

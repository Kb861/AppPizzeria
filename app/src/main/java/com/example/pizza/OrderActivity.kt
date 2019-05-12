package com.example.pizza

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import butterknife.ButterKnife
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        ButterKnife.bind(this)
        bill.setText(intent.getStringExtra("key"))




    }
}

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_item_screen.addBtn
import kotlinx.android.synthetic.main.activity_item_screen.backBtn
import kotlinx.android.synthetic.main.activity_item_screen.descriptionTxt
import kotlinx.android.synthetic.main.activity_item_screen.itemPic
import kotlinx.android.synthetic.main.activity_item_screen.itemPrice
import kotlinx.android.synthetic.main.activity_item_screen.itemTitle
import kotlinx.android.synthetic.main.activity_item_screen.minusBtn
import kotlinx.android.synthetic.main.activity_item_screen.quantityTxt
import kotlinx.android.synthetic.main.activity_item_screen.readMoreBtn


class item_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_screen)
        val receivedTitle = intent.extras!!.getString("title")
        val receivedPrice = intent.extras!!.getString("price")
        val receivedPath = intent.extras!!.getString("imagePath")
        itemTitle.text = receivedTitle
        itemPrice.text = receivedPrice
        Picasso.get()
            .load(receivedPath)
            .resize(300, 300)
            .into(itemPic)
        var quantity = quantityTxt.text.toString().toInt()

        addBtn.setOnClickListener {
            quantity += 1
            quantityTxt.setText(quantity.toString())
        }

        minusBtn.setOnClickListener {
            if (quantity > 1) {
                quantity -= 1
                quantityTxt.setText(quantity.toString())
            } else {
                quantityTxt.setText("1")
            }
        }
        readMoreBtn.setOnClickListener {
            if (readMoreBtn.text == "Read More") {
                descriptionTxt.maxLines = Int.MAX_VALUE
                readMoreBtn.text = "Read Less"
            } else if (readMoreBtn.text == "Read Less") {
                descriptionTxt.maxLines = 2
                readMoreBtn.text = "Read More"
            }
        }
        backBtn.setOnClickListener {
            finish()
        }
    }
}

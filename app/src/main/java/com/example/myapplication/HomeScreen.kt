package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_home_screen.itemFour
import kotlinx.android.synthetic.main.activity_home_screen.itemFourPrice
import kotlinx.android.synthetic.main.activity_home_screen.itemFourTitle
import kotlinx.android.synthetic.main.activity_home_screen.itemImageFour
import kotlinx.android.synthetic.main.activity_home_screen.itemImageOne
import kotlinx.android.synthetic.main.activity_home_screen.itemImageThree
import kotlinx.android.synthetic.main.activity_home_screen.itemImageTwo
import kotlinx.android.synthetic.main.activity_home_screen.itemOne
import kotlinx.android.synthetic.main.activity_home_screen.itemOnePrice
import kotlinx.android.synthetic.main.activity_home_screen.itemOneTitle
import kotlinx.android.synthetic.main.activity_home_screen.itemThree
import kotlinx.android.synthetic.main.activity_home_screen.itemThreePrice
import kotlinx.android.synthetic.main.activity_home_screen.itemThreeTitle
import kotlinx.android.synthetic.main.activity_home_screen.itemTwo
import kotlinx.android.synthetic.main.activity_home_screen.itemTwoPrice
import kotlinx.android.synthetic.main.activity_home_screen.itemTwoTitle


class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val imagePathOne = "https://omalo.fr/site/wp-content/uploads/2021/03/Malo-Burger_O-malo-2.png"
        val imagePathTwo = "https://png.pngtree.com/png-clipart/20230425/original/pngtree-burger-cheese-beef-transparent-png-image_9096453.png"
        val imagePathThree = "https://png.pngtree.com/png-clipart/20231002/original/pngtree-crispy-and-delicious-french-fries-png-image_13066544.png"
        val imagePathFour = "https://freepngimg.com/download/pizza/35730-9-pepperoni-pizza-image.png"

        Picasso.get()
            .load(imagePathOne)
            .resize(500,500)
            .into(itemImageOne)

        Picasso.get()
            .load(imagePathTwo)
            .resize(500,500)
            .into(itemImageTwo)

        Picasso.get()
            .load(imagePathThree)
            .resize(500,500)
            .into(itemImageThree)

        Picasso.get()
            .load(imagePathFour)
            .resize(500,500)
            .into(itemImageFour)


        itemOne.setOnClickListener {
            val price = itemOnePrice.text
            val title = itemOneTitle.text

            val i = Intent(this@HomeScreen, item_screen::class.java)
            i.putExtra("price", price)
            i.putExtra("title", title)
            i.putExtra("imagePath", imagePathOne)
            startActivity(i)
        }

            itemTwo.setOnClickListener {
                val price=itemTwoPrice.text
                val title = itemTwoTitle.text
                val i = Intent(this@HomeScreen, item_screen::class.java)
                i.putExtra("price",price)
                i.putExtra("title",title)
                i.putExtra("imagePath",imagePathTwo)
                startActivity(i)

        }

        itemThree.setOnClickListener {
            val price=itemThreePrice.text
            val title = itemThreeTitle.text
            val i = Intent(this@HomeScreen, item_screen::class.java)
            i.putExtra("price",price)
            i.putExtra("title",title)
            i.putExtra("imagePath",imagePathThree)
            startActivity(i)

        }
        itemFour.setOnClickListener {
            val price=itemFourPrice.text
            val title = itemFourTitle.text
            val i = Intent(this@HomeScreen, item_screen::class.java)
            i.putExtra("price",price)
            i.putExtra("title",title)
            i.putExtra("imagePath",imagePathFour)
            startActivity(i)

        }


    }
}

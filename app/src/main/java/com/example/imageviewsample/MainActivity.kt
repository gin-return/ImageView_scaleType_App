package com.example.imageviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        big_image_bt.setOnClickListener {
            image.setImageResource(R.drawable.thubmnail)
        }

        small_image_bt.setOnClickListener {
            image.setImageResource(R.drawable.redroid)
        }

        center_bt.setOnClickListener {
            image.scaleType = ImageView.ScaleType.CENTER
        }

        centerCrop_bt.setOnClickListener {
            image.scaleType = ImageView.ScaleType.CENTER_CROP
        }

        centerInside_bt.setOnClickListener {
            image.scaleType = ImageView.ScaleType.CENTER_INSIDE
        }

        fitCenter_bt.setOnClickListener {
            image.scaleType = ImageView.ScaleType.FIT_CENTER
        }

        fitEnd_bt.setOnClickListener {
            image.scaleType = ImageView.ScaleType.FIT_END
        }

        fitStart_bt.setOnClickListener {
            image.scaleType = ImageView.ScaleType.FIT_START
        }

        fitXY_bt.setOnClickListener {
            image.scaleType = ImageView.ScaleType.FIT_XY
        }

    }



}

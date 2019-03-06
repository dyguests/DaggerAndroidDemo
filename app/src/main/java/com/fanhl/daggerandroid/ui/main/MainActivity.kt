package com.fanhl.daggerandroid.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fanhl.daggerandroid.R
import com.fanhl.daggerandroid.domain.model.Car
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        text_view.text = car.wheel.type()
    }
}

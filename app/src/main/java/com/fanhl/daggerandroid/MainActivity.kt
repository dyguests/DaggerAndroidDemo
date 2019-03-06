package com.fanhl.daggerandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fanhl.daggerandroid.domain.model.Car
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerAppComponent.builder()
//            .build()
//            .inject(this)
        text_view.text = car.wheel.type()
    }
}

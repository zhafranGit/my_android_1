package com.example.myapplicationdicoding

import android.bluetooth.BluetoothDevice.EXTRA_NAME
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val tvDataReceiver: TextView = findViewById(R.id.tv_data_received)

        val name = intent.getStringArrayExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = "Name : $name, your age : $age"
        tvDataReceiver.text = text
    }
companion object {
    const val EXTRA_AGE = "extra_age"
    const val EXTRA_NAME = "extra_name"
    }
}

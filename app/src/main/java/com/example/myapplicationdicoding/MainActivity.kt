package com.example.myapplicationdicoding

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.ViewPropertyAnimatorCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id){
                R.id.btn_move_activity ->{
                    val moveIntent = Intent(this@MainActivity,Main2Activity::class.java)
                    startActivity(moveIntent)
                }
                R.id.btn_move_activity_data ->{
                    val moveWithDataIntent = Intent(this@MainActivity,Main3Activity::class.java)
                    moveWithDataIntent.putExtra(Main3Activity.EXTRA_NAME, "Zhafran Saloom")
                    moveWithDataIntent.putExtra(Main3Activity.EXTRA_AGE, 22)
                    startActivity(moveWithDataIntent)
                }
                R.id.btn_dial_number -> {
                    val phoneNumber = "085961531869"
                    val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                    startActivity(dialPhoneIntent)
                }
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
    }

}


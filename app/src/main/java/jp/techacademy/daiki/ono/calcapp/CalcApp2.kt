package jp.techacademy.daiki.ono.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_app2.*

class CalcApp2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_app2)

        val value1=intent.getDoubleExtra("VALUE",0.0)



        textView1.text= value1.toString()
    }
}
package jp.techacademy.daiki.ono.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v:View?){
        val intent = Intent(this,CalcApp2::class.java)
        val value1=editText1.text.toString().toDouble()
        val value2=editText2.text.toString().toDouble()
        var value3=0.0
        if (v != null) {
            if(v.id==R.id.button1){
                value3=(value1+value2)
            }else if(v.id==R.id.button2){
                value3= (value1-value2)
            }else if(v.id==R.id.button3){
                value3=(value1*value2)
            }else{
                value3=(value1/value2)
            }
        }

        intent.putExtra("VALUE",value3)
        startActivity(intent)
    }
}

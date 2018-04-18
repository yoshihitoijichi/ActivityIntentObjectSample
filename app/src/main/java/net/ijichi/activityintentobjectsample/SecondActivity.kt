package net.ijichi.activityintentobjectsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    companion object {
        val KEY_STATE = "key_state"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val states = intent.getSerializableExtra(KEY_STATE) as ArrayList<*>

        states.forEach {
            if(it is DataState){
                println(it.id)
                println(it.name)
            }
        }
    }
}
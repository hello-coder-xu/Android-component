package com.ants.component.activity.life

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

import com.ants.component.R
import kotlinx.android.synthetic.main.life_first_main.*

/**
 * 生命周期第一个页面
 */

class FirstActivity : AppCompatActivity() {
    var tag: String = "life ${javaClass.simpleName}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.life_first_main)

        initView()

        print("onCreate()")
    }

    private fun initView() {
        next?.setOnClickListener {
            startActivity(Intent(this, SecondeActivity::class.java))
        }
    }


    /**
     * 打印
     */
    private fun print(value: String) {
        Log.w(tag, value)
    }

    override fun onStart() {
        super.onStart()
        print("onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart()")
    }

    override fun onResume() {
        super.onResume()
        print("onResume()")
    }

    override fun onPause() {
        super.onPause()
        print("onPause()")
    }

    override fun onStop() {
        super.onStop()
        print("onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy()")
    }


}

package com.ants.component.activity.life

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

import com.ants.component.R
import kotlinx.android.synthetic.main.life_seconde_main.*

/**
 * 生命周期第一个页面
 */

class SecondeActivity : AppCompatActivity() {
    var tag: String = "life ${javaClass.simpleName}"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_seconde_main)

        initView()

        print("onCreate()")
    }

    private fun initView() {
        back?.setOnClickListener {
            finish()
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

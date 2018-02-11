package com.ants.component.activity.life

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

import com.ants.component.R

/**
 * 查看activity 中 fragment 的生命周期
 */

class ActivityFragmentActivity : AppCompatActivity() {
    var tag: String = "life ${javaClass.simpleName}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.life_activityfragment_main)

        initView()

        print("onCreate()")
    }


    private fun initView() {
        var transaction = fragmentManager.beginTransaction()
        var lifeFragment = LifeFragment()
        transaction.replace(R.id.fragment_layout, lifeFragment)
        transaction.commit()
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

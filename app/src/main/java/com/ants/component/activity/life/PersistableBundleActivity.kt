package com.ants.component.activity.life

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

import com.ants.component.R
import kotlinx.android.synthetic.main.life_persistable_main.*

/**
 * 数据持久化保存
 */

class PersistableBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.life_persistable_main)

        initView()
    }

    private fun initView() {
        var type = intent.getStringExtra("type")
        if (type != null && type.isNotEmpty()) {
            text?.text = type
        }
        kill?.setOnClickListener {
            System.exit(0)
        }
        back?.setOnClickListener { finish() }
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        println("PersistableBundleActivity onPostCreate 1")
        if (persistentState != null) {
            text.text = persistentState.getString("text")
        }
    }


    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        outPersistentState.putString("text", text.text.toString())
        super.onSaveInstanceState(outState, outPersistentState)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle, persistentState: PersistableBundle) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        if (persistentState != null) {
            text.text = persistentState.getString("text")
        }
    }
}

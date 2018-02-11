package com.ants.component.activity.life

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ants.component.R
import kotlinx.android.synthetic.main.life_fragment_main.*

/**
 * fragment 生命周期
 */

class LifeFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        print("onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print("onCreate()")
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        print("onCreateView()")
        return inflater.inflate(R.layout.life_fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
        print("onActivityCreated()")

    }

    private fun initView() {
        back?.setOnClickListener { activity.finish() }
        next?.setOnClickListener {
            startActivity(Intent(activity, SecondeActivity::class.java))
        }
    }

    /**
     * 打印
     */
    private fun print(value: String) {
        Log.w("ActivityFragmentActivity fragment", value)
    }

    override fun onStart() {
        super.onStart()
        print("onStart()")
    }

    override fun onResume() {
        super.onResume()
        print("onResume()")
    }

    override fun onStop() {
        super.onStop()
        print("onStop()")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        print("onDestroyView()")
    }

    override fun onDetach() {
        super.onDetach()
        print("onDetach()")
    }
}

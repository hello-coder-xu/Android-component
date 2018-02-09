package com.ants.component

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.ants.component.activity.life.FirstActivity
import com.ants.component.comm.ListBean
import com.zhy.adapter.recyclerview.CommonAdapter
import com.zhy.adapter.recyclerview.base.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        var arrayList = ArrayList<ListBean>()

        arrayList.add(ListBean(1, "LifeActivity"))
        arrayList.add(ListBean(2, "StartWay"))
        arrayList.add(ListBean(3, "JumpWay"))
        arrayList.add(ListBean(4, "Anim"))
        arrayList.add(ListBean(5, "ShareComponent"))

        main_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        main_recycler.adapter = object : CommonAdapter<ListBean>(this, R.layout.main_item, arrayList) {
            override fun convert(holder: ViewHolder, listBean: ListBean, position: Int) {
                holder.setText(R.id.main_item_text, listBean.name)
                holder.itemView.setOnClickListener {
                    when (listBean.id) {
                        1 -> {
                            startActivity(Intent(context, FirstActivity::class.java))
                        }
                        2 -> {
                        }
                        3 -> {
                        }
                        4 -> {
                        }
                        5 -> {
                        }
                    }
                }
            }
        }
    }

}

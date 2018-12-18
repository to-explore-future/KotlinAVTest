package com.zq.av.ui.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.zq.av.R
import com.zq.av.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * Created by to-explore-future on 2018/12/15
 */
class SplashActivity : BaseActivity() {


    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        ViewCompat.animate(splash_image).scaleX(1.0f).scaleY(1.0f).setListener(object: ViewPropertyAnimatorListener {
            override fun onAnimationEnd(p0: View?) {
                startActivityAndFinish<MainActivity>()
            }

            override fun onAnimationCancel(p0: View?) {
            }

            override fun onAnimationStart(p0: View?) {
            }
        }).duration = 2000
    }


}
package com.v2ray.ang.ui

import android.os.Bundle
import com.v2ray.ang.util.Utils

class AboutActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 直接打开指定网站
        Utils.openUri(this, "https://example.com/")
        // 结束当前活动
        finish()
    }
}
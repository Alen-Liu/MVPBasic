package com.android.alen.mybasicproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Alen on 2018/2/9.
 *
 * 所有Activity的父类   在这里处理通用的逻辑。
 * 例如，添加页面打开的打点， Umeng 统计的处理逻辑等等
 */

public class MyBaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

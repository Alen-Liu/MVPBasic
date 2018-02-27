package com.android.alen.mybasicproject.Module;

import android.app.Activity;
import android.content.Context;

/**
 * Created by Alen on 2018/2/26.
 * MVP 页面的接口类的  父类
 * 里面包含Presenter 和 View
 */

public class BaseContract {
    public interface Presenter { // 在这里定义 Presenter 需要执行的方法

        /**
         * Detach View to prevent Memory Leak
         * Call it in onDestroy of all Activity
         */
        @SuppressWarnings("unused")
        void detachView();

    }

    public interface View { // 在这里定义 View 需要执行的方法
        Context getContext();
        Activity getActivity();
    }
}

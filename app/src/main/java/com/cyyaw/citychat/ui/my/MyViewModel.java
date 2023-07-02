package com.cyyaw.citychat.ui.my;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * 我的 视图 模型
 */
public class MyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("xxxxxxxxxxxxxxxxxxxxxxx");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
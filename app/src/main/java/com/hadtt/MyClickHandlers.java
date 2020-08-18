package com.hadtt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.hadtt.model.User;

public class MyClickHandlers {
    public void onClicked(View view, User user) {
        if (TextUtils.isEmpty(user.getUserName()) || TextUtils.isEmpty(user.getPassword())) {
            // view.setClickable();
        }
    }
}

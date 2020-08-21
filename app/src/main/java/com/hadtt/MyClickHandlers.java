package com.hadtt;

import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;

import androidx.databinding.BindingAdapter;

import com.hadtt.model.User;

public class MyClickHandlers {
    public void onClicked(View view, User user) {
        view.getContext().startActivity(new Intent(view.getContext(), TestRecycleView.class));
    }

    public void checkBox(CheckBox checkBox, User user) {
        checkBox.setChecked(user.isCheck());
    }
}

package com.hadtt;

import android.view.View;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class BindingUtils {

   // @BindingAdapter("setAdapter")
    public static void setAdapter(RecyclerView view, BaseBindingAdapter adapter) {
        view.setAdapter(adapter);
    }


    @BindingAdapter({"android:onClick", "android:clickable"})
    public static void setOnClick(View view, View.OnClickListener clickListener,
                                  boolean clickable) {
        view.setOnClickListener(clickListener);
        view.setClickable(clickable);
    }
}

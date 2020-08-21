package com.hadtt.bindingadapter;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.hadtt.R;
import com.hadtt.databinding.TestBindingAdapterBinding;
import com.hadtt.model.User;

public class TestBindAdapter extends AppCompatActivity {

    private TestBindingAdapterBinding bindingAdapterBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindingAdapterBinding = DataBindingUtil.setContentView(this, R.layout.test_binding_adapter);
        bindingAdapterBinding.setViewModel(new User("ha", "1234"));
    }
}

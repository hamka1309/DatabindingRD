package com.hadtt;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.hadtt.databinding.ActivityTestRecycleViewBinding;
import com.hadtt.model.User;

import java.util.ArrayList;
import java.util.List;

public class TestRecycleView extends AppCompatActivity {
    ActivityTestRecycleViewBinding binding;
    private List<User> data = new ArrayList<>();
    private BaseBindingAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test_recycle_view);
        initData();
        adapter = new BaseBindingAdapter(this);
        BindingUtils.setAdapter(binding.lvUser, adapter);
        adapter.setData(data);
    }

    private void initData() {
        data.add(new User("Nguyễn Văn A", "0123345687"));
        data.add(new User("Nguyễn Văn B", "0985564222"));
        data.add(new User("Nguyễn Văn C", "0988555422"));
        data.add(new User("Nguyễn Văn D", "0985311441"));

    }

}

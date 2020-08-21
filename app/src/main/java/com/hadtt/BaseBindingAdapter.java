package com.hadtt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.hadtt.databinding.ItemRecycleViewBinding;
import com.hadtt.model.User;

import java.util.List;

public class BaseBindingAdapter extends RecyclerView.Adapter<BaseBindingAdapter.ViewHolder> {

    private List<User> data;
    private Context context;

    public BaseBindingAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<User> data) {
        this.data = data;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecycleViewBinding itemRecycleViewBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_recycle_view, parent, false);
        return new ViewHolder(itemRecycleViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User item = data.get(position);
        holder.binding.setVariable(BR.item, item);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecycleViewBinding binding;

        public ViewHolder(ItemRecycleViewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}

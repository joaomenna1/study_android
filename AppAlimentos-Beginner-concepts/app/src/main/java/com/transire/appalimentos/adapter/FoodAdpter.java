package com.transire.appalimentos.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.transire.appalimentos.R;
import com.transire.appalimentos.adapter.viewHolder.FoodViewHolder;
import com.transire.appalimentos.interfaces.OnListClick;
import com.transire.appalimentos.model.FoodEntity;

import java.util.List;

public class FoodAdpter extends RecyclerView.Adapter<FoodViewHolder> {
    private OnListClick mListener;
    private List<FoodEntity> mList;

    public FoodAdpter(List<FoodEntity> list, OnListClick listener) {
        this.mList = list;
        this.mListener =listener;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_food, parent, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodEntity foodEntity = this.mList.get(position);
        holder.bind(foodEntity, this.mListener);
    }

    @Override
    public int getItemCount() {
        return this.mList.size();
    }
}

package com.hamad.empty_mvvm_template.ui.base;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;



public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBind(int position);
}

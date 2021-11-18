package com.hamad.empty_mvvm_template.utils;

import android.content.Context;
import androidx.databinding.BindingAdapter;

import android.widget.ImageView;
import com.bumptech.glide.Glide;


public final class BindingUtils {

    private BindingUtils() {
        // This class is not publicly instantiable
    }



    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        Glide.with(context).load(url).into(imageView);
    }
}

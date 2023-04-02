package com.example.productlistapp.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.productlistapp.R;
import com.example.productlistapp.service.Utility;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;

public class ProductListAdapter extends ArrayAdapter<Product> {

    public ProductListAdapter(@NonNull Context context, @NonNull ArrayList<Product> products) {
        super(context, R.layout.product_list_item, products);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.product_list_item, parent, false);
        }

        Product product = getItem(position);

        TextView mTextViewName = convertView.findViewById(R.id.product_title);
        TextView mTextViewPrice = convertView.findViewById(R.id.product_price);
        TextView mTextViewDescription = convertView.findViewById(R.id.product_description);
        ImageView mProductImage = convertView.findViewById(R.id.product_img_holder);

        mProductImage.setImageResource(product.getImgSrc());
        mTextViewName.setText(String.valueOf(product.getTitle()));
        mTextViewPrice.setText(Utility.formatCurrency(product.getPrice()));
        mTextViewDescription.setText(Utility.truncateString(product.getDescription(), 160));

        return convertView;
    }


}

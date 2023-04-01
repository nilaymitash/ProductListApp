package com.example.productlistapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.productlistapp.R;
import com.example.productlistapp.model.Product;
import com.example.productlistapp.model.ProductListAdapter;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SearchProductActivity extends AppCompatActivity {

    private ListView mProductListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_product);

        ProductListAdapter adapter = new ProductListAdapter(SearchProductActivity.this, fetchProductList());
        mProductListView = findViewById(R.id.product_listview);
        mProductListView.setAdapter(adapter);
    }

    private ArrayList<Product> fetchProductList() {
        ArrayList<Product> productList = new ArrayList<>();

        Product p1 = new Product();
        p1.setSku(123L);
        p1.setItem_title("Some random product 1");
        p1.setRetail_price(new BigDecimal("99.99"));

        Product p2 = new Product();
        p2.setSku(456L);
        p2.setItem_title("Some random product 2");
        p2.setRetail_price(new BigDecimal("199.99"));

        Product p3 = new Product();
        p3.setSku(789L);
        p3.setItem_title("Some random product 3");
        p3.setRetail_price(new BigDecimal("299.99"));

        productList.add(p1);
        productList.add(p2);
        return productList;
    }
}
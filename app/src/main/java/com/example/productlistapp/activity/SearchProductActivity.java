package com.example.productlistapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.productlistapp.R;
import com.example.productlistapp.model.Product;
import com.example.productlistapp.model.ProductListAdapter;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SearchProductActivity extends AppCompatActivity {

    private ListView mProductListView;
    private TextView mLogoutLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_product);

        mLogoutLink = findViewById(R.id.logout_link);
        mProductListView = findViewById(R.id.product_listview);

        mLogoutLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SearchProductActivity.this, MainActivity.class));
            }
        });

        ProductListAdapter adapter = new ProductListAdapter(SearchProductActivity.this, fetchProductList());
        mProductListView.setAdapter(adapter);
        mProductListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Product selectedProduct = (Product) adapterView.getItemAtPosition(position);
                Intent intent = new Intent(SearchProductActivity.this, ProductActivity.class);
                intent.putExtra("selectedProduct", selectedProduct);
                //TODO: add search filter/sort criteria as extra
                startActivity(intent);
            }
        });
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
        productList.add(p3);
        return productList;
    }
}
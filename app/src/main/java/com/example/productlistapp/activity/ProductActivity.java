package com.example.productlistapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.productlistapp.R;
import com.example.productlistapp.model.Product;

public class ProductActivity extends AppCompatActivity {

    private TextView mLogoutLink;
    private Button mBackButton;
    private TextView mProductSKULabel;
    private TextView mProductTitleLabel;
    private TextView mProductPriceLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        mLogoutLink = findViewById(R.id.logout_link);
        mBackButton = findViewById(R.id.back_to_search_btn);
        mProductSKULabel = findViewById(R.id.sku_label);
        mProductTitleLabel = findViewById(R.id.product_title_label);
        mProductPriceLabel = findViewById(R.id.product_price_label);

        Intent intent = getIntent();
        Product selectedProduct = (Product) intent.getSerializableExtra("selectedProduct");
        //TODO: grab search filter/sort criteria from extra

        mProductSKULabel.setText(String.valueOf(selectedProduct.getSku()));
        mProductTitleLabel.setText(String.valueOf(selectedProduct.getItem_title()));
        mProductPriceLabel.setText(String.valueOf(selectedProduct.getRetail_price()));

        mBackButton.setOnClickListener(new ProductPageListener());
        mLogoutLink.setOnClickListener(new ProductPageListener());
    }

    private class ProductPageListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.logout_link: logout(); break;
                case R.id.back_to_search_btn: backToSearch(); break;
                default: break;
            }
        }

        private void backToSearch() {
            Intent intent = new Intent(ProductActivity.this, SearchProductActivity.class);
            //TODO: add search filter/sort criteria as extra
            // so that search page can preserve its state from before navigation.
            intent.putExtra("RETURN_FROM_PRODUCT_PAGE", true);
            startActivity(intent);
        }

        private void logout() {
            startActivity(new Intent(ProductActivity.this, MainActivity.class));
        }
    }
}
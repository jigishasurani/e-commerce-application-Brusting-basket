package com.example.online_shopping;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView fruit, fresh_vegetable, exotic_fruit;
    private ImageView exotic_vegetable, herb, green_leafy_vegetable;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        fruit = (ImageView) findViewById(R.id.fresh_fruit);
        fresh_vegetable = (ImageView) findViewById(R.id.fresh_vegitable);
        exotic_fruit = (ImageView) findViewById(R.id.exotic_fruit);

        exotic_vegetable = (ImageView) findViewById(R.id.exotic_vegitable);
        herb = (ImageView) findViewById(R.id.herb);
        green_leafy_vegetable = (ImageView) findViewById(R.id.green_leafy_vegetable);


        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "fruit");
                startActivity(intent);
            }
        });


        fresh_vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "fresh_vegetable");
                startActivity(intent);
            }
        });



        exotic_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "exotic_fruit");
                startActivity(intent);
            }
        });



        exotic_vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "exotic_vegetable ");
                startActivity(intent);
            }
        });



        herb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "herb");
                startActivity(intent);
            }
        });


        green_leafy_vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "green_leafy_vegetable");
                startActivity(intent);
            }
        });
    }
}

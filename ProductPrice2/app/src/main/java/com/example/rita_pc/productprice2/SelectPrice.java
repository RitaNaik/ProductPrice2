package com.example.rita_pc.productprice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectPrice extends AppCompatActivity
{
    Button mBtnNext_Price;
    String item,price;
    String []names;
    int p;
    public static ArrayList <String> myList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_price);

        Bundle b=getIntent().getExtras();

        String user=b.getString("UserName");

        p=b.getInt("Price");

        item=b.getString("Selected_Item");

        names=b.getStringArray("Spinner");

        final ArrayList<Integer> cost=b.getIntegerArrayList("Prices");

        TextView dispUser= (TextView) findViewById(R.id.txtUserName_Price);

        dispUser.setText("UserName :"+user);


        TextView dispPrice= (TextView) findViewById(R.id.txtDispPrice);

        dispPrice.setText("");
        dispPrice.setText(String.valueOf(p));
        mBtnNext_Price= (Button) findViewById(R.id.btnNext_Price);

        mBtnNext_Price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               Intent i=new Intent(SelectPrice.this,DisplayList.class);
                Bundle b=new Bundle();

               b.putInt("Price",p);
                b.putString("Selected",item);


                /*b.putStringArray("ProductList",names);
                i.putExtra("ProductPrices",cost);*/

                i.putExtras(b);
                startActivity(i);

            }
        });
    }
}

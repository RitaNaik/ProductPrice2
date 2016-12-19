package com.example.rita_pc.productprice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayList extends AppCompatActivity
{
   EditText mEdtName,mEdtPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_list);

       mEdtName= (EditText) findViewById(R.id.edtProductName);
        mEdtPrice= (EditText) findViewById(R.id.edtPrice);

        Bundle b=getIntent().getExtras();

        String [] product_name=b.getStringArray("ProductList");

        int cost=b.getInt("Price");

        String selected=b.getString("Selected");

        mEdtName.setText(selected.toString());
        mEdtPrice.setText(String.valueOf(cost));

       /* ArrayList<Integer>product_Cost=b.getIntegerArrayList("ProductPrices");

        //Toast.makeText(this,"selected product:"+selected+" "+cost,Toast.LENGTH_LONG).show();

        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,product_name);

        mList1.setAdapter(adapter);

        ArrayAdapter <Integer> adapter1=new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,product_Cost);
        mList2.setAdapter(adapter1);*/



    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}

package com.example.rita_pc.productprice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SelectProduct extends AppCompatActivity
{
    String u,selected;
    Button mBtnNext_Product;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_product);

        final Bundle b1=new Bundle();
        Bundle b = getIntent().getExtras();

        u = b.getString("UserName");


        TextView tv = (TextView) findViewById(R.id.txtUserName_Product);
        tv.setText("UserName: " + u);

        mBtnNext_Product= (Button) findViewById(R.id.btnNext_Product);
        spinner= (Spinner) findViewById(R.id.spinnerProduct);

        final String [] products=new String[]{"KeyBoard","Mouse","Monitor","CPU","Printer","Speakers","PenDrive"};

        final ArrayList<Integer> price=new ArrayList<>();

            price.add(100);
            price.add(200);
            price.add(300);
            price.add(400);
            price.add(500);
            price.add(600);
            price.add(700);


        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,products);
        spinner.setAdapter(adapter);


        mBtnNext_Product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(SelectProduct.this,SelectPrice.class);

                b1.putString("UserName",u);
               b1.putStringArray("Spinner",products);
                b1.putIntegerArrayList("Prices",price);

                i.putExtras(b1);

                startActivity(i);
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                 selected=parent.getItemAtPosition(position).toString();
                if(position==0)
                {
                    b1.putString("Selected_Item",selected);
                    b1.putInt("Price",price.get(position));
                }
               else if(position==1)
                {
                    b1.putString("Selected_Item",selected);
                    b1.putInt("Price",price.get(position));
                }
                else if(position==2)
                {
                    b1.putString("Selected_Item",selected);
                    b1.putInt("Price",price.get(position));
                }
                else if(position==3)
                {
                    b1.putString("Selected_Item",selected);
                    b1.putInt("Price",price.get(position));
                }
                else if(position==4)
                {
                    b1.putString("Selected_Item",selected);
                    b1.putInt("Price",price.get(position));
                }
                else if(position==5)
                {
                    b1.putString("Selected_Item",selected);
                    b1.putInt("Price",price.get(position));
                }
                else if(position==6)
                {
                    b1.putString("Selected_Item",selected);
                    b1.putInt("Price",price.get(position));
                }
                else
                {
                    Toast.makeText(SelectProduct.this,"Invalid Input",Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }
}

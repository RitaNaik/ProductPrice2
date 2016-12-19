package com.example.rita_pc.productprice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText mEdtUser,mEdtPass;
    Button mBtnCancel,mBtnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtUser=(EditText)findViewById(R.id.edtUser);
        mEdtPass= (EditText) findViewById(R.id.edtPass);

        mBtnCancel= (Button) findViewById(R.id.btnCancel);
        mBtnOk= (Button) findViewById(R.id.btnOk);

        mBtnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mEdtUser.setText("");
                mEdtPass.setText("");
            }
        });

        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String user=mEdtPass.getText().toString();
                String pass=mEdtPass.getText().toString();
                if(user.equals("android") && (pass.equals("android")))
                {
                        Intent intent=new Intent(MainActivity.this,SelectProduct.class);
                    Bundle b=new Bundle();
                    b.putString("UserName",user);


                    //Add the set of extended data to the intent and start it
                    intent.putExtras(b);//putExtra() hold the value in intent object

                    startActivity(intent);//It is used because we dont want to come back to first Activity
                    //startActivityForResult(intent,REQUEST_CODE);//It is used because we have to come back to the first activity for displaying result.

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid UserName or Password!!!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}

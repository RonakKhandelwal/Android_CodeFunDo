package com.example.ronak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText cName,pName,special,cEmail,cNum,yoe;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button b = (Button)findViewById(R.id.submit);
        final EditText cName = (EditText)findViewById(R.id.cName);
        final EditText pName = (EditText)findViewById(R.id.pName);
        final EditText special = (EditText)findViewById(R.id.special);
        final EditText cEmail = (EditText)findViewById(R.id.cEmail);
        final EditText cNum = (EditText)findViewById(R.id.cNum);
        final EditText yoe = (EditText)findViewById(R.id.yoe);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a0 = cName.getText().toString();
                String a1 = pName.getText().toString();
                String a2 = special.getText().toString();
                String a3 = cEmail.getText().toString();
                String a4 = cNum.getText().toString();
                String a5 = yoe.getText().toString();

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);


            }
        };

        b.setOnClickListener(ocl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

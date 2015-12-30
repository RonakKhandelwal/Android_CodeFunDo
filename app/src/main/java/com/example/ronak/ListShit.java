package com.example.ronak;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class ListShit extends ListActivity {
    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<No> listItems=new ArrayList<No>();

    Listen l;

    String a="Big One";

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<No> adapter;

    //RECORDING HOW MANY TIMES THE BUTTON HAS BEEN CLICKED
    int clickCounter=0;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);
        l = new Listen();
        adapter=new ArrayAdapter<No>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        setListAdapter(adapter);
    }

    //METHOD WHICH WILL HANDLE DYNAMIC INSERTION
    public void addItems(View v) {
        Context c = this.getApplicationContext();
        No b = new No(c,a);
        b.setOnClickListener(getOnClickDoSomething(b));
            b.setText("Hello");
        listItems.add(b);
        //int i=0;
        adapter.notifyDataSetChanged();
        //for (Button bl:listItems){
          //  b.setText("hELLo");
        //}
    }
    View.OnClickListener getOnClickDoSomething(final Button button)  {
        return new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BigDisc.class);
                i.putExtra("Text",a);
                startActivity(i);
            }
        };
    }

    class Listen implements View.OnClickListener{
        @Override
        public void onClick(View v) {




        }
    }

}




class No extends Button{
    TextView descText;
    ImageButton show, hide;
    public No(Context context,String a) {
        super(context);

    }
    public String toString(){
        String a = this.getText().toString();
        return a;
    }
}






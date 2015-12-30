package com.example.ronak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by ronak on 31/10/15.
 */
public class Node extends RelativeLayout {

    View rootView;
    TextView disc,comp,stip;
    ImageView iv;
    public Node(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Node(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context){
        rootView = inflate(context, R.layout.component_node, this);
        disc = (TextView)findViewById(R .id.disc);
        comp = (TextView)findViewById(R.id.comp);
        stip = (TextView)findViewById(R.id.stip);


    }
}


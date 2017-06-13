package ajaymehta.registerrecieveintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // we are first registering this activity or app for social sharing ...by giving it intent filter in mainfiest file
    // second it will reciving data coming with intent (SEND) for social sharing..this all will recieve and print it in text view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i  = getIntent();
        String action  = i.getAction();
        String type = i.getType();

        if(Intent.ACTION_SEND.equals(action) && type !=null) {
            if("text/html".equals(type)) {
                updateTextView(i);    // see when u are not feeling like making intent or any other object gloable..simply pass it between method...aah naa haan..yeah!

            }
        }
    }

    private void updateTextView(Intent i) {

      String data =   i.getStringExtra(Intent.EXTRA_TEXT);

        TextView textview = (TextView) findViewById(R.id.tv_get_data);

        textview.setText(data);

    }
}

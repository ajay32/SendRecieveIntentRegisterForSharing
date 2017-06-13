package ajaymehta.sendrecieveintentregisterforsharing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendDataToApp(View view) {

        String msg = ((EditText) findViewById(R.id.et_put)).getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);  // sending somthing n whats that
        intent.putExtra(Intent.EXTRA_TEXT, msg);   // that is text... our msg  // wee Intent.EXTRA_TEXT is a key here build in baby
        intent.setType("text/html");             // telling  type of data is text..
        startActivity(Intent.createChooser(intent, "Share via..."));
    }
}

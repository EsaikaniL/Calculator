package com.example.dinesh.newproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText e1,e2;
    ImageButton floatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatButton=(ImageButton)findViewById(R.id.fab);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Button Cicked",Toast.LENGTH_LONG).show();
                //.setAction("Action", null)
                     //   .show();

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         e1 = (EditText) findViewById(R.id.editText);
         e2 = (EditText) findViewById(R.id.editText2);
         t1 = (TextView) findViewById(R.id.textView);
        Button b = (Button) findViewById(R.id.button);
        Button b1 = (Button) findViewById(R.id.button2);


b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    if(e1.getText().toString().equals("")||e2.getText().toString().equals("")) {

        Toast.makeText(getApplicationContext(),"please fill the number fields correctly",Toast.LENGTH_LONG).show();

    }
        else
    {
        int t = Integer.parseInt(e1.getText().toString());
        int t11 = Integer.parseInt(e2.getText().toString());
        int sum = t + t11;
        t1.setText(String.valueOf(sum));

    }
    }

});
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((e1.getText().toString().equals(""))||(e2.getText().toString().equals("")))) {

                    Toast.makeText(getApplicationContext(), "please fill the number fields correctly", Toast.LENGTH_LONG).show();

                } else {

                    int t = Integer.parseInt(e1.getText().toString());
                    int t11 = Integer.parseInt(e2.getText().toString());
                    int sum = t - t11;
                    t1.setText(String.valueOf(sum));
                }
            }

        });
    }




    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }*/
}

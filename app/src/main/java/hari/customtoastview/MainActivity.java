package hari.customtoastview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.buttonClick);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t=new Toast(getApplicationContext());
                t.setDuration(Toast.LENGTH_LONG);
                LayoutInflater lin=getLayoutInflater();
                View appear=lin.inflate(R.layout.toastcustom, (ViewGroup) findViewById(R.id.toast_linear));
                t.setView(appear);
                t.show();
            }
        });
    }
}

package com.mobilprogramlama.nov9proje1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    TextView ekle;
    Button btn1,btn2,btn3;
    int say=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ekle=(TextView) findViewById(R.id.txtSayac);
        btn1=(Button) findViewById(R.id.buttonYukari);
        btn2=(Button) findViewById(R.id.buttonAsagi);
        btn3=(Button) findViewById(R.id.buttonSifirla);


        ekle.setText("Sayac: "+0);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++say;
                ekle.setText("Sayac: "+say);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (say>0)
                {
                    --say;
                    ekle.setText("Sayac: "+say);
                }else
                {
                    say=0;
                }
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                say=0;
                ekle.setText("Sayac: "+say);
            }
        });
    }
}
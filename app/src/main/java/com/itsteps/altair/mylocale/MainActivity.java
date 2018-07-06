package com.itsteps.altair.mylocale;

import java.util.Locale;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    String mLang1;
    String mLang2;
    private Locale mNewLocale;
    TextView txtV;
    TextView txtV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ruBtn = (Button) findViewById(R.id.button1);
        Button enBtn = (Button) findViewById(R.id.button2);

        OnClickListener clickBtn = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.button1:
                        setLocale1("en");
                        break;
                    case R.id.button2:
                        setLocale2("ru");
                        break;
                    default:

                }
            }
        };

        ruBtn.setOnClickListener(clickBtn);
        enBtn.setOnClickListener(clickBtn);

    }

    public void  updateTextView() {
        txtV = (TextView) findViewById(R.id.textView1);

        txtV.setText(getResources().getString(R.string.text));}


    }

    public void  updateTextView2() {
        txtV2 = (TextView) findViewById(R.id.textView2);

            txtV2.setText(getResources().getString(R.string.text2));}

    }

    void setLocale1(String mLang1) {
        newLocale = new Locale(mLang);
        Locale.setDefault(mNewLocale);
        android.content.res.Configuration config = new android.content.res.Configuration();
        config.locale = mNewLocale;
        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
        updateTextView();
    }
    void setLocale2(String mLang2) {
            newLocale = new Locale(mLang);
            Locale.setDefault(mNewLocale);
            android.content.res.Configuration config = new android.content.res.Configuration();
            config.locale = mNewLocale;
            getResources().updateConfiguration(config, getResources().getDisplayMetrics());
            updateTextView2();
            }
}
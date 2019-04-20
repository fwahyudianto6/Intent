package com.fwahyudianto.learn.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityObject extends AppCompatActivity {
    public static final String strExtraName = "extra_name";
    public static final String strExtraEmail = "extra_email";
    public static final String strExtraNik = "extra_nik";
    public static final String strExtraAge = "extra_age";

    TextView tvObjectReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);

        setTitle("Move Activity With Object [Intent Explicit]");

        tvObjectReceived = findViewById(R.id.tv_moveactivityobject);

        String strName = getIntent().getStringExtra(strExtraName);
        String strEmail = getIntent().getStringExtra(strExtraEmail);
        String strNik = getIntent().getStringExtra(strExtraNik);
        int iAge = getIntent().getIntExtra(strExtraAge, 0);

        String strResult = "Name \t: \t" + strName +
                "\nEmail  \t: \t" + strEmail +
                "\nNIK  \t\t: \t" + strNik +
                "\nAge \t\t: \t" + iAge;
        tvObjectReceived.setText(strResult);
    }
}
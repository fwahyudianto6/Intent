package com.fwahyudianto.learn.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityData extends AppCompatActivity {
    //  Declaration Variable
    public static final String strExtraName = "extra_name";
    public static final String strExtraNik = "extra_nik";
    public static final String strExtraAge = "extra_age";

    TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        setTitle("Move Activity With Data");    // Set Title Activity

        tvDataReceived = findViewById(R.id.tv_moveactivitydata);    //  Declaration TextView

        //  Get Data From Activity
        String strName = getIntent().getStringExtra(strExtraName);
        String strNik = getIntent().getStringExtra(strExtraNik);
        int iAge = getIntent().getIntExtra(strExtraAge, 0);

        String strResult = "Name \t: \t" + strName +
                "\nNIK  \t\t: \t" + strNik +
                "\nAge \t\t: \t" + iAge;
        tvDataReceived.setText(strResult);
    }
}
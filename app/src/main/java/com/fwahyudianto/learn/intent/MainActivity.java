package com.fwahyudianto.learn.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveActivityData;
    Button btnMoveActivityObject;
    Button btnDialNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityData = findViewById(R.id.btn_move_activitydata);
        btnMoveActivityData.setOnClickListener(this);

        btnMoveActivityObject = findViewById(R.id.btn_moveactivityobject);
        btnMoveActivityObject.setOnClickListener(this);

        btnDialNumber = findViewById(R.id.btn_dialnumber);
        btnDialNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                //  Start New Activity
                Intent oIntentMove = new Intent(MainActivity.this, MoveActivity.class); // Create object
                startActivity(oIntentMove); // Start new activity without data
                break;
            case R.id.btn_move_activitydata:
                Intent oIntentMoveData = new Intent(MainActivity.this, MoveActivityData.class);
                oIntentMoveData.putExtra(MoveActivityData.strExtraName, "Fajar Wahyudianto");   //  Set Value to Send Other Activity
                oIntentMoveData.putExtra(MoveActivityData.strExtraNik, "3302262511920001");
                oIntentMoveData.putExtra(MoveActivityData.strExtraAge, 26);
                startActivity(oIntentMoveData);
                break;
            case R.id.btn_moveactivityobject:
                //  Create New Person (Object) with Value by Parameter
                Person oPerson = new Person(
                        "Fajar Wahyudianto",
                        "fwahyudi06@gmail.com",
                        "3302262511920001",
                        26);

                Intent oIntentObject = new Intent(MainActivity.this, MoveActivityObject.class);
                oIntentObject.putExtra(MoveActivityObject.strExtraName, oPerson.getName());
                oIntentObject.putExtra(MoveActivityObject.strExtraEmail, oPerson.getEmail());
                oIntentObject.putExtra(MoveActivityObject.strExtraNik, oPerson.getNik());
                oIntentObject.putExtra(MoveActivityObject.strExtraAge, oPerson.getAge());
                startActivity(oIntentObject);

                oPerson = null;
                break;
            case R.id.btn_dialnumber:
                String strMobileNumber = "085747117005";
                Intent oIntentDial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + strMobileNumber));
                startActivity(oIntentDial);
                break;
        }
    }
}
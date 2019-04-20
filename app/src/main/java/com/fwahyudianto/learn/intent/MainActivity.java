package com.fwahyudianto.learn.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveActivityData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityData = findViewById(R.id.btn_move_activitydata);
        btnMoveActivityData.setOnClickListener(this);
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
        }
    }
}
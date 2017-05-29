package org.sawhers.altafhussain.togglebutton_switch;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    TextView tv1;
    ToggleButton toggleButton,Togglebtn2,ToggleButonChangeBg;
    LinearLayout myLayout;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton= (ToggleButton) findViewById(R.id.toggleButton);
        myLayout=(LinearLayout)findViewById(R.id.main_layout);
        tv1= (TextView) findViewById(R.id.tv_Togglebtn);
        Togglebtn2= (ToggleButton) findViewById(R.id.togglebtn2);

        aSwitch= (Switch) findViewById(R.id.switch1);

        ToggleButonChangeBg= (ToggleButton) findViewById(R.id.toggleButonChangeBg);

        Togglebtn2.setOnCheckedChangeListener(this);
        aSwitch.setOnCheckedChangeListener(this);
        ToggleButonChangeBg.setOnCheckedChangeListener(this);





        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //Toast.makeText(MainActivity.this, "Turn on", Toast.LENGTH_SHORT).show();
                    tv1.setText("You Turn On the Toggle Button");
                }
                else {
                    //Toast.makeText(MainActivity.this, "Turn off", Toast.LENGTH_SHORT).show();
                    tv1.setText("You Turn Off the Toggle Button");
                }
            }
        });
        //*****************************************************************************************
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){

            case R.id.togglebtn2:
                if (isChecked){
                    myLayout.setBackgroundColor(Color.DKGRAY);
                }
                else {
                    myLayout.setBackgroundColor(Color.WHITE);
                }
                break;

            case R.id.switch1:
                if (isChecked){
                    myLayout.setBackgroundColor(Color.DKGRAY);
                }
                else {
                    myLayout.setBackgroundColor(Color.WHITE);
                }


                break;
            case R.id.toggleButonChangeBg:
                if (isChecked){
                    myLayout.setBackgroundResource(R.drawable.b);
                }
                else {
                    myLayout.setBackgroundColor(Color.WHITE);
                }


                break;
        }




    }

}

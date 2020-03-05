package com.example.houserent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.houserent.constants.Constants;

public class MainActivity extends AppCompatActivity {
    private String location;
    private Integer price;
    private Boolean isPaidMonthly;
    private String info;
    private Rent rent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) getView("B_1");
        button.setOnClickListener(listener);
    }


    /** button listener */
    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            Button button = (Button) v;

            EditText e1 = (EditText) getView("E_1");
            EditText e2 = (EditText) getView("E_2");
            EditText e3 = (EditText) getView("E_3");
            CheckBox c1 = (CheckBox) getView("C_1");

            location = e1.getText().toString();
            price = Integer.parseInt(e2.getText().toString());
            isPaidMonthly = c1.isChecked();
            info = e3.getText().toString();
            rent = new Rent(location, price, isPaidMonthly, info);
            jump();
        }
    };

    //get View by its ID
    private View getView(String sID) {
        int ID = getResources().getIdentifier(sID, "id", getPackageName());
        return findViewById(ID);
    }


    /** go to the second activity */
    public void jump(){
        /** create an intent of target activity*/
        Intent intent = new Intent(this, Details.class);

        /** put the parameter to transfer*/
        intent.putExtra(Constants.RENT_KEY, rent);
        startActivity(intent);
    }
}

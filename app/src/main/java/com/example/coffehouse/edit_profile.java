package com.example.coffehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import java.text.DateFormat;
import java.util.Calendar;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import android.widget.TextView;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;


public class edit_profile extends AppCompatActivity {
    ImageView img_close;
    Button bt_luu;
    LinearLayout linear_ngsinh;
    DateFormat fmtDateAndTime = DateFormat.getDateTimeInstance();
    EditText edt_ngsinh;
    TextView lblDateAndTime;
    Calendar myCalendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener()
    {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }
    };
    private void updateLabel() {
        lblDateAndTime.setText(fmtDateAndTime.format(myCalendar.getTime()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
//        EditText lblDateAndTime=(EditText) findViewById(R.id.edt_ngsinh);
        lblDateAndTime = (TextView) findViewById(R.id.lblDateAndTime);
        LinearLayout linear_ngsinh = (LinearLayout) findViewById(R.id.linear_ngsinh);
        linear_ngsinh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new DatePickerDialog(edit_profile.this, d,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        updateLabel();
        ImageView img_close=(ImageView) findViewById(R.id.close_doitt);
        Button bt_luu=(Button) findViewById(R.id.bt_luu);
        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bt_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
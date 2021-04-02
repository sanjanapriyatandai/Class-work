
package com.example.androidmenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
int date,month,year,min,hours;
Button btn;
Spinner sp;
TextView textview_label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.ShowButton);
        sp=findViewById(R.id.spin);
        textview_label=findViewById(R.id.tv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myHero=sp.getSelectedItem().toString();
                textview_label.setText(myHero);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.alert:
                showAlert();
                break;
            case R.id.datepicker:
                showDate();
                break;
            case R.id.timepicker:
                showTime();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showTime() {
        Calendar c=Calendar.getInstance();
        hours=c.get(Calendar.HOUR);
        min=c.get(Calendar.MINUTE);

        TimePickerDialog dialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String time=hourOfDay+"-"+minute;
                Toast.makeText(MainActivity.this,"select your time is:"+time,Toast.LENGTH_SHORT).show();
            }
        },hours,min,false);
        dialog.show();
     // Toast.makeText(this,"Item Time Picker",Toast.LENGTH_SHORT).show();
    }

    private void showDate() {
        Calendar c=Calendar.getInstance();
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        date=c.get(Calendar.DATE);

        DatePickerDialog dialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String date=year+"-"+month+"-"+dayOfMonth;
                Toast.makeText(MainActivity.this,"select your date:"+date,Toast.LENGTH_SHORT).show();
            }
        },year,month,date);
         dialog.show();
       // Toast.makeText(this,"Item Date Picker",Toast.LENGTH_SHORT).show();
    }

    private void showAlert() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Alert...!");
        builder.setMessage("saranghey..❤");
        builder.setIcon(R.drawable.ic_baseline_warning_24);
        builder.setCancelable(false);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.show();
       // Toast.makeText(this,"Item Alert",Toast.LENGTH_SHORT).show();
    }
}
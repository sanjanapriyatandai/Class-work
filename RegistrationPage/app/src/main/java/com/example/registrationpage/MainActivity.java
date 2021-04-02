package com.example.registrationpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

import com.example.registrationpage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
String gender,KnownCourses,userRating,userProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    public void showData(View view) {
        String name=binding.etUsername.getText().toString();
        String email=binding.etUsermail.getText().toString();
        String mobile=binding.etUserMobileNumber.getText().toString();
        String password=binding.etUserpassword.getText().toString();
        String address=binding.etAddress.getText().toString();

        if(binding.male.isChecked()){
            gender="Male";
        }else if(binding.female.isChecked()){
            gender="Female";
        }
        binding.rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            }
        });
        Intent intentObj=new Intent(this,DetailsActivity.class);
        intentObj.putExtra("myname",name);
        intentObj.putExtra("myemail",email);
        intentObj.putExtra("mypassword",password);
        intentObj.putExtra("mymobile",mobile);
        intentObj.putExtra("myaddress",address);
        intentObj.putExtra("mygender",gender);
        startActivity(intentObj);

    }
}
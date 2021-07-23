package com.example.checkpermission;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.content.res.AppCompatResources;

import com.google.android.material.textfield.TextInputEditText;
import com.squareup.picasso.Picasso;

public class MainActivity1 extends AppCompatActivity {

    private EditText edPackageName;
    private EditText edFbId;
    private EditText edData;
    private Button btnCheck;
    private EditText edTargetSDK;
    private ImageView imageN;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        imageN = (ImageView) findViewById(R.id.imageN);
        edPackageName = (EditText) findViewById(R.id.edPackageName);
        edFbId = (EditText) findViewById(R.id.edFbId);
        edData =  findViewById(R.id.edData);
        btnCheck = (Button) findViewById(R.id.btnCheck);
        edTargetSDK = (EditText) findViewById(R.id.edTargetSDK);
        int maxLength=1000000000;
        edData.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});


    }

    public void check(View view) {

        String mData = edData.getText().toString().trim();
        String mFBId = edFbId.getText().toString().trim();
        String mPkName = edPackageName.getText().toString().trim();
        String mTargetSDK = edTargetSDK.getText().toString().trim();

        if (mData != null && !mData.isEmpty()) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("mData", mData);
            intent.putExtra("mFbID", mFBId);
            intent.putExtra("mPackageName", mPkName);
            intent.putExtra("mTargetSDK", mTargetSDK);

            Log.d("TAG", "check: " + mData +"=====" + mFBId + "=======" + mPkName + "========" + mTargetSDK);
            startActivity(intent);

        } else Toast.makeText(this, "Bạn chưa nhập dữ liệu kìa!!", Toast.LENGTH_SHORT).show();




    }
}
package com.example.pepey.crudmysql;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class search extends AppCompatActivity {

    public static final String URL_GET_EMP = "http://192.168.33.7/Pegawai/tampil_detail.php?id=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final TextView t1 = (TextView)findViewById(R.id.text_name);

        t1.setText(getIntent().getExtras().getString("search"));


    }

}




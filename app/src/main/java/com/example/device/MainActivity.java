package com.example.device;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

import com.mercadopago.android.px.model.Device;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Device device = new Device(MainActivity.this);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Gson gson = gsonBuilder.create();
        String deviceJson = gson.toJson(device);

        Log.i("device", deviceJson);

        setContentView(R.layout.activity_main);
    }
}
package com.junker.jrouter.example;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.junker.jrouter.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        initView();
    }

    private void initView() {
        FragmentManager fm = getSupportFragmentManager(); //获取Fragment管理器对象
        FragmentTransaction ft = fm.beginTransaction(); //开启事务
        ft.replace(R.id.once_fragment, new FirstFragment());
        ft.commit();
    }
}
package com.junker.jrouter.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.junker.jrouter.R;
import com.junker.library.jrouter.JRouter;

public class OnceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_once);

        initView();
    }

    private void initView(){
        FragmentManager fm = getSupportFragmentManager(); //获取Fragment管理器对象
        FragmentTransaction ft = fm.beginTransaction(); //开启事务
        ft.replace(R.id.once_fragment,new BlankFragment());
        ft.commit();
    }
}
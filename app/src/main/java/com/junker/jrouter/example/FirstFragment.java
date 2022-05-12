package com.junker.jrouter.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.junker.jrouter.R;
import com.junker.library.jrouter.JRouter;

import static android.app.Activity.RESULT_OK;

public class FirstFragment extends Fragment {
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        btn = view.findViewById(R.id.fm_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JRouter.Navigation navigation = JRouter.getInstance().setDestination("SecondActivity");
                navigation.navigate(launcher);

//                Intent intent = new Intent();
//                intent.putExtra("data", "我是从 firstFragment 返回的数据");
//                getActivity().setResult(RESULT_OK, intent);
//                getActivity().finish();
            }
        });
        return view;
    }

    private ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result.getResultCode() == RESULT_OK){
                String data = result.getData().getStringExtra("data");
                Log.e("TAG",data);
                btn.setText(data);
            }
        }
    });

}
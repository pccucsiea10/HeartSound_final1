package com.example.heartsound.Novice_teaching;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.heartsound.Communication.Connect;
import com.example.heartsound.MainActivity2;
import com.example.heartsound.Quiz.StartFragment;
import com.example.heartsound.R;


public class TeachingFragment extends Fragment {

    private View mainView;
    ImageView imageView4;
    Button next_page,last_page;
    int[] photoId={R.drawable.photo00,R.drawable.photo01,R.drawable.photo02,R.drawable.photo03,
            R.drawable.photo04,R.drawable.photo05,R.drawable.photo06,
            R.drawable.photo07,R.drawable.photo08,R.drawable.photo09,R.drawable.photo10,
            R.drawable.photo11,R.drawable.photo12};
    int idx = 0;   // 第幾張圖片變數
    int count = photoId.length;   // 共有多少張圖片
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_teaching,container,false);

        mainView = inflater.inflate(R.layout.fragment_teaching, container, false);


        next_page = mainView.findViewById(R.id.next_page);
        last_page = mainView.findViewById(R.id.last_page);

        imageView4 =  mainView.findViewById(R.id.imageView4);



        next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idx++;
                if (idx == count)
                    idx = 0;
                imageView4.setImageResource(photoId[idx]);   //設定 ImageView 資源


            }
        });

        last_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idx--;
                if (idx < 0)
                    idx = count-1;
                imageView4.setImageResource(photoId[idx]);    //設定 ImageView 資源
            }
        });

        return mainView;
    }

}

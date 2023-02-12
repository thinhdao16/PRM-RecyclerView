package com.example.recylerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvUser;
    private UserAdapter mUserAdapter;
    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate (saveInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        mUserAdapter = new UserAdapter(this );

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rcvUser.setLayoutManager(gridLayoutManager);

        mUserAdapter.setData(getLisUser());
        rcvUser.setAdapter(mUserAdapter);
    }

    private List<User> getLisUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.img_1,"1"));
        list.add(new User(R.drawable.img_2,"2"));
        list.add(new User(R.drawable.img_3,"3"));
        list.add(new User(R.drawable.img_4,"4"));
        list.add(new User(R.drawable.img_5,"5"));
        list.add(new User(R.drawable.img_6,"6"));
        list.add(new User(R.drawable.img_7,"7"));
        list.add(new User(R.drawable.img_8,"8"));

        list.add(new User(R.drawable.img_1,"1"));
        list.add(new User(R.drawable.img_2,"2"));
        list.add(new User(R.drawable.img_3,"3"));
        list.add(new User(R.drawable.img_4,"4"));
        list.add(new User(R.drawable.img_5,"5"));
        list.add(new User(R.drawable.img_6,"6"));
        list.add(new User(R.drawable.img_7,"7"));
        list.add(new User(R.drawable.img_8,"8"));

        return list;
    }
}

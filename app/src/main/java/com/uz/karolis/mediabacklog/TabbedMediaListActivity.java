package com.uz.karolis.mediabacklog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.uz.karolis.mediabacklog.adapters.MediaRecycleListAdapter;

public class TabbedMediaListActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_media_list);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mRecyclerView = findViewById(R.id.media_item_recycle_list);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        String[] myDataset = new String[100];
        for (int i = 0; i<100; i++){
            myDataset[i] = "Filmas"+i;
        }

        // specify an adapter (see also next example)
        mAdapter = new MediaRecycleListAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Toast.makeText(getApplicationContext(), R.string.title_home, Toast.LENGTH_SHORT).show();
                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_games:
                    Toast.makeText(getApplicationContext(), R.string.title_games, Toast.LENGTH_SHORT).show();
                    //mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_movies:
                    Toast.makeText(getApplicationContext(), R.string.title_movies, Toast.LENGTH_SHORT).show();
                    //mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };


}

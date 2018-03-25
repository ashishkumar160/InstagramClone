package com.apprensics.instagram;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Story> stories = new ArrayList<>();
    private List<Feed> feedList = new ArrayList<>();
    private RecyclerView recyclerView, recyclerView1;
    private StoriesAdapter mAdapter;
    private FeedAdapter mAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_camera);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView textView = findViewById(R.id.toolbar_text);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/CosmopolitanScriptRegular.otf");
        textView.setTypeface(custom_font);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView1 = findViewById(R.id.recyclerView1);

        mAdapter = new StoriesAdapter(stories);
        mAdapter1 = new FeedAdapter(feedList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager mManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView1.setLayoutManager(mManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(mAdapter);
        recyclerView1.setAdapter(mAdapter1);

        stories.add(new Story("You", R.drawable.photo));
        stories.add(new Story("Dan Galpin", R.drawable.dan));
        stories.add(new Story("Katherine Kuan", R.drawable.kat));
        stories.add(new Story("Lyla Fujiwara", R.drawable.lyla));
        stories.add(new Story("Reto Meier", R.drawable.reto));

        feedList.add(new Feed("Ashish Kumar", "Kailash Hills", "URL", R.drawable.birds, "257 likes", "View all 7 comments", "Ashish Sign", 3));
        feedList.add(new Feed("Ashish Kumar", "Kailash Hills", "URL", R.drawable.ditheringopt, "58 likes", "View all 2 comments", "Ashish Sign", 3));
        feedList.add(new Feed("Ashish Kumar", "Kailash Hills", "URL", R.drawable.eyes, "411 likes", "View all 11 comments", "Ashish Sign", 3));
        feedList.add(new Feed("Ashish Kumar", "Kailash Hills", "URL", R.drawable.globe, "66 likes", "View all 2 comments", "Ashish Sign", 3));


        mAdapter1.notifyDataSetChanged();

        mAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}

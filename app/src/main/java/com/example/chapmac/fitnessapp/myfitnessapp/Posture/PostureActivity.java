package com.example.chapmac.fitnessapp.myfitnessapp.Posture;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.chapmac.fitnessapp.myfitnessapp.Data.AdapterPosture;
import com.example.chapmac.fitnessapp.myfitnessapp.Data.Posture;
import com.example.chapmac.fitnessapp.myfitnessapp.Detail.DetailActivity;
import com.example.chapmac.fitnessapp.myfitnessapp.R;

import java.util.List;

public class PostureActivity extends AppCompatActivity implements PostureView, AdapterView.OnItemClickListener  {

    private ListView listView;
    private ProgressBar progressBar;
    private PosturePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posture);
        String text = getIntent().getExtras().getString("Message");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        toolbar.setTitle(text);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(this);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        presenter = new PosturePresenterImpl(this, new PostureInteractorImpl());

    }

    @Override protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        listView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        listView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setItems(List<Posture> items) {
        AdapterPosture adapter = new AdapterPosture(this,items);
        listView.setAdapter(adapter);
    }

    @Override
    public void navigateToPosture(String str) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Message", str);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        presenter.onItemClicked(position);
    }
}

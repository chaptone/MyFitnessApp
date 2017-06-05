package com.example.chapmac.fitnessapp.myfitnessapp.Workouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.chapmac.fitnessapp.myfitnessapp.Data.Adapter;
import com.example.chapmac.fitnessapp.myfitnessapp.Posture.PostureActivity;
import com.example.chapmac.fitnessapp.myfitnessapp.R;
import com.example.chapmac.fitnessapp.myfitnessapp.Data.Workout;

import java.util.List;
public class MainActivity extends Activity implements MainView, AdapterView.OnItemClickListener {

    private ListView listView;
    private ProgressBar progressBar;
    private MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(this);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        presenter = new MainPresenterImpl(this, new FindItemsInteractorImpl());
    }



    @Override protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        listView.setVisibility(View.INVISIBLE);
    }

    @Override public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        listView.setVisibility(View.VISIBLE);
    }

    @Override public void setItems(List<Workout> items) {
        Adapter adapter = new Adapter(this,items);
        listView.setAdapter(adapter);
    }

    @Override public void navigateToPosture(String str) {
        Intent intent = new Intent(this,PostureActivity.class);
        intent.putExtra("Message", str);
        startActivity(intent);
    }

    @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        presenter.onItemClicked(position);
    }
}

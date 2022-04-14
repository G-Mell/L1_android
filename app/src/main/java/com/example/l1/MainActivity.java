package com.example.l1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.l1.ui.main.SectionsPagerAdapter;
import com.example.l1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    Button button2;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        button2=(Button)findViewById(R.id.button2);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;

       // button2.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();
            //}
        //});
    }

    public void Click(View view) {
        textView2=(TextView)findViewById(R.id.textView2);
        textView2.setText("Выполнила студентка ИВТ2 Мельниченко Юлия");
    }
}
package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Person> people = new LinkedList<>();
        people.add(new Person(12, "Name1", "em1@gmail.com"));
        people.add(new Person(13, "Name12", "em12@gmail.com"));
        people.add(new Person(16, "Name13", "em109@gmail.com"));
        people.add(new Person(18, "Name4", "em1@gmail.com"));
        people.add(new Person(17, "Name5", "em21@gmail.com"));
        people.add(new Person(19, "Name133", "em14@gmail.com"));
        people.add(new Person(13, "Name122", "em15@gmail.com"));
        people.add(new Person(12, "Name144", "em15@gmail.com"));
        people.add(new Person(15, "Name123", "em61@gmail.com"));
        people.add(new Person(2, "Name132", "em16@gmail.com"));
        people.add(new Person(2, "Name132", "em16@gmail.com"));
        people.add(new Person(23, "Name132", "em16@gmail.com"));
        people.add(new Person(25, "Name1232", "em16@gmail.com"));
        people.add(new Person(26, "Name132", "em16@gmail.com"));
        people.add(new Person(27, "Name1322", "em16@gmail.com"));
        people.add(new Person(24, "Name132", "em16@gmail.com"));
        people.add(new Person(42, "Name1332", "em16@gmail.com"));
        people.add(new Person(72, "Name1342", "em16@gmail.com"));
        people.add(new Person(82, "Name132", "em16@gmail.com"));
        people.add(new Person(62, "Name1342", "em16@gmail.com"));
        people.add(new Person(2, "Name132", "em16@gmail.com"));


        RecyclerView recyclerView = findViewById(R.id.peopleRecyclerView);

        recyclerView.setAdapter(new PeopleAdapter(people));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



    }
}
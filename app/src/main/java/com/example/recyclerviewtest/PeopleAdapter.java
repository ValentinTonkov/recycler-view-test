package com.example.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder> {

    private List<Person> people;

    public PeopleAdapter(List<Person> people){
        this.people = people;
    }


    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item, parent, false);
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        Person person = people.get(position);

        holder.getNameText().setText(person.getName());
        holder.getEmailText().setText(person.getEmail());
        holder.getAgeText().setText(String.valueOf(person.getAge()));
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}

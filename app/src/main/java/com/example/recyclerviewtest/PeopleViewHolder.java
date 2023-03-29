package com.example.recyclerviewtest;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleViewHolder extends RecyclerView.ViewHolder {

    private TextView nameText;
    private TextView ageText;
    private TextView emailText;

    public PeopleViewHolder(@NonNull View itemView) {
        super(itemView);

        nameText = itemView.findViewById(R.id.nameText);
        ageText = itemView.findViewById(R.id.ageText);
        emailText = itemView.findViewById(R.id.emailText);
    }

    public TextView getAgeText() {
        return ageText;
    }

    public TextView getEmailText() {
        return emailText;
    }

    public TextView getNameText() {
        return nameText;
    }
}

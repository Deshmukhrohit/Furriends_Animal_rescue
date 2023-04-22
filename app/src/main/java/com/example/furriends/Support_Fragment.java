package com.example.furriends;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Support_Fragment extends Fragment {

    private TextView contactNumberTextView, addressTextView, descriptionTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_support_, container, false);

        // Get references to the TextViews in the layout
        contactNumberTextView = view.findViewById(R.id.text_support_contact);
        addressTextView = view.findViewById(R.id.text_support_address);
        descriptionTextView = view.findViewById(R.id.text_support_description);

        // Set the values for the TextViews
        contactNumberTextView.setText("Contact No. 7024315162");
        addressTextView.setText("Address: Juhu, Mumbai");
        descriptionTextView.setText("Our app is for rescuing animals. We believe that every animal deserves a chance at life, and we work tirelessly to make sure that they get that chance. With our app, you can help us save animals and give them the love and care they need to thrive.");

        return view;
    }
}

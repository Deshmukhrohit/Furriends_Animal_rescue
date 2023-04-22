package com.example.furriends;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class NotificationFragment extends Fragment {

    private TextView mNotificationTextView;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notification, container, false);
        mNotificationTextView = root.findViewById(R.id.notification_text_view);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Code to fetch notifications from the database or server and display them
        // in the TextView
        String notificationText = fetchNotifications();
        mNotificationTextView.setText(notificationText);
    }

    private String fetchNotifications() {
        // Code to fetch notifications from the database or server
        // and return them as a string
        return "New rescue mission added\nVet appointment scheduled";
    }
}

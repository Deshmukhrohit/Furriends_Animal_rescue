package com.example.furriends;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SettingsFragment extends Fragment {

    private CheckBox mNotificationCheckBox;
    private CheckBox mSoundCheckBox;
    private CheckBox mVibrationCheckBox;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_settings, container, false);

        // Find CheckBox views and set their listeners
        mNotificationCheckBox = rootView.findViewById(R.id.check_box_notification);
        mSoundCheckBox = rootView.findViewById(R.id.check_box_sound);
        mVibrationCheckBox = rootView.findViewById(R.id.check_box_vibration);

        mNotificationCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Perform action when notification checkbox is checked
                    Toast.makeText(getActivity(), "Notifications enabled", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform action when notification checkbox is unchecked
                    Toast.makeText(getActivity(), "Notifications disabled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mSoundCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Perform action when sound checkbox is checked
                    Toast.makeText(getActivity(), "Sound enabled", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform action when sound checkbox is unchecked
                    Toast.makeText(getActivity(), "Sound disabled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mVibrationCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Perform action when vibration checkbox is checked
                    Toast.makeText(getActivity(), "Vibration enabled", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform action when vibration checkbox is unchecked
                    Toast.makeText(getActivity(), "Vibration disabled", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;
    }
}

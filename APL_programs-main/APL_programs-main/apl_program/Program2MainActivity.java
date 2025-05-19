package com.example.apl_program;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

// Main Activity that loads two fragments
public class Program2MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program2_main);
    }

    // First Fragment
    public static class FragmentA extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            TextView textView = new TextView(getActivity());
            textView.setText("This is Fragment A");
            textView.setTextSize(20);
            textView.setBackgroundColor(0xFFD1C4E9); // Light purple
            textView.setPadding(50, 100, 50, 100);
            textView.setGravity(android.view.Gravity.CENTER);
            return textView;
        }
    }

    // Second Fragment
    public static class FragmentB extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            TextView textView = new TextView(getActivity());
            textView.setText("This is Fragment B");
            textView.setTextSize(20);
            textView.setBackgroundColor(0xFFC8E6C9); // Light green
            textView.setPadding(50, 100, 50, 100);
            textView.setGravity(android.view.Gravity.CENTER);
            return textView;
        }
    }
}

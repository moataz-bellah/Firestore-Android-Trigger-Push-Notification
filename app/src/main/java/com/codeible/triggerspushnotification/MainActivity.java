package com.codeible.triggerspushnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        firebaseMessaging.subscribeToTopic("new_user_forums");
    }
}
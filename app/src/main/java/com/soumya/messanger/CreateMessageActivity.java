package com.soumya.messanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.action;

public class CreateMessageActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }



//Button click method

    public void onSendMessage(View view) {
        EditText messageView=(EditText) findViewById(R.id.message);
        String messageText=messageView.getText().toString();
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        String chooserTitle=getString(R.string.chooser);
        Intent chosenIntent=Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);

    }

}
package com.example.twoactivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etMsgSend;
    TextView tvMsgReplyShow;
    String msgReply;
    public static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG,"--onCreate--");

        etMsgSend = findViewById(R.id.idEtMsgSend);
        tvMsgReplyShow = findViewById(R.id.idTvValueback1Show);
    }

    public void goPage2(View v){
        Intent i = new Intent(this,MainActivity2.class);
        String str = etMsgSend.getText().toString();
        i.putExtra("MSG_SEND",str);
        startActivityForResult(i,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if (resultCode == RESULT_OK){
                msgReply = data.getStringExtra("MSG_REPLY");
                tvMsgReplyShow.setText(msgReply);
            }
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"--onRestart--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG,"--onDestroy--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"--onPause--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"--onResume--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"--onStop--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"--onStart--");
    }
}
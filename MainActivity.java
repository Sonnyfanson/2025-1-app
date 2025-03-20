package com.example.edittext_test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    private EditText etextId;
    private EditText etextPassword;
    private EditText ephone;

    private Button eButton;
    private TextView textView;
    private TextView textPasswordView;
    private TextView phoneView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etextId = (EditText) findViewById(R.id.textId);
        etextPassword = (EditText) findViewById(R.id.textPassword);
        ephone = (EditText) findViewById(R.id.phone);
        eButton = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textPasswordView = (TextView) findViewById(R.id.textPasswordView);
        phoneView = (TextView) findViewById(R.id.phoneView);
    }

    public void onClicked(View view) {
        String str = etextId.getText().toString();
        String str1 = etextPassword.getText().toString();
        String str2 = ephone.getText().toString();

        textView.setText("아이디: " + str);
        textPasswordView.setText("패스워드: " + str1);
        phoneView.setText("전화 번호: " + str2);
    }
}
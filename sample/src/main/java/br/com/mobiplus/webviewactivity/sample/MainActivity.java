package br.com.mobiplus.webviewactivity.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import br.com.mobiplus.webviewactivity.MPWebViewActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenWebView(View view) {
        EditText textUrl = (EditText) findViewById(R.id.editWebView);
        MPWebViewActivity.start(this, textUrl.getText().toString());
    }
}

package br.com.mobiplus.webviewactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MPWebViewActivity extends AppCompatActivity {

    private static final String EXTRA_URL = "EXTRA_URL";

    public static void start(Activity activity, String url) {
        Intent intent = new Intent(activity, MPWebViewActivity.class);
        intent.putExtra(EXTRA_URL, url);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mp_activity_webview);

        String url = getIntent().getStringExtra(EXTRA_URL);
        
        this.loadWebView(url);
    }

    private void loadWebView(String url) {
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl(url);
    }
}

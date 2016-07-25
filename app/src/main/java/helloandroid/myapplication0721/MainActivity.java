package helloandroid.myapplication0721;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView2=(TextView) findViewById(R.id.textView2 );
        textView2.setAutoLinkMask(Linkify.WEB_URLS);
        textView2.setText("在程式中設定URL:http://tw.yahoo.com");
    }
}

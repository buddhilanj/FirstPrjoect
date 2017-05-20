package lk.ac.kln.mit.stu.firstprjoect;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtFirst;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFirst = (TextView) findViewById(R.id.txt_first);
        btnClick = (Button) findViewById(R.id.btn_click);
        btnClick.setOnClickListener(this);
        txtFirst.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_click:
                txtFirst.setText("Clicked");
                break;
            case R.id.txt_first:
                btnClick.setText("Text Clicked");
                break;
        }

    }

//    public void onBtnClick(View v){
//        txtFirst.setText("Clicked");
//    }

}

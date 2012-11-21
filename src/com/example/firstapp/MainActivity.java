package com.example.firstapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //ここでレイアウトのidと紐付け 
        Button btn = (Button) this.findViewById(R.id.button1);  
        //イベントをセットする
        btn.setOnClickListener(new OnClickListener(){  
  
            @Override  
            public void onClick(View v) {  
                Button01_OnClick();  
            }  
              
        });
        
     // テキストビューを生成
        TextView text = new TextView(this);
        text.setText("onCriateのタイミングで生成されます");
         
        LinearLayout layout = new LinearLayout(this);
        // レイアウトにテキストビューを追加
        layout.addView(text);
 
        setContentView(layout);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    //イベント関数
    private void Button01_OnClick(){  
        AlertDialog.Builder AlertDlgBldr = new AlertDialog.Builder(MainActivity.this);   
        AlertDlgBldr.setTitle("警告ダイアログタイトル");  
        AlertDlgBldr.setMessage("警告ダイアログメッセージ");  
        AlertDlgBldr.setPositiveButton("ok", new DialogInterface.OnClickListener() {  
  
            @Override  
            public void onClick(DialogInterface dialog, int which) {  
                  
            }  
              
        });  
        AlertDlgBldr.setNegativeButton("cancel", new DialogInterface.OnClickListener() {  
  
            @Override  
            public void onClick(DialogInterface dialog, int which) {  
                  
            }  
              
        });  
        AlertDialog AlertDlg = AlertDlgBldr.create();  
        AlertDlg.show();  
    }  
}

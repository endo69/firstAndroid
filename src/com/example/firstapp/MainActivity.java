package com.example.firstapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //�����Ń��C�A�E�g��id�ƕR�t�� 
        Button btn = (Button) this.findViewById(R.id.button1);  
        //�C�x���g���Z�b�g����
        btn.setOnClickListener(new OnClickListener(){  
  
            @Override  
            public void onClick(View v) {  
                Button01_OnClick();  
            }  
              
        });  
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    //�C�x���g�֐�
    private void Button01_OnClick(){  
        AlertDialog.Builder AlertDlgBldr = new AlertDialog.Builder(MainActivity.this);   
        AlertDlgBldr.setTitle("�x���_�C�A���O�^�C�g��");  
        AlertDlgBldr.setMessage("�x���_�C�A���O���b�Z�[�W");  
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

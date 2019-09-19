/**
 * https://www.jianshu.com/p/eae320ee9b2d
 */

package com.ty.android.ndkdevdemo_ndkbuild;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ty.android.ndkdevdemo.NdkLib;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextView = null;
    private Button   mButton   = null;
    private Button   mButton2  = null;
    private NdkLib   mLib      = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLib = new NdkLib();
        mTextView = findViewById(R.id.ID_MAIN_TEXTVIEW);
        mButton = findViewById(R.id.ID_MAIN_BUTTON);
        mButton.setOnClickListener(this);
        mButton2 = findViewById(R.id.ID_MAIN_BUTTON2);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.ID_MAIN_BUTTON:
                mTextView.setText(mLib.getData());
                break;
            case R.id.ID_MAIN_BUTTON2:
                mLib.updateData();
                break;
            default:
                break;
        }
    }
}

package com.example.holleworld2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity implements View.OnClickListener,CompoundButton.OnCheckedChangeListener {
    private TextView resultView;

    private Button plusView;
    private Button submitView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_3);
        //mountainArray = getResources().getStringArray(R.array.visit_place_array);
        initView();
    }

    private void initView() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.visit_place_rg);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int index = -1;
                if (i == R.id.place1) {
                    index = 0;
                } else if (i == R.id.place2) {
                    index = 1;
                } else if (i == R.id.place3) {
                    index = 2;
                } else if (i == R.id.place4) {
                    index = 3;
                }

//                Toast.makeText(MainActivity.this)
//
//                if (index >=0 && index < mountainArray.length) {
//                    showUIToast(mountainArray[index]);
//                }
            }
        });

        CheckBox badmintonView = (CheckBox) findViewById(R.id.badminton_view);
        CheckBox basketballView = (CheckBox) findViewById(R.id.basketball_view);
        badmintonView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton CompoundButton, boolean b) {

            }
        });

//          badmintonView.setOnCheckedChangeListener(this);
//          basketballView.setOnCheckedChangeListener(this);
//        usernameView = (EditText) findViewById(R.id.username);
//        resultView = (TextView) findViewById(R.id.result_view);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        Button plusView = (Button) findViewById(R.id.plus_view);
        Button substractView = (Button) findViewById(R.id.substract_view);
        Button submitView = findViewById(R.id.submit);
        submitView.setOnClickListener(this);
        plusView.setOnClickListener(this);
        substractView.setOnClickListener(this);

        Button button = findViewById(R.id.submit);
        button.setOnClickListener(this);
    }

             private void showUIToast(final String info){
                Toast.makeText(MainActivity.this, "您投票的景点是："+info,
                         Toast.LENGTH_SHORT).show();
             }

             private void onSubmitConfirm() {
                 AlertDialog dlg;
                 AlertDialog.Builder builder = new AlertDialog.Builder(this)
                         .setTitle("普通对话框")//设置对话框的标题
                         //.setIcon(R..mipmap.ic_launcher)//设置对话框的图标
                         .setMessage("是否确定提交？")//设置对话框的提示信息
                         //添加“确定”按钮
                         .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialogInterface, int i) {
                                 onSubmitConfirm();
                                 // onSubmit();
                             }
                         })
                         //添加“取消”按钮
                         .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 dialog.dismiss();
                             }
                         });
                 dlg = builder.create();
                 dlg.show();
             }

//             private void onSumit(){
//                 StringBuffer sb = new StringBuffer();
//                 sb.append(getString(R.string.your_hobbies_info,hobbyList.toString()));
//                 String username = usernameView.getText().toString();
//                 if(username != null && !username.isEmpty()){
//                 sb.append(" \n by " + username);
//                 }
//                 resultView.setText(sb.toString());
//             }

                 //        submitView.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//
//             }
//         });
//
//        plusView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//         });
//              private void onSubmit(){
//                  StringBuffer sb = new StringBuffer();
//                  sb.append(getString(R.string.your_hobbies_info, hobbyList.toString()));
//                  String username = usernameView.getText().toString();
//                  if (username != null && !username.isEmpty()){
//                      sb.append("\n by" + username);
//                  }
//                  resultView.setText(sb.toString());
//              }
              private void updateProgressView(boolean plus){
                  int progress = progressBar.getProgress();
                  if (plus){
                      progress += 10;
                      if (progress > 100){
                          progress = 100;
                      }
                  } else {
                      progress -= 10;
                      if (progress < 0) {
                          progress = 0;
                      }
                  }

                  progressBar.setProgress(progress);
              }

              @Override
              public void onClick(View view) {
                  int id = view.getId();
                  switch (id) {
                      case R.id.plus_view:
                          updateProgressView(true);
                          break;
                      case R.id.submit:
                          onSubmitConfirm();
//                          onSubmit();
                          break;
                      case R.id.substract_view:
                          updateProgressView(false);
                          break;
                      default:
                          break;
                  }
              }
              @Override
              public void onCheckedChanged(CompoundButton CompoundButton, boolean checked) {
//                  String hobby =
              }
}

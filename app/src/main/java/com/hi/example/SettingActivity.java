package com.hi.example;

import android.os.Bundle;

import com.creek.router.annotation.CreekBean;
import com.hi.example.plugin.PluginBaseActivity;

@CreekBean(path = "plugin_mail_SettingActivity")
public class SettingActivity extends PluginBaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

//        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext,"Click",Toast.LENGTH_SHORT).show();
//                startActivity("plugin_mail_CF_MailMainActivity");
//            }
//        });
    }
}
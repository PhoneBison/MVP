package com.phonebison.it.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseMvpActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_mvp);
    }
}

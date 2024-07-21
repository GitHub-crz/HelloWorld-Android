package com.crz.application.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.crz.application.BaseActivity;
import com.crz.application.R;

public class DataBindingActivity extends BaseActivity {

    ActivityDataBindingBinding mBinding;

    UserViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding);
        mViewModel = new ViewModelProvider(this).get(UserViewModel.class);
    }
}
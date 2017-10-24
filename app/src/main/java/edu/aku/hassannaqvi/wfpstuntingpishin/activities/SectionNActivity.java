package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Spinner;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionNActivity extends Activity {

    @BindView(R.id.spbln01)
    Spinner spbln01;
    @BindView(R.id.spbln02)
    EditText spbln02;
    @BindView(R.id.spbln03)
    EditText spbln03;
    @BindView(R.id.spblj0401a)
    Spinner spblj0401a;
    @BindView(R.id.spblj0401b)
    EditText spblj0401b;
    @BindView(R.id.spblj0402a)
    Spinner spblj0402a;
    @BindView(R.id.spblj0402b)
    EditText spblj0402b;
    @BindView(R.id.spblj0501a)
    Spinner spblj0501a;
    @BindView(R.id.spblj0501b)
    EditText spblj0501b;
    @BindView(R.id.spblj0502a)
    Spinner spblj0502a;
    @BindView(R.id.spblj0502b)
    EditText spblj0502b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_n);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        MainApp.endActivity(this, this);
    }
}


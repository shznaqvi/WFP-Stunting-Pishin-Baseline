package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.CheckBox;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionBActivity extends Activity {

    @BindView(R.id.spblb01)
    EditText spblb01;
    @BindView(R.id.spblb02)
    RadioGroup spblb02;
    @BindView(R.id.spblb02a)
    RadioButton spblb02a;
    @BindView(R.id.spblb02b)
    RadioButton spblb02b;
    @BindView(R.id.spblb03)
    Spinner spblb03;
    @BindView(R.id.spblb04y)
    EditText spblb04y;
    @BindView(R.id.spblb04m)
    EditText spblb04m;
    @BindView(R.id.spblb04d)
    EditText spblb04d;
    @BindView(R.id.spblb05)
    EditText spblb05;
    @BindView(R.id.spblb06)
    RadioGroup spblb06;
    @BindView(R.id.spblb06a)
    RadioButton spblb06a;
    @BindView(R.id.spblb06b)
    RadioButton spblb06b;
    @BindView(R.id.spblb06c)
    RadioButton spblb06c;
    @BindView(R.id.spblb06d)
    RadioButton spblb06d;
    @BindView(R.id.spblb06e)
    RadioButton spblb06e;
    @BindView(R.id.spblb06f)
    RadioButton spblb06f;
    @BindView(R.id.spblb06g)
    RadioButton spblb06g;
    @BindView(R.id.spblb06h)
    RadioButton spblb06h;
    @BindView(R.id.spblb06i)
    RadioButton spblb06i;
    @BindView(R.id.spblb06j)
    RadioButton spblb06j;
    @BindView(R.id.spblb06k)
    RadioButton spblb06k;
    @BindView(R.id.spblb07)
    CheckBox spblb07;
    @BindView(R.id.spblb08)
    CheckBox spblb08;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
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


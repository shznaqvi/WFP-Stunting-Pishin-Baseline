package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionMActivity extends Activity {

    @BindView(R.id.spblm01a)
    RadioGroup spblm01a;
    @BindView(R.id.spblm01aa)
    RadioButton spblm01aa;
    @BindView(R.id.spblm01ab)
    RadioButton spblm01ab;
    @BindView(R.id.spblm01b)
    RadioGroup spblm01b;
    @BindView(R.id.spblm01ba)
    RadioButton spblm01ba;
    @BindView(R.id.spblm01bb)
    RadioButton spblm01bb;
    @BindView(R.id.spblm01c)
    RadioGroup spblm01c;
    @BindView(R.id.spblm01ca)
    RadioButton spblm01ca;
    @BindView(R.id.spblm01cb)
    RadioButton spblm01cb;
    @BindView(R.id.spblm01d)
    RadioGroup spblm01d;
    @BindView(R.id.spblm01da)
    RadioButton spblm01da;
    @BindView(R.id.spblm01db)
    RadioButton spblm01db;
    @BindView(R.id.spblm01e)
    RadioGroup spblm01e;
    @BindView(R.id.spblm01ea)
    RadioButton spblm01ea;
    @BindView(R.id.spblm01eb)
    RadioButton spblm01eb;
    @BindView(R.id.spblm01f)
    RadioGroup spblm01f;
    @BindView(R.id.spblm01fa)
    RadioButton spblm01fa;
    @BindView(R.id.spblm01fb)
    RadioButton spblm01fb;
    @BindView(R.id.spblm01g)
    RadioGroup spblm01g;
    @BindView(R.id.spblm01ga)
    RadioButton spblm01ga;
    @BindView(R.id.spblm01gb)
    RadioButton spblm01gb;
    @BindView(R.id.spblm01h)
    RadioGroup spblm01h;
    @BindView(R.id.spblm01ha)
    RadioButton spblm01ha;
    @BindView(R.id.spblm01hb)
    RadioButton spblm01hb;
    @BindView(R.id.spblm01i)
    RadioGroup spblm01i;
    @BindView(R.id.spblm01i88)
    RadioButton spblm01i88;
    @BindView(R.id.spblm01i00)
    RadioButton spblm01i00;
    @BindView(R.id.spblm01i88x)
    EditText spblm01i88x;
    @BindView(R.id.spblm02)
    RadioGroup spblm02;
    @BindView(R.id.spblm02a)
    RadioButton spblm02a;
    @BindView(R.id.spblm02b)
    RadioButton spblm02b;
    @BindView(R.id.spblm02c)
    RadioButton spblm02c;
    @BindView(R.id.spblm03)
    RadioGroup spblm03;
    @BindView(R.id.spblm03a)
    RadioButton spblm03a;
    @BindView(R.id.spblm03b)
    RadioButton spblm03b;
    @BindView(R.id.spblm04)
    RadioGroup spblm04;
    @BindView(R.id.spblm04a)
    RadioButton spblm04a;
    @BindView(R.id.spblm04b)
    RadioButton spblm04b;
    @BindView(R.id.spblm04c)
    RadioButton spblm04c;
    @BindView(R.id.spblm0488)
    RadioButton spblm0488;
    @BindView(R.id.spblm0488x)
    EditText spblm0488x;
    @BindView(R.id.spblm05)
    RadioGroup spblm05;
    @BindView(R.id.spblm05a)
    RadioButton spblm05a;
    @BindView(R.id.spblm05b)
    RadioButton spblm05b;
    @BindView(R.id.spblm05c)
    RadioButton spblm05c;
    @BindView(R.id.spblm05d)
    RadioButton spblm05d;
    @BindView(R.id.spblm05e)
    RadioButton spblm05e;
    @BindView(R.id.spblm05f)
    RadioButton spblm05f;
    @BindView(R.id.spblm05g)
    RadioButton spblm05g;
    @BindView(R.id.spblm05h)
    RadioButton spblm05h;
    @BindView(R.id.spblm0588)
    RadioButton spblm0588;
    @BindView(R.id.spblm0588x)
    EditText spblm0588x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
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


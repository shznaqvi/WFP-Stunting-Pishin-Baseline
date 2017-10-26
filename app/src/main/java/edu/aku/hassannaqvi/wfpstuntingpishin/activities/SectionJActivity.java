package edu.aku.hassannaqvi.wfpstuntingpishin.activities;


import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionJActivity extends Activity {

    @BindView(R.id.spblj01)
    EditText spblj01;
    @BindView(R.id.spblj0201a)
    Spinner spblj0201a;
    @BindView(R.id.spblj0201b)
    EditText spblj0201b;
    @BindView(R.id.spblj0202a)
    Spinner spblj0202a;
    @BindView(R.id.spblj0202b)
    EditText spblj0202b;
    @BindView(R.id.spblj0301a)
    Spinner spblj0301a;
    @BindView(R.id.spblj0301b)
    EditText spblj0301b;
    @BindView(R.id.spblj0302a)
    Spinner spblj0302a;
    @BindView(R.id.spblj0302b)
    EditText spblj0302b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_j);
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


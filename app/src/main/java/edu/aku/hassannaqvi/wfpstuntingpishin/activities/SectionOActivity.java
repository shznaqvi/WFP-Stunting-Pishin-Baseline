package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;

public class SectionOActivity extends Activity {

    @BindView(R.id.spblo01)
    EditText spblo01;
    @BindView(R.id.spblo02)
    RadioGroup spblo02;
    @BindView(R.id.spblo02b)
    RadioButton spblo02b;
    @BindView(R.id.spblo02a)
    RadioButton spblo02a;
    @BindView(R.id.fldGrpspblo02)
    LinearLayout fldGrpspblo02;
    @BindView(R.id.spblo03a)
    CheckBox spblo03a;
    @BindView(R.id.spblo03b)
    CheckBox spblo03b;
    @BindView(R.id.spblo03c)
    CheckBox spblo03c;
    @BindView(R.id.spblo03d)
    CheckBox spblo03d;
    @BindView(R.id.spblo03e)
    CheckBox spblo03e;
    @BindView(R.id.spblo03f)
    CheckBox spblo03f;
    @BindView(R.id.spblo0388)
    CheckBox spblo0388;
    @BindView(R.id.spblo0388x)
    EditText spblo0388x;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.spblo04)
    RadioGroup spblo04;
    @BindView(R.id.spblo04a)
    RadioButton spblo04a;
    @BindView(R.id.spblo04b)
    RadioButton spblo04b;
    @BindView(R.id.spblo0499)
    RadioButton spblo0499;
    @BindView(R.id.fldGrpspblo04)
    LinearLayout fldGrpspblo04;
    @BindView(R.id.spblo05a)
    EditText spblo05a;
    @BindView(R.id.spblo0599)
    CheckBox spblo0599;
    @BindView(R.id.spblo06a)
    EditText spblo06a;
    @BindView(R.id.spblo06b)
    EditText spblo06b;
    @BindView(R.id.spblo06c)
    CheckBox spblo06c;
    @BindView(R.id.fldGrpspblo06)
    LinearLayout fldGrpspblo06;
    @BindView(R.id.spblo07)
    RadioGroup spblo07;
    @BindView(R.id.spblo07a)
    RadioButton spblo07a;
    @BindView(R.id.spblo07b)
    RadioButton spblo07b;
    @BindView(R.id.spblo07c)
    RadioButton spblo07c;
    @BindView(R.id.spblo07d)
    RadioButton spblo07d;
    @BindView(R.id.spblo07e)
    RadioButton spblo07e;
    @BindView(R.id.spblo07f)
    RadioButton spblo07f;
    @BindView(R.id.spblo07g)
    RadioButton spblo07g;
    @BindView(R.id.spblo0788)
    RadioButton spblo0788;
    @BindView(R.id.spblo0788x)
    EditText spblo0788x;
    @BindView(R.id.spblo08)
    RadioGroup spblo08;
    @BindView(R.id.spblo08a)
    RadioButton spblo08a;
    @BindView(R.id.spblo08b)
    RadioButton spblo08b;
    @BindView(R.id.spblo0899)
    RadioButton spblo0899;
    @BindView(R.id.fldGrpspblo08)
    LinearLayout fldGrpspblo08;
    @BindView(R.id.spblo09a)
    EditText spblo09a;
    @BindView(R.id.spblo09b)
    EditText spblo09b;
    @BindView(R.id.spblo10)
    RadioGroup spblo10;
    @BindView(R.id.spblo10a)
    RadioButton spblo10a;
    @BindView(R.id.spblo10b)
    RadioButton spblo10b;
    @BindView(R.id.spblo10c)
    RadioButton spblo10c;
    @BindView(R.id.spblo10d)
    RadioButton spblo10d;
    @BindView(R.id.spblo1088)
    RadioButton spblo1088;
    @BindView(R.id.spblo1088x)
    EditText spblo1088x;
    @BindView(R.id.spblo11)
    RadioGroup spblo11;
    @BindView(R.id.spblo11a)
    RadioButton spblo11a;
    @BindView(R.id.spblo11b)
    RadioButton spblo11b;
    @BindView(R.id.spblo1199)
    RadioButton spblo1199;
    @BindView(R.id.fldGrpspblo11)
    LinearLayout fldGrpspblo11;
    @BindView(R.id.spblo12a)
    EditText spblo12a;
    @BindView(R.id.spblo13)
    RadioGroup spblo13;
    @BindView(R.id.spblo13a)
    RadioButton spblo13a;
    @BindView(R.id.spblo13b)
    RadioButton spblo13b;
    @BindView(R.id.spblo13c)
    RadioButton spblo13c;
    @BindView(R.id.spblo13d)
    RadioButton spblo13d;
    @BindView(R.id.spblo1399)
    RadioButton spblo1399;
    @BindView(R.id.spblo1388)
    RadioButton spblo1388;
    @BindView(R.id.spblo1388x)
    EditText spblo1388x;
    @BindView(R.id.spblo14)
    RadioGroup spblo14;
    @BindView(R.id.spblo14a)
    RadioButton spblo14a;
    @BindView(R.id.spblo14b)
    RadioButton spblo14b;
    @BindView(R.id.spblo1499)
    RadioButton spblo1499;
    @BindView(R.id.fldGrpspblo14)
    LinearLayout fldGrpspblo14;
    @BindView(R.id.spblo15)
    RadioGroup spblo15;
    @BindView(R.id.spblo15a)
    RadioButton spblo15a;
    @BindView(R.id.spblo1588)
    RadioButton spblo1588;
    @BindView(R.id.spblo1588x)
    EditText spblo1588x;
    @BindView(R.id.spblo16)
    RadioGroup spblo16;
    @BindView(R.id.spblo16a)
    RadioButton spblo16a;
    @BindView(R.id.spblo16b)
    RadioButton spblo16b;
    @BindView(R.id.spblo1699)
    RadioButton spblo1699;
    @BindView(R.id.fldGrpspblo16)
    LinearLayout fldGrpspblo16;
    @BindView(R.id.spblo17)
    RadioGroup spblo17;
    @BindView(R.id.spblo17a)
    RadioButton spblo17a;
    @BindView(R.id.spblo17b)
    RadioButton spblo17b;
    @BindView(R.id.spblo1788)
    RadioButton spblo1788;
    @BindView(R.id.spblo1788x)
    EditText spblo1788x;
    @BindView(R.id.spblo18)
    RadioGroup spblo18;
    @BindView(R.id.spblo18a)
    RadioButton spblo18a;
    @BindView(R.id.spblo18b)
    RadioButton spblo18b;
    @BindView(R.id.spblo1888)
    RadioButton spblo1888;
    @BindView(R.id.spblo1888x)
    EditText spblo1888x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_o);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {

        Intent secNext = new Intent(this, SectionPActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);

    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        //TODO implement
    }


}
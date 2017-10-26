package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionPActivity extends Activity {

    @BindView(R.id.spblp01a)
    EditText spblp01a;
    @BindView(R.id.fldGrpspblp01b)
    LinearLayout fldGrpspblp01b;
    @BindView(R.id.spblp01b)
    RadioGroup spblp01b;
    @BindView(R.id.spblp01b01)
    RadioButton spblp01b01;
    @BindView(R.id.spblp01b02)
    RadioButton spblp01b02;
    @BindView(R.id.spblp01b03)
    RadioButton spblp01b03;
    @BindView(R.id.spblp01b04)
    RadioButton spblp01b04;
    @BindView(R.id.spblp01b05)
    RadioButton spblp01b05;
    @BindView(R.id.spblp01b06)
    RadioButton spblp01b06;
    @BindView(R.id.spblp01b07)
    RadioButton spblp01b07;
    @BindView(R.id.spblp01b08)
    RadioButton spblp01b08;
    @BindView(R.id.spblp01b09)
    RadioButton spblp01b09;
    @BindView(R.id.spblp01b10)
    RadioButton spblp01b10;
    @BindView(R.id.spblp02a)
    EditText spblp02a;
    @BindView(R.id.fldGrpspblp02b)
    LinearLayout fldGrpspblp02b;
    @BindView(R.id.spblp02b)
    RadioGroup spblp02b;
    @BindView(R.id.spblp02b01)
    RadioButton spblp02b01;
    @BindView(R.id.spblp02b02)
    RadioButton spblp02b02;
    @BindView(R.id.spblp02b03)
    RadioButton spblp02b03;
    @BindView(R.id.spblp02b04)
    RadioButton spblp02b04;
    @BindView(R.id.spblp02b05)
    RadioButton spblp02b05;
    @BindView(R.id.spblp02b06)
    RadioButton spblp02b06;
    @BindView(R.id.spblp02b07)
    RadioButton spblp02b07;
    @BindView(R.id.spblp02b08)
    RadioButton spblp02b08;
    @BindView(R.id.spblp02b09)
    RadioButton spblp02b09;
    @BindView(R.id.spblp02b10)
    RadioButton spblp02b10;
    @BindView(R.id.spblp03a)
    EditText spblp03a;
    @BindView(R.id.fldGrpspblp03b)
    LinearLayout fldGrpspblp03b;
    @BindView(R.id.spblp03b)
    RadioGroup spblp03b;
    @BindView(R.id.spblp03b01)
    RadioButton spblp03b01;
    @BindView(R.id.spblp03b02)
    RadioButton spblp03b02;
    @BindView(R.id.spblp03b03)
    RadioButton spblp03b03;
    @BindView(R.id.spblp03b04)
    RadioButton spblp03b04;
    @BindView(R.id.spblp03b05)
    RadioButton spblp03b05;
    @BindView(R.id.spblp03b06)
    RadioButton spblp03b06;
    @BindView(R.id.spblp03b07)
    RadioButton spblp03b07;
    @BindView(R.id.spblp03b08)
    RadioButton spblp03b08;
    @BindView(R.id.spblp03b09)
    RadioButton spblp03b09;
    @BindView(R.id.spblp03b10)
    RadioButton spblp03b10;
    @BindView(R.id.spblp04a)
    EditText spblp04a;
    @BindView(R.id.fldGrpspblp04)
    LinearLayout fldGrpspblp04;
    @BindView(R.id.fldGrpspblp04b)
    LinearLayout fldGrpspblp04b;
    @BindView(R.id.spblp04b)
    RadioGroup spblp04b;
    @BindView(R.id.spblp04b01)
    RadioButton spblp04b01;
    @BindView(R.id.spblp04b02)
    RadioButton spblp04b02;
    @BindView(R.id.spblp04b03)
    RadioButton spblp04b03;
    @BindView(R.id.spblp04b04)
    RadioButton spblp04b04;
    @BindView(R.id.spblp04b05)
    RadioButton spblp04b05;
    @BindView(R.id.spblp04b06)
    RadioButton spblp04b06;
    @BindView(R.id.spblp04b07)
    RadioButton spblp04b07;
    @BindView(R.id.spblp04b08)
    RadioButton spblp04b08;
    @BindView(R.id.spblp04b09)
    RadioButton spblp04b09;
    @BindView(R.id.spblp04b10)
    RadioButton spblp04b10;
    @BindView(R.id.spblp0401a)
    EditText spblp0401a;
    @BindView(R.id.fldGrpspblp0401b)
    LinearLayout fldGrpspblp0401b;
    @BindView(R.id.spblp0401b)
    RadioGroup spblp0401b;
    @BindView(R.id.spblp0401b01)
    RadioButton spblp0401b01;
    @BindView(R.id.spblp0401b02)
    RadioButton spblp0401b02;
    @BindView(R.id.spblp0401b03)
    RadioButton spblp0401b03;
    @BindView(R.id.spblp0401b04)
    RadioButton spblp0401b04;
    @BindView(R.id.spblp0401b05)
    RadioButton spblp0401b05;
    @BindView(R.id.spblp0401b06)
    RadioButton spblp0401b06;
    @BindView(R.id.spblp0401b07)
    RadioButton spblp0401b07;
    @BindView(R.id.spblp0401b08)
    RadioButton spblp0401b08;
    @BindView(R.id.spblp0401b09)
    RadioButton spblp0401b09;
    @BindView(R.id.spblp0401b10)
    RadioButton spblp0401b10;
    @BindView(R.id.spblp0402a)
    EditText spblp0402a;
    @BindView(R.id.fldGrpspblp0402b)
    LinearLayout fldGrpspblp0402b;
    @BindView(R.id.spblp0402b)
    RadioGroup spblp0402b;
    @BindView(R.id.spblp0402b01)
    RadioButton spblp0402b01;
    @BindView(R.id.spblp0402b02)
    RadioButton spblp0402b02;
    @BindView(R.id.spblp0402b03)
    RadioButton spblp0402b03;
    @BindView(R.id.spblp0402b04)
    RadioButton spblp0402b04;
    @BindView(R.id.spblp0402b05)
    RadioButton spblp0402b05;
    @BindView(R.id.spblp0402b06)
    RadioButton spblp0402b06;
    @BindView(R.id.spblp0402b07)
    RadioButton spblp0402b07;
    @BindView(R.id.spblp0402b08)
    RadioButton spblp0402b08;
    @BindView(R.id.spblp0402b09)
    RadioButton spblp0402b09;
    @BindView(R.id.spblp0402b10)
    RadioButton spblp0402b10;
    @BindView(R.id.spblp0403a)
    EditText spblp0403a;
    @BindView(R.id.fldGrpspblp0403b)
    LinearLayout fldGrpspblp0403b;
    @BindView(R.id.spblp0403b)
    RadioGroup spblp0403b;
    @BindView(R.id.spblp0403b01)
    RadioButton spblp0403b01;
    @BindView(R.id.spblp0403b02)
    RadioButton spblp0403b02;
    @BindView(R.id.spblp0403b03)
    RadioButton spblp0403b03;
    @BindView(R.id.spblp0403b04)
    RadioButton spblp0403b04;
    @BindView(R.id.spblp0403b05)
    RadioButton spblp0403b05;
    @BindView(R.id.spblp0403b06)
    RadioButton spblp0403b06;
    @BindView(R.id.spblp0403b07)
    RadioButton spblp0403b07;
    @BindView(R.id.spblp0403b08)
    RadioButton spblp0403b08;
    @BindView(R.id.spblp0403b09)
    RadioButton spblp0403b09;
    @BindView(R.id.spblp0403b10)
    RadioButton spblp0403b10;
    @BindView(R.id.spblp0404a)
    EditText spblp0404a;
    @BindView(R.id.fldGrpspblp0404b)
    LinearLayout fldGrpspblp0404b;
    @BindView(R.id.spblp0404b)
    RadioGroup spblp0404b;
    @BindView(R.id.spblp0404b01)
    RadioButton spblp0404b01;
    @BindView(R.id.spblp0404b02)
    RadioButton spblp0404b02;
    @BindView(R.id.spblp0404b03)
    RadioButton spblp0404b03;
    @BindView(R.id.spblp0404b04)
    RadioButton spblp0404b04;
    @BindView(R.id.spblp0404b05)
    RadioButton spblp0404b05;
    @BindView(R.id.spblp0404b06)
    RadioButton spblp0404b06;
    @BindView(R.id.spblp0404b07)
    RadioButton spblp0404b07;
    @BindView(R.id.spblp0404b08)
    RadioButton spblp0404b08;
    @BindView(R.id.spblp0404b09)
    RadioButton spblp0404b09;
    @BindView(R.id.spblp0404b10)
    RadioButton spblp0404b10;
    @BindView(R.id.spblp05a)
    EditText spblp05a;
    @BindView(R.id.fldGrpspblp05)
    LinearLayout fldGrpspblp05;
    @BindView(R.id.fldGrpspblp05b)
    LinearLayout fldGrpspblp05b;
    @BindView(R.id.spblp05b)
    RadioGroup spblp05b;
    @BindView(R.id.spblp05b01)
    RadioButton spblp05b01;
    @BindView(R.id.spblp05b02)
    RadioButton spblp05b02;
    @BindView(R.id.spblp05b03)
    RadioButton spblp05b03;
    @BindView(R.id.spblp05b04)
    RadioButton spblp05b04;
    @BindView(R.id.spblp05b05)
    RadioButton spblp05b05;
    @BindView(R.id.spblp05b06)
    RadioButton spblp05b06;
    @BindView(R.id.spblp05b07)
    RadioButton spblp05b07;
    @BindView(R.id.spblp05b08)
    RadioButton spblp05b08;
    @BindView(R.id.spblp05b09)
    RadioButton spblp05b09;
    @BindView(R.id.spblp05b10)
    RadioButton spblp05b10;
    @BindView(R.id.spblp0501a)
    EditText spblp0501a;
    @BindView(R.id.fldGrpspblp0501b)
    LinearLayout fldGrpspblp0501b;
    @BindView(R.id.spblp0501b)
    RadioGroup spblp0501b;
    @BindView(R.id.spblp0501b01)
    RadioButton spblp0501b01;
    @BindView(R.id.spblp0501b02)
    RadioButton spblp0501b02;
    @BindView(R.id.spblp0501b03)
    RadioButton spblp0501b03;
    @BindView(R.id.spblp0501b04)
    RadioButton spblp0501b04;
    @BindView(R.id.spblp0501b05)
    RadioButton spblp0501b05;
    @BindView(R.id.spblp0501b06)
    RadioButton spblp0501b06;
    @BindView(R.id.spblp0501b07)
    RadioButton spblp0501b07;
    @BindView(R.id.spblp0501b08)
    RadioButton spblp0501b08;
    @BindView(R.id.spblp0501b09)
    RadioButton spblp0501b09;
    @BindView(R.id.spblp0501b10)
    RadioButton spblp0501b10;
    @BindView(R.id.spblp0502a)
    EditText spblp0502a;
    @BindView(R.id.fldGrpspblp0502b)
    LinearLayout fldGrpspblp0502b;
    @BindView(R.id.spblp0502b)
    RadioGroup spblp0502b;
    @BindView(R.id.spblp0502b01)
    RadioButton spblp0502b01;
    @BindView(R.id.spblp0502b02)
    RadioButton spblp0502b02;
    @BindView(R.id.spblp0502b03)
    RadioButton spblp0502b03;
    @BindView(R.id.spblp0502b04)
    RadioButton spblp0502b04;
    @BindView(R.id.spblp0502b05)
    RadioButton spblp0502b05;
    @BindView(R.id.spblp0502b06)
    RadioButton spblp0502b06;
    @BindView(R.id.spblp0502b07)
    RadioButton spblp0502b07;
    @BindView(R.id.spblp0502b08)
    RadioButton spblp0502b08;
    @BindView(R.id.spblp0502b09)
    RadioButton spblp0502b09;
    @BindView(R.id.spblp0502b10)
    RadioButton spblp0502b10;
    @BindView(R.id.spblp06a)
    EditText spblp06a;
    @BindView(R.id.fldGrpspblp06)
    LinearLayout fldGrpspblp06;
    @BindView(R.id.fldGrpspblp06b)
    LinearLayout fldGrpspblp06b;
    @BindView(R.id.spblp06b)
    RadioGroup spblp06b;
    @BindView(R.id.spblp06b01)
    RadioButton spblp06b01;
    @BindView(R.id.spblp06b02)
    RadioButton spblp06b02;
    @BindView(R.id.spblp06b03)
    RadioButton spblp06b03;
    @BindView(R.id.spblp06b04)
    RadioButton spblp06b04;
    @BindView(R.id.spblp06b05)
    RadioButton spblp06b05;
    @BindView(R.id.spblp06b06)
    RadioButton spblp06b06;
    @BindView(R.id.spblp06b07)
    RadioButton spblp06b07;
    @BindView(R.id.spblp06b08)
    RadioButton spblp06b08;
    @BindView(R.id.spblp06b09)
    RadioButton spblp06b09;
    @BindView(R.id.spblp06b10)
    RadioButton spblp06b10;
    @BindView(R.id.spblp0601a)
    EditText spblp0601a;
    @BindView(R.id.fldGrpspblp0601b)
    LinearLayout fldGrpspblp0601b;
    @BindView(R.id.spblp0601b)
    RadioGroup spblp0601b;
    @BindView(R.id.spblp0601b01)
    RadioButton spblp0601b01;
    @BindView(R.id.spblp0601b02)
    RadioButton spblp0601b02;
    @BindView(R.id.spblp0601b03)
    RadioButton spblp0601b03;
    @BindView(R.id.spblp0601b04)
    RadioButton spblp0601b04;
    @BindView(R.id.spblp0601b05)
    RadioButton spblp0601b05;
    @BindView(R.id.spblp0601b06)
    RadioButton spblp0601b06;
    @BindView(R.id.spblp0601b07)
    RadioButton spblp0601b07;
    @BindView(R.id.spblp0601b08)
    RadioButton spblp0601b08;
    @BindView(R.id.spblp0601b09)
    RadioButton spblp0601b09;
    @BindView(R.id.spblp0601b10)
    RadioButton spblp0601b10;
    @BindView(R.id.spblp07a)
    EditText spblp07a;
    @BindView(R.id.fldGrpspblp07b)
    LinearLayout fldGrpspblp07b;
    @BindView(R.id.spblp07b)
    RadioGroup spblp07b;
    @BindView(R.id.spblp07b01)
    RadioButton spblp07b01;
    @BindView(R.id.spblp07b02)
    RadioButton spblp07b02;
    @BindView(R.id.spblp07b03)
    RadioButton spblp07b03;
    @BindView(R.id.spblp07b04)
    RadioButton spblp07b04;
    @BindView(R.id.spblp07b05)
    RadioButton spblp07b05;
    @BindView(R.id.spblp07b06)
    RadioButton spblp07b06;
    @BindView(R.id.spblp07b07)
    RadioButton spblp07b07;
    @BindView(R.id.spblp07b08)
    RadioButton spblp07b08;
    @BindView(R.id.spblp07b09)
    RadioButton spblp07b09;
    @BindView(R.id.spblp07b10)
    RadioButton spblp07b10;
    @BindView(R.id.spblp08a)
    EditText spblp08a;
    @BindView(R.id.fldGrpspblp08b)
    LinearLayout fldGrpspblp08b;
    @BindView(R.id.spblp08b)
    RadioGroup spblp08b;
    @BindView(R.id.spblp08b01)
    RadioButton spblp08b01;
    @BindView(R.id.spblp08b02)
    RadioButton spblp08b02;
    @BindView(R.id.spblp08b03)
    RadioButton spblp08b03;
    @BindView(R.id.spblp08b04)
    RadioButton spblp08b04;
    @BindView(R.id.spblp08b05)
    RadioButton spblp08b05;
    @BindView(R.id.spblp08b06)
    RadioButton spblp08b06;
    @BindView(R.id.spblp08b07)
    RadioButton spblp08b07;
    @BindView(R.id.spblp08b08)
    RadioButton spblp08b08;
    @BindView(R.id.spblp08b09)
    RadioButton spblp08b09;
    @BindView(R.id.spblp08b10)
    RadioButton spblp08b10;
    @BindView(R.id.spblp09a)
    EditText spblp09a;
    @BindView(R.id.fldGrpspblp09b)
    LinearLayout fldGrpspblp09b;
    @BindView(R.id.spblp09b)
    RadioGroup spblp09b;
    @BindView(R.id.spblp09b01)
    RadioButton spblp09b01;
    @BindView(R.id.spblp09b02)
    RadioButton spblp09b02;
    @BindView(R.id.spblp09b03)
    RadioButton spblp09b03;
    @BindView(R.id.spblp09b04)
    RadioButton spblp09b04;
    @BindView(R.id.spblp09b05)
    RadioButton spblp09b05;
    @BindView(R.id.spblp09b06)
    RadioButton spblp09b06;
    @BindView(R.id.spblp09b07)
    RadioButton spblp09b07;
    @BindView(R.id.spblp09b08)
    RadioButton spblp09b08;
    @BindView(R.id.spblp09b09)
    RadioButton spblp09b09;
    @BindView(R.id.spblp09b10)
    RadioButton spblp09b10;
    @BindView(R.id.spblpa01)
    RadioGroup spblpa01;
    @BindView(R.id.spblpa01a)
    RadioButton spblpa01a;
    @BindView(R.id.spblpa01b)
    RadioButton spblpa01b;
    @BindView(R.id.spblpa01c)
    RadioButton spblpa01c;
    @BindView(R.id.spblpa01d)
    RadioButton spblpa01d;
    @BindView(R.id.spblpa01e)
    RadioButton spblpa01e;
    @BindView(R.id.spblpa01f)
    RadioButton spblpa01f;
    @BindView(R.id.spblpa01g)
    RadioButton spblpa01g;
    @BindView(R.id.spblpa02)
    RadioGroup spblpa02;
    @BindView(R.id.spblpa02a)
    RadioButton spblpa02a;
    @BindView(R.id.spblpa02b)
    RadioButton spblpa02b;
    @BindView(R.id.spblpa02c)
    RadioButton spblpa02c;
    @BindView(R.id.spblpa02d)
    RadioButton spblpa02d;
    @BindView(R.id.spblpa02e)
    RadioButton spblpa02e;
    @BindView(R.id.spblpa02f)
    RadioButton spblpa02f;
    @BindView(R.id.spblpa02g)
    RadioButton spblpa02g;
    @BindView(R.id.spblpa03)
    RadioGroup spblpa03;
    @BindView(R.id.spblpa03a)
    RadioButton spblpa03a;
    @BindView(R.id.spblpa03b)
    RadioButton spblpa03b;
    @BindView(R.id.spblpa03c)
    RadioButton spblpa03c;
    @BindView(R.id.spblpa03d)
    RadioButton spblpa03d;
    @BindView(R.id.spblpa03e)
    RadioButton spblpa03e;
    @BindView(R.id.spblpa03f)
    RadioButton spblpa03f;
    @BindView(R.id.spblpa03g)
    RadioButton spblpa03g;
    @BindView(R.id.spblpa04)
    RadioGroup spblpa04;
    @BindView(R.id.spblpa04a)
    RadioButton spblpa04a;
    @BindView(R.id.spblpa04b)
    RadioButton spblpa04b;
    @BindView(R.id.spblpa04c)
    RadioButton spblpa04c;
    @BindView(R.id.spblpa04d)
    RadioButton spblpa04d;
    @BindView(R.id.spblpa04e)
    RadioButton spblpa04e;
    @BindView(R.id.spblpa04f)
    RadioButton spblpa04f;
    @BindView(R.id.spblpa04g)
    RadioButton spblpa04g;
    @BindView(R.id.spblpa05)
    RadioGroup spblpa05;
    @BindView(R.id.spblpa05a)
    RadioButton spblpa05a;
    @BindView(R.id.spblpa05b)
    RadioButton spblpa05b;
    @BindView(R.id.spblpa05c)
    RadioButton spblpa05c;
    @BindView(R.id.spblpa05d)
    RadioButton spblpa05d;
    @BindView(R.id.spblpa05e)
    RadioButton spblpa05e;
    @BindView(R.id.spblpa05f)
    RadioButton spblpa05f;
    @BindView(R.id.spblpa05g)
    RadioButton spblpa05g;
    @BindView(R.id.spblpb01)
    RadioGroup spblpb01;
    @BindView(R.id.spblpb01a)
    RadioButton spblpb01a;
    @BindView(R.id.spblpb01b)
    RadioButton spblpb01b;
    @BindView(R.id.spblpb01c)
    RadioButton spblpb01c;
    @BindView(R.id.spblpb01d)
    RadioButton spblpb01d;
    @BindView(R.id.spblpb01e)
    RadioButton spblpb01e;
    @BindView(R.id.spblpb01f)
    RadioButton spblpb01f;
    @BindView(R.id.spblpb01g)
    RadioButton spblpb01g;
    @BindView(R.id.spblpb02)
    RadioGroup spblpb02;
    @BindView(R.id.spblpb02a)
    RadioButton spblpb02a;
    @BindView(R.id.spblpb02b)
    RadioButton spblpb02b;
    @BindView(R.id.spblpb02c)
    RadioButton spblpb02c;
    @BindView(R.id.spblpb02d)
    RadioButton spblpb02d;
    @BindView(R.id.spblpb02e)
    RadioButton spblpb02e;
    @BindView(R.id.spblpb02f)
    RadioButton spblpb02f;
    @BindView(R.id.spblpb02g)
    RadioButton spblpb02g;
    @BindView(R.id.spblpb03)
    RadioGroup spblpb03;
    @BindView(R.id.spblpb03a)
    RadioButton spblpb03a;
    @BindView(R.id.spblpb03b)
    RadioButton spblpb03b;
    @BindView(R.id.spblpb03c)
    RadioButton spblpb03c;
    @BindView(R.id.spblpb03d)
    RadioButton spblpb03d;
    @BindView(R.id.spblpb03e)
    RadioButton spblpb03e;
    @BindView(R.id.spblpb03f)
    RadioButton spblpb03f;
    @BindView(R.id.spblpb03g)
    RadioButton spblpb03g;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_p);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();


                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", true);
                startActivity(endSec);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

     /*   int updcount = db.updateSP();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject sp = new JSONObject();


        //   MainApp.fc.setsP(String.valueOf(sp));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== spblp01a ==============

        return true;

    }

}



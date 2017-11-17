package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionCActivity extends Activity {

    private static final String TAG = SectionCActivity.class.getName();

    @BindView(R.id.spblc01)
    RadioGroup spblc01;
    @BindView(R.id.spblc01a)
    RadioButton spblc01a;
    @BindView(R.id.spblc01b)
    RadioButton spblc01b;
    @BindView(R.id.spblc01c)
    RadioButton spblc01c;
    @BindView(R.id.spblc01d)
    RadioButton spblc01d;
    @BindView(R.id.spblc01e)
    RadioButton spblc01e;
    @BindView(R.id.spblc01f)
    RadioButton spblc01f;
    @BindView(R.id.spblc0188)
    RadioButton spblc0188;
    @BindView(R.id.spblc0188x)
    EditText spblc0188x;
    @BindView(R.id.spblc02)
    RadioGroup spblc02;
    @BindView(R.id.spblc02a)
    RadioButton spblc02a;
    @BindView(R.id.spblc02b)
    RadioButton spblc02b;
    @BindView(R.id.spblc02c)
    RadioButton spblc02c;
    @BindView(R.id.spblc02d)
    RadioButton spblc02d;
    @BindView(R.id.spblc02e)
    RadioButton spblc02e;
    @BindView(R.id.spblc02f)
    RadioButton spblc02f;
    @BindView(R.id.spblc02g)
    RadioButton spblc02g;
    @BindView(R.id.spblc02h)
    RadioButton spblc02h;
    @BindView(R.id.spblc02i)
    RadioButton spblc02i;
    @BindView(R.id.spblc02j)
    RadioButton spblc02j;
    @BindView(R.id.spblc02k)
    RadioButton spblc02k;
    @BindView(R.id.spblc02l)
    RadioButton spblc02l;
    @BindView(R.id.spblc02o)
    RadioButton spblc02o;
    @BindView(R.id.spblc02n)
    RadioButton spblc02n;
    @BindView(R.id.spblc02m)
    RadioButton spblc02m;
    @BindView(R.id.spblc0288)
    RadioButton spblc0288;
    @BindView(R.id.spblc0288x)
    EditText spblc0288x;
    @BindView(R.id.spblc03)
    RadioGroup spblc03;
    @BindView(R.id.spblc03a)
    RadioButton spblc03a;
    @BindView(R.id.spblc03b)
    RadioButton spblc03b;
    @BindView(R.id.fldGrpspblc01)
    LinearLayout fldGrpspblc01;
    @BindView(R.id.spblc04)
    RadioGroup spblc04;
    @BindView(R.id.spblc04a)
    RadioButton spblc04a;
    @BindView(R.id.spblc04b)
    RadioButton spblc04b;
    @BindView(R.id.spblc04c)
    RadioButton spblc04c;
    @BindView(R.id.spblc04d)
    RadioButton spblc04d;
    @BindView(R.id.spblc04e)
    RadioButton spblc04e;
    @BindView(R.id.spblc04f)
    RadioButton spblc04f;
    @BindView(R.id.spblc0488)
    RadioButton spblc0488;
    @BindView(R.id.spblc0488x)
    EditText spblc0488x;
    @BindView(R.id.spblc05)
    RadioGroup spblc05;
    @BindView(R.id.spblc05a)
    RadioButton spblc05a;
    @BindView(R.id.spblc05b)
    RadioButton spblc05b;
    @BindView(R.id.spblc05c)
    RadioButton spblc05c;
    @BindView(R.id.spblc05d)
    RadioButton spblc05d;
    @BindView(R.id.spblc05e)
    RadioButton spblc05e;
    @BindView(R.id.spblc05f)
    RadioButton spblc05f;
    @BindView(R.id.spblc05g)
    RadioButton spblc05g;
    @BindView(R.id.spblc05h)
    RadioButton spblc05h;
    @BindView(R.id.spblc05i)
    RadioButton spblc05i;
    @BindView(R.id.spblc05j)
    RadioButton spblc05j;
    @BindView(R.id.spblc0588)
    RadioButton spblc0588;
    @BindView(R.id.spblc0588x)
    EditText spblc0588x;
    @BindView(R.id.spblc06)
    RadioGroup spblc06;
    @BindView(R.id.spblc06a)
    RadioButton spblc06a;
    @BindView(R.id.spblc06b)
    RadioButton spblc06b;
    @BindView(R.id.fldGrpspblc02)
    LinearLayout fldGrpspblc02;
    @BindView(R.id.spblc07)
    EditText spblc07;
    @BindView(R.id.spblc0799)
    CheckBox spblc0799;
    @BindView(R.id.spblc0801)
    RadioGroup spblc0801;
    @BindView(R.id.spblc0801a)
    RadioButton spblc0801a;
    @BindView(R.id.spblc0801b)
    RadioButton spblc0801b;
    @BindView(R.id.spblc0802)
    RadioGroup spblc0802;
    @BindView(R.id.spblc0802a)
    RadioButton spblc0802a;
    @BindView(R.id.spblc0802b)
    RadioButton spblc0802b;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.spblc0803)
    RadioGroup spblc0803;
    @BindView(R.id.spblc0803a)
    RadioButton spblc0803a;
    @BindView(R.id.spblc0803b)
    RadioButton spblc0803b;
    @BindView(R.id.spblc0804)
    RadioGroup spblc0804;
    @BindView(R.id.spblc0804a)
    RadioButton spblc0804a;
    @BindView(R.id.spblc0804b)
    RadioButton spblc0804b;
    @BindView(R.id.spblc0805)
    RadioGroup spblc0805;
    @BindView(R.id.spblc0805a)
    RadioButton spblc0805a;
    @BindView(R.id.spblc0805b)
    RadioButton spblc0805b;
    @BindView(R.id.spblc0806)
    RadioGroup spblc0806;
    @BindView(R.id.spblc0806a)
    RadioButton spblc0806a;
    @BindView(R.id.spblc0806b)
    RadioButton spblc0806b;
    @BindView(R.id.spblc0807)
    RadioGroup spblc0807;
    @BindView(R.id.spblc0807a)
    RadioButton spblc0807a;
    @BindView(R.id.spblc0807b)
    RadioButton spblc0807b;
    @BindView(R.id.spblc0808)
    RadioGroup spblc0808;
    @BindView(R.id.spblc0808a)
    RadioButton spblc0808a;
    @BindView(R.id.spblc0808b)
    RadioButton spblc0808b;
    @BindView(R.id.spblc0809)
    RadioGroup spblc0809;
    @BindView(R.id.spblc0809a)
    RadioButton spblc0809a;
    @BindView(R.id.spblc0809b)
    RadioButton spblc0809b;
    @BindView(R.id.spblc0810)
    RadioGroup spblc0810;
    @BindView(R.id.spblc0810a)
    RadioButton spblc0810a;
    @BindView(R.id.spblc0810b)
    RadioButton spblc0810b;
    @BindView(R.id.spblc0811)
    RadioGroup spblc0811;
    @BindView(R.id.spblc0811a)
    RadioButton spblc0811a;
    @BindView(R.id.spblc0811b)
    RadioButton spblc0811b;
    @BindView(R.id.spblc0812)
    RadioGroup spblc0812;
    @BindView(R.id.spblc0812a)
    RadioButton spblc0812a;
    @BindView(R.id.spblc0812b)
    RadioButton spblc0812b;
    @BindView(R.id.spblc0813)
    RadioGroup spblc0813;
    @BindView(R.id.spblc0813a)
    RadioButton spblc0813a;
    @BindView(R.id.spblc0813b)
    RadioButton spblc0813b;
    @BindView(R.id.spblc0814)
    RadioGroup spblc0814;
    @BindView(R.id.spblc0814a)
    RadioButton spblc0814a;
    @BindView(R.id.spblc0814b)
    RadioButton spblc0814b;
    @BindView(R.id.spblc0815)
    RadioGroup spblc0815;
    @BindView(R.id.spblc0815a)
    RadioButton spblc0815a;
    @BindView(R.id.spblc0815b)
    RadioButton spblc0815b;
    @BindView(R.id.spblc0816)
    RadioGroup spblc0816;
    @BindView(R.id.spblc0816a)
    RadioButton spblc0816a;
    @BindView(R.id.spblc0816b)
    RadioButton spblc0816b;
    @BindView(R.id.spblc0817)
    RadioGroup spblc0817;
    @BindView(R.id.spblc0817a)
    RadioButton spblc0817a;
    @BindView(R.id.spblc0817b)
    RadioButton spblc0817b;
    @BindView(R.id.spblc0818)
    RadioGroup spblc0818;
    @BindView(R.id.spblc0818a)
    RadioButton spblc0818a;
    @BindView(R.id.spblc0818b)
    RadioButton spblc0818b;
    @BindView(R.id.spblc09)
    RadioGroup spblc09;
    @BindView(R.id.spblc09a)
    RadioButton spblc09a;
    @BindView(R.id.spblc09b)
    RadioButton spblc09b;
    @BindView(R.id.spblc09c)
    RadioButton spblc09c;
    @BindView(R.id.spblc09d)
    RadioButton spblc09d;
    @BindView(R.id.spblc09e)
    RadioButton spblc09e;
    @BindView(R.id.spblc09f)
    RadioButton spblc09f;
    @BindView(R.id.spblc09g)
    RadioButton spblc09g;
    @BindView(R.id.spblc09h)
    RadioButton spblc09h;
    @BindView(R.id.spblc09i)
    RadioButton spblc09i;
    @BindView(R.id.spblc09j)
    RadioButton spblc09j;
    @BindView(R.id.spblc0988)
    RadioButton spblc0988;
    @BindView(R.id.spblc0988x)
    EditText spblc0988x;
    @BindView(R.id.spblc10)
    RadioGroup spblc10;
    @BindView(R.id.spblc10a)
    RadioButton spblc10a;
    @BindView(R.id.spblc10b)
    RadioButton spblc10b;
    @BindView(R.id.spblc10c)
    RadioButton spblc10c;
    @BindView(R.id.spblc1088)
    RadioButton spblc1088;
    @BindView(R.id.spblc1088x)
    EditText spblc1088x;
    @BindView(R.id.spblc11)
    RadioGroup spblc11;
    @BindView(R.id.spblc11a)
    RadioButton spblc11a;
    @BindView(R.id.spblc11b)
    RadioButton spblc11b;
    @BindView(R.id.spblc12)
    RadioGroup spblc12;
    @BindView(R.id.spblc12a)
    RadioButton spblc12a;
    @BindView(R.id.spblc12b)
    RadioButton spblc12b;
    @BindView(R.id.spblc12c)
    RadioButton spblc12c;
    @BindView(R.id.spblc12d)
    RadioButton spblc12d;
    @BindView(R.id.spblc12e)
    RadioButton spblc12e;
    @BindView(R.id.spblc12f)
    RadioButton spblc12f;
    @BindView(R.id.spblc12g)
    RadioButton spblc12g;
    @BindView(R.id.spblc12h)
    RadioButton spblc12h;
    @BindView(R.id.spblc12i)
    RadioButton spblc12i;
    @BindView(R.id.spblc12j)
    RadioButton spblc12j;
    @BindView(R.id.spblc12k)
    RadioButton spblc12k;
    @BindView(R.id.spblc12l)
    RadioButton spblc12l;
    @BindView(R.id.spblc12m)
    RadioButton spblc12m;
    @BindView(R.id.spblc1288)
    RadioButton spblc1288;
    @BindView(R.id.spblc1288x)
    EditText spblc1288x;
    @BindView(R.id.spblc13)
    RadioGroup spblc13;
    @BindView(R.id.spblc13a)
    RadioButton spblc13a;
    @BindView(R.id.spblc13b)
    RadioButton spblc13b;
    @BindView(R.id.spblc13c)
    RadioButton spblc13c;
    @BindView(R.id.spblc13d)
    RadioButton spblc13d;
    @BindView(R.id.spblc13e)
    RadioButton spblc13e;
    @BindView(R.id.spblc13f)
    RadioButton spblc13f;
    @BindView(R.id.spblc13g)
    RadioButton spblc13g;
    @BindView(R.id.spblc13h)
    RadioButton spblc13h;
    @BindView(R.id.spblc13i)
    RadioButton spblc13i;
    @BindView(R.id.spblc13j)
    RadioButton spblc13j;
    @BindView(R.id.spblc13k)
    RadioButton spblc13k;
    @BindView(R.id.spblc13l)
    RadioButton spblc13l;
    @BindView(R.id.spblc13m)
    RadioButton spblc13m;
    @BindView(R.id.spblc13n)
    RadioButton spblc13n;
    @BindView(R.id.spblc1388)
    RadioButton spblc1388;
    @BindView(R.id.spblc1388x)
    EditText spblc1388x;
    @BindView(R.id.spblc14)
    RadioGroup spblc14;
    @BindView(R.id.spblc14a)
    RadioButton spblc14a;
    @BindView(R.id.spblc14b)
    RadioButton spblc14b;
    @BindView(R.id.spblc14c)
    RadioButton spblc14c;
    @BindView(R.id.spblc14d)
    RadioButton spblc14d;
    @BindView(R.id.spblc14e)
    RadioButton spblc14e;
    @BindView(R.id.spblc14f)
    RadioButton spblc14f;
    @BindView(R.id.spblc14g)
    RadioButton spblc14g;
    @BindView(R.id.spblc14h)
    RadioButton spblc14h;
    @BindView(R.id.spblc14i)
    RadioButton spblc14i;
    @BindView(R.id.spblc14j)
    RadioButton spblc14j;
    @BindView(R.id.spblc14k)
    RadioButton spblc14k;
    @BindView(R.id.spblc14l)
    RadioButton spblc14l;
    @BindView(R.id.spblc14m)
    RadioButton spblc14m;
    @BindView(R.id.spblc14n)
    RadioButton spblc14n;
    @BindView(R.id.spblc14o)
    RadioButton spblc14o;
    @BindView(R.id.spblc14p)
    RadioButton spblc14p;
    @BindView(R.id.spblc14q)
    RadioButton spblc14q;
    @BindView(R.id.spblc14r)
    RadioButton spblc14r;
    @BindView(R.id.spblc14s)
    RadioButton spblc14s;
    @BindView(R.id.spblc14t)
    RadioButton spblc14t;
    @BindView(R.id.spblc14u)
    RadioButton spblc14u;
    @BindView(R.id.spblc1488)
    RadioButton spblc1488;
    @BindView(R.id.spblc1488x)
    EditText spblc1488x;
    @BindView(R.id.spblc15)
    EditText spblc15;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.spblc16a)
    RadioGroup spblc16a;
    @BindView(R.id.spblc16aa)
    RadioButton spblc16aa;
    @BindView(R.id.spblc16ab)
    RadioButton spblc16ab;
    @BindView(R.id.spblc16b)
    RadioGroup spblc16b;
    @BindView(R.id.spblc16ba)
    RadioButton spblc16ba;
    @BindView(R.id.spblc16bb)
    RadioButton spblc16bb;
    @BindView(R.id.spblc16c)
    RadioGroup spblc16c;
    @BindView(R.id.spblc16ca)
    RadioButton spblc16ca;
    @BindView(R.id.spblc16cb)
    RadioButton spblc16cb;
    @BindView(R.id.spblc16d)
    RadioGroup spblc16d;
    @BindView(R.id.spblc16da)
    RadioButton spblc16da;
    @BindView(R.id.spblc16db)
    RadioButton spblc16db;
    @BindView(R.id.spblc16e)
    RadioGroup spblc16e;
    @BindView(R.id.spblc16ea)
    RadioButton spblc16ea;
    @BindView(R.id.spblc16eb)
    RadioButton spblc16eb;
    @BindView(R.id.spblc16f)
    RadioGroup spblc16f;
    @BindView(R.id.spblc16fa)
    RadioButton spblc16fa;
    @BindView(R.id.spblc16fb)
    RadioButton spblc16fb;
    @BindView(R.id.spblc16g)
    RadioGroup spblc16g;
    @BindView(R.id.spblc16ga)
    RadioButton spblc16ga;
    @BindView(R.id.spblc16gb)
    RadioButton spblc16gb;
    @BindView(R.id.spblc16h)
    RadioGroup spblc16h;
    @BindView(R.id.spblc16ha)
    RadioButton spblc16ha;
    @BindView(R.id.spblc16hb)
    RadioButton spblc16hb;
    @BindView(R.id.spblc16i)
    RadioGroup spblc16i;
    @BindView(R.id.spblc16ia)
    RadioButton spblc16ia;
    @BindView(R.id.spblc16ib)
    RadioButton spblc16ib;
    @BindView(R.id.spblc17)
    RadioGroup spblc17;
    @BindView(R.id.spblc17a)
    RadioButton spblc17a;
    @BindView(R.id.spblc17b)
    RadioButton spblc17b;
    @BindView(R.id.fldGrpspblc03)
    LinearLayout fldGrpspblc03;
    @BindView(R.id.spblc18)
    RadioGroup spblc18;
    @BindView(R.id.spblc18a)
    RadioButton spblc18a;
    @BindView(R.id.spblc18ac)
    EditText spblc18ac;
    @BindView(R.id.spblc18b)
    RadioButton spblc18b;
    @BindView(R.id.spblc18kn)
    EditText spblc18kn;
    @BindView(R.id.spblc18c)
    RadioButton spblc18c;
    @BindView(R.id.spblc18mr)
    EditText spblc18mr;
    @BindView(R.id.spblc1899)
    RadioButton spblc1899;
    @BindView(R.id.spblc19)
    RadioGroup spblc19;
    @BindView(R.id.spblc19a)
    RadioButton spblc19a;
    @BindView(R.id.spblc19b)
    RadioButton spblc19b;
    @BindView(R.id.fldGrpspblc04)
    LinearLayout fldGrpspblc04;
    @BindView(R.id.spblc20a)
    EditText spblc20a;
    @BindView(R.id.spblc20b)
    EditText spblc20b;
    @BindView(R.id.spblc20c)
    EditText spblc20c;
    @BindView(R.id.spblc20d)
    EditText spblc20d;
    @BindView(R.id.spblc20e)
    EditText spblc20e;
    @BindView(R.id.spblc20f)
    EditText spblc20f;
    @BindView(R.id.spblc20g)
    EditText spblc20g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);


//        Skips

//        03
        spblc03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc03a) {
                    fldGrpspblc01.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblc01.setVisibility(View.GONE);
                    spblc04.clearCheck();
                    spblc0488x.setText(null);
                }
            }
        });

//        06
        spblc06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc06a) {
                    fldGrpspblc02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblc02.setVisibility(View.GONE);
                    spblc0799.setChecked(false);
                    spblc07.setText(null);
                }
            }
        });

//        17
        spblc17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc17a) {
                    fldGrpspblc03.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblc03.setVisibility(View.GONE);
                    spblc18.clearCheck();
                    spblc18ac.setText(null);
                    spblc18kn.setText(null);
                    spblc18mr.setText(null);
                }
            }
        });

//        19
        spblc19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc19a) {
                    fldGrpspblc04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblc04.setVisibility(View.GONE);
                    spblc20a.setText(null);
                    spblc20b.setText(null);
                    spblc20c.setText(null);
                    spblc20d.setText(null);
                    spblc20e.setText(null);
                    spblc20f.setText(null);
                    spblc20g.setText(null);
                }
            }
        });

//        Others Skip

//        01
        spblc01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc0188) {
                    spblc0188x.setVisibility(View.VISIBLE);
                } else {
                    spblc0188x.setVisibility(View.GONE);
                    spblc0188x.setText(null);
                }
            }
        });


//        02
        spblc02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc0288) {
                    spblc0288x.setVisibility(View.VISIBLE);
                } else {
                    spblc0288x.setVisibility(View.GONE);
                    spblc0288x.setText(null);
                }
            }
        });

//        04
        spblc04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc0488) {
                    spblc0488x.setVisibility(View.VISIBLE);
                } else {
                    spblc0488x.setVisibility(View.GONE);
                    spblc0488x.setText(null);
                }
            }
        });

//        05
        spblc05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc0588) {
                    spblc0588x.setVisibility(View.VISIBLE);
                } else {
                    spblc0588x.setVisibility(View.GONE);
                    spblc0588x.setText(null);
                }
            }
        });

//        07
        spblc0799.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    spblc07.setVisibility(View.GONE);
                    spblc07.setText(null);
                } else {
                    spblc07.setVisibility(View.VISIBLE);

                }
            }
        });

//        09
        spblc09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc0988) {
                    spblc0988x.setVisibility(View.VISIBLE);
                } else {
                    spblc0988x.setVisibility(View.GONE);
                    spblc0988x.setText(null);
                }
            }
        });

//        10
        spblc10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc1088) {
                    spblc1088x.setVisibility(View.VISIBLE);
                } else {
                    spblc1088x.setVisibility(View.GONE);
                    spblc1088x.setText(null);
                }
            }
        });

//        10
        spblc10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc1088) {
                    spblc1088x.setVisibility(View.VISIBLE);
                } else {
                    spblc1088x.setVisibility(View.GONE);
                    spblc1088x.setText(null);
                }
            }
        });

//        12
        spblc12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc1288) {
                    spblc1288x.setVisibility(View.VISIBLE);
                } else {
                    spblc1288x.setVisibility(View.GONE);
                    spblc1288x.setText(null);
                }
            }
        });

//        13
        spblc13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc1388) {
                    spblc1388x.setVisibility(View.VISIBLE);
                } else {
                    spblc1388x.setVisibility(View.GONE);
                    spblc1388x.setText(null);
                }
            }
        });

//        14
        spblc14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc1488) {
                    spblc1488x.setVisibility(View.VISIBLE);
                } else {
                    spblc1488x.setVisibility(View.GONE);
                    spblc1488x.setText(null);
                }
            }
        });

//        18
        spblc18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.spblc18a) {
                    spblc18ac.setVisibility(View.VISIBLE);
                    spblc18kn.setVisibility(View.GONE);
                    spblc18kn.setText(null);
                    spblc18mr.setVisibility(View.GONE);
                    spblc18mr.setText(null);
                } else if (i == R.id.spblc18b) {
                    spblc18kn.setVisibility(View.VISIBLE);
                    spblc18ac.setVisibility(View.GONE);
                    spblc18ac.setText(null);
                    spblc18mr.setVisibility(View.GONE);
                    spblc18mr.setText(null);
                } else if (i == R.id.spblc18c) {
                    spblc18mr.setVisibility(View.VISIBLE);
                    spblc18ac.setVisibility(View.GONE);
                    spblc18ac.setText(null);
                    spblc18kn.setVisibility(View.GONE);
                    spblc18kn.setText(null);
                } else {
                    spblc18ac.setVisibility(View.GONE);
                    spblc18ac.setText(null);
                    spblc18kn.setVisibility(View.GONE);
                    spblc18kn.setText(null);
                    spblc18mr.setVisibility(View.GONE);
                    spblc18mr.setText(null);
                }
            }
        });


    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionDActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        MainApp.endActivity(this, this);
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sC = new JSONObject();

//        01
        sC.put("spblc01", spblc01a.isChecked() ? "1" : spblc01b.isChecked() ? "2" : spblc01c.isChecked() ? "3"
                : spblc01d.isChecked() ? "4" : spblc01e.isChecked() ? "5" : spblc01f.isChecked() ? "6"
                : spblc0188.isChecked() ? "88" : "0");
        sC.put("spblc0188x", spblc0188x.getText().toString());

//        02
        sC.put("spblc02", spblc02a.isChecked() ? "1" : spblc02b.isChecked() ? "2" : spblc02c.isChecked() ? "3"
                : spblc02d.isChecked() ? "4" : spblc02e.isChecked() ? "5" : spblc02f.isChecked() ? "6"
                : spblc02g.isChecked() ? "7" : spblc02h.isChecked() ? "8" : spblc02i.isChecked() ? "9" : spblc02j.isChecked() ? "10"
                : spblc02k.isChecked() ? "11" : spblc02l.isChecked() ? "12" : spblc02m.isChecked() ? "13"
                : spblc02n.isChecked() ? "14" : spblc02o.isChecked() ? "15" : spblc0288.isChecked() ? "88"
                : "0");
        sC.put("spblc0288x", spblc0288x.getText().toString());

//        03
        sC.put("spblc03", spblc03a.isChecked() ? "1" : spblc03b.isChecked() ? "2" : "0");

//        04
        sC.put("spblc04", spblc04a.isChecked() ? "1" : spblc04b.isChecked() ? "2" : spblc04c.isChecked() ? "3"
                : spblc04d.isChecked() ? "4" : spblc04e.isChecked() ? "5" : spblc04f.isChecked() ? "6"
                : spblc0488.isChecked() ? "88" : "0");
        sC.put("spblc0488x", spblc0488x.getText().toString());

//        05
        sC.put("spblc05", spblc05a.isChecked() ? "1" : spblc05b.isChecked() ? "2" : spblc05c.isChecked() ? "3"
                : spblc05d.isChecked() ? "4" : spblc05e.isChecked() ? "5" : spblc05f.isChecked() ? "6"
                : spblc05g.isChecked() ? "7" : spblc05h.isChecked() ? "8" : spblc05i.isChecked() ? "9"
                : spblc05j.isChecked() ? "10" : spblc0588.isChecked() ? "88" : "0");
        sC.put("spblc0588x", spblc0588x.getText().toString());

//        06
        sC.put("spblc06", spblc06a.isChecked() ? "1" : spblc06b.isChecked() ? "2" : "0");

//        07
        sC.put("spblc07", spblc0799.isChecked() ? "99" : spblc07.getText().toString());

//        08
        sC.put("spblc0801", spblc0801a.isChecked() ? "1" : spblc0801b.isChecked() ? "2" : "0");
        sC.put("spblc0802", spblc0802a.isChecked() ? "1" : spblc0802b.isChecked() ? "2" : "0");
        sC.put("spblc0803", spblc0803a.isChecked() ? "1" : spblc0803b.isChecked() ? "2" : "0");
        sC.put("spblc0804", spblc0804a.isChecked() ? "1" : spblc0804b.isChecked() ? "2" : "0");
        sC.put("spblc0805", spblc0805a.isChecked() ? "1" : spblc0805b.isChecked() ? "2" : "0");
        sC.put("spblc0806", spblc0806a.isChecked() ? "1" : spblc0806b.isChecked() ? "2" : "0");
        sC.put("spblc0807", spblc0807a.isChecked() ? "1" : spblc0807b.isChecked() ? "2" : "0");
        sC.put("spblc0808", spblc0808a.isChecked() ? "1" : spblc0808b.isChecked() ? "2" : "0");
        sC.put("spblc0809", spblc0809a.isChecked() ? "1" : spblc0809b.isChecked() ? "2" : "0");
        sC.put("spblc0810", spblc0810a.isChecked() ? "1" : spblc0810b.isChecked() ? "2" : "0");
        sC.put("spblc0811", spblc0811a.isChecked() ? "1" : spblc0811b.isChecked() ? "2" : "0");
        sC.put("spblc0812", spblc0812a.isChecked() ? "1" : spblc0812b.isChecked() ? "2" : "0");
        sC.put("spblc0813", spblc0813a.isChecked() ? "1" : spblc0813b.isChecked() ? "2" : "0");
        sC.put("spblc0814", spblc0814a.isChecked() ? "1" : spblc0814b.isChecked() ? "2" : "0");
        sC.put("spblc0815", spblc0815a.isChecked() ? "1" : spblc0815b.isChecked() ? "2" : "0");
        sC.put("spblc0816", spblc0816a.isChecked() ? "1" : spblc0816b.isChecked() ? "2" : "0");
        sC.put("spblc0817", spblc0817a.isChecked() ? "1" : spblc0817b.isChecked() ? "2" : "0");
        sC.put("spblc0818", spblc0818a.isChecked() ? "1" : spblc0818b.isChecked() ? "2" : "0");

//        09
        sC.put("spblc09", spblc09a.isChecked() ? "1" : spblc09b.isChecked() ? "2" : spblc09c.isChecked() ? "3"
                : spblc09d.isChecked() ? "4" : spblc09e.isChecked() ? "5" : spblc09f.isChecked() ? "6"
                : spblc09g.isChecked() ? "7" : spblc09h.isChecked() ? "8" : spblc09i.isChecked() ? "9"
                : spblc09j.isChecked() ? "10" : spblc0988.isChecked() ? "88" : "0");
        sC.put("spblc0988x", spblc0988x.getText().toString());

//        10
        sC.put("spblc10", spblc10a.isChecked() ? "1" : spblc10b.isChecked() ? "2" : spblc10c.isChecked() ? "3"
                : "0");
        sC.put("spblc1088x", spblc1088x.getText().toString());

//        11
        sC.put("spblc11", spblc11a.isChecked() ? "1" : spblc11b.isChecked() ? "2" : "0");

//        12
        sC.put("spblc12", spblc12a.isChecked() ? "1" : spblc12b.isChecked() ? "2" : spblc12c.isChecked() ? "3"
                : spblc12d.isChecked() ? "4" : spblc12e.isChecked() ? "5" : spblc12f.isChecked() ? "6"
                : spblc12g.isChecked() ? "7" : spblc12h.isChecked() ? "8" : spblc12i.isChecked() ? "9"
                : spblc12j.isChecked() ? "10" : spblc12k.isChecked() ? "11" : spblc12l.isChecked() ? "12"
                : spblc12m.isChecked() ? "13" : spblc1288.isChecked() ? "88" : "0");
        sC.put("spblc1288x", spblc1288x.getText().toString());

//        13
        sC.put("spblc13", spblc13a.isChecked() ? "1" : spblc13b.isChecked() ? "2" : spblc13c.isChecked() ? "3"
                : spblc13d.isChecked() ? "4" : spblc13e.isChecked() ? "5" : spblc13f.isChecked() ? "6"
                : spblc13g.isChecked() ? "7" : spblc13h.isChecked() ? "8" : spblc13i.isChecked() ? "9"
                : spblc13j.isChecked() ? "10" : spblc13k.isChecked() ? "11" : spblc13l.isChecked() ? "12"
                : spblc13m.isChecked() ? "13" : spblc13n.isChecked() ? "14" : spblc1388.isChecked() ? "88" : "0");
        sC.put("spblc1388x", spblc1388x.getText().toString());

//        14
        sC.put("spblc14", spblc14a.isChecked() ? "1" : spblc14b.isChecked() ? "2" : spblc14c.isChecked() ? "3"
                : spblc14d.isChecked() ? "4" : spblc14e.isChecked() ? "5" : spblc14f.isChecked() ? "6"
                : spblc14g.isChecked() ? "7" : spblc14h.isChecked() ? "8" : spblc14i.isChecked() ? "9"
                : spblc14j.isChecked() ? "10" : spblc14k.isChecked() ? "11" : spblc14l.isChecked() ? "12"
                : spblc14m.isChecked() ? "13" : spblc14n.isChecked() ? "14" : spblc14o.isChecked() ? "15"
                : spblc14p.isChecked() ? "15" : spblc14q.isChecked() ? "16" : spblc14r.isChecked() ? "17"
                : spblc14s.isChecked() ? "18" : spblc14t.isChecked() ? "19" : spblc14u.isChecked() ? "20"
                : spblc1488.isChecked() ? "88" : "0");
        sC.put("spblc1488x", spblc1488x.getText().toString());

//        15
        sC.put("spblc15", spblc15.getText().toString());

//        16
        sC.put("spblc16a", spblc16aa.isChecked() ? "1" : spblc16ab.isChecked() ? "2" : "0");
        sC.put("spblc16b", spblc16ba.isChecked() ? "1" : spblc16bb.isChecked() ? "2" : "0");
        sC.put("spblc16c", spblc16ca.isChecked() ? "1" : spblc16cb.isChecked() ? "2" : "0");
        sC.put("spblc16d", spblc16da.isChecked() ? "1" : spblc16db.isChecked() ? "2" : "0");
        sC.put("spblc16e", spblc16ea.isChecked() ? "1" : spblc16eb.isChecked() ? "2" : "0");
        sC.put("spblc16f", spblc16fa.isChecked() ? "1" : spblc16fb.isChecked() ? "2" : "0");
        sC.put("spblc16g", spblc16ga.isChecked() ? "1" : spblc16gb.isChecked() ? "2" : "0");
        sC.put("spblc16h", spblc16ha.isChecked() ? "1" : spblc16hb.isChecked() ? "2" : "0");
        sC.put("spblc16i", spblc16ia.isChecked() ? "1" : spblc16ib.isChecked() ? "2" : "0");

//        17
        sC.put("spblc17", spblc17a.isChecked() ? "1" : spblc17b.isChecked() ? "2" : "0");

//        18
        sC.put("spblc18", spblc18a.isChecked() ? "1" : spblc18b.isChecked() ? "2"
                : spblc18c.isChecked() ? "3" : spblc1899.isChecked() ? "99" : "0");
        if (spblc18a.isChecked()) {
            sC.put("spblc18ac", spblc18ac.getText().toString());
        } else if (spblc18b.isChecked()) {
            sC.put("spblc18kn", spblc18kn.getText().toString());
        } else if (spblc18c.isChecked()) {
            sC.put("spblc18mr", spblc18mr.getText().toString());
        }

//        19
        sC.put("spblc19", spblc19a.isChecked() ? "1" : spblc19b.isChecked() ? "2" : "0");

//        20
        sC.put("spblc20a", spblc20a.getText().toString());
        sC.put("spblc20b", spblc20b.getText().toString());
        sC.put("spblc20c", spblc20c.getText().toString());
        sC.put("spblc20d", spblc20d.getText().toString());
        sC.put("spblc20e", spblc20e.getText().toString());
        sC.put("spblc20f", spblc20f.getText().toString());
        sC.put("spblc20g", spblc20g.getText().toString());

        MainApp.fc.setsC(String.valueOf(sC));
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSC();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spblc01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc01), Toast.LENGTH_SHORT).show();
            spblc01a.setError("This data is Required!");    // Set Error on last radio button
            spblc01a.setFocusable(true);
            spblc01a.setFocusableInTouchMode(true);
            spblc01a.requestFocus();
            Log.i(TAG, "spblc01a: This data is Required!");
            return false;
        } else {
            spblc01a.setError(null);
        }


        if (spblc0188.isChecked() && spblc0188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc01) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc0188x.setError("This data is Required!");    // Set Error on last radio button
            spblc0188x.requestFocus();
            Log.i(TAG, "spblc0188x: This data is Required!");
            return false;
        } else {
            spblc0188x.setError(null);
        }


        if (spblc02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc02), Toast.LENGTH_SHORT).show();
            spblc02a.setError("This data is Required!");    // Set Error on last radio button
            spblc02a.setFocusable(true);
            spblc02a.setFocusableInTouchMode(true);
            spblc02a.requestFocus();
            Log.i(TAG, "spblc02a: This data is Required!");
            return false;
        } else {
            spblc02a.setError(null);
        }


        if (spblc0288.isChecked() && spblc0288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc02) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc0288x.setError("This data is Required!");    // Set Error on last radio button
            spblc0288x.requestFocus();
            Log.i(TAG, "spblc0288x: This data is Required!");
            return false;
        } else {
            spblc0288x.setError(null);
        }


        if (spblc03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc03), Toast.LENGTH_SHORT).show();
            spblc03a.setError("This data is Required!");    // Set Error on last radio button
            spblc03a.setFocusable(true);
            spblc03a.setFocusableInTouchMode(true);
            spblc03a.requestFocus();
            Log.i(TAG, "spblc03a: This data is Required!");
            return false;
        } else {
            spblc03a.setError(null);
        }


        if (spblc03a.isChecked()) {
            if (spblc04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc04), Toast.LENGTH_SHORT).show();
                spblc04a.setError("This data is Required!");    // Set Error on last radio button
                spblc04a.setFocusable(true);
                spblc04a.setFocusableInTouchMode(true);
                spblc04a.requestFocus();
                Log.i(TAG, "spblc04a: This data is Required!");
                return false;
            } else {
                spblc04a.setError(null);
            }


            if (spblc0488.isChecked() && spblc0488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc04) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
                spblc0488x.setError("This data is Required!");    // Set Error on last radio button
                spblc0488x.requestFocus();
                Log.i(TAG, "spblc0488x: This data is Required!");
                return false;
            } else {
                spblc0488x.setError(null);
            }
        }


        if (spblc05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc05), Toast.LENGTH_SHORT).show();
            spblc05a.setError("This data is Required!");    // Set Error on last radio button
            spblc05a.setFocusable(true);
            spblc05a.setFocusableInTouchMode(true);
            spblc05a.requestFocus();
            Log.i(TAG, "spblc05a: This data is Required!");
            return false;
        } else {
            spblc05a.setError(null);
        }


        if (spblc0588.isChecked() && spblc0588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc05) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc0588x.setError("This data is Required!");    // Set Error on last radio button
            spblc0588x.requestFocus();
            Log.i(TAG, "spblc0588x: This data is Required!");
            return false;
        } else {
            spblc0588x.setError(null);
        }


        if (spblc06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc06), Toast.LENGTH_SHORT).show();
            spblc06a.setError("This data is Required!");    // Set Error on last radio button
            spblc06a.setFocusable(true);
            spblc06a.setFocusableInTouchMode(true);
            spblc06a.requestFocus();
            Log.i(TAG, "spblc06a: This data is Required!");
            return false;
        } else {
            spblc06a.setError(null);
        }


        if (spblc06a.isChecked()) {
            if (!spblc0799.isChecked()) {
                if (spblc07.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc07), Toast.LENGTH_SHORT).show();
                    spblc07.setError("This data is Required!");    // Set Error on last radio button
                    spblc07.requestFocus();
                    Log.i(TAG, "spblc07: This data is Required!");
                    return false;
                } else {
                    spblc07.setError(null);
                }

                if (Integer.valueOf(spblc07.getText().toString()) < 1 || Integer.valueOf(spblc07.getText().toString()) > 10) {
                    Toast.makeText(this, "Range cannot be greater than 10", Toast.LENGTH_SHORT).show();
                    spblc07.setError("Range cannot be greater than 10");    // Set Error on last radio button
                    spblc07.requestFocus();
                    return false;
                } else {
                    spblc07.setError(null);
                }
            }
        }


        if (spblc0801.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0801), Toast.LENGTH_SHORT).show();
            spblc0801a.setError("This data is Required!");    // Set Error on last radio button
            spblc0801a.setFocusable(true);
            spblc0801a.setFocusableInTouchMode(true);
            spblc0801a.requestFocus();
            Log.i(TAG, "spblc0801a: This data is Required!");
            return false;
        } else {
            spblc0801a.setError(null);
        }


        if (spblc0802.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0802), Toast.LENGTH_SHORT).show();
            spblc0802a.setError("This data is Required!");    // Set Error on last radio button
            spblc0802a.setFocusable(true);
            spblc0802a.setFocusableInTouchMode(true);
            spblc0802a.requestFocus();
            Log.i(TAG, "spblc0801a: This data is Required!");
            return false;
        } else {
            spblc0802a.setError(null);
        }


        if (spblc0803.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0803), Toast.LENGTH_SHORT).show();
            spblc0803a.setError("This data is Required!");    // Set Error on last radio button
            spblc0803a.setFocusable(true);
            spblc0803a.setFocusableInTouchMode(true);
            spblc0803a.requestFocus();
            Log.i(TAG, "spblc0803a: This data is Required!");
            return false;
        } else {
            spblc0803a.setError(null);
        }


        if (spblc0804.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0804), Toast.LENGTH_SHORT).show();
            spblc0804a.setError("This data is Required!");    // Set Error on last radio button
            spblc0804a.setFocusable(true);
            spblc0804a.setFocusableInTouchMode(true);
            spblc0804a.requestFocus();
            Log.i(TAG, "spblc0804a: This data is Required!");
            return false;
        } else {
            spblc0804a.setError(null);
        }


        if (spblc0805.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0805), Toast.LENGTH_SHORT).show();
            spblc0805a.setError("This data is Required!");    // Set Error on last radio button
            spblc0805a.setFocusable(true);
            spblc0805a.setFocusableInTouchMode(true);
            spblc0805a.requestFocus();
            Log.i(TAG, "spblc0805a: This data is Required!");
            return false;
        } else {
            spblc0805a.setError(null);
        }


        if (spblc0806.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0806), Toast.LENGTH_SHORT).show();
            spblc0806a.setError("This data is Required!");    // Set Error on last radio button
            spblc0806a.setFocusable(true);
            spblc0806a.setFocusableInTouchMode(true);
            spblc0806a.requestFocus();
            Log.i(TAG, "spblc0806a: This data is Required!");
            return false;
        } else {
            spblc0806a.setError(null);
        }


        if (spblc0807.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0807), Toast.LENGTH_SHORT).show();
            spblc0807a.setError("This data is Required!");    // Set Error on last radio button
            spblc0807a.setFocusable(true);
            spblc0807a.setFocusableInTouchMode(true);
            spblc0807a.requestFocus();
            Log.i(TAG, "spblc0807a: This data is Required!");
            return false;
        } else {
            spblc0807a.setError(null);
        }


        if (spblc0808.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0808), Toast.LENGTH_SHORT).show();
            spblc0808a.setError("This data is Required!");    // Set Error on last radio button
            spblc0808a.setFocusable(true);
            spblc0808a.setFocusableInTouchMode(true);
            spblc0808a.requestFocus();
            Log.i(TAG, "spblc0808a: This data is Required!");
            return false;
        } else {
            spblc0808a.setError(null);
        }


        if (spblc0809.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc08), Toast.LENGTH_SHORT).show();
            spblc0809a.setError("This data is Required!");    // Set Error on last radio button
            spblc0809a.setFocusable(true);
            spblc0809a.setFocusableInTouchMode(true);
            spblc0809a.requestFocus();
            Log.i(TAG, "spblc0809: This data is Required!");
            return false;
        } else {
            spblc0809a.setError(null);
        }


        if (spblc0810.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0810), Toast.LENGTH_SHORT).show();
            spblc0810a.setError("This data is Required!");    // Set Error on last radio button
            spblc0810a.setFocusable(true);
            spblc0810a.setFocusableInTouchMode(true);
            spblc0810a.requestFocus();
            Log.i(TAG, "spblc0810a: This data is Required!");
            return false;
        } else {
            spblc0810a.setError(null);
        }


        if (spblc0811.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0811), Toast.LENGTH_SHORT).show();
            spblc0811a.setError("This data is Required!");    // Set Error on last radio button
            spblc0811a.setFocusable(true);
            spblc0811a.setFocusableInTouchMode(true);
            spblc0811a.requestFocus();
            Log.i(TAG, "spblc0811a: This data is Required!");
            return false;
        } else {
            spblc0811a.setError(null);
        }


        if (spblc0812.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0812), Toast.LENGTH_SHORT).show();
            spblc0812a.setError("This data is Required!");    // Set Error on last radio button
            spblc0812a.setFocusable(true);
            spblc0812a.setFocusableInTouchMode(true);
            spblc0812a.requestFocus();
            Log.i(TAG, "spblc0812a: This data is Required!");
            return false;
        } else {
            spblc0812a.setError(null);
        }


        if (spblc0813.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0813), Toast.LENGTH_SHORT).show();
            spblc0813a.setError("This data is Required!");    // Set Error on last radio button
            spblc0813a.setFocusable(true);
            spblc0813a.setFocusableInTouchMode(true);
            spblc0813a.requestFocus();
            Log.i(TAG, "spblc0813a: This data is Required!");
            return false;
        } else {
            spblc0813a.setError(null);
        }


        if (spblc0814.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0814), Toast.LENGTH_SHORT).show();
            spblc0814a.setError("This data is Required!");    // Set Error on last radio button
            spblc0814a.setFocusable(true);
            spblc0814a.setFocusableInTouchMode(true);
            spblc0814a.requestFocus();
            Log.i(TAG, "spblc0814a: This data is Required!");
            return false;
        } else {
            spblc0814a.setError(null);
        }


        if (spblc0815.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0815), Toast.LENGTH_SHORT).show();
            spblc0815a.setError("This data is Required!");    // Set Error on last radio button
            spblc0815a.setFocusable(true);
            spblc0815a.setFocusableInTouchMode(true);
            spblc0815a.requestFocus();
            Log.i(TAG, "spblc0815a: This data is Required!");
            return false;
        } else {
            spblc0815a.setError(null);
        }


        if (spblc0816.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0816), Toast.LENGTH_SHORT).show();
            spblc0816a.setError("This data is Required!");    // Set Error on last radio button
            spblc0816a.setFocusable(true);
            spblc0816a.setFocusableInTouchMode(true);
            spblc0816a.requestFocus();
            Log.i(TAG, "spblc0816a: This data is Required!");
            return false;
        } else {
            spblc0816a.setError(null);
        }


        if (spblc0817.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0817), Toast.LENGTH_SHORT).show();
            spblc0817a.setError("This data is Required!");    // Set Error on last radio button
            spblc0817a.setFocusable(true);
            spblc0817a.setFocusableInTouchMode(true);
            spblc0817a.requestFocus();
            Log.i(TAG, "spblc0817a: This data is Required!");
            return false;
        } else {
            spblc0817a.setError(null);
        }


        if (spblc0818.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc0818), Toast.LENGTH_SHORT).show();
            spblc0818a.setError("This data is Required!");    // Set Error on last radio button
            spblc0818a.setFocusable(true);
            spblc0818a.setFocusableInTouchMode(true);
            spblc0818a.requestFocus();
            Log.i(TAG, "spblc0818a: This data is Required!");
            return false;
        } else {
            spblc0818a.setError(null);
        }


        if (spblc09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc09), Toast.LENGTH_SHORT).show();
            spblc09a.setError("This data is Required!");    // Set Error on last radio button
            spblc09a.setFocusable(true);
            spblc09a.setFocusableInTouchMode(true);
            spblc09a.requestFocus();
            Log.i(TAG, "spblc09a: This data is Required!");
            return false;
        } else {
            spblc09a.setError(null);
        }


        if (spblc0988.isChecked() && spblc0988x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc09) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc0988x.setError("This data is Required!");    // Set Error on last radio button
            spblc0988x.requestFocus();
            Log.i(TAG, "spblc0988x: This data is Required!");
            return false;
        } else {
            spblc0988x.setError(null);
        }


        if (spblc10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc10a), Toast.LENGTH_SHORT).show();
            spblc10a.setError("This data is Required!");    // Set Error on last radio button
            spblc10a.setFocusable(true);
            spblc10a.setFocusableInTouchMode(true);
            spblc10a.requestFocus();
            Log.i(TAG, "spblc10a: This data is Required!");
            return false;
        } else {
            spblc10a.setError(null);
        }


        if (spblc1088.isChecked() && spblc1088x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc10) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc1088x.setError("This data is Required!");    // Set Error on last radio button
            spblc1088x.requestFocus();
            Log.i(TAG, "spblc1088x: This data is Required!");
            return false;
        } else {
            spblc1088x.setError(null);
        }


        if (spblc11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc11), Toast.LENGTH_SHORT).show();
            spblc11a.setError("This data is Required!");    // Set Error on last radio button
            spblc11a.setFocusable(true);
            spblc11a.setFocusableInTouchMode(true);
            spblc11a.requestFocus();
            Log.i(TAG, "spblc11a: This data is Required!");
            return false;
        } else {
            spblc11a.setError(null);
        }


        if (spblc12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc12), Toast.LENGTH_SHORT).show();
            spblc12a.setError("This data is Required!");    // Set Error on last radio button
            spblc12a.setFocusable(true);
            spblc12a.setFocusableInTouchMode(true);
            spblc12a.requestFocus();
            Log.i(TAG, "spblc12a: This data is Required!");
            return false;
        } else {
            spblc12a.setError(null);
        }


        if (spblc1288.isChecked() && spblc1288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc12) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc1288x.setError("This data is Required!");    // Set Error on last radio button
            spblc1288x.requestFocus();
            Log.i(TAG, "spblc1288x: This data is Required!");
            return false;
        } else {
            spblc1288x.setError(null);
        }


        if (spblc13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc13a), Toast.LENGTH_SHORT).show();
            spblc13a.setError("This data is Required!");    // Set Error on last radio button
            spblc13a.setFocusable(true);
            spblc13a.setFocusableInTouchMode(true);
            spblc13a.requestFocus();
            Log.i(TAG, "spblc13a: This data is Required!");
            return false;
        } else {
            spblc13a.setError(null);
        }


        if (spblc1388.isChecked() && spblc1388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc13) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc1388x.setError("This data is Required!");    // Set Error on last radio button
            spblc1388x.requestFocus();
            Log.i(TAG, "spblc1388x: This data is Required!");
            return false;
        } else {
            spblc1388x.setError(null);
        }


        if (spblc14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc14a), Toast.LENGTH_SHORT).show();
            spblc14a.setError("This data is Required!");    // Set Error on last radio button
            spblc14a.setFocusable(true);
            spblc14a.setFocusableInTouchMode(true);
            spblc14a.requestFocus();
            Log.i(TAG, "spblc14a: This data is Required!");
            return false;
        } else {
            spblc14a.setError(null);
        }


        if (spblc1488.isChecked() && spblc1488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc14) + " -" + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblc1488x.setError("This data is Required!");    // Set Error on last radio button
            spblc1488x.requestFocus();
            Log.i(TAG, "spblc1488x: This data is Required!");
            return false;
        } else {
            spblc1488x.setError(null);
        }


        if (spblc15.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc15), Toast.LENGTH_SHORT).show();
            spblc15.setError("This data is Required!");    // Set Error on last radio button
            spblc15.requestFocus();
            Log.i(TAG, "spblc15: This data is Required!");
            return false;
        } else {
            spblc15.setError(null);
        }

        if (!spblc15.getText().toString().isEmpty() &&
                Integer.valueOf(spblc15.getText().toString()) < 1 || Integer.valueOf(spblc15.getText().toString()) > 99) {
            Toast.makeText(this, "Range must be 1 - 99", Toast.LENGTH_SHORT).show();
            spblc15.setError("Range must be 1 - 99");    // Set Error on last radio button
            spblc15.requestFocus();
            return false;
        } else {
            spblc15.setError(null);
        }


        if (spblc16a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16a), Toast.LENGTH_SHORT).show();
            spblc16aa.setError("This data is Required!");    // Set Error on last radio button
            spblc16aa.setFocusable(true);
            spblc16aa.setFocusableInTouchMode(true);
            spblc16aa.requestFocus();
            Log.i(TAG, "spblc16aa: This data is Required!");
            return false;
        } else {
            spblc16aa.setError(null);
        }


        if (spblc16b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16b), Toast.LENGTH_SHORT).show();
            spblc16ba.setError("This data is Required!");    // Set Error on last radio button
            spblc16ba.setFocusable(true);
            spblc16ba.setFocusableInTouchMode(true);
            spblc16ba.requestFocus();
            Log.i(TAG, "spblc16ba: This data is Required!");
            return false;
        } else {
            spblc16ba.setError(null);
        }


        if (spblc16c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16c), Toast.LENGTH_SHORT).show();
            spblc16ca.setError("This data is Required!");    // Set Error on last radio button
            spblc16ca.setFocusable(true);
            spblc16ca.setFocusableInTouchMode(true);
            spblc16ca.requestFocus();
            Log.i(TAG, "spblc16ca: This data is Required!");
            return false;
        } else {
            spblc16ca.setError(null);
        }


        if (spblc16d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16d), Toast.LENGTH_SHORT).show();
            spblc16da.setError("This data is Required!");    // Set Error on last radio button
            spblc16da.setFocusable(true);
            spblc16da.setFocusableInTouchMode(true);
            spblc16da.requestFocus();
            Log.i(TAG, "spblc16da: This data is Required!");
            return false;
        } else {
            spblc16da.setError(null);
        }


        if (spblc16e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16e), Toast.LENGTH_SHORT).show();
            spblc16ea.setError("This data is Required!");    // Set Error on last radio button
            spblc16ea.setFocusable(true);
            spblc16ea.setFocusableInTouchMode(true);
            spblc16ea.requestFocus();
            Log.i(TAG, "spblc16ea: This data is Required!");
            return false;
        } else {
            spblc16ea.setError(null);
        }


        if (spblc16f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16f), Toast.LENGTH_SHORT).show();
            spblc16fa.setError("This data is Required!");    // Set Error on last radio button
            spblc16fa.setFocusable(true);
            spblc16fa.setFocusableInTouchMode(true);
            spblc16fa.requestFocus();
            Log.i(TAG, "spblc16fa: This data is Required!");
            return false;
        } else {
            spblc16fa.setError(null);
        }


        if (spblc16g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16g), Toast.LENGTH_SHORT).show();
            spblc16ga.setError("This data is Required!");    // Set Error on last radio button
            spblc16ga.setFocusable(true);
            spblc16ga.setFocusableInTouchMode(true);
            spblc16ga.requestFocus();
            Log.i(TAG, "spblc16ga: This data is Required!");
            return false;
        } else {
            spblc16ga.setError(null);
        }


        if (spblc16h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16h), Toast.LENGTH_SHORT).show();
            spblc16ha.setError("This data is Required!");    // Set Error on last radio button
            spblc16ha.setFocusable(true);
            spblc16ha.setFocusableInTouchMode(true);
            spblc16ha.requestFocus();
            Log.i(TAG, "spblc16ha: This data is Required!");
            return false;
        } else {
            spblc16ha.setError(null);
        }


        if (spblc16i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc16i), Toast.LENGTH_SHORT).show();
            spblc16ia.setError("This data is Required!");    // Set Error on last radio button
            spblc16ia.setFocusable(true);
            spblc16ia.setFocusableInTouchMode(true);
            spblc16ia.requestFocus();
            Log.i(TAG, "spblc16ia: This data is Required!");
            return false;
        } else {
            spblc16ia.setError(null);
        }


        if (spblc17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc17), Toast.LENGTH_SHORT).show();
            spblc17a.setError("This data is Required!");    // Set Error on last radio button
            spblc17a.setFocusable(true);
            spblc17a.setFocusableInTouchMode(true);
            spblc17a.requestFocus();
            Log.i(TAG, "spblc17a: This data is Required!");
            return false;
        } else {
            spblc17a.setError(null);
        }


        if (spblc17a.isChecked()) {
            if (spblc18.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc18), Toast.LENGTH_SHORT).show();
                spblc18a.setError("This data is Required!");    // Set Error on last radio button
                spblc18a.setFocusable(true);
                spblc18a.setFocusableInTouchMode(true);
                spblc18a.requestFocus();
                Log.i(TAG, "spblc18a: This data is Required!");
                return false;
            } else {
                spblc18a.setError(null);
            }

            if (spblc18a.isChecked()) {
                if (spblc18ac.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc18a), Toast.LENGTH_SHORT).show();
                    spblc18ac.setError("This data is Required!");    // Set Error on last radio button
                    spblc18ac.requestFocus();
                    Log.i(TAG, "spblc18ac: This data is Required!");
                    return false;
                } else {
                    spblc18ac.setError(null);
                }

                if (Double.valueOf(spblc18ac.getText().toString()) < 0.1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc18a), Toast.LENGTH_SHORT).show();
                    spblc18ac.setError("This data is Required!");    // Set Error on last radio button
                    spblc18ac.requestFocus();
                    Log.i(TAG, "spblc18ac: This data is Required!");
                    return false;
                } else {
                    spblc18ac.setError(null);
                }
            }

            if (spblc18b.isChecked()) {
                if (spblc18kn.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc18b), Toast.LENGTH_SHORT).show();
                    spblc18kn.setError("This data is Required!");    // Set Error on last radio button
                    spblc18kn.requestFocus();
                    Log.i(TAG, "spblc18ac: This data is Required!");
                    return false;
                } else {
                    spblc18kn.setError(null);
                }

                if (Double.valueOf(spblc18kn.getText().toString()) < 0.1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc18b), Toast.LENGTH_SHORT).show();
                    spblc18kn.setError("This data is Required!");    // Set Error on last radio button
                    spblc18kn.requestFocus();
                    Log.i(TAG, "spblc18kn: This data is Required!");
                    return false;
                } else {
                    spblc18kn.setError(null);
                }
            }


        }


        if (spblc19.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc19), Toast.LENGTH_SHORT).show();
            spblc19a.setError("This data is Required!");    // Set Error on last radio button
            spblc19a.setFocusable(true);
            spblc19a.setFocusableInTouchMode(true);
            spblc19a.requestFocus();
            Log.i(TAG, "spblc19a: This data is Required!");
            return false;
        } else {
            spblc19a.setError(null);
        }


        if (spblc19a.isChecked()) {

            if (spblc20a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc20a), Toast.LENGTH_SHORT).show();
                spblc20a.setError("This data is Required!");    // Set Error on last radio button
                spblc20a.requestFocus();
                Log.i(TAG, "spblc20a: This data is Required!");
                return false;
            } else {
                spblc20a.setError(null);
            }


            if (spblc20b.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc20b), Toast.LENGTH_SHORT).show();
                spblc20b.setError("This data is Required!");    // Set Error on last radio button
                spblc20b.requestFocus();
                Log.i(TAG, "spblc20b: This data is Required!");
                return false;
            } else {
                spblc20b.setError(null);
            }


            if (spblc20c.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc20c), Toast.LENGTH_SHORT).show();
                spblc20c.setError("This data is Required!");    // Set Error on last radio button
                spblc20c.requestFocus();
                Log.i(TAG, "spblc20c: This data is Required!");
                return false;
            } else {
                spblc20c.setError(null);
            }


            if (spblc20d.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc20d), Toast.LENGTH_SHORT).show();
                spblc20d.setError("This data is Required!");    // Set Error on last radio button
                spblc20d.requestFocus();
                Log.i(TAG, "spblc20d: This data is Required!");
                return false;
            } else {
                spblc20d.setError(null);
            }


            if (spblc20e.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc20e), Toast.LENGTH_SHORT).show();
                spblc20e.setError("This data is Required!");    // Set Error on last radio button
                spblc20e.requestFocus();
                Log.i(TAG, "spblc20e: This data is Required!");
                return false;
            } else {
                spblc20e.setError(null);
            }


            if (spblc20f.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblc20f), Toast.LENGTH_SHORT).show();
                spblc20f.setError("This data is Required!");    // Set Error on last radio button
                spblc20f.requestFocus();
                Log.i(TAG, "spblc20f: This data is Required!");
                return false;
            } else {
                spblc20f.setError(null);
            }
        }


        return true;
    }


}
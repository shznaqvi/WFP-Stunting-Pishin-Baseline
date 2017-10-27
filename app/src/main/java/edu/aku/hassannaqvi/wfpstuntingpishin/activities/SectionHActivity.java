package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionHActivity extends Activity {


    @BindView(R.id.spblh01)
    Spinner spblh01;
    @BindView(R.id.spblh02)
    RadioGroup spblh02;
    @BindView(R.id.spblh02a)
    RadioButton spblh02a;
    @BindView(R.id.spblh02b)
    RadioButton spblh02b;
    @BindView(R.id.spblh0299)
    RadioButton spblh0299;
    @BindView(R.id.fldGrpspblh02)
    LinearLayout fldGrpspblh02;
    @BindView(R.id.spblh03a)
    CheckBox spblh03a;
    @BindView(R.id.spblh03b)
    CheckBox spblh03b;
    @BindView(R.id.spblh03c)
    CheckBox spblh03c;
    @BindView(R.id.spblh03d)
    CheckBox spblh03d;
    @BindView(R.id.spblh03e)
    CheckBox spblh03e;
    @BindView(R.id.spblh03f)
    CheckBox spblh03f;
    @BindView(R.id.spblh03g)
    CheckBox spblh03g;
    @BindView(R.id.spblh0399)
    CheckBox spblh0399;
    @BindView(R.id.spblh0388)
    CheckBox spblh0388;
    @BindView(R.id.spblh0388x)
    EditText spblh0388x;
    @BindView(R.id.spblh04a)
    CheckBox spblh04a;
    @BindView(R.id.spblh04b)
    CheckBox spblh04b;
    @BindView(R.id.spblh0499)
    CheckBox spblh0499;
    @BindView(R.id.spblh0488)
    CheckBox spblh0488;
    @BindView(R.id.spblh0488x)
    EditText spblh0488x;
    @BindView(R.id.spblh05)
    RadioGroup spblh05;
    @BindView(R.id.spblh05a)
    RadioButton spblh05a;
    @BindView(R.id.spblh05b)
    RadioButton spblh05b;
    @BindView(R.id.spblh0599)
    RadioButton spblh0599;
    @BindView(R.id.fldGrpspblh05)
    LinearLayout fldGrpspblh05;
    @BindView(R.id.spblh06a)
    CheckBox spblh06a;
    @BindView(R.id.spblh06b)
    CheckBox spblh06b;
    @BindView(R.id.spblh06c)
    CheckBox spblh06c;
    @BindView(R.id.spblh06d)
    CheckBox spblh06d;
    @BindView(R.id.spblh06e)
    CheckBox spblh06e;
    @BindView(R.id.spblh06f)
    CheckBox spblh06f;
    @BindView(R.id.spblh06g)
    CheckBox spblh06g;
    @BindView(R.id.spblh06h)
    CheckBox spblh06h;
    @BindView(R.id.spblh0699)
    CheckBox spblh0699;
    @BindView(R.id.spblh0688)
    CheckBox spblh0688;
    @BindView(R.id.spblh0688x)
    EditText spblh0688x;
    @BindView(R.id.spblh07a)
    CheckBox spblh07a;
    @BindView(R.id.spblh07b)
    CheckBox spblh07b;
    @BindView(R.id.spblh07c)
    CheckBox spblh07c;
    @BindView(R.id.spblh07d)
    CheckBox spblh07d;
    @BindView(R.id.spblh07e)
    CheckBox spblh07e;
    @BindView(R.id.spblh07f)
    CheckBox spblh07f;
    @BindView(R.id.spblh07g)
    CheckBox spblh07g;
    @BindView(R.id.spblh07h)
    CheckBox spblh07h;
    @BindView(R.id.spblh0799)
    CheckBox spblh0799;
    @BindView(R.id.spblh0788)
    CheckBox spblh0788;
    @BindView(R.id.spblh0788x)
    EditText spblh0788x;
    @BindView(R.id.spblh08)
    RadioGroup spblh08;
    @BindView(R.id.spblh08a)
    RadioButton spblh08a;
    @BindView(R.id.spblh08b)
    RadioButton spblh08b;
    @BindView(R.id.spblh0899)
    RadioButton spblh0899;
    @BindView(R.id.fldGrpspblh08)
    LinearLayout fldGrpspblh08;
    @BindView(R.id.spblh09a)
    CheckBox spblh09a;
    @BindView(R.id.spblh09b)
    CheckBox spblh09b;
    @BindView(R.id.spblh09c)
    CheckBox spblh09c;
    @BindView(R.id.spblh09d)
    CheckBox spblh09d;
    @BindView(R.id.spblh09e)
    CheckBox spblh09e;
    @BindView(R.id.spblh0999)
    CheckBox spblh0999;
    @BindView(R.id.spblh0988)
    CheckBox spblh0988;
    @BindView(R.id.spblh0988x)
    EditText spblh0988x;
    @BindView(R.id.spblh10a)
    CheckBox spblh10a;
    @BindView(R.id.spblh10b)
    CheckBox spblh10b;
    @BindView(R.id.spblh10c)
    CheckBox spblh10c;
    @BindView(R.id.spblh10d)
    CheckBox spblh10d;
    @BindView(R.id.spblh1099)
    CheckBox spblh1099;
    @BindView(R.id.spblh1088)
    CheckBox spblh1088;
    @BindView(R.id.spblh1088x)
    EditText spblh1088x;
    @BindView(R.id.spblh11)
    RadioGroup spblh11;
    @BindView(R.id.spblh11a)
    RadioButton spblh11a;
    @BindView(R.id.spblh11b)
    RadioButton spblh11b;
    @BindView(R.id.spblh1199)
    RadioButton spblh1199;
    @BindView(R.id.fldGrpspblh11)
    LinearLayout fldGrpspblh11;
    @BindView(R.id.spblh12a)
    CheckBox spblh12a;
    @BindView(R.id.spblh12b)
    CheckBox spblh12b;
    @BindView(R.id.spblh12c)
    CheckBox spblh12c;
    @BindView(R.id.spblh12d)
    CheckBox spblh12d;
    @BindView(R.id.spblh12e)
    CheckBox spblh12e;
    @BindView(R.id.spblh12f)
    CheckBox spblh12f;
    @BindView(R.id.spblh1299)
    CheckBox spblh1299;
    @BindView(R.id.spblh1288)
    CheckBox spblh1288;
    @BindView(R.id.spblh1288x)
    EditText spblh1288x;
    @BindView(R.id.spblh13a)
    CheckBox spblh13a;
    @BindView(R.id.spblh13b)
    CheckBox spblh13b;
    @BindView(R.id.spblh13c)
    CheckBox spblh13c;
    @BindView(R.id.spblh1399)
    CheckBox spblh1399;
    @BindView(R.id.spblh1388)
    CheckBox spblh1388;
    @BindView(R.id.spblh1388x)
    EditText spblh1388x;
    @BindView(R.id.spblh14)
    RadioGroup spblh14;
    @BindView(R.id.spblh14a)
    RadioButton spblh14a;
    @BindView(R.id.spblh14b)
    RadioButton spblh14b;
    @BindView(R.id.spblh1499)
    RadioButton spblh1499;
    @BindView(R.id.fldGrpspblh14)
    LinearLayout fldGrpspblh14;
    @BindView(R.id.spblh15a)
    CheckBox spblh15a;
    @BindView(R.id.spblh15b)
    CheckBox spblh15b;
    @BindView(R.id.spblh15c)
    CheckBox spblh15c;
    @BindView(R.id.spblh15d)
    CheckBox spblh15d;
    @BindView(R.id.spblh15e)
    CheckBox spblh15e;
    @BindView(R.id.spblh15f)
    CheckBox spblh15f;
    @BindView(R.id.spblh15g)
    CheckBox spblh15g;
    @BindView(R.id.spblh15h)
    CheckBox spblh15h;
    @BindView(R.id.spblh1599)
    CheckBox spblh1599;
    @BindView(R.id.spblh1588)
    CheckBox spblh1588;
    @BindView(R.id.spblh1588x)
    EditText spblh1588x;
    @BindView(R.id.spblh16a)
    CheckBox spblh16a;
    @BindView(R.id.spblh16b)
    CheckBox spblh16b;
    @BindView(R.id.spblh16c)
    CheckBox spblh16c;
    @BindView(R.id.spblh16d)
    CheckBox spblh16d;
    @BindView(R.id.spblh16e)
    CheckBox spblh16e;
    @BindView(R.id.spblh16f)
    CheckBox spblh16f;
    @BindView(R.id.spblh16g)
    CheckBox spblh16g;
    @BindView(R.id.spblh16h)
    CheckBox spblh16h;
    @BindView(R.id.spblh16i)
    CheckBox spblh16i;
    @BindView(R.id.spblh1699)
    CheckBox spblh1699;
    @BindView(R.id.spblh1688)
    CheckBox spblh1688;
    @BindView(R.id.spblh1688x)
    EditText spblh1688x;
    @BindView(R.id.spblh17)
    RadioGroup spblh17;
    @BindView(R.id.spblh17a)
    RadioButton spblh17a;
    @BindView(R.id.spblh17b)
    RadioButton spblh17b;
    @BindView(R.id.spblh1799)
    RadioButton spblh1799;
    @BindView(R.id.fldGrpspblh17)
    LinearLayout fldGrpspblh17;
    @BindView(R.id.spblh18a)
    CheckBox spblh18a;
    @BindView(R.id.spblh18b)
    CheckBox spblh18b;
    @BindView(R.id.spblh18c)
    CheckBox spblh18c;
    @BindView(R.id.spblh18d)
    CheckBox spblh18d;
    @BindView(R.id.spblh18e)
    CheckBox spblh18e;
    @BindView(R.id.spblh18f)
    CheckBox spblh18f;
    @BindView(R.id.spblh18g)
    CheckBox spblh18g;
    @BindView(R.id.spblh18h)
    CheckBox spblh18h;
    @BindView(R.id.spblh1899)
    CheckBox spblh1899;
    @BindView(R.id.spblh1888)
    CheckBox spblh1888;
    @BindView(R.id.spblh1888x)
    EditText spblh1888x;
    @BindView(R.id.spblh19a)
    CheckBox spblh19a;
    @BindView(R.id.spblh19b)
    CheckBox spblh19b;
    @BindView(R.id.spblh19c)
    CheckBox spblh19c;
    @BindView(R.id.spblh19d)
    CheckBox spblh19d;
    @BindView(R.id.spblh19e)
    CheckBox spblh19e;
    @BindView(R.id.spblh1999)
    CheckBox spblh1999;
    @BindView(R.id.spblh1988)
    CheckBox spblh1988;
    @BindView(R.id.spblh1988x)
    EditText spblh1988x;
    @BindView(R.id.spblh20)
    RadioGroup spblh20;
    @BindView(R.id.spblh20a)
    RadioButton spblh20a;
    @BindView(R.id.spblh20b)
    RadioButton spblh20b;
    @BindView(R.id.spblh2099)
    RadioButton spblh2099;
    @BindView(R.id.fldGrpspblh20)
    LinearLayout fldGrpspblh20;
    @BindView(R.id.spblh21a)
    CheckBox spblh21a;
    @BindView(R.id.spblh21b)
    CheckBox spblh21b;
    @BindView(R.id.spblh21c)
    CheckBox spblh21c;
    @BindView(R.id.spblh21d)
    CheckBox spblh21d;
    @BindView(R.id.spblh21e)
    CheckBox spblh21e;
    @BindView(R.id.spblh21f)
    CheckBox spblh21f;
    @BindView(R.id.spblh2199)
    CheckBox spblh2199;
    @BindView(R.id.spblh2188)
    CheckBox spblh2188;
    @BindView(R.id.spblh2188x)
    EditText spblh2188x;
    @BindView(R.id.spblh22a)
    CheckBox spblh22a;
    @BindView(R.id.spblh22b)
    CheckBox spblh22b;
    @BindView(R.id.spblh22c)
    CheckBox spblh22c;
    @BindView(R.id.spblh2299)
    CheckBox spblh2299;
    @BindView(R.id.spblh2288)
    CheckBox spblh2288;
    @BindView(R.id.spblh2288x)
    EditText spblh2288x;
    @BindView(R.id.spblh23)
    RadioGroup spblh23;
    @BindView(R.id.spblh23a)
    RadioButton spblh23a;
    @BindView(R.id.spblh23b)
    RadioButton spblh23b;
    @BindView(R.id.spblh2399)
    RadioButton spblh2399;
    @BindView(R.id.fldGrpspblh23)
    LinearLayout fldGrpspblh23;
    @BindView(R.id.spblh24)
    RadioGroup spblh24;
    @BindView(R.id.spblh24a)
    RadioButton spblh24a;
    @BindView(R.id.spblh24b)
    RadioButton spblh24b;
    @BindView(R.id.spblh2499)
    RadioButton spblh2499;
    @BindView(R.id.fldGrpspblh24)
    LinearLayout fldGrpspblh24;
    @BindView(R.id.spblh25a)
    CheckBox spblh25a;
    @BindView(R.id.spblh25b)
    CheckBox spblh25b;
    @BindView(R.id.spblh25c)
    CheckBox spblh25c;
    @BindView(R.id.spblh25d)
    CheckBox spblh25d;
    @BindView(R.id.spblh25e)
    CheckBox spblh25e;
    @BindView(R.id.spblh25f)
    CheckBox spblh25f;
    @BindView(R.id.spblh2599)
    CheckBox spblh2599;
    @BindView(R.id.spblh2588)
    CheckBox spblh2588;
    @BindView(R.id.spblh2588x)
    EditText spblh2588x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);

        spblh02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh02a.isChecked()) {
                    fldGrpspblh02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh02.setVisibility(View.GONE);
                    spblh03a.setChecked(false);
                    spblh03b.setChecked(false);
                    spblh03c.setChecked(false);
                    spblh03d.setChecked(false);
                    spblh03e.setChecked(false);
                    spblh03f.setChecked(false);
                    spblh03g.setChecked(false);
                    spblh0399.setChecked(false);
                    spblh0388.setChecked(false);
                    spblh0388x.setText(null);
                    spblh04a.setChecked(false);
                    spblh04b.setChecked(false);
                    spblh0499.setChecked(false);
                    spblh0488.setChecked(false);
                    spblh0488x.setText(null);
                }
            }
        });

        spblh0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh0388x.setVisibility(View.VISIBLE);
                } else {
                    spblh0388x.setVisibility(View.GONE);
                    spblh0388x.setText(null);
                }
            }
        });

        spblh0488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh0488x.setVisibility(View.VISIBLE);
                } else {
                    spblh0488x.setVisibility(View.GONE);
                    spblh0488x.setText(null);
                }
            }
        });

        spblh05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh05a.isChecked()) {
                    fldGrpspblh05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh05.setVisibility(View.GONE);
                    spblh06a.setChecked(false);
                    spblh06b.setChecked(false);
                    spblh06c.setChecked(false);
                    spblh06d.setChecked(false);
                    spblh06e.setChecked(false);
                    spblh06f.setChecked(false);
                    spblh06g.setChecked(false);
                    spblh06h.setChecked(false);
                    spblh0699.setChecked(false);
                    spblh0688.setChecked(false);
                    spblh0688x.setText(null);
                    spblh07a.setChecked(false);
                    spblh07b.setChecked(false);
                    spblh07c.setChecked(false);
                    spblh07d.setChecked(false);
                    spblh07e.setChecked(false);
                    spblh07f.setChecked(false);
                    spblh07g.setChecked(false);
                    spblh07h.setChecked(false);
                    spblh0799.setChecked(false);
                    spblh0788.setChecked(false);
                    spblh0788x.setText(null);
                }
            }
        });

        spblh0688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh0688x.setVisibility(View.VISIBLE);
                } else {
                    spblh0688x.setVisibility(View.GONE);
                    spblh0688x.setText(null);
                }
            }
        });

        spblh0788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh0788x.setVisibility(View.VISIBLE);
                } else {
                    spblh0788x.setVisibility(View.GONE);
                    spblh0788x.setText(null);
                }
            }
        });

        spblh08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh08a.isChecked()) {
                    fldGrpspblh08.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh08.setVisibility(View.GONE);
                    spblh09a.setChecked(false);
                    spblh09b.setChecked(false);
                    spblh09c.setChecked(false);
                    spblh09d.setChecked(false);
                    spblh09e.setChecked(false);
                    spblh0999.setChecked(false);
                    spblh0988.setChecked(false);
                    spblh0988x.setText(null);
                    spblh10a.setChecked(false);
                    spblh10b.setChecked(false);
                    spblh10c.setChecked(false);
                    spblh10d.setChecked(false);
                    spblh1099.setChecked(false);
                    spblh1088.setChecked(false);
                    spblh1088x.setText(null);
                }
            }
        });

        spblh0988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh0988x.setVisibility(View.VISIBLE);
                } else {
                    spblh0988x.setVisibility(View.GONE);
                    spblh0988x.setText(null);
                }
            }
        });

        spblh1088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh1088x.setVisibility(View.VISIBLE);
                } else {
                    spblh1088x.setVisibility(View.GONE);
                    spblh1088x.setText(null);
                }
            }
        });

        spblh11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh11a.isChecked()) {
                    fldGrpspblh11.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh11.setVisibility(View.GONE);
                    spblh12a.setChecked(false);
                    spblh12b.setChecked(false);
                    spblh12c.setChecked(false);
                    spblh12d.setChecked(false);
                    spblh12e.setChecked(false);
                    spblh12f.setChecked(false);
                    spblh1299.setChecked(false);
                    spblh1288.setChecked(false);
                    spblh1288x.setText(null);
                    spblh13a.setChecked(false);
                    spblh13b.setChecked(false);
                    spblh13c.setChecked(false);
                    spblh1399.setChecked(false);
                    spblh1388.setChecked(false);
                    spblh1388x.setText(null);
                }
            }
        });

        spblh1288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh1288x.setVisibility(View.VISIBLE);
                } else {
                    spblh1288x.setVisibility(View.GONE);
                    spblh1288x.setText(null);
                }
            }
        });

        spblh1388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh1388x.setVisibility(View.VISIBLE);
                } else {
                    spblh1388x.setVisibility(View.GONE);
                    spblh1388x.setText(null);
                }
            }
        });

        spblh14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh14a.isChecked()) {
                    fldGrpspblh14.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh14.setVisibility(View.GONE);
                    spblh15a.setChecked(false);
                    spblh15b.setChecked(false);
                    spblh15c.setChecked(false);
                    spblh15d.setChecked(false);
                    spblh15e.setChecked(false);
                    spblh15f.setChecked(false);
                    spblh15g.setChecked(false);
                    spblh15h.setChecked(false);
                    spblh1599.setChecked(false);
                    spblh1588.setChecked(false);
                    spblh1588x.setText(null);
                    spblh16a.setChecked(false);
                    spblh16b.setChecked(false);
                    spblh16c.setChecked(false);
                    spblh16d.setChecked(false);
                    spblh16e.setChecked(false);
                    spblh16f.setChecked(false);
                    spblh16g.setChecked(false);
                    spblh16h.setChecked(false);
                    spblh16i.setChecked(false);
                    spblh1699.setChecked(false);
                    spblh1688.setChecked(false);
                    spblh1688x.setText(null);
                }
            }
        });

        spblh1588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh1588x.setVisibility(View.VISIBLE);
                } else {
                    spblh1588x.setVisibility(View.GONE);
                    spblh1588x.setText(null);
                }
            }
        });

        spblh1688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh1688x.setVisibility(View.VISIBLE);
                } else {
                    spblh1688x.setVisibility(View.GONE);
                    spblh1688x.setText(null);
                }
            }
        });

        spblh17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh17a.isChecked()) {
                    fldGrpspblh17.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh17.setVisibility(View.GONE);
                    spblh18a.setChecked(false);
                    spblh18b.setChecked(false);
                    spblh18c.setChecked(false);
                    spblh18d.setChecked(false);
                    spblh18e.setChecked(false);
                    spblh18f.setChecked(false);
                    spblh18g.setChecked(false);
                    spblh18h.setChecked(false);
                    spblh1899.setChecked(false);
                    spblh1888.setChecked(false);
                    spblh1888x.setText(null);
                    spblh19a.setChecked(false);
                    spblh19b.setChecked(false);
                    spblh19c.setChecked(false);
                    spblh19d.setChecked(false);
                    spblh19e.setChecked(false);
                    spblh1999.setChecked(false);
                    spblh1988.setChecked(false);
                    spblh1988x.setText(null);
                }
            }
        });

        spblh1888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh1888x.setVisibility(View.VISIBLE);
                } else {
                    spblh1888x.setVisibility(View.GONE);
                    spblh1888x.setText(null);
                }
            }
        });

        spblh1988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh1988x.setVisibility(View.VISIBLE);
                } else {
                    spblh1988x.setVisibility(View.GONE);
                    spblh1988x.setText(null);
                }
            }
        });

        spblh20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh20a.isChecked()) {
                    fldGrpspblh20.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh20.setVisibility(View.GONE);
                    spblh21a.setChecked(false);
                    spblh21b.setChecked(false);
                    spblh21c.setChecked(false);
                    spblh21d.setChecked(false);
                    spblh21e.setChecked(false);
                    spblh21f.setChecked(false);
                    spblh2199.setChecked(false);
                    spblh2188.setChecked(false);
                    spblh2188x.setText(null);
                    spblh22a.setChecked(false);
                    spblh22b.setChecked(false);
                    spblh22c.setChecked(false);
                    spblh2299.setChecked(false);
                    spblh2288.setChecked(false);
                    spblh2288x.setText(null);
                }
            }
        });

        spblh2188.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh2188x.setVisibility(View.VISIBLE);
                } else {
                    spblh2188x.setVisibility(View.GONE);
                    spblh2188x.setText(null);
                }
            }
        });

        spblh2288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh2288x.setVisibility(View.VISIBLE);
                } else {
                    spblh2288x.setVisibility(View.GONE);
                    spblh2288x.setText(null);
                }
            }
        });

        spblh23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh23a.isChecked()) {
                    fldGrpspblh23.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh23.setVisibility(View.GONE);
                    spblh24.clearCheck();
                    spblh25a.setChecked(false);
                    spblh25b.setChecked(false);
                    spblh25c.setChecked(false);
                    spblh25d.setChecked(false);
                    spblh25e.setChecked(false);
                    spblh25f.setChecked(false);
                    spblh2599.setChecked(false);
                    spblh2588.setChecked(false);
                    spblh2588x.setText(null);
                }
            }
        });

        spblh2588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh2588x.setVisibility(View.VISIBLE);
                } else {
                    spblh2588x.setVisibility(View.GONE);
                    spblh2588x.setText(null);
                }
            }
        });

        spblh24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh24a.isChecked()) {
                    fldGrpspblh24.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblh24.setVisibility(View.GONE);
                    spblh25a.setChecked(false);
                    spblh25b.setChecked(false);
                    spblh25c.setChecked(false);
                    spblh25d.setChecked(false);
                    spblh25e.setChecked(false);
                    spblh25f.setChecked(false);
                    spblh2599.setChecked(false);
                    spblh2588.setChecked(false);
                    spblh2588x.setText(null);
                }
            }
        });

        spblh0399.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh03a.setEnabled(false);
                    spblh03a.setChecked(false);
                    spblh03b.setEnabled(false);
                    spblh03b.setChecked(false);
                    spblh03c.setEnabled(false);
                    spblh03c.setChecked(false);
                    spblh03d.setEnabled(false);
                    spblh03d.setChecked(false);
                    spblh03e.setEnabled(false);
                    spblh03e.setChecked(false);
                    spblh03f.setEnabled(false);
                    spblh03f.setChecked(false);
                    spblh03g.setEnabled(false);
                    spblh03g.setChecked(false);
                    spblh0388.setEnabled(false);
                    spblh0388.setChecked(false);
                    spblh0388x.setText(null);
                } else {
                    spblh03a.setEnabled(true);
                    spblh03b.setEnabled(true);
                    spblh03c.setEnabled(true);
                    spblh03d.setEnabled(true);
                    spblh03e.setEnabled(true);
                    spblh03f.setEnabled(true);
                    spblh03g.setEnabled(true);
                    spblh0388.setEnabled(true);
                }
            }
        });

        spblh0499.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh04a.setEnabled(false);
                    spblh04a.setChecked(false);
                    spblh04b.setEnabled(false);
                    spblh04b.setChecked(false);
                    spblh0488.setEnabled(false);
                    spblh0488.setChecked(false);
                    spblh0488x.setText(null);
                } else {
                    spblh04a.setEnabled(true);
                    spblh04b.setEnabled(true);
                    spblh0488.setEnabled(true);
                }
            }
        });

        spblh0699.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh06a.setEnabled(false);
                    spblh06a.setChecked(false);
                    spblh06b.setEnabled(false);
                    spblh06b.setChecked(false);
                    spblh06c.setEnabled(false);
                    spblh06c.setChecked(false);
                    spblh06d.setEnabled(false);
                    spblh06d.setChecked(false);
                    spblh06e.setEnabled(false);
                    spblh06e.setChecked(false);
                    spblh06f.setEnabled(false);
                    spblh06f.setChecked(false);
                    spblh06g.setEnabled(false);
                    spblh06g.setChecked(false);
                    spblh06h.setEnabled(false);
                    spblh06h.setChecked(false);
                    spblh0688.setEnabled(false);
                    spblh0688.setChecked(false);
                    spblh0688x.setText(null);
                } else {
                    spblh06a.setEnabled(true);
                    spblh06b.setEnabled(true);
                    spblh06c.setEnabled(true);
                    spblh06d.setEnabled(true);
                    spblh06e.setEnabled(true);
                    spblh06f.setEnabled(true);
                    spblh06g.setEnabled(true);
                    spblh06h.setEnabled(true);
                    spblh0688.setEnabled(true);
                }
            }
        });

        spblh0799.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh07a.setEnabled(false);
                    spblh07a.setChecked(false);
                    spblh07b.setEnabled(false);
                    spblh07b.setChecked(false);
                    spblh07c.setEnabled(false);
                    spblh07c.setChecked(false);
                    spblh07d.setEnabled(false);
                    spblh07d.setChecked(false);
                    spblh07e.setEnabled(false);
                    spblh07e.setChecked(false);
                    spblh07f.setEnabled(false);
                    spblh07f.setChecked(false);
                    spblh07g.setEnabled(false);
                    spblh07g.setChecked(false);
                    spblh07h.setEnabled(false);
                    spblh07h.setChecked(false);
                    spblh0788.setEnabled(false);
                    spblh0788.setChecked(false);
                    spblh0788x.setText(null);
                } else {
                    spblh07a.setEnabled(true);
                    spblh07b.setEnabled(true);
                    spblh07c.setEnabled(true);
                    spblh07d.setEnabled(true);
                    spblh07e.setEnabled(true);
                    spblh07f.setEnabled(true);
                    spblh07g.setEnabled(true);
                    spblh07h.setEnabled(true);
                    spblh0788.setEnabled(true);
                }
            }
        });

        spblh0999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh09a.setEnabled(false);
                    spblh09a.setChecked(false);
                    spblh09b.setEnabled(false);
                    spblh09b.setChecked(false);
                    spblh09c.setEnabled(false);
                    spblh09c.setChecked(false);
                    spblh09d.setEnabled(false);
                    spblh09d.setChecked(false);
                    spblh09e.setEnabled(false);
                    spblh09e.setChecked(false);
                    spblh0988.setEnabled(false);
                    spblh0988.setChecked(false);
                    spblh0988x.setText(null);
                } else {
                    spblh09a.setEnabled(true);
                    spblh09b.setEnabled(true);
                    spblh09c.setEnabled(true);
                    spblh09d.setEnabled(true);
                    spblh09e.setEnabled(true);
                    spblh0988.setEnabled(true);
                }
            }
        });

        spblh1099.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh10a.setEnabled(false);
                    spblh10a.setChecked(false);
                    spblh10b.setEnabled(false);
                    spblh10b.setChecked(false);
                    spblh10c.setEnabled(false);
                    spblh10c.setChecked(false);
                    spblh10d.setEnabled(false);
                    spblh10d.setChecked(false);
                    spblh1088.setEnabled(false);
                    spblh1088.setChecked(false);
                    spblh1088x.setText(null);
                } else {
                    spblh10a.setEnabled(true);
                    spblh10b.setEnabled(true);
                    spblh10c.setEnabled(true);
                    spblh10d.setEnabled(true);
                    spblh1088.setEnabled(true);
                }
            }
        });

        spblh1299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh12a.setEnabled(false);
                    spblh12a.setChecked(false);
                    spblh12b.setEnabled(false);
                    spblh12b.setChecked(false);
                    spblh12c.setEnabled(false);
                    spblh12c.setChecked(false);
                    spblh12d.setEnabled(false);
                    spblh12d.setChecked(false);
                    spblh12e.setEnabled(false);
                    spblh12e.setChecked(false);
                    spblh12f.setEnabled(false);
                    spblh12f.setChecked(false);
                    spblh1288.setEnabled(false);
                    spblh1288.setChecked(false);
                    spblh1288x.setText(null);
                } else {
                    spblh12a.setEnabled(true);
                    spblh12b.setEnabled(true);
                    spblh12c.setEnabled(true);
                    spblh12d.setEnabled(true);
                    spblh12e.setEnabled(true);
                    spblh12f.setEnabled(true);
                    spblh1288.setEnabled(true);
                }
            }
        });

        spblh1399.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh13a.setEnabled(false);
                    spblh13a.setChecked(false);
                    spblh13b.setEnabled(false);
                    spblh13b.setChecked(false);
                    spblh13c.setEnabled(false);
                    spblh13c.setChecked(false);
                    spblh1388.setEnabled(false);
                    spblh1388.setChecked(false);
                    spblh1388x.setText(null);
                } else {
                    spblh13a.setEnabled(true);
                    spblh13b.setEnabled(true);
                    spblh13c.setEnabled(true);
                    spblh1388.setEnabled(true);
                }
            }
        });

        spblh1599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh15a.setEnabled(false);
                    spblh15a.setChecked(false);
                    spblh15b.setEnabled(false);
                    spblh15b.setChecked(false);
                    spblh15c.setEnabled(false);
                    spblh15c.setChecked(false);
                    spblh15d.setEnabled(false);
                    spblh15d.setChecked(false);
                    spblh15e.setEnabled(false);
                    spblh15e.setChecked(false);
                    spblh15f.setEnabled(false);
                    spblh15f.setChecked(false);
                    spblh15g.setEnabled(false);
                    spblh15g.setChecked(false);
                    spblh15h.setEnabled(false);
                    spblh15h.setChecked(false);
                    spblh1588.setEnabled(false);
                    spblh1588.setChecked(false);
                    spblh1588x.setText(null);
                } else {
                    spblh15a.setEnabled(true);
                    spblh15b.setEnabled(true);
                    spblh15c.setEnabled(true);
                    spblh15d.setEnabled(true);
                    spblh15e.setEnabled(true);
                    spblh15f.setEnabled(true);
                    spblh15g.setEnabled(true);
                    spblh15h.setEnabled(true);
                    spblh1588.setEnabled(true);
                }
            }
        });

        spblh1699.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh16a.setEnabled(false);
                    spblh16a.setChecked(false);
                    spblh16b.setEnabled(false);
                    spblh16b.setChecked(false);
                    spblh16c.setEnabled(false);
                    spblh16c.setChecked(false);
                    spblh16d.setEnabled(false);
                    spblh16d.setChecked(false);
                    spblh16e.setEnabled(false);
                    spblh16e.setChecked(false);
                    spblh16f.setEnabled(false);
                    spblh16f.setChecked(false);
                    spblh16g.setEnabled(false);
                    spblh16g.setChecked(false);
                    spblh16h.setEnabled(false);
                    spblh16h.setChecked(false);
                    spblh16i.setEnabled(false);
                    spblh16i.setChecked(false);
                    spblh1688.setEnabled(false);
                    spblh1688.setChecked(false);
                    spblh1688x.setText(null);
                } else {
                    spblh16a.setEnabled(true);
                    spblh16b.setEnabled(true);
                    spblh16c.setEnabled(true);
                    spblh16d.setEnabled(true);
                    spblh16e.setEnabled(true);
                    spblh16f.setEnabled(true);
                    spblh16g.setEnabled(true);
                    spblh16h.setEnabled(true);
                    spblh16i.setEnabled(true);
                    spblh1688.setEnabled(true);
                }
            }
        });

        spblh1899.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh18a.setEnabled(false);
                    spblh18a.setChecked(false);
                    spblh18b.setEnabled(false);
                    spblh18b.setChecked(false);
                    spblh18c.setEnabled(false);
                    spblh18c.setChecked(false);
                    spblh18d.setEnabled(false);
                    spblh18d.setChecked(false);
                    spblh18e.setEnabled(false);
                    spblh18e.setChecked(false);
                    spblh18f.setEnabled(false);
                    spblh18f.setChecked(false);
                    spblh18g.setEnabled(false);
                    spblh18g.setChecked(false);
                    spblh18h.setEnabled(false);
                    spblh18h.setChecked(false);
                    spblh1888.setEnabled(false);
                    spblh1888.setChecked(false);
                    spblh1888x.setText(null);
                } else {
                    spblh18a.setEnabled(true);
                    spblh18b.setEnabled(true);
                    spblh18c.setEnabled(true);
                    spblh18d.setEnabled(true);
                    spblh18e.setEnabled(true);
                    spblh18f.setEnabled(true);
                    spblh18g.setEnabled(true);
                    spblh18h.setEnabled(true);
                    spblh1888.setEnabled(true);
                }
            }
        });

        spblh1999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh19a.setEnabled(false);
                    spblh19a.setChecked(false);
                    spblh19b.setEnabled(false);
                    spblh19b.setChecked(false);
                    spblh19c.setEnabled(false);
                    spblh19c.setChecked(false);
                    spblh19d.setEnabled(false);
                    spblh19d.setChecked(false);
                    spblh19e.setEnabled(false);
                    spblh19e.setChecked(false);
                    spblh1988.setEnabled(false);
                    spblh1988.setChecked(false);
                    spblh1988x.setText(null);
                } else {
                    spblh19a.setEnabled(true);
                    spblh19b.setEnabled(true);
                    spblh19c.setEnabled(true);
                    spblh19d.setEnabled(true);
                    spblh19e.setEnabled(true);
                    spblh1988.setEnabled(true);
                }
            }
        });

        spblh2199.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh21a.setEnabled(false);
                    spblh21a.setChecked(false);
                    spblh21b.setEnabled(false);
                    spblh21b.setChecked(false);
                    spblh21c.setEnabled(false);
                    spblh21c.setChecked(false);
                    spblh21d.setEnabled(false);
                    spblh21d.setChecked(false);
                    spblh21e.setEnabled(false);
                    spblh21e.setChecked(false);
                    spblh21f.setEnabled(false);
                    spblh21f.setChecked(false);
                    spblh2188.setEnabled(false);
                    spblh2188.setChecked(false);
                    spblh2188x.setText(null);
                } else {
                    spblh21a.setEnabled(true);
                    spblh21b.setEnabled(true);
                    spblh21c.setEnabled(true);
                    spblh21d.setEnabled(true);
                    spblh21e.setEnabled(true);
                    spblh21f.setEnabled(true);
                    spblh2188.setEnabled(true);
                }
            }
        });

        spblh2299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh22a.setEnabled(false);
                    spblh22a.setChecked(false);
                    spblh22b.setEnabled(false);
                    spblh22b.setChecked(false);
                    spblh22c.setEnabled(false);
                    spblh22c.setChecked(false);
                    spblh2288.setEnabled(false);
                    spblh2288.setChecked(false);
                    spblh2288x.setText(null);
                } else {
                    spblh22a.setEnabled(true);
                    spblh22b.setEnabled(true);
                    spblh22c.setEnabled(true);
                    spblh2288.setEnabled(true);
                }
            }
        });

        spblh2599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblh25a.setEnabled(false);
                    spblh25a.setChecked(false);
                    spblh25b.setEnabled(false);
                    spblh25b.setChecked(false);
                    spblh25c.setEnabled(false);
                    spblh25c.setChecked(false);
                    spblh25d.setEnabled(false);
                    spblh25d.setChecked(false);
                    spblh25e.setEnabled(false);
                    spblh25e.setChecked(false);
                    spblh25f.setEnabled(false);
                    spblh25f.setChecked(false);
                    spblh2588.setEnabled(false);
                    spblh2588.setChecked(false);
                    spblh2588x.setText(null);
                } else {
                    spblh25a.setEnabled(true);
                    spblh25b.setEnabled(true);
                    spblh25c.setEnabled(true);
                    spblh25d.setEnabled(true);
                    spblh25e.setEnabled(true);
                    spblh25f.setEnabled(true);
                    spblh2588.setEnabled(true);
                }
            }
        });

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
       /* if (ValidateForm()) {
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
        }*/

        Intent secNext = new Intent(this, SectionIActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);

    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();


        MainApp.endActivity(this, this);
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

     /*   int updcount = db.updateSH();

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

        JSONObject sh = new JSONObject();

        sh.put("spblh02", spblh02a.isChecked() ? "1" : spblh02b.isChecked() ? "2" : spblh0299.isChecked() ? "99" : "0");
        sh.put("spblh03a", spblh03a.isChecked() ? "1" : "0");
        sh.put("spblh03b", spblh03b.isChecked() ? "2" : "0");
        sh.put("spblh03c", spblh03c.isChecked() ? "3" : "0");
        sh.put("spblh03d", spblh03d.isChecked() ? "4" : "0");
        sh.put("spblh03e", spblh03e.isChecked() ? "5" : "0");
        sh.put("spblh03f", spblh03f.isChecked() ? "6" : "0");
        sh.put("spblh03g", spblh03g.isChecked() ? "7" : "0");
        sh.put("spblh0399", spblh0399.isChecked() ? "99" : "0");
        sh.put("spblh0388", spblh0388.isChecked() ? "88" : "0");
        sh.put("spblh0388x", spblh0388x.getText().toString());
        sh.put("spblh04a", spblh04a.isChecked() ? "1" : "0");
        sh.put("spblh04b", spblh04b.isChecked() ? "2" : "0");
        sh.put("spblh0499", spblh0499.isChecked() ? "99" : "0");
        sh.put("spblh0488", spblh0488.isChecked() ? "88" : "0");
        sh.put("spblh0488x", spblh0488x.getText().toString());
        sh.put("spblh05", spblh05a.isChecked() ? "1" : spblh05b.isChecked() ? "2" : spblh0599.isChecked() ? "99" : "0");
        sh.put("spblh06a", spblh06a.isChecked() ? "1" : "0");
        sh.put("spblh06b", spblh06b.isChecked() ? "2" : "0");
        sh.put("spblh06c", spblh06c.isChecked() ? "3" : "0");
        sh.put("spblh06d", spblh06d.isChecked() ? "4" : "0");
        sh.put("spblh06e", spblh06e.isChecked() ? "5" : "0");
        sh.put("spblh06f", spblh06f.isChecked() ? "6" : "0");
        sh.put("spblh06g", spblh06g.isChecked() ? "7" : "0");
        sh.put("spblh06h", spblh06h.isChecked() ? "8" : "0");
        sh.put("spblh0699", spblh0699.isChecked() ? "99" : "0");
        sh.put("spblh0688", spblh0688.isChecked() ? "88" : "0");
        sh.put("spblh0688x", spblh0688x.getText().toString());
        sh.put("spblh07a", spblh07a.isChecked() ? "1" : "0");
        sh.put("spblh07b", spblh07b.isChecked() ? "2" : "0");
        sh.put("spblh07c", spblh07c.isChecked() ? "3" : "0");
        sh.put("spblh07d", spblh07d.isChecked() ? "4" : "0");
        sh.put("spblh07e", spblh07e.isChecked() ? "5" : "0");
        sh.put("spblh07f", spblh07f.isChecked() ? "6" : "0");
        sh.put("spblh07g", spblh07g.isChecked() ? "7" : "0");
        sh.put("spblh07h", spblh07h.isChecked() ? "8" : "0");
        sh.put("spblh0799", spblh0799.isChecked() ? "99" : "0");
        sh.put("spblh0788", spblh0788.isChecked() ? "88" : "0");
        sh.put("spblh0788x", spblh0788x.getText().toString());


        //   MainApp.fc.setsH(String.valueOf(sh));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== spblh01a ==============

        return true;

    }


}


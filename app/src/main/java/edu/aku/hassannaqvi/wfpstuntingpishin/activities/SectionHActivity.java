package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionHActivity extends Activity {

    private static final String TAG = SectionHActivity.class.getSimpleName();

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

    Map<String, String> mwraMap;
    ArrayList<String> lstMwra;

    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);


        mwraMap = new HashMap<>();
        lstMwra = new ArrayList<>();

        mwraMap.put("....", "");
        lstMwra.add("....");

        for (byte i = 0; i < MainApp.familyMembersList.size(); i++) {
            if (MainApp.familyMembersList.get(i).getType().equals("mw")) {
                mwraMap.put(MainApp.familyMembersList.get(i).getMemberName(), MainApp.familyMembersList.get(i).getSerial());
                lstMwra.add(MainApp.familyMembersList.get(i).getMemberName());
            }
        }

        spblh01.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lstMwra));

        spblh01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                position = i;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


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


        spblh24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblh24b.isChecked()) {
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
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();


                Intent endSec = new Intent(this, SectionIActivity.class);
                endSec.putExtra("getName", spblh01.getSelectedItem().toString());
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

        int updcount = db.updateSH();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject sh = new JSONObject();

        sh.put("spblh01", spblh01.getSelectedItem().toString());
        //MainApp.selectedWoman = spblh01.getSelectedItem().toString();
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
        sh.put("spblh08", spblh08a.isChecked() ? "1" : spblh08b.isChecked() ? "2" : spblh0899.isChecked() ? "99" : "0");
        sh.put("spblh09a", spblh09a.isChecked() ? "1" : "0");
        sh.put("spblh09b", spblh09b.isChecked() ? "2" : "0");
        sh.put("spblh09c", spblh09c.isChecked() ? "3" : "0");
        sh.put("spblh09d", spblh09d.isChecked() ? "4" : "0");
        sh.put("spblh09e", spblh09e.isChecked() ? "5" : "0");
        sh.put("spblh0999", spblh0999.isChecked() ? "99" : "0");
        sh.put("spblh0988", spblh0988.isChecked() ? "88" : "0");
        sh.put("spblh0988x", spblh0988x.getText().toString());
        sh.put("spblh10a", spblh10a.isChecked() ? "1" : "0");
        sh.put("spblh10b", spblh10b.isChecked() ? "2" : "0");
        sh.put("spblh10c", spblh10c.isChecked() ? "3" : "0");
        sh.put("spblh10d", spblh10d.isChecked() ? "4" : "0");
        sh.put("spblh1099", spblh1099.isChecked() ? "99" : "0");
        sh.put("spblh1088", spblh1088.isChecked() ? "88" : "0");
        sh.put("spblh1088x", spblh1088x.getText().toString());
        sh.put("spblh11", spblh11a.isChecked() ? "1" : spblh11b.isChecked() ? "2" : spblh1199.isChecked() ? "99" : "0");
        sh.put("spblh12a", spblh12a.isChecked() ? "1" : "0");
        sh.put("spblh12b", spblh12b.isChecked() ? "2" : "0");
        sh.put("spblh12c", spblh12c.isChecked() ? "3" : "0");
        sh.put("spblh12d", spblh12d.isChecked() ? "4" : "0");
        sh.put("spblh12e", spblh12e.isChecked() ? "5" : "0");
        sh.put("spblh12f", spblh12f.isChecked() ? "6" : "0");
        sh.put("spblh1299", spblh1299.isChecked() ? "99" : "0");
        sh.put("spblh1288", spblh1288.isChecked() ? "88" : "0");
        sh.put("spblh1288x", spblh1288x.getText().toString());
        sh.put("spblh13a", spblh13a.isChecked() ? "1" : "0");
        sh.put("spblh13b", spblh13b.isChecked() ? "2" : "0");
        sh.put("spblh13c", spblh13c.isChecked() ? "3" : "0");
        sh.put("spblh1399", spblh1399.isChecked() ? "99" : "0");
        sh.put("spblh1388", spblh1388.isChecked() ? "88" : "0");
        sh.put("spblh1388x", spblh1388x.getText().toString());
        sh.put("spblh14", spblh14a.isChecked() ? "1" : spblh14b.isChecked() ? "2" : spblh1499.isChecked() ? "99" : "0");
        sh.put("spblh15a", spblh15a.isChecked() ? "1" : "0");
        sh.put("spblh15b", spblh15b.isChecked() ? "2" : "0");
        sh.put("spblh15c", spblh15c.isChecked() ? "3" : "0");
        sh.put("spblh15d", spblh15d.isChecked() ? "4" : "0");
        sh.put("spblh15e", spblh15e.isChecked() ? "5" : "0");
        sh.put("spblh15f", spblh15f.isChecked() ? "6" : "0");
        sh.put("spblh15g", spblh15g.isChecked() ? "7" : "0");
        sh.put("spblh15h", spblh15h.isChecked() ? "8" : "0");
        sh.put("spblh1599", spblh1599.isChecked() ? "99" : "0");
        sh.put("spblh1588", spblh1588.isChecked() ? "88" : "0");
        sh.put("spblh1588x", spblh1588x.getText().toString());
        sh.put("spblh16a", spblh16a.isChecked() ? "1" : "0");
        sh.put("spblh16b", spblh16b.isChecked() ? "2" : "0");
        sh.put("spblh16c", spblh16c.isChecked() ? "3" : "0");
        sh.put("spblh16d", spblh16d.isChecked() ? "4" : "0");
        sh.put("spblh16e", spblh16e.isChecked() ? "5" : "0");
        sh.put("spblh16f", spblh16f.isChecked() ? "6" : "0");
        sh.put("spblh16g", spblh16g.isChecked() ? "7" : "0");
        sh.put("spblh16h", spblh16h.isChecked() ? "8" : "0");
        sh.put("spblh16i", spblh16i.isChecked() ? "9" : "0");
        sh.put("spblh1699", spblh1699.isChecked() ? "99" : "0");
        sh.put("spblh1688", spblh1688.isChecked() ? "88" : "0");
        sh.put("spblh1688x", spblh1688x.getText().toString());
        sh.put("spblh17", spblh17a.isChecked() ? "1" : spblh17b.isChecked() ? "2" : spblh1799.isChecked() ? "99" : "0");
        sh.put("spblh18a", spblh18a.isChecked() ? "1" : "0");
        sh.put("spblh18b", spblh18b.isChecked() ? "2" : "0");
        sh.put("spblh18c", spblh18c.isChecked() ? "3" : "0");
        sh.put("spblh18d", spblh18d.isChecked() ? "4" : "0");
        sh.put("spblh18e", spblh18e.isChecked() ? "5" : "0");
        sh.put("spblh18f", spblh18f.isChecked() ? "6" : "0");
        sh.put("spblh18g", spblh18g.isChecked() ? "7" : "0");
        sh.put("spblh18h", spblh18h.isChecked() ? "8" : "0");
        sh.put("spblh1899", spblh1899.isChecked() ? "99" : "0");
        sh.put("spblh1888", spblh1888.isChecked() ? "88" : "0");
        sh.put("spblh1888x", spblh1888x.getText().toString());
        sh.put("spblh19a", spblh19a.isChecked() ? "1" : "0");
        sh.put("spblh19b", spblh19b.isChecked() ? "2" : "0");
        sh.put("spblh19c", spblh19c.isChecked() ? "3" : "0");
        sh.put("spblh19d", spblh19d.isChecked() ? "4" : "0");
        sh.put("spblh19e", spblh19e.isChecked() ? "5" : "0");
        sh.put("spblh1999", spblh1999.isChecked() ? "99" : "0");
        sh.put("spblh1988", spblh1988.isChecked() ? "88" : "0");
        sh.put("spblh1988x", spblh1988x.getText().toString());
        sh.put("spblh20", spblh20a.isChecked() ? "1" : spblh20b.isChecked() ? "2" : spblh2099.isChecked() ? "99" : "0");
        sh.put("spblh21a", spblh21a.isChecked() ? "1" : "0");
        sh.put("spblh21b", spblh21b.isChecked() ? "2" : "0");
        sh.put("spblh21c", spblh21c.isChecked() ? "3" : "0");
        sh.put("spblh21d", spblh21d.isChecked() ? "4" : "0");
        sh.put("spblh21e", spblh21e.isChecked() ? "5" : "0");
        sh.put("spblh21f", spblh21f.isChecked() ? "6" : "0");
        sh.put("spblh2199", spblh2199.isChecked() ? "99" : "0");
        sh.put("spblh2188", spblh2188.isChecked() ? "88" : "0");
        sh.put("spblh2188x", spblh2188x.getText().toString());
        sh.put("spblh22a", spblh22a.isChecked() ? "1" : "0");
        sh.put("spblh22b", spblh22b.isChecked() ? "2" : "0");
        sh.put("spblh22c", spblh22c.isChecked() ? "3" : "0");
        sh.put("spblh2299", spblh2299.isChecked() ? "99" : "0");
        sh.put("spblh2288", spblh2288.isChecked() ? "88" : "0");
        sh.put("spblh2288x", spblh2288x.getText().toString());
        sh.put("spblh23", spblh23a.isChecked() ? "1" : spblh23b.isChecked() ? "2" : spblh2399.isChecked() ? "99" : "0");
        sh.put("spblh24", spblh23a.isChecked() ? "1" : spblh24b.isChecked() ? "2" : spblh2499.isChecked() ? "99" : "0");
        sh.put("spblh25a", spblh25a.isChecked() ? "1" : "0");
        sh.put("spblh25b", spblh25b.isChecked() ? "2" : "0");
        sh.put("spblh25c", spblh25c.isChecked() ? "3" : "0");
        sh.put("spblh25d", spblh25d.isChecked() ? "4" : "0");
        sh.put("spblh25e", spblh25e.isChecked() ? "5" : "0");
        sh.put("spblh25f", spblh25f.isChecked() ? "6" : "0");
        sh.put("spblh2599", spblh2599.isChecked() ? "99" : "0");
        sh.put("spblh2588", spblh2588.isChecked() ? "88" : "0");
        sh.put("spblh2588x", spblh2588x.getText().toString());


        MainApp.fc.setsH(String.valueOf(sh));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {


        if (spblh01.getSelectedItem().toString() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh01), Toast.LENGTH_SHORT).show();
            ((TextView) spblh01.getSelectedView()).setText("This Data is Required");
            ((TextView) spblh01.getSelectedView()).setTextColor(Color.RED);
            spblh01.requestFocus();
            Log.i(TAG, "spbli01w: This Data is Required!");
            return false;
        } else {
            ((TextView) spblh01.getSelectedView()).setError(null);
        }

        // =================== Q2 ====================
        if (spblh02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh02), Toast.LENGTH_SHORT).show();
            spblh0299.setError("This Data is Required");
            spblh0299.setFocusableInTouchMode(true);
            spblh0299.setFocusable(true);
            spblh0299.requestFocus();
            Log.d(TAG, "spblh02:This Data is Required");
            return false;
        } else {
            spblh0299.setError(null);
        }

        if (spblh02a.isChecked()) {

            // =================== Q3 ====================
            if (!(spblh03a.isChecked() || spblh03b.isChecked() || spblh03c.isChecked() || spblh03d.isChecked()
                    || spblh03e.isChecked() || spblh03f.isChecked() || spblh03g.isChecked() || spblh0399.isChecked() || spblh0388.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh03), Toast.LENGTH_SHORT).show();
                spblh0388.setError("This Data is Required");
                spblh0388.setFocusableInTouchMode(true);
                spblh0388.setFocusable(true);
                Log.d(TAG, "spblh03:This Data is Required");
                spblh0388.requestFocus();
                return false;

            } else {
                spblh0388.setError(null);
            }

            if (!spblh0399.isChecked()) {
                if (!(spblh03a.isChecked() || spblh03b.isChecked() || spblh03c.isChecked() || spblh03d.isChecked()
                        || spblh03e.isChecked() || spblh03f.isChecked() || spblh03g.isChecked() || spblh0388.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh03), Toast.LENGTH_SHORT).show();
                    spblh0388.setError("This Data is Required");
                    spblh0388.setFocusableInTouchMode(true);
                    spblh0388.setFocusable(true);
                    spblh0388.requestFocus();
                    Log.d(TAG, "spblh03:This Data is Required");
                    return false;
                } else {
                    spblh0388.setError(null);
                }
            }

            if (spblh0388.isChecked() && spblh0388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh03) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh0388x.setError("This data is Required!");    // Set Error on last radio button
                spblh0388x.requestFocus();
                Log.d(TAG, "spblh0388x: This data is Required!");
                return false;
            } else {
                spblh0388x.setError(null);
            }

            // =================== Q4 ====================
            if (!(spblh04a.isChecked() || spblh04b.isChecked() || spblh0499.isChecked() || spblh0488.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh04), Toast.LENGTH_SHORT).show();
                spblh0488.setError("This Data is Required");
                spblh0488.setFocusableInTouchMode(true);
                spblh0488.setFocusable(true);
                spblh0488.requestFocus();
                Log.d(TAG, "spblh04:This Data is Required");
                return false;
            } else {
                spblh0488.setError(null);
            }

            if (!spblh0499.isChecked()) {
                if (!(spblh04a.isChecked() || spblh04b.isChecked() || spblh0488.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh04), Toast.LENGTH_SHORT).show();
                    spblh0488.setError("This Data is Required");
                    spblh0488.setFocusableInTouchMode(true);
                    spblh0488.setFocusable(true);
                    spblh0488.requestFocus();
                    Log.d(TAG, "spblh04:This Data is Required");
                    return false;
                } else {
                    spblh0488.setError(null);
                }
            }

            if (spblh0488.isChecked() && spblh0488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh0488x.setError("This data is Required!");    // Set Error on last radio button
                spblh0488x.requestFocus();
                Log.d(TAG, "spblh0488x: This data is Required!");
                return false;
            } else {
                spblh0488x.setError(null);
            }
        }

        // =================== Q5 ====================
        if (spblh05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh05), Toast.LENGTH_SHORT).show();
            spblh0599.setError("This Data is Required");
            spblh0599.setFocusableInTouchMode(true);
            spblh0599.setFocusable(true);
            spblh0599.requestFocus();
            Log.d(TAG, "spblh05:This Data is Required");
            return false;
        } else {
            spblh0599.setError(null);
        }

        if (spblh05a.isChecked()) {
            // =================== Q6 ====================
            if (!(spblh06a.isChecked() || spblh06b.isChecked() || spblh06c.isChecked() || spblh06d.isChecked()
                    || spblh06e.isChecked() || spblh06f.isChecked() || spblh06g.isChecked() || spblh06h.isChecked() || spblh0699.isChecked() || spblh0688.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh06), Toast.LENGTH_SHORT).show();
                spblh0688.setError("This Data is Required");
                spblh0688.setFocusableInTouchMode(true);
                spblh0688.setFocusable(true);
                spblh0688.requestFocus();
                Log.d(TAG, "spblh06:This Data is Required");
                return false;
            } else {
                spblh0688.setError(null);
            }

            if (!spblh0699.isChecked()) {
                if (!(spblh06a.isChecked() || spblh06b.isChecked() || spblh06c.isChecked() || spblh06d.isChecked()
                        || spblh06e.isChecked() || spblh06f.isChecked() || spblh06g.isChecked() || spblh0688.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh06), Toast.LENGTH_SHORT).show();
                    spblh0688.setError("This Data is Required");
                    spblh0688.setFocusableInTouchMode(true);
                    spblh0688.setFocusable(true);
                    spblh0688.requestFocus();
                    Log.d(TAG, "spblh06:This Data is Required");
                    return false;
                } else {
                    spblh0688.setError(null);
                }
            }

            if (spblh0688.isChecked() && spblh0688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh06) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh0688x.setError("This data is Required!");    // Set Error on last radio button
                spblh0688x.requestFocus();
                Log.d(TAG, "spblh0688x: This data is Required!");
                return false;
            } else {
                spblh0688x.setError(null);
            }

            // =================== Q7 ====================
            if (!(spblh07a.isChecked() || spblh07b.isChecked() || spblh07c.isChecked() || spblh07d.isChecked()
                    || spblh07e.isChecked() || spblh07f.isChecked() || spblh07g.isChecked() || spblh07h.isChecked()
                    || spblh0799.isChecked() || spblh0788.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh07), Toast.LENGTH_SHORT).show();
                spblh0788.setError("This Data is Required");
                spblh0788.setFocusableInTouchMode(true);
                spblh0788.setFocusable(true);
                spblh0788.requestFocus();
                Log.d(TAG, "spblh07:This Data is Required");
                return false;
            } else {
                spblh0788.setError(null);
            }

            if (!spblh0799.isChecked()) {
                if (!(spblh07a.isChecked() || spblh07b.isChecked() || spblh07c.isChecked() || spblh07d.isChecked()
                        || spblh07e.isChecked() || spblh07f.isChecked() || spblh07g.isChecked() || spblh07h.isChecked()
                        || spblh0788.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh07), Toast.LENGTH_SHORT).show();
                    spblh0788.setError("This Data is Required");
                    spblh0788.setFocusableInTouchMode(true);
                    spblh0788.setFocusable(true);
                    spblh0788.requestFocus();
                    Log.d(TAG, "spblh07:This Data is Required");
                    return false;
                } else {
                    spblh0788.setError(null);
                }
            }
            if (spblh0788.isChecked() && spblh0788x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh07) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh0788x.setError("This data is Required!");    // Set Error on last radio button
                spblh0788x.requestFocus();
                Log.d(TAG, "spblh0788x: This data is Required!");
                return false;
            } else {
                spblh0788x.setError(null);
            }
        }

        // =================== Q8 ====================
        if (spblh08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh08), Toast.LENGTH_SHORT).show();
            spblh0899.setError("This Data is Required");
            spblh0899.setFocusableInTouchMode(true);
            spblh0899.setFocusable(true);
            spblh0899.requestFocus();
            Log.d(TAG, "spblh08:This Data is Required");
            return false;
        } else {
            spblh0899.setError(null);
        }

        if (spblh08a.isChecked()) {
            // =================== Q6 ====================
            if (!(spblh09a.isChecked() || spblh09b.isChecked() || spblh09c.isChecked() || spblh09d.isChecked()
                    || spblh09e.isChecked() || spblh0999.isChecked() || spblh0988.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh09), Toast.LENGTH_SHORT).show();
                spblh0988.setError("This Data is Required");
                spblh0988.setFocusableInTouchMode(true);
                spblh0988.setFocusable(true);
                spblh0988.requestFocus();
                Log.d(TAG, "spblh09:This Data is Required");
                return false;
            } else {
                spblh0988.setError(null);
            }

            if (!spblh0999.isChecked()) {
                if (!(spblh09a.isChecked() || spblh09b.isChecked() || spblh09c.isChecked() || spblh09d.isChecked()
                        || spblh09e.isChecked() || spblh0988.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh09), Toast.LENGTH_SHORT).show();
                    spblh0988.setError("This Data is Required");
                    spblh0988.setFocusableInTouchMode(true);
                    spblh0988.setFocusable(true);
                    spblh0988.requestFocus();
                    Log.d(TAG, "spblh09:This Data is Required");
                    return false;
                } else {
                    spblh0988.setError(null);
                }
            }

            if (spblh0988.isChecked() && spblh0988x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh09) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh0988x.setError("This data is Required!");    // Set Error on last radio button
                spblh0988x.requestFocus();
                Log.d(TAG, "spblh0988x: This data is Required!");
                return false;
            } else {
                spblh0988x.setError(null);
            }

            // =================== Q10 ====================
            if (!(spblh10a.isChecked() || spblh10b.isChecked() || spblh10c.isChecked() || spblh10d.isChecked()
                    || spblh1099.isChecked() || spblh1088.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh10), Toast.LENGTH_SHORT).show();
                spblh1088.setError("This Data is Required");
                spblh1088.setFocusableInTouchMode(true);
                spblh1088.setFocusable(true);
                spblh1088.requestFocus();
                Log.d(TAG, "spblh10: This Data is Required");
                return false;
            } else {
                spblh1088.setError(null);
            }

            if (!spblh1099.isChecked()) {
                if (!(spblh10a.isChecked() || spblh10b.isChecked() || spblh10c.isChecked() || spblh10d.isChecked()
                        || spblh1088.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh10), Toast.LENGTH_SHORT).show();
                    spblh1088.setError("This Data is Required");
                    spblh1088.setFocusableInTouchMode(true);
                    spblh1088.setFocusable(true);
                    spblh1088.requestFocus();
                    Log.d(TAG, "spblh10: This Data is Required");
                    return false;
                } else {
                    spblh1088.setError(null);
                }
            }

            if (spblh1088.isChecked() && spblh1088x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh10) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh1088x.setError("This data is Required!");    // Set Error on last radio button
                spblh1088x.requestFocus();
                Log.d(TAG, "spblh1088x: This data is Required!");
                return false;
            } else {
                spblh1088x.setError(null);
            }
        }

        // =================== Q11 ====================
        if (spblh11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh11), Toast.LENGTH_SHORT).show();
            spblh1199.setError("This Data is Required");
            spblh1199.setFocusableInTouchMode(true);
            spblh1199.setFocusable(true);
            spblh1199.requestFocus();
            Log.d(TAG, "spblh11:This Data is Required");
            return false;
        } else {
            spblh1199.setError(null);
        }

        if (spblh11a.isChecked()) {
            // =================== Q6 ====================
            if (!(spblh12a.isChecked() || spblh12b.isChecked() || spblh12c.isChecked() || spblh12d.isChecked()
                    || spblh12e.isChecked() || spblh12f.isChecked() || spblh1299.isChecked() || spblh1288.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh12), Toast.LENGTH_SHORT).show();
                spblh1288.setError("This Data is Required");
                spblh1288.setFocusableInTouchMode(true);
                spblh1288.setFocusable(true);
                spblh1288.requestFocus();
                Log.d(TAG, "spblh12:This Data is Required");
                return false;
            } else {
                spblh1288.setError(null);
            }

            if (!spblh1299.isChecked()) {
                if (!(spblh12a.isChecked() || spblh12b.isChecked() || spblh12c.isChecked() || spblh12d.isChecked()
                        || spblh12e.isChecked() || spblh12f.isChecked() || spblh1288.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh12), Toast.LENGTH_SHORT).show();
                    spblh1288.setError("This Data is Required");
                    spblh1288.setFocusableInTouchMode(true);
                    spblh1288.setFocusable(true);
                    spblh1288.requestFocus();
                    Log.d(TAG, "spblh12:This Data is Required");
                    return false;
                } else {
                    spblh1288.setError(null);
                }
            }

            if (spblh1288.isChecked() && spblh1288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh12) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh1288x.setError("This data is Required!");    // Set Error on last radio button
                spblh1288x.requestFocus();
                Log.d(TAG, "spblh1288x: This data is Required!");
                return false;
            } else {
                spblh1288x.setError(null);
            }

            // =================== Q13 ====================
            if (!(spblh13a.isChecked() || spblh13b.isChecked() || spblh13c.isChecked()
                    || spblh1399.isChecked() || spblh1388.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh13), Toast.LENGTH_SHORT).show();
                spblh1388.setError("This Data is Required");
                spblh1388.setFocusableInTouchMode(true);
                spblh1388.setFocusable(true);
                spblh1388.requestFocus();
                Log.d(TAG, "spblh13:This Data is Required");
                return false;
            } else {
                spblh1388.setError(null);
            }

            if (!spblh1399.isChecked()) {
                if (!(spblh13a.isChecked() || spblh13b.isChecked() || spblh13c.isChecked()
                        || spblh1388.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh13), Toast.LENGTH_SHORT).show();
                    spblh1388.setError("This Data is Required");
                    spblh1388.setFocusableInTouchMode(true);
                    spblh1388.setFocusable(true);
                    spblh1388.requestFocus();
                    Log.d(TAG, "spblh13:This Data is Required");
                    return false;
                } else {
                    spblh1388.setError(null);
                }
            }

            if (spblh1388.isChecked() && spblh1388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh13) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh1388x.setError("This data is Required!");    // Set Error on last radio button
                spblh1388x.requestFocus();
                Log.d(TAG, "spblh1388x: This data is Required!");
                return false;
            } else {
                spblh1388x.setError(null);
            }
        }

        // =================== Q14 ====================
        if (spblh14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh14), Toast.LENGTH_SHORT).show();
            spblh1499.setError("This Data is Required");
            spblh1499.setFocusableInTouchMode(true);
            spblh1499.setFocusable(true);
            spblh1499.requestFocus();
            Log.d(TAG, "spblh14:This Data is Required");
            return false;
        } else {
            spblh1499.setError(null);
        }

        if (spblh14a.isChecked()) {
            // =================== Q15 ====================
            if (!(spblh15a.isChecked() || spblh15b.isChecked() || spblh15c.isChecked() || spblh15d.isChecked()
                    || spblh15e.isChecked() || spblh15f.isChecked() || spblh15g.isChecked() || spblh15h.isChecked()
                    || spblh1599.isChecked() || spblh1588.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh15), Toast.LENGTH_SHORT).show();
                spblh1588.setError("This Data is Required");
                spblh1588.setFocusableInTouchMode(true);
                spblh1588.setFocusable(true);
                spblh1588.requestFocus();
                Log.d(TAG, "spblh15:This Data is Required");
                return false;
            } else {
                spblh1588.setError(null);
            }

            if (!spblh1599.isChecked()) {
                if (!(spblh15a.isChecked() || spblh15b.isChecked() || spblh15c.isChecked() || spblh15d.isChecked()
                        || spblh15e.isChecked() || spblh15f.isChecked() || spblh15g.isChecked() || spblh15h.isChecked()
                        || spblh1588.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh15), Toast.LENGTH_SHORT).show();
                    spblh1588.setError("This Data is Required");
                    spblh1588.setFocusableInTouchMode(true);
                    spblh1588.setFocusable(true);
                    spblh1588.requestFocus();
                    Log.d(TAG, "spblh15:This Data is Required");
                    return false;
                } else {
                    spblh1588.setError(null);
                }
            }

            if (spblh1588.isChecked() && spblh1588x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh15) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh1588x.setError("This data is Required!");    // Set Error on last radio button
                spblh1588x.requestFocus();
                Log.d(TAG, "spblh1588x: This data is Required!");
                return false;
            } else {
                spblh1288x.setError(null);
            }

            // =================== Q16 ====================
            if (!(spblh16a.isChecked() || spblh16b.isChecked() || spblh16c.isChecked() || spblh16c.isChecked()
                    || spblh16d.isChecked() || spblh16e.isChecked() || spblh16f.isChecked() || spblh16g.isChecked()
                    || spblh16h.isChecked() || spblh16i.isChecked() || spblh1699.isChecked() || spblh1688.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh16), Toast.LENGTH_SHORT).show();
                spblh1688.setError("This Data is Required");
                spblh1688.setFocusableInTouchMode(true);
                spblh1688.setFocusable(true);
                spblh1688.requestFocus();
                Log.d(TAG, "spblh16:This Data is Required");
                return false;
            } else {
                spblh1688.setError(null);
            }

            if (!spblh1699.isChecked()) {
                if (!(spblh16a.isChecked() || spblh16b.isChecked() || spblh16c.isChecked()
                        || spblh16d.isChecked() || spblh16e.isChecked() || spblh16f.isChecked() || spblh16g.isChecked()
                        || spblh16h.isChecked() || spblh16i.isChecked() || spblh1688.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh16), Toast.LENGTH_SHORT).show();
                    spblh1688.setError("This Data is Required");
                    spblh1688.setFocusableInTouchMode(true);
                    spblh1688.setFocusable(true);
                    spblh1688.requestFocus();
                    Log.d(TAG, "spblh16:This Data is Required");
                    return false;
                } else {
                    spblh1688.setError(null);
                }
            }

            if (spblh1688.isChecked() && spblh1688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh16) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh1688x.setError("This data is Required!");    // Set Error on last radio button
                spblh1688x.requestFocus();
                Log.d(TAG, "spblh1688x: This data is Required!");
                return false;
            } else {
                spblh1688x.setError(null);
            }
        }

        // =================== Q17 ====================
        if (spblh17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh17), Toast.LENGTH_SHORT).show();
            spblh1799.setError("This Data is Required");
            spblh1799.setFocusableInTouchMode(true);
            spblh1799.setFocusable(true);
            spblh1799.requestFocus();
            Log.d(TAG, "spblh17:This Data is Required");
            return false;
        } else {
            spblh1799.setError(null);
        }


        if (spblh17a.isChecked()) {
            // =================== Q18 ====================
            if (!(spblh18a.isChecked() || spblh18b.isChecked() || spblh18c.isChecked() || spblh18d.isChecked()
                    || spblh18e.isChecked() || spblh18f.isChecked() || spblh18g.isChecked() || spblh18h.isChecked()
                    || spblh1899.isChecked() || spblh1888.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh18), Toast.LENGTH_SHORT).show();
                spblh1888.setError("This Data is Required");
                spblh1888.setFocusableInTouchMode(true);
                spblh1888.setFocusable(true);
                spblh1888.requestFocus();
                Log.d(TAG, "spblh18:This Data is Required");
                return false;
            } else {
                spblh1888.setError(null);
            }

            if (!spblh1899.isChecked()) {
                if (!(spblh18a.isChecked() || spblh18b.isChecked() || spblh18c.isChecked() || spblh18d.isChecked()
                        || spblh18e.isChecked() || spblh18f.isChecked() || spblh18g.isChecked() || spblh18h.isChecked()
                        || spblh1888.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh18), Toast.LENGTH_SHORT).show();
                    spblh1888.setError("This Data is Required");
                    spblh1888.setFocusableInTouchMode(true);
                    spblh1888.setFocusable(true);
                    spblh1888.requestFocus();
                    Log.d(TAG, "spblh18:This Data is Required");
                    return false;
                } else {
                    spblh1888.setError(null);
                }
            }

            if (spblh1888.isChecked() && spblh1888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh18) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh1888x.setError("This data is Required!");    // Set Error on last radio button
                spblh1888x.requestFocus();
                Log.d(TAG, "spblh1888x: This data is Required!");
                return false;
            } else {
                spblh1888x.setError(null);
            }

            // =================== Q19 ====================
            if (!(spblh19a.isChecked() || spblh19b.isChecked() || spblh19c.isChecked()
                    || spblh19d.isChecked() || spblh19e.isChecked() || spblh1999.isChecked() || spblh1988.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh19), Toast.LENGTH_SHORT).show();
                spblh1988.setError("This Data is Required");
                spblh1988.setFocusableInTouchMode(true);
                spblh1988.setFocusable(true);
                spblh1988.requestFocus();
                Log.d(TAG, "spblh19:This Data is Required");
                return false;
            } else {
                spblh1988.setError(null);
            }

            if (!spblh1999.isChecked()) {
                if (!(spblh19a.isChecked() || spblh19b.isChecked() || spblh19c.isChecked()
                        || spblh19d.isChecked() || spblh19e.isChecked() || spblh1988.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh19), Toast.LENGTH_SHORT).show();
                    spblh1988.setError("This Data is Required");
                    spblh1988.setFocusableInTouchMode(true);
                    spblh1988.setFocusable(true);
                    spblh1988.requestFocus();
                    Log.d(TAG, "spblh19:This Data is Required");
                    return false;
                } else {
                    spblh1988.setError(null);
                }
            }

            if (spblh1988.isChecked() && spblh1988x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh19) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh1988x.setError("This data is Required!");    // Set Error on last radio button
                spblh1988x.requestFocus();
                Log.d(TAG, "spblh1988x: This data is Required!");
                return false;
            } else {
                spblh1988x.setError(null);
            }
        }

        // =================== Q20 ====================
        if (spblh20.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh20), Toast.LENGTH_SHORT).show();
            spblh2099.setError("This Data is Required");
            spblh2099.setFocusableInTouchMode(true);
            spblh2099.setFocusable(true);
            spblh2099.requestFocus();
            Log.d(TAG, "spblh20:This Data is Required");
            return false;
        } else {
            spblh2099.setError(null);
        }

        if (spblh20a.isChecked()) {
            // =================== Q21 ====================
            if (!(spblh21a.isChecked() || spblh21b.isChecked() || spblh21c.isChecked() || spblh21d.isChecked()
                    || spblh21e.isChecked() || spblh21f.isChecked()
                    || spblh2199.isChecked() || spblh2188.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh21), Toast.LENGTH_SHORT).show();
                spblh2188.setError("This Data is Required");
                spblh2188.setFocusableInTouchMode(true);
                spblh2188.setFocusable(true);
                spblh2188.requestFocus();
                Log.d(TAG, "spblh21:This Data is Required");
                return false;
            } else {
                spblh2188.setError(null);
            }

            if (!spblh2199.isChecked()) {
                if (!(spblh21a.isChecked() || spblh21b.isChecked() || spblh21c.isChecked() || spblh21d.isChecked()
                        || spblh21e.isChecked() || spblh21f.isChecked() || spblh2188.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh21), Toast.LENGTH_SHORT).show();
                    spblh2188.setError("This Data is Required");
                    spblh2188.setFocusableInTouchMode(true);
                    spblh2188.setFocusable(true);
                    spblh2188.requestFocus();
                    Log.d(TAG, "spblh21:This Data is Required");
                    return false;
                } else {
                    spblh2188.setError(null);
                }
            }

            if (spblh2188.isChecked() && spblh2188x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh21) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh2188x.setError("This data is Required!");    // Set Error on last radio button
                spblh2188x.requestFocus();
                Log.d(TAG, "spblh2188x: This data is Required!");
                return false;
            } else {
                spblh2188x.setError(null);
            }

            // =================== Q22 ====================
            if (!(spblh22a.isChecked() || spblh22b.isChecked() || spblh22c.isChecked()
                    || spblh2299.isChecked() || spblh2288.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh22), Toast.LENGTH_SHORT).show();
                spblh2288.setError("This Data is Required");
                spblh2288.setFocusableInTouchMode(true);
                spblh2288.setFocusable(true);
                spblh2288.requestFocus();
                Log.d(TAG, "spblh22:This Data is Required");
                return false;
            } else {
                spblh2288.setError(null);
            }

            if (!spblh2299.isChecked()) {
                if (!(spblh22a.isChecked() || spblh22b.isChecked() || spblh22c.isChecked()
                        || spblh2288.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh22), Toast.LENGTH_SHORT).show();
                    spblh2288.setError("This Data is Required");
                    spblh2288.setFocusableInTouchMode(true);
                    spblh2288.setFocusable(true);
                    spblh2288.requestFocus();
                    Log.d(TAG, "spblh22:This Data is Required");
                    return false;
                } else {
                    spblh2288.setError(null);
                }
            }

            if (spblh2288.isChecked() && spblh2288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh22) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblh2288x.setError("This data is Required!");    // Set Error on last radio button
                spblh2288x.requestFocus();
                Log.d(TAG, "spblh2288x: This data is Required!");
                return false;
            } else {
                spblh2288x.setError(null);
            }
        }

        // =================== Q23 ====================
        if (spblh23.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh23), Toast.LENGTH_SHORT).show();
            spblh2399.setError("This Data is Required");
            spblh2399.setFocusableInTouchMode(true);
            spblh2399.setFocusable(true);
            spblh2399.requestFocus();
            Log.d(TAG, "spblh23:This Data is Required");
            return false;
        } else {
            spblh2399.setError(null);
        }

        if (spblh23a.isChecked()) {
            if (spblh24.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh24), Toast.LENGTH_SHORT).show();
                spblh2499.setError("This Data is Required");
                spblh2499.setFocusableInTouchMode(true);
                spblh2499.setFocusable(true);
                spblh2499.requestFocus();
                Log.d(TAG, "spblh24:This Data is Required");
                return false;
            } else {
                spblh2499.setError(null);
            }
            if (spblh24b.isChecked()) {
                // =================== Q25 ====================
                if (!(spblh25a.isChecked() || spblh25b.isChecked() || spblh25c.isChecked()
                        || spblh25d.isChecked() || spblh25e.isChecked() || spblh25f.isChecked()
                        || spblh2599.isChecked() || spblh2588.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh25), Toast.LENGTH_SHORT).show();
                    spblh2588.setError("This Data is Required");
                    spblh2588.setFocusableInTouchMode(true);
                    spblh2588.setFocusable(true);
                    spblh2588.requestFocus();
                    Log.d(TAG, "spblh25:This Data is Required");
                    return false;
                } else {
                    spblh2588.setError(null);
                }

                if (!spblh2599.isChecked()) {
                    if (!(spblh25a.isChecked() || spblh25b.isChecked() || spblh25c.isChecked()
                            || spblh25d.isChecked() || spblh25e.isChecked() || spblh25f.isChecked()
                            || spblh2588.isChecked())) {
                        Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh25), Toast.LENGTH_SHORT).show();
                        spblh2588.setError("This Data is Required");
                        spblh2588.setFocusableInTouchMode(true);
                        spblh2588.setFocusable(true);
                        spblh2588.requestFocus();
                        Log.d(TAG, "spblh25:This Data is Required");
                        return false;
                    } else {
                        spblh2588.setError(null);
                    }
                }

                if (spblh2588.isChecked() && spblh2588x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh25) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    spblh2588x.setError("This data is Required!");    // Set Error on last radio button
                    spblh2588x.requestFocus();
                    Log.d(TAG, "spblh2588x: This data is Required!");
                    return false;
                } else {
                    spblh2588x.setError(null);
                }
            }
        }

        return true;

    }


}


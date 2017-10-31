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

public class SectionOActivity extends Activity {

    private static final String TAG = SectionOActivity.class.getSimpleName();

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
    @BindView(R.id.spblo07a)
    CheckBox spblo07a;
    @BindView(R.id.spblo07b)
    CheckBox spblo07b;
    @BindView(R.id.spblo07c)
    CheckBox spblo07c;
    @BindView(R.id.spblo07d)
    CheckBox spblo07d;
    @BindView(R.id.spblo07e)
    CheckBox spblo07e;
    @BindView(R.id.spblo07f)
    CheckBox spblo07f;
    @BindView(R.id.spblo07g)
    CheckBox spblo07g;
    @BindView(R.id.spblo0788)
    CheckBox spblo0788;
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
    @BindView(R.id.spblo10a)
    CheckBox spblo10a;
    @BindView(R.id.spblo10b)
    CheckBox spblo10b;
    @BindView(R.id.spblo10c)
    CheckBox spblo10c;
    @BindView(R.id.spblo10d)
    CheckBox spblo10d;
    @BindView(R.id.spblo1088)
    CheckBox spblo1088;
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

        spblo02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblo02b.isChecked()) {
                    fldGrpspblo02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblo02.setVisibility(View.GONE);
                    spblo03a.setChecked(false);
                    spblo03b.setChecked(false);
                    spblo03c.setChecked(false);
                    spblo03d.setChecked(false);
                    spblo03e.setChecked(false);
                    spblo03f.setChecked(false);
                    spblo0388.setChecked(false);
                    spblo0388x.setText(null);

                }
            }
        });

        spblo0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblo0388x.setVisibility(View.VISIBLE);
                } else {
                    spblo0388x.setVisibility(View.GONE);
                    spblo0388x.setText(null);
                }
            }
        });

        spblo04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblo04a.isChecked()) {
                    fldGrpspblo04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblo04.setVisibility(View.GONE);
                    spblo05a.setText(null);
                    spblo0599.setChecked(false);
                    spblo06a.setText(null);
                    spblo06b.setText(null);
                    spblo06c.setChecked(false);
                    spblo07a.setChecked(false);
                    spblo07b.setChecked(false);
                    spblo07c.setChecked(false);
                    spblo07d.setChecked(false);
                    spblo07e.setChecked(false);
                    spblo07f.setChecked(false);
                    spblo07g.setChecked(false);
                    spblo0788.setChecked(false);
                    spblo0788x.setText(null);

                }
            }
        });

        spblo0788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblo0788x.setVisibility(View.VISIBLE);
                } else {
                    spblo0788x.setVisibility(View.GONE);
                    spblo0788x.setText(null);
                }
            }
        });

        spblo08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblo08a.isChecked()) {
                    fldGrpspblo08.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblo08.setVisibility(View.GONE);
                    spblo09a.setText(null);
                    spblo09b.setText(null);
                    spblo10a.setChecked(false);
                    spblo10b.setChecked(false);
                    spblo10c.setChecked(false);
                    spblo10d.setChecked(false);
                    spblo1088.setChecked(false);
                    spblo1088x.setText(null);

                }
            }
        });

        spblo1088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblo1088x.setVisibility(View.VISIBLE);
                } else {
                    spblo1088x.setVisibility(View.GONE);
                    spblo1088x.setText(null);
                }
            }
        });

        spblo11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblo11b.isChecked()) {
                    fldGrpspblo11.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblo11.setVisibility(View.GONE);
                    spblo12a.setText(null);

                }
            }
        });

        spblo1388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblo1388x.setVisibility(View.VISIBLE);
                } else {
                    spblo1388x.setVisibility(View.GONE);
                    spblo1388x.setText(null);
                }
            }
        });


        spblo14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblo14a.isChecked()) {
                    fldGrpspblo14.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblo14.setVisibility(View.GONE);
                    spblo15.clearCheck();
                    spblo1588x.setText(null);

                }
            }
        });

        spblo1588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblo1588x.setVisibility(View.VISIBLE);
                } else {
                    spblo1588x.setVisibility(View.GONE);
                    spblo1588x.setText(null);
                }
            }
        });

        spblo16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblo16a.isChecked()) {
                    fldGrpspblo16.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblo16.setVisibility(View.GONE);
                    spblo17.clearCheck();
                    spblo1788x.setText(null);
                    spblo18.clearCheck();
                    spblo1888x.setText(null);

                }
            }
        });

        spblo1399.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblo13a.setEnabled(false);
                    spblo13a.setChecked(false);
                    spblo13b.setEnabled(false);
                    spblo13b.setChecked(false);
                    spblo13c.setEnabled(false);
                    spblo13c.setChecked(false);
                    spblo13d.setEnabled(false);
                    spblo13d.setChecked(false);
                    spblo1388.setEnabled(false);
                    spblo1388.setChecked(false);
                    spblo1388x.setText(null);
                } else {
                    spblo13a.setEnabled(true);
                    spblo13b.setEnabled(true);
                    spblo13c.setEnabled(true);
                    spblo13d.setEnabled(true);
                    spblo1388.setEnabled(true);
                }
            }
        });

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {

        Intent secNext = new Intent(this, SectionPActivity.class);
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

     /*   int updcount = db.updateSO();

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

        JSONObject so = new JSONObject();

        so.put("spblo01a", spblo01.getText().toString());
        so.put("spblo02", spblo02a.isChecked() ? "1" : spblo02b.isChecked() ? "2" : "0");
        so.put("spblo03a", spblo03a.isChecked() ? "1" : "0");
        so.put("spblo03b", spblo03b.isChecked() ? "2" : "0");
        so.put("spblo03c", spblo03c.isChecked() ? "3" : "0");
        so.put("spblo03d", spblo03d.isChecked() ? "4" : "0");
        so.put("spblo03e", spblo03e.isChecked() ? "5" : "0");
        so.put("spblo03f", spblo03f.isChecked() ? "6" : "0");
        so.put("spblo0388", spblo0388.isChecked() ? "88" : "0");
        so.put("spblo0388x", spblo0388x.getText().toString());
        so.put("spblo04", spblo04a.isChecked() ? "1" : spblo04b.isChecked() ? "2" : spblo0499.isChecked() ? "99" : "0");
        so.put("spblo05", spblo0599.isChecked() ? "99" : spblo05a.getText().toString());
        so.put("spblo06a", spblo06a.getText().toString());
        so.put("spblo06b", spblo06b.getText().toString());
        so.put("spblo06c", spblo06c.isChecked() ? "3" : "0");
        so.put("spblo07a", spblo07a.isChecked() ? "1" : "0");
        so.put("spblo07b", spblo07b.isChecked() ? "2" : "0");
        so.put("spblo07c", spblo07c.isChecked() ? "3" : "0");
        so.put("spblo07d", spblo07d.isChecked() ? "4" : "0");
        so.put("spblo07e", spblo07e.isChecked() ? "5" : "0");
        so.put("spblo07f", spblo07f.isChecked() ? "6" : "0");
        so.put("spblo07g", spblo07g.isChecked() ? "7" : "0");
        so.put("spblo0788", spblo0788.isChecked() ? "88" : "0");
        so.put("spblo0788x", spblo0788x.getText().toString());
        so.put("spblo08", spblo08a.isChecked() ? "1" : spblo08b.isChecked() ? "2" : spblo0899.isChecked() ? "99" : "0");
        so.put("spblo09a", spblo09a.getText().toString());
        so.put("spblo09b", spblo09b.getText().toString());
        so.put("spblo10a", spblo10a.isChecked() ? "1" : "0");
        so.put("spblo10b", spblo10b.isChecked() ? "2" : "0");
        so.put("spblo10c", spblo10c.isChecked() ? "3" : "0");
        so.put("spblo10d", spblo10d.isChecked() ? "4" : "0");
        so.put("spblo1088", spblo1088.isChecked() ? "88" : "0");
        so.put("spblo1088x", spblo1088x.getText().toString());
        so.put("spblo11", spblo11a.isChecked() ? "1" : spblo11b.isChecked() ? "2" : spblo1199.isChecked() ? "99" : "0");
        so.put("spblo12a", spblo12a.getText().toString());
        so.put("spblo13", spblo13a.isChecked() ? "1" : spblo13b.isChecked() ? "2" : spblo13c.isChecked() ? "3" : spblo13d.isChecked() ? "4" : spblo1399.isChecked() ? "99" : spblo1388.isChecked() ? "88" : "0");
        so.put("spblo1388x", spblo1388x.getText().toString());
        so.put("spblo14", spblo14a.isChecked() ? "1" : spblo14b.isChecked() ? "2" : spblo1499.isChecked() ? "99" : "0");
        so.put("spblo15", spblo15a.isChecked() ? "1" : spblo1588.isChecked() ? "88" : "0");
        so.put("spblo1588x", spblo1588x.getText().toString());
        so.put("spblo16", spblo16a.isChecked() ? "1" : spblo16b.isChecked() ? "2" : spblo1699.isChecked() ? "99" : "0");
        so.put("spblo17", spblo17a.isChecked() ? "1" : spblo17b.isChecked() ? "2" : spblo1788.isChecked() ? "88" : "0");
        so.put("spblo1788x", spblo1788x.getText().toString());
        so.put("spblo18", spblo18a.isChecked() ? "1" : spblo18b.isChecked() ? "2" : spblo1888.isChecked() ? "88" : "0");
        so.put("spblo1888x", spblo1888x.getText().toString());


        //   MainApp.fc.setsO(String.valueOf(so));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        if (spblo01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo01), Toast.LENGTH_SHORT).show();
            spblo01.setError("This data is Required!");
            spblo01.requestFocus();
            Log.i(TAG, "spblo01: This Data is Required!");
            return false;
        } else {
            spblo01.setError(null);
        }

        if ((Integer.parseInt(spblo01.getText().toString().isEmpty() ? "0" : spblo01.getText().toString()) == 0)) {
            Toast.makeText(this, "ERROR: " + getString(R.string.spblo01) + getString(R.string.day), Toast.LENGTH_LONG).show();
            spblo01.setError("Days cannnot be zero");
            spblo01.requestFocus();
            Log.i(TAG, "cannot not be zero");
            return false;
        } else {
            spblo01.setError(null);
        }

        if (spblo02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblo02), Toast.LENGTH_SHORT).show();
            spblo02b.setError("This data is Required!");
            spblo02b.setFocusableInTouchMode(true);
            spblo02b.setFocusable(true);
            spblo02b.requestFocus();
            Log.i(TAG, "spblo02: This data is Required!");
            return false;
        } else {
            spblo02b.setError(null);
        }

        if (spblo02b.isChecked()) {

            if (!(spblo03a.isChecked() || spblo03b.isChecked() || spblo03c.isChecked() || spblo03d.isChecked()
                    || spblo03e.isChecked() || spblo03f.isChecked() || spblo0388.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh03), Toast.LENGTH_SHORT).show();
                spblo0388.setError("This Data is Required");
                spblo0388.setFocusableInTouchMode(true);
                spblo0388.setFocusable(true);
                spblo0388.requestFocus();
                Log.d(TAG, "spblo03:This Data is Required");
            } else {
                spblo0388.setError(null);
            }

            if (spblo0388.isChecked() && spblo0388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh03) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblo0388x.setError("This data is Required!");    // Set Error on last radio button
                spblo0388x.requestFocus();
                Log.d(TAG, "spblo0388x: This data is Required!");
                return false;
            } else {
                spblo0388x.setError(null);
            }
        }

        if (spblo04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo04), Toast.LENGTH_SHORT).show();
            spblo0499.setError("This Data is Required");
            spblo0499.setFocusableInTouchMode(true);
            spblo0499.setFocusable(true);
            spblo0499.requestFocus();
            Log.d(TAG, "spblo04:This Data is Required");
            return false;
        } else {
            spblo0499.setError(null);
        }

        if (spblo04a.isChecked()) {
            if (!spblo0599.isChecked()) {
                if (spblo05a.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo05), Toast.LENGTH_SHORT).show();
                    spblo05a.setError("This data is Required!");
                    spblo05a.requestFocus();
                    Log.i(TAG, "spblo05: This Data is Required!");
                    return false;
                } else {
                    spblo05a.setError(null);
                }
            }

            if (spblo06a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo06) + getString(R.string.spblo06a), Toast.LENGTH_SHORT).show();
                spblo06a.setError("This data is Required!");
                spblo06a.requestFocus();
                Log.i(TAG, "spblo06: This Data is Required!");
                return false;
            } else {
                spblo06a.setError(null);
            }

            if ((Integer.parseInt(spblo06a.getText().toString().isEmpty() ? "0" : spblo06a.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.spblo06a), Toast.LENGTH_LONG).show();
                spblo06a.setError("Days cannnot be zero");
                spblo06a.requestFocus();
                Log.i(TAG, "spblo06a : days cannot not be zero");
                return false;
            } else {
                spblo06a.setError(null);
            }

            if (spblo06b.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo06) + getString(R.string.spblo06a), Toast.LENGTH_SHORT).show();
                spblo06b.setError("This data is Required!");
                spblo06b.requestFocus();
                Log.i(TAG, "spblo06b: This Data is Required!");
                return false;
            } else {
                spblo06b.setError(null);
            }

            if ((Integer.parseInt(spblo06b.getText().toString().isEmpty() ? "0" : spblo06b.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.spblo06b), Toast.LENGTH_LONG).show();
                spblo06b.setError("months cannnot be zero");
                spblo06b.requestFocus();
                Log.i(TAG, "spblo06b : months cannot not be zero");
                return false;
            } else {
                spblo06b.setError(null);
            }

            if (!(spblo07a.isChecked() || spblo07b.isChecked() || spblo07c.isChecked() || spblo07d.isChecked()
                    || spblo07e.isChecked() || spblo07f.isChecked() || spblo07g.isChecked() || spblo0788.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh03), Toast.LENGTH_SHORT).show();
                spblo0788.setError("This Data is Required");
                spblo0788.setError("This Data is Required");
                spblo0788.setFocusableInTouchMode(true);
                spblo0788.setFocusable(true);
                spblo0788.requestFocus();
                Log.d(TAG, "spblo07:This Data is Required");
            } else {
                spblo0788.setError(null);
            }

            if (spblo0788.isChecked() && spblo0788x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh07) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblo0788x.setError("This data is Required!");    // Set Error on last radio button
                spblo0788x.requestFocus();
                Log.d(TAG, "spblo0788x: This data is Required!");
                return false;
            } else {
                spblo0788x.setError(null);
            }

        }

        if (spblo08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo08), Toast.LENGTH_SHORT).show();
            spblo0899.setError("This Data is Required");
            spblo0899.setFocusableInTouchMode(true);
            spblo0899.setFocusable(true);
            spblo0899.requestFocus();
            Log.d(TAG, "spblo08:This Data is Required");
            return false;
        } else {
            spblo0899.setError(null);
        }

        if (spblo08a.isChecked()) {

            if (spblo09a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo09) + getString(R.string.spblo09a), Toast.LENGTH_SHORT).show();
                spblo09a.setError("This data is Required!");
                spblo09a.requestFocus();
                Log.i(TAG, "spblo09: This Data is Required!");
                return false;
            } else {
                spblo09a.setError(null);
            }

            if ((Integer.parseInt(spblo09a.getText().toString().isEmpty() ? "0" : spblo09a.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.spblo09a), Toast.LENGTH_LONG).show();
                spblo09a.setError("Days cannnot be zero");
                spblo09a.requestFocus();
                Log.i(TAG, "spblo09a : days cannot not be zero");
                return false;
            } else {
                spblo09a.setError(null);
            }

            if (spblo09b.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo09) + getString(R.string.spblo09a), Toast.LENGTH_SHORT).show();
                spblo09b.setError("This data is Required!");
                spblo09b.requestFocus();
                Log.i(TAG, "spblo09b: This Data is Required!");
                return false;
            } else {
                spblo09b.setError(null);
            }

            if ((Integer.parseInt(spblo09b.getText().toString().isEmpty() ? "0" : spblo09b.getText().toString()) == 0)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.spblo09b), Toast.LENGTH_LONG).show();
                spblo09b.setError("months cannnot be zero");
                spblo09b.requestFocus();
                Log.i(TAG, "spblo09b : months cannot not be zero");
                return false;
            } else {
                spblo09b.setError(null);
            }

            if (!(spblo10a.isChecked() || spblo10b.isChecked() || spblo10c.isChecked() || spblo10d.isChecked()
                    || spblo1088.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblh10), Toast.LENGTH_SHORT).show();
                spblo1088.setError("This Data is Required");
                spblo1088.setError("This Data is Required");
                spblo1088.setFocusableInTouchMode(true);
                spblo1088.setFocusable(true);
                spblo1088.requestFocus();
                Log.d(TAG, "spblo10:This Data is Required");
            } else {
                spblo1088.setError(null);
            }

            if (spblo1088.isChecked() && spblo1088x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh10) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblo1088x.setError("This data is Required!");    // Set Error on last radio button
                spblo1088x.requestFocus();
                Log.d(TAG, "spblo1088x: This data is Required!");
                return false;
            } else {
                spblo1088x.setError(null);
            }

        }

        if (spblo11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo11), Toast.LENGTH_SHORT).show();
            spblo1199.setError("This Data is Required");
            spblo1199.setFocusableInTouchMode(true);
            spblo1199.setFocusable(true);
            spblo1199.requestFocus();
            Log.d(TAG, "spblo11:This Data is Required");
            return false;
        } else {
            spblo1199.setError(null);
        }

        if (spblo11b.isChecked()) {

            if (spblo12a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo12) + getString(R.string.spblo12a), Toast.LENGTH_SHORT).show();
                spblo12a.setError("This data is Required!");
                spblo12a.requestFocus();
                Log.i(TAG, "spblo12: This Data is Required!");
                return false;
            } else {
                spblo12a.setError(null);
            }
        }

        if (spblo13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo13), Toast.LENGTH_SHORT).show();
            spblo1388.setError("This Data is Required");
            spblo1388.setFocusableInTouchMode(true);
            spblo1388.setFocusable(true);
            spblo1388.requestFocus();
            Log.d(TAG, "spblo13:This Data is Required");
            return false;
        } else {
            spblo1388.setError(null);
        }

        if (spblo1388.isChecked() && spblo1388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh13) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            spblo1388x.setError("This data is Required!");    // Set Error on last radio button
            spblo1388x.requestFocus();
            Log.d(TAG, "spblo1388x: This data is Required!");
            return false;
        } else {
            spblo1388x.setError(null);
        }

        if (spblo14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo14), Toast.LENGTH_SHORT).show();
            spblo1499.setError("This Data is Required");
            spblo1499.setFocusableInTouchMode(true);
            spblo1499.setFocusable(true);
            spblo1499.requestFocus();
            Log.d(TAG, "spblo14:This Data is Required");
            return false;
        } else {
            spblo1499.setError(null);
        }

        if (spblo14a.isChecked()) {

            if (spblo15.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo15), Toast.LENGTH_SHORT).show();
                spblo1588.setError("This Data is Required");
                spblo1588.setFocusableInTouchMode(true);
                spblo1588.setFocusable(true);
                spblo1588.requestFocus();
                Log.d(TAG, "spblo15:This Data is Required");
                return false;
            } else {
                spblo1588.setError(null);
            }
        }

        if (spblo16.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo16), Toast.LENGTH_SHORT).show();
            spblo1699.setError("This Data is Required");
            spblo1699.setFocusableInTouchMode(true);
            spblo1699.setFocusable(true);
            spblo1699.requestFocus();
            Log.d(TAG, "spblo16:This Data is Required");
            return false;
        } else {
            spblo1699.setError(null);
        }

        if (spblo16a.isChecked()) {

            if (spblo17.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo17), Toast.LENGTH_SHORT).show();
                spblo1788.setError("This Data is Required");
                spblo1788.setFocusableInTouchMode(true);
                spblo1788.setFocusable(true);
                spblo1788.requestFocus();
                Log.d(TAG, "spblo17:This Data is Required");
                return false;
            } else {
                spblo1788.setError(null);
            }

            if (spblo1788.isChecked() && spblo1388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh17) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblo1788x.setError("This data is Required!");    // Set Error on last radio button
                spblo1788x.requestFocus();
                Log.d(TAG, "spblo1788x: This data is Required!");
                return false;
            } else {
                spblo1788x.setError(null);
            }

            if (spblo18.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblo18), Toast.LENGTH_SHORT).show();
                spblo1888.setError("This Data is Required");
                spblo1888.setFocusableInTouchMode(true);
                spblo1888.setFocusable(true);
                spblo1888.requestFocus();
                Log.d(TAG, "spblo18:This Data is Required");
                return false;
            } else {
                spblo1888.setError(null);
            }

            if (spblo1888.isChecked() && spblo1388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblh18) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                spblo1888x.setError("This data is Required!");    // Set Error on last radio button
                spblo1888x.requestFocus();
                Log.d(TAG, "spblo1888x: This data is Required!");
                return false;
            } else {
                spblo1888x.setError(null);
            }
        }

        return true;


    }

}
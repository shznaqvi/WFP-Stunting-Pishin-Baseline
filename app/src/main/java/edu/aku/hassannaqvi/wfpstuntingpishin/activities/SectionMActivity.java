package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
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

public class SectionMActivity extends Activity {

    private static final String TAG = SectionMActivity.class.getSimpleName();
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
    @BindView(R.id.spblm0188)
    RadioGroup spblm0188;
    @BindView(R.id.spblm0188a)
    RadioButton spblm0188a;
    @BindView(R.id.spblm0188x)
    EditText spblm0188x;
    @BindView(R.id.spblm0188b)
    RadioButton spblm0188b;
    @BindView(R.id.spblm0166)
    RadioGroup spblm0166;
    @BindView(R.id.spblm0166a)
    RadioButton spblm0166a;
    @BindView(R.id.spblm0166b)
    RadioButton spblm0166b;
    @BindView(R.id.spblm02)
    RadioGroup spblm02;
    @BindView(R.id.spblm02a)
    RadioButton spblm02a;
    @BindView(R.id.spblm02b)
    RadioButton spblm02b;
    @BindView(R.id.spblm0299)
    RadioButton spblm0299;
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
    @BindView(R.id.fldGrpspblm02)
    LinearLayout fldGrpspblm02;
    @BindView(R.id.fldGrpspblm04)
    LinearLayout fldGrpspblm04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
        ButterKnife.bind(this);

        spblm0166.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblm0166a.isChecked()) {
                    spblm01a.clearCheck();
                    spblm01b.clearCheck();
                    spblm01c.clearCheck();
                    spblm01d.clearCheck();
                    spblm01e.clearCheck();
                    spblm01f.clearCheck();
                    spblm01g.clearCheck();
                    spblm01h.clearCheck();
                    spblm0188.clearCheck();
                    spblm0188x.setText(null);
                    spblm01aa.setEnabled(false);
                    spblm01ab.setEnabled(false);
                    spblm01ba.setEnabled(false);
                    spblm01bb.setEnabled(false);
                    spblm01ca.setEnabled(false);
                    spblm01cb.setEnabled(false);
                    spblm01da.setEnabled(false);
                    spblm01db.setEnabled(false);
                    spblm01ea.setEnabled(false);
                    spblm01eb.setEnabled(false);
                    spblm01fa.setEnabled(false);
                    spblm01fb.setEnabled(false);
                    spblm01ga.setEnabled(false);
                    spblm01gb.setEnabled(false);
                    spblm01ha.setEnabled(false);
                    spblm01hb.setEnabled(false);
                    spblm0188a.setEnabled(false);
                    spblm0188b.setEnabled(false);
                    fldGrpspblm02.setVisibility(View.GONE);
                    spblm02.clearCheck();
                    spblm03.clearCheck();
                    spblm04.clearCheck();
                    spblm0488x.setText(null);
                    spblm05.clearCheck();
                    spblm0588x.setText(null);

                } else {
                    fldGrpspblm02.setVisibility(View.VISIBLE);
                    spblm01aa.setEnabled(true);
                    spblm01ab.setEnabled(true);
                    spblm01ba.setEnabled(true);
                    spblm01bb.setEnabled(true);
                    spblm01ca.setEnabled(true);
                    spblm01cb.setEnabled(true);
                    spblm01da.setEnabled(true);
                    spblm01db.setEnabled(true);
                    spblm01ea.setEnabled(true);
                    spblm01eb.setEnabled(true);
                    spblm01fa.setEnabled(true);
                    spblm01fb.setEnabled(true);
                    spblm01ga.setEnabled(true);
                    spblm01gb.setEnabled(true);
                    spblm01ha.setEnabled(true);
                    spblm01hb.setEnabled(true);
                    spblm0188a.setEnabled(true);
                    spblm0188b.setEnabled(true);
                }
            }
        });

        spblm03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblm03a.isChecked()) {
                    fldGrpspblm04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblm04.setVisibility(View.GONE);
                    spblm04.clearCheck();
                    spblm0488x.setText(null);
                    spblm05.clearCheck();
                    spblm0588x.setText(null);
                }
            }
        });



    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        /*Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                startActivity(new Intent(this, SectionNActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/

        Intent secNext = new Intent(this, SectionMActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        MainApp.endActivity(this, this);
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sM = new JSONObject();

        sM.put("spblm01a", spblm01aa.isChecked() ? "1" : spblm01ab.isChecked() ? "2" : "0");
        sM.put("spblm01b", spblm01ba.isChecked() ? "1" : spblm01bb.isChecked() ? "2" : "0");
        sM.put("spblm01c", spblm01ca.isChecked() ? "1" : spblm01cb.isChecked() ? "2" : "0");
        sM.put("spblm01d", spblm01da.isChecked() ? "1" : spblm01db.isChecked() ? "2" : "0");
        sM.put("spblm01e", spblm01ea.isChecked() ? "1" : spblm01eb.isChecked() ? "2" : "0");
        sM.put("spblm01f", spblm01fa.isChecked() ? "1" : spblm01fb.isChecked() ? "2" : "0");
        sM.put("spblm01g", spblm01ga.isChecked() ? "1" : spblm01gb.isChecked() ? "2" : "0");
        sM.put("spblm01h", spblm01ha.isChecked() ? "1" : spblm01hb.isChecked() ? "2" : "0");
        sM.put("spblm0188", spblm0188a.isChecked() ? "1" : spblm0188b.isChecked() ? "2" : "0");
        sM.put("spblm0188x", spblm0188x.getText().toString());
        sM.put("spblm0166", spblm0166a.isChecked() ? "1" : spblm0166b.isChecked() ? "2" : "0");
//        02
        sM.put("spblm02", spblm02a.isChecked() ? "1" : spblm02b.isChecked() ? "2" : spblm0299.isChecked() ? "99" : "0");

//        03
        sM.put("spblm03", spblm03a.isChecked() ? "1" : spblm03b.isChecked() ? "2" : "0");

//        04
        sM.put("spblm04", spblm04a.isChecked() ? "1" : spblm04b.isChecked() ? "2" : spblm0488.isChecked() ? "88" : "0");
        sM.put("spblm0488x", spblm0488x.getText().toString());

//        05
        sM.put("spblm05", spblm05a.isChecked() ? "1" : spblm05b.isChecked() ? "2" : spblm05c.isChecked() ? "3"
                : spblm05d.isChecked() ? "4" : spblm05e.isChecked() ? "5" : spblm05f.isChecked() ? "6"
                : spblm05g.isChecked() ? "7" : spblm05h.isChecked() ? "8" : spblm0588.isChecked() ? "88" : "0");
        sM.put("spblm0588x", spblm0588x.getText().toString());

        //        MainApp.fc.setsM(String.valueOf(sM));
    }
    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        /*int updcount = db.updateSM();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }*/
        return true;
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (!spblm0166a.isChecked()) {
            if (spblm01a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01a), Toast.LENGTH_SHORT).show();
                spblm01aa.setError("This data is Required!");
                Log.i(TAG, "spblm01a: This data is Required!");
                spblm01aa.setFocusable(true);
                spblm01aa.setFocusableInTouchMode(true);
                spblm01aa.requestFocus();
                return false;
            } else {
                spblm01aa.setError(null);
            }

            if (spblm01b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01b), Toast.LENGTH_SHORT).show();
                spblm01ba.setError("This data is Required!");
                Log.i(TAG, "spblm01b: This data is Required!");
                spblm01ba.setFocusable(true);
                spblm01ba.setFocusableInTouchMode(true);
                spblm01ba.requestFocus();
                return false;
            } else {
                spblm01ba.setError(null);
            }

            if (spblm01c.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01c), Toast.LENGTH_SHORT).show();
                spblm01ca.setError("This data is Required!");
                Log.i(TAG, "spblm01c: This data is Required!");
                spblm01ca.setFocusable(true);
                spblm01ca.setFocusableInTouchMode(true);
                spblm01ca.requestFocus();
                return false;
            } else {
                spblm01ca.setError(null);
            }


            if (spblm01d.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01d), Toast.LENGTH_SHORT).show();
                spblm01da.setError("This data is Required!");
                Log.i(TAG, "spblm01d: This data is Required!");
                spblm01da.setFocusable(true);
                spblm01da.setFocusableInTouchMode(true);
                spblm01da.requestFocus();
                return false;
            } else {
                spblm01da.setError(null);
            }

            if (spblm01e.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01e), Toast.LENGTH_SHORT).show();
                spblm01ea.setError("This data is Required!");
                Log.i(TAG, "spblm01e: This data is Required!");
                spblm01ea.setFocusable(true);
                spblm01ea.setFocusableInTouchMode(true);
                spblm01ea.requestFocus();
                return false;
            } else {
                spblm01ea.setError(null);
            }

            if (spblm01f.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01f), Toast.LENGTH_SHORT).show();
                spblm01fa.setError("This data is Required!");
                Log.i(TAG, "spblm01f: This data is Required!");
                spblm01fa.setFocusable(true);
                spblm01fa.setFocusableInTouchMode(true);
                spblm01fa.requestFocus();
                return false;
            } else {
                spblm01fa.setError(null);
            }

            if (spblm01g.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01g), Toast.LENGTH_SHORT).show();
                spblm01ga.setError("This data is Required!");
                Log.i(TAG, "spblm01g: This data is Required!");
                spblm01ga.setFocusable(true);
                spblm01ga.setFocusableInTouchMode(true);
                spblm01ga.requestFocus();
                return false;
            } else {
                spblm01ga.setError(null);
            }

            if (spblm01h.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm01h), Toast.LENGTH_SHORT).show();
                spblm01ha.setError("This data is Required!");
                Log.i(TAG, "spblm01c: This data is Required!");
                spblm01ha.setFocusable(true);
                spblm01ha.setFocusableInTouchMode(true);
                spblm01ha.requestFocus();
                return false;
            } else {
                spblm01ha.setError(null);
            }

            if (spblm0188.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                spblm0188a.setError("This data is Required!");
                Log.i(TAG, "spblm0188: This data is Required!");
                spblm0188a.setFocusable(true);
                spblm0188a.setFocusableInTouchMode(true);
                spblm0188a.requestFocus();
                return false;
            } else {
                spblm0188a.setError(null);
            }

            if (spblm0188a.isChecked() && spblm0188x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                spblm0188x.setError("This data is Required!");
                Log.i(TAG, "spblm0188x: This data is Required!");
                spblm0188x.requestFocus();
                return false;
            } else {
                spblm0188x.setError(null);
            }
        }

        if (spblm0166.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.none), Toast.LENGTH_SHORT).show();
            spblm0166a.setError("This data is Required!");
            Log.i(TAG, "spblm0166: This data is Required!");
            spblm0166a.setFocusable(true);
            spblm0166a.setFocusableInTouchMode(true);
            spblm0166a.requestFocus();
            return false;
        } else {
            spblm0166a.setError(null);
        }

        if (!spblm0166a.isChecked()) {
            if (spblm02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblm02), Toast.LENGTH_SHORT).show();
                spblm02a.setError("This data is Required!");
                Log.i(TAG, "spblm02: This data is Required!");
                spblm02a.setFocusable(true);
                spblm02a.setFocusableInTouchMode(true);
                spblm02a.requestFocus();
                return false;
            } else {
                spblm02a.setError(null);
            }


        }
        return true;
    }
}


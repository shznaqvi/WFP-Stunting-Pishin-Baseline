package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
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
    @BindView(R.id.spblb0677)
    RadioButton spblb0677;
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
    @BindView(R.id.spblb07)
    CheckBox spblb07;
    @BindView(R.id.spblb08)
    CheckBox spblb08;
    @BindView(R.id.fldGrpspblb07)
    LinearLayout fldGrpspblb07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);

        spblb02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (spblb02a.isChecked()) {
                    spblb06a.setEnabled(false);
                    spblb06a.setChecked(false);
                    fldGrpspblb07.setVisibility(View.GONE);
                    spblb07.setChecked(false);
                    spblb08.setChecked(false);
                } else {
                    spblb06a.setEnabled(true);
                    fldGrpspblb07.setVisibility(View.VISIBLE);
                }
            }
        });

        spblb04y.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.valueOf(spblb04y.getText().toString().isEmpty() ? "0" : spblb04y.getText().toString()) < 15
                        || Integer.valueOf(spblb04y.getText().toString().isEmpty() ? "0" : spblb04y.getText().toString()) > 49) {
                    fldGrpspblb07.setVisibility(View.GONE);
                    spblb07.setChecked(false);
                    spblb08.setChecked(false);
                } else {
                    fldGrpspblb07.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

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

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        MainApp.endActivity(this, this);
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);


        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);


        JSONObject sB = new JSONObject();

        sB.put("spblb01", spblb01.getText().toString());
        sB.put("spblb02", spblb02a.isChecked() ? "1" : spblb02b.isChecked() ? "2" : "0");
        sB.put("spblb03", spblb03.getSelectedItem().toString());
        sB.put("spblb04y", spblb04y.getText().toString());
        sB.put("spblb04m", spblb04m.getText().toString());
        sB.put("spblb04d", spblb04d.getText().toString());
        sB.put("spblb05", spblb05.getText().toString());
        sB.put("spblb06", spblb0677.isChecked() ? "77" : spblb06a.isChecked() ? "1" : spblb06b.isChecked() ? "2" : spblb06c.isChecked() ? "3"
                : spblb06d.isChecked() ? "4" : spblb06e.isChecked() ? "5" : spblb06f.isChecked() ? "6"
                : spblb06g.isChecked() ? "7" : spblb06h.isChecked() ? "8" : spblb06i.isChecked() ? "9"
                : spblb06j.isChecked() ? "10" : "0");
        sB.put("spblb07", spblb07.isChecked() ? "1" : "0");
        sB.put("spblb08", spblb08.isChecked() ? "1" : "0");


//        MainApp.ims.setsI(String.valueOf(sI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spblk01.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk01), Toast.LENGTH_SHORT).show();
            ((TextView) spblk01.getSelectedView()).setText("This Data is Required");
            ((TextView) spblk01.getSelectedView()).setTextColor(Color.RED);
            spblk01.requestFocus();
            Log.i(TAG, "spblk01: This Data is Required!");
            return false;
        } else {
            ((TextView) spblk01.getSelectedView()).setError(null);
        }

        if (spblk04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk04), Toast.LENGTH_SHORT).show();
            spblk04.setError("This Data is Required!");
            spblk04.requestFocus();
            Log.i(TAG, "spblk01: This Data is Required!");
            return false;
        } else {
            spblk04.setError(null);
        }


        if (spblk05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk05), Toast.LENGTH_SHORT).show();
            spblk05a.setError("This data is Required!");
            Log.i(TAG, "spblk05: This data is Required!");
            spblk05a.setFocusable(true);
            spblk05a.setFocusableInTouchMode(true);
            spblk05a.requestFocus();
            return false;
        } else {
            spblk05a.setError(null);
        }

        if (spblk06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
            spblk06.setError("This Data is Required!");
            spblk06.requestFocus();
            Log.i(TAG, "spblk06: This Data is Required!");
            return false;
        } else {
            spblk06.setError(null);
        }

        if (Integer.valueOf(spblk06.getText().toString()) < 0 || Integer.valueOf(spblk06.getText().toString()) > 23) {
            Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
            spblk06.setError("Age Range is 0 to 23 months");
            spblk06.requestFocus();
            Log.i(TAG, "spblk06: Age Range is 0 to 23 months");
            return false;
        } else {
            spblk06.setError(null);
        }

        if (spblk07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk07), Toast.LENGTH_SHORT).show();
            spblk07a.setError("This data is Required!");
            Log.i(TAG, "spblk07: This data is Required!");
            spblk07a.setFocusable(true);
            spblk07a.setFocusableInTouchMode(true);
            spblk07a.requestFocus();
            return false;
        } else {
            spblk07a.setError(null);
        }

        if (spblk07a.isChecked()) {
            if (spblk08.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk08), Toast.LENGTH_SHORT).show();
                spblk08a.setError("This data is Required!");
                Log.i(TAG, "spblk08: This data is Required!");
                spblk08a.setFocusable(true);
                spblk08a.setFocusableInTouchMode(true);
                spblk08a.requestFocus();
                return false;
            } else {
                spblk08a.setError(null);
            }

            if (spblk08b.isChecked() && spblk08bx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.hour), Toast.LENGTH_SHORT).show();
                spblk08bx.setError("This Data is Required!");
                spblk08bx.requestFocus();
                Log.i(TAG, "spblk08bx: This Data is Required!");
                return false;
            } else {
                spblk08bx.setError(null);
            }

            if (spblk08c.isChecked() && spblk08cx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                spblk08cx.setError("This Data is Required!");
                spblk08cx.requestFocus();
                Log.i(TAG, "spblk08cx: This Data is Required!");
                return false;
            } else {
                spblk08cx.setError(null);
            }


            if (spblk09.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk09), Toast.LENGTH_SHORT).show();
                spblk09a.setError("This data is Required!");
                Log.i(TAG, "spblk09: This data is Required!");
                spblk09a.setFocusable(true);
                spblk09a.setFocusableInTouchMode(true);
                spblk09a.requestFocus();
                return false;
            } else {
                spblk09a.setError(null);
            }

        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }










}


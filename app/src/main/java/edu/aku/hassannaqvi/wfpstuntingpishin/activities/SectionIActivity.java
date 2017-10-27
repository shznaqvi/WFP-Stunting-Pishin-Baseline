package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;

//import edu.aku.hassannaqvi.wfpstuntingpishin.R;

public class SectionIActivity extends Activity {
    private static final String TAG = SectionIActivity.class.getName();


    @BindView(R.id.spbli01w)
    Spinner spbli01w;
    @BindView(R.id.spbli01)
    RadioGroup spbli01;
    @BindView(R.id.spbli01a)
    RadioButton spbli01a;
    @BindView(R.id.spbli01b)
    RadioButton spbli01b;
    @BindView(R.id.spbli01c)
    RadioButton spbli01c;
    @BindView(R.id.spbli02)
    EditText spbli02;
    @BindView(R.id.spbli03)
    RadioGroup spbli03;
    @BindView(R.id.spbli03a)
    RadioButton spbli03a;
    @BindView(R.id.spbli03b)
    RadioButton spbli03b;
    @BindView(R.id.spbli03c)
    RadioButton spbli03c;
    @BindView(R.id.spbli04)
    RadioGroup spbli04;
    @BindView(R.id.spbli04a)
    RadioButton spbli04a;
    @BindView(R.id.spbli04b)
    RadioButton spbli04b;
    @BindView(R.id.spbli04c)
    RadioButton spbli04c;
    @BindView(R.id.spbli04d)
    RadioButton spbli04d;
    @BindView(R.id.spbli04e)
    RadioButton spbli04e;
    @BindView(R.id.spbli04f)
    RadioButton spbli04f;
    @BindView(R.id.spbli04g)
    RadioButton spbli04g;
    @BindView(R.id.spbli04h)
    RadioButton spbli04h;
    @BindView(R.id.spbli0488)
    RadioButton spbli0488;
    @BindView(R.id.spbli0488x)
    EditText spbli0488x;
    @BindView(R.id.spbli05)
    RadioGroup spbli05;
    @BindView(R.id.spbli05a)
    RadioButton spbli05a;
    @BindView(R.id.spbli05b)
    RadioButton spbli05b;
    @BindView(R.id.spbli05c)
    RadioButton spbli05c;
    @BindView(R.id.spbli05d)
    RadioButton spbli05d;
    @BindView(R.id.spbli0588)
    RadioButton spbli0588;
    @BindView(R.id.spbli0588x)
    EditText spbli0588x;
    @BindView(R.id.spbli06)
    EditText spbli06;
    @BindView(R.id.spbli06999)
    CheckBox spbli06999;
    @BindView(R.id.spbli07)
    EditText spbli07;
    @BindView(R.id.spbli07999)
    CheckBox spbli07999;
    @BindView(R.id.spbli08)
    RadioGroup spbli08;
    @BindView(R.id.spbli08a)
    RadioButton spbli08a;
    @BindView(R.id.spbli08b)
    RadioButton spbli08b;
    @BindView(R.id.spbli08c)
    RadioButton spbli08c;
    @BindView(R.id.spbli08d)
    RadioButton spbli08d;
    @BindView(R.id.spbli08e)
    RadioButton spbli08e;
    @BindView(R.id.spbli0888)
    RadioButton spbli0888;
    @BindView(R.id.spbli0888x)
    EditText spbli0888x;
    @BindView(R.id.spbli09)
    RadioGroup spbli09;
    @BindView(R.id.spbli09a)
    RadioButton spbli09a;
    @BindView(R.id.spbli09b)
    RadioButton spbli09b;
    @BindView(R.id.spbli0999)
    RadioButton spbli0999;
    @BindView(R.id.spbli010)
    EditText spbli010;
    @BindView(R.id.spbli01099)
    CheckBox spbli01099;
    @BindView(R.id.spbli011)
    RadioGroup spbli011;
    @BindView(R.id.spbli011a)
    RadioButton spbli011a;
    @BindView(R.id.spbli011b)
    RadioButton spbli011b;
    @BindView(R.id.spbli01199)
    RadioButton spbli01199;
    @BindView(R.id.spbli012)
    EditText spbli012;
    @BindView(R.id.spbli01299)
    CheckBox spbli01299;
    @BindView(R.id.spbli013)
    EditText spbli013;
    @BindView(R.id.spbli014)
    RadioGroup spbli014;
    @BindView(R.id.spbli014a)
    RadioButton spbli014a;
    @BindView(R.id.spbli014b)
    RadioButton spbli014b;
    @BindView(R.id.spbli01499)
    RadioButton spbli01499;
    @BindView(R.id.spbli015)
    EditText spbli015;
    @BindView(R.id.spbli01597)
    CheckBox spbli01597;
    @BindView(R.id.spbli01599)
    CheckBox spbli01599;
    @BindView(R.id.spbli016)
    RadioGroup spbli016;
    @BindView(R.id.spbli016a)
    RadioButton spbli016a;
    @BindView(R.id.spbli016b)
    RadioButton spbli016b;
    @BindView(R.id.spbli01699)
    RadioButton spbli01699;
    @BindView(R.id.spbli017)
    RadioGroup spbli017;
    @BindView(R.id.spbli017a)
    RadioButton spbli017a;
    @BindView(R.id.spbli017b)
    RadioButton spbli017b;
    @BindView(R.id.spbli017c)
    RadioButton spbli017c;
    @BindView(R.id.spbli017d)
    RadioButton spbli017d;
    @BindView(R.id.spbli017e)
    RadioButton spbli017e;
    @BindView(R.id.spbli017f)
    RadioButton spbli017f;
    @BindView(R.id.spbli017g)
    RadioButton spbli017g;
    @BindView(R.id.spbli017h)
    RadioButton spbli017h;
    @BindView(R.id.spbli017i)
    RadioButton spbli017i;
    @BindView(R.id.spbli01788)
    RadioButton spbli01788;
    @BindView(R.id.spbli01788x)
    EditText spbli01788x;
    @BindView(R.id.spbli018)
    RadioGroup spbli018;
    @BindView(R.id.spbli018a)
    RadioButton spbli018a;
    @BindView(R.id.spbli018b)
    RadioButton spbli018b;
    @BindView(R.id.spbli018c)
    RadioButton spbli018c;
    @BindView(R.id.spbli01888)
    RadioButton spbli01888;
    @BindView(R.id.spbli01888x)
    EditText spbli01888x;
    @BindView(R.id.spbli019)
    RadioGroup spbli019;
    @BindView(R.id.spbli019a)
    RadioButton spbli019a;
    @BindView(R.id.spbli019b)
    RadioButton spbli019b;
    @BindView(R.id.spbli019c)
    RadioButton spbli019c;
    @BindView(R.id.spbli019d)
    RadioButton spbli019d;
    @BindView(R.id.spbli020)
    RadioGroup spbli020;
    @BindView(R.id.spbli020a)
    RadioButton spbli020a;
    @BindView(R.id.spbli020b)
    RadioButton spbli020b;
    @BindView(R.id.spbli02099)
    RadioButton spbli02099;
    @BindView(R.id.spbli021)
    RadioGroup spbli021;
    @BindView(R.id.spbli021a)
    RadioButton spbli021a;
    @BindView(R.id.spbli021b)
    RadioButton spbli021b;
    @BindView(R.id.spbli021a1)
    EditText spbli021a1;
    @BindView(R.id.spbli021a2)
    EditText spbli021a2;
    @BindView(R.id.spbli022)
    RadioGroup spbli022;
    @BindView(R.id.spbli022a)
    RadioButton spbli022a;
    @BindView(R.id.spbli022b)
    RadioButton spbli022b;
    @BindView(R.id.spbli02288)
    RadioButton spbli02288;
    @BindView(R.id.spbli02299)
    RadioButton spbli02299;
    @BindView(R.id.spbli02288x)
    EditText spbli02288x;
    @BindView(R.id.spbli023)
    RadioGroup spbli023;
    @BindView(R.id.spbli023a)
    RadioButton spbli023a;
    @BindView(R.id.spbli023b)
    RadioButton spbli023b;
    @BindView(R.id.spbli023c)
    RadioButton spbli023c;
    @BindView(R.id.spbli023d)
    RadioButton spbli023d;
    @BindView(R.id.spbli023e)
    RadioButton spbli023e;
    @BindView(R.id.spbli023f)
    RadioButton spbli023f;
    @BindView(R.id.spbli02399)
    RadioButton spbli02399;
    @BindView(R.id.spbli024)
    RadioGroup spbli024;
    @BindView(R.id.spbli24a)
    RadioButton spbli24a;
    @BindView(R.id.spbli024b)
    RadioButton spbli024b;
    @BindView(R.id.spbli02499)
    RadioButton spbli02499;
    @BindView(R.id.spbli025)
    RadioGroup spbli025;
    @BindView(R.id.spbli025a)
    RadioButton spbli025a;
    @BindView(R.id.spbli025b)
    RadioButton spbli025b;
    @BindView(R.id.spbli025c)
    RadioButton spbli025c;
    @BindView(R.id.spbli02588)
    RadioButton spbli02588;
    @BindView(R.id.spbli02599)
    RadioButton spbli02599;
    @BindView(R.id.spbli02588x)
    EditText spbli02588x;
    @BindView(R.id.spbli026)
    RadioGroup spbli026;
    @BindView(R.id.spbli026h)
    RadioButton spbli026h;
    @BindView(R.id.spbli026d)
    RadioButton spbli026d;
    @BindView(R.id.spbli026w)
    RadioButton spbli026w;
    @BindView(R.id.spbli26n)
    RadioButton spbli26n;
    @BindView(R.id.spbli026hr)
    EditText spbli026hr;
    @BindView(R.id.spbli026day)
    EditText spbli026day;
    @BindView(R.id.spbli026wk)
    EditText spbli026wk;
    @BindView(R.id.spbli027)
    RadioGroup spbli027;
    @BindView(R.id.spbli027a)
    RadioButton spbli027a;
    @BindView(R.id.spbli027b)
    RadioButton spbli027b;
    @BindView(R.id.spbli027c)
    RadioButton spbli027c;
    @BindView(R.id.spbli027d)
    RadioButton spbli027d;
    @BindView(R.id.spbli027e)
    RadioButton spbli027e;
    @BindView(R.id.spbli027f)
    RadioButton spbli027f;
    @BindView(R.id.spbli027g)
    RadioButton spbli027g;
    @BindView(R.id.spbli027h)
    RadioButton spbli027h;
    @BindView(R.id.spbli02788)
    RadioButton spbli02788;
    @BindView(R.id.spbli02788x)
    EditText spbli02788x;
    @BindView(R.id.spbli028)
    RadioGroup spbli028;
    @BindView(R.id.spbli028a)
    RadioButton spbli028a;
    @BindView(R.id.spbli028b)
    RadioButton spbli028b;
    @BindView(R.id.spbli028c)
    RadioButton spbli028c;
    @BindView(R.id.spbli02888)
    RadioButton spbli02888;
    @BindView(R.id.spbli02888x)
    EditText spbli02888x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn_Continue)
    void SaveData() {

        /*if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, SectionEActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/

        Intent secNext = new Intent(this, SectionJActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);

    }

/*
    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
    }


    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSHI();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean ValidateForm() {


        if (spbli01w.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbli01w), Toast.LENGTH_SHORT).show();
            ((TextView) spbli01w.getSelectedView()).setText("This Data is Required");
            ((TextView) spbli01w.getSelectedView()).setTextColor(Color.RED);
            spbli01w.requestFocus();
            Log.i(TAG, "spbli01w: This Data is Required!");
            return false;
        } else {
            ((TextView) spbli01w.getSelectedView()).setError(null);
        }


        //        spbld01
        if (spbli01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli01a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli01a: This data is Required!");
            spbli01a.setFocusable(true);
            spbli01a.setFocusableInTouchMode(true);
            spbli01a.requestFocus();
            return false;
        } else {
            spbli01a.setError(null);
        }


        //        spbli02
        if (spbli02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli02), Toast.LENGTH_SHORT).show();
            spbli02.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli02: This data is Required!");
            spbli02.requestFocus();
            return false;
        } else {
            spbli02.setError(null);
        }


        //        spbli03
        if (spbli03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli03a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli03a: This data is Required!");
            spbli03a.setFocusable(true);
            spbli03a.setFocusableInTouchMode(true);
            spbli03a.requestFocus();
            return false;
        } else {
            spbli03a.setError(null);
        }


        //        spbli04
        if (spbli04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli04a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli04a: This data is Required!");
            spbli04a.setFocusable(true);
            spbli04a.setFocusableInTouchMode(true);
            spbli04a.requestFocus();
            return false;
        } else {
            spbli04a.setError(null);
        }


        //        spbli0488x
        if (spbli0488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli0488x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli0488x: This data is Required!");
            spbli0488x.requestFocus();
            return false;
        } else {
            spbli0488x.setError(null);
        }


        //        spbli05
        if (spbli05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli05a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli04a: This data is Required!");
            spbli05a.setFocusable(true);
            spbli05a.setFocusableInTouchMode(true);
            spbli05a.requestFocus();
            return false;
        } else {
            spbli05a.setError(null);
        }


        //        spbli0588x
        if (spbli0588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli0588x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli0588x: This data is Required!");
            spbli0588x.requestFocus();
            return false;
        } else {
            spbli0588x.setError(null);
        }


        //        spbli06
        if (spbli06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli06), Toast.LENGTH_SHORT).show();
            spbli06.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli06: This data is Required!");
            spbli06.requestFocus();
            return false;
        } else {
            spbli06.setError(null);
        }


        //        spbli07
        if (spbli07.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli07), Toast.LENGTH_SHORT).show();
            spbli07.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli07: This data is Required!");
            spbli07.requestFocus();
            return false;
        } else {
            spbli07.setError(null);
        }


        //        spbli08
        if (spbli08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli08a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli08a: This data is Required!");
            spbli08a.setFocusable(true);
            spbli08a.setFocusableInTouchMode(true);
            spbli08a.requestFocus();
            return false;
        } else {
            spbli08a.setError(null);
        }


        //        spbli0888x
        if (spbli0888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli0888x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli0888x: This data is Required!");
            spbli0888x.requestFocus();
            return false;
        } else {
            spbli0888x.setError(null);
        }


        //        spbli09
        if (spbli09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli09a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli09a: This data is Required!");
            spbli09a.setFocusable(true);
            spbli09a.setFocusableInTouchMode(true);
            spbli09a.requestFocus();
            return false;
        } else {
            spbli09a.setError(null);
        }


        //        spbli010
        if (spbli010.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli010), Toast.LENGTH_SHORT).show();
            spbli010.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli010: This data is Required!");
            spbli010.requestFocus();
            return false;
        } else {
            spbli010.setError(null);
        }


        //        spbli011
        if (spbli011.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli011a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli011a: This data is Required!");
            spbli011a.setFocusable(true);
            spbli011a.setFocusableInTouchMode(true);
            spbli011a.requestFocus();
            return false;
        } else {
            spbli011a.setError(null);
        }


        //        spbli012
        if (spbli012.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli012), Toast.LENGTH_SHORT).show();
            spbli012.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli012: This data is Required!");
            spbli012.requestFocus();
            return false;
        } else {
            spbli012.setError(null);
        }


        //        spbli013
        if (spbli013.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli013), Toast.LENGTH_SHORT).show();
            spbli013.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli013: This data is Required!");
            spbli013.requestFocus();
            return false;
        } else {
            spbli013.setError(null);
        }


        //        spbli014
        if (spbli014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli014a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli014a: This data is Required!");
            spbli014a.setFocusable(true);
            spbli014a.setFocusableInTouchMode(true);
            spbli014a.requestFocus();
            return false;
        } else {
            spbli014a.setError(null);
        }


        //        spbli015
        if (spbli015.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli015), Toast.LENGTH_SHORT).show();
            spbli015.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli015: This data is Required!");
            spbli015.requestFocus();
            return false;
        } else {
            spbli015.setError(null);
        }


        //        spbli016
        if (spbli016.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli016a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli016a: This data is Required!");
            spbli016a.setFocusable(true);
            spbli016a.setFocusableInTouchMode(true);
            spbli016a.requestFocus();
            return false;
        } else {
            spbli016a.setError(null);
        }


        //        spbli017
        if (spbli017.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli017a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli017a: This data is Required!");
            spbli017a.setFocusable(true);
            spbli017a.setFocusableInTouchMode(true);
            spbli017a.requestFocus();
            return false;
        } else {
            spbli017a.setError(null);
        }


        //        spbli01788x
        if (spbli01788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli01788x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli01788x: This data is Required!");
            spbli01788x.requestFocus();
            return false;
        } else {
            spbli01788x.setError(null);
        }


        //        spbli018
        if (spbli018.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli018a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli018a: This data is Required!");
            spbli018a.setFocusable(true);
            spbli018a.setFocusableInTouchMode(true);
            spbli018a.requestFocus();
            return false;
        } else {
            spbli018a.setError(null);
        }


        //        spbli01888x
        if (spbli01888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli01888x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli01888x: This data is Required!");
            spbli01888x.requestFocus();
            return false;
        } else {
            spbli01888x.setError(null);
        }


        //        spbli019
        if (spbli019.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli019a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli019a: This data is Required!");
            spbli019a.setFocusable(true);
            spbli019a.setFocusableInTouchMode(true);
            spbli019a.requestFocus();
            return false;
        } else {
            spbli019a.setError(null);
        }


        //        spbli020
        if (spbli020.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli020a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli020a: This data is Required!");
            spbli020a.setFocusable(true);
            spbli020a.setFocusableInTouchMode(true);
            spbli020a.requestFocus();
            return false;
        } else {
            spbli020a.setError(null);
        }


        //        spbli021
        if (spbli021.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli021a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli021a: This data is Required!");
            spbli021a.setFocusable(true);
            spbli021a.setFocusableInTouchMode(true);
            spbli021a.requestFocus();
            return false;
        } else {
            spbli021a.setError(null);
        }


        //        spbli021a1
        if (spbli021a1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli021a1), Toast.LENGTH_SHORT).show();
            spbli021a1.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli021a1: This data is Required!");
            spbli021a1.requestFocus();
            return false;
        } else {
            spbli021a1.setError(null);
        }


        //        spbli021a2
        if (spbli021a2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli021a2), Toast.LENGTH_SHORT).show();
            spbli021a2.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli021a2: This data is Required!");
            spbli021a2.requestFocus();
            return false;
        } else {
            spbli021a2.setError(null);
        }


        //        spbli02288x
        if (spbli02288x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli02288x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli02288x: This data is Required!");
            spbli02288x.requestFocus();
            return false;
        } else {
            spbli02288x.setError(null);
        }


        //        spbli023
        if (spbli023.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli023a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli023a: This data is Required!");
            spbli023a.setFocusable(true);
            spbli023a.setFocusableInTouchMode(true);
            spbli023a.requestFocus();
            return false;
        } else {
            spbli023a.setError(null);
        }


        //        spbli024
        if (spbli024.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli024a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli024a: This data is Required!");
            spbli024a.setFocusable(true);
            spbli024a.setFocusableInTouchMode(true);
            spbli024a.requestFocus();
            return false;
        } else {
            spbli024a.setError(null);
        }


        //        spbli025
        if (spbli025.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli025a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli025a: This data is Required!");
            spbli025a.setFocusable(true);
            spbli025a.setFocusableInTouchMode(true);
            spbli025a.requestFocus();
            return false;
        } else {
            spbli025a.setError(null);
        }


        //        spbli02588x
        if (spbli02588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli02588x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli02588x: This data is Required!");
            spbli02588x.requestFocus();
            return false;
        } else {
            spbli02588x.setError(null);
        }


        //        spbli026
        if (spbli026.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli026a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli026a: This data is Required!");
            spbli026a.setFocusable(true);
            spbli026a.setFocusableInTouchMode(true);
            spbli026a.requestFocus();
            return false;
        } else {
            spbli026a.setError(null);
        }


        //        spbli026hr
        if (spbli026hr.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli026hr), Toast.LENGTH_SHORT).show();
            spbli026hr.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli026hr: This data is Required!");
            spbli026hr.requestFocus();
            return false;
        } else {
            spbli026hr.setError(null);
        }


        //        spbli026day
        if (spbli026day.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli026day), Toast.LENGTH_SHORT).show();
            spbli026day.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli026day: This data is Required!");
            spbli026day.requestFocus();
            return false;
        } else {
            spbli026day.setError(null);
        }


        //        spbli026wk
        if (spbli026wk.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbli026wk), Toast.LENGTH_SHORT).show();
            spbli026wk.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli026wk: This data is Required!");
            spbli026wk.requestFocus();
            return false;
        } else {
            spbli026wk.setError(null);
        }


        //        spbli027
        if (spbli027.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli027a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli027a: This data is Required!");
            spbli027a.setFocusable(true);
            spbli027a.setFocusableInTouchMode(true);
            spbli027a.requestFocus();
            return false;
        } else {
            spbli027a.setError(null);
        }


        //        spbli02788x
        if (spbli02788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli02788x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli02788x: This data is Required!");
            spbli02788x.requestFocus();
            return false;
        } else {
            spbli02788x.setError(null);
        }


        //        spbli028
        if (spbli028.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbli028a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli028a: This data is Required!");
            spbli028a.setFocusable(true);
            spbli028a.setFocusableInTouchMode(true);
            spbli028a.requestFocus();
            return false;
        } else {
            spbli028a.setError(null);
        }


        //        spbli02888x
        if (spbli02888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbli02888x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbli02888x: This data is Required!");
            spbli02888x.requestFocus();
            return false;
        } else {
            spbli02888x.setError(null);
        }


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHI = new JSONObject();

        sHI.put("spbli01w", spbli01w.selectedItem.toString());

        sHI.put("spbli01", spbli01a.isChecked() ? "1" : spbli01b.isChecked() ? "2"
                : spbli01c.isChecked() ? "3"
                : "0");

        sHI.put("spbli02", spbli02.getText().toString());

        sHI.put("spbli03", spbli03a.isChecked() ? "1" : spbli03b.isChecked() ? "2"
                : spbli03c.isChecked() ? "3"
                : "0");

        sHI.put("spbli04", spbli04a.isChecked() ? "1" : spbli04b.isChecked() ? "2"
                : spbli04c.isChecked() ? "3"
                : spbli04d.isChecked() ? "4"
                : spbli04e.isChecked() ? "5"
                : spbli04f.isChecked() ? "6"
                : spbli04g.isChecked() ? "7"
                : spbli04h.isChecked() ? "8"
                : spbli0488.isChecked() ? "88"
                : "0");

        sHI.put("spbli0488x", spbli0488x.getText().toString());

        sHI.put("spbli05", spbli05a.isChecked() ? "1" : spbli05b.isChecked() ? "2"
                : spbli05c.isChecked() ? "3"
                : spbli05d.isChecked() ? "4"
                : spbli0588.isChecked() ? "88"
                : "0");

        sHI.put("spbli0588x", spbli0588x.getText().toString());

        sHI.put("spbli06", spbli06.getText().toString());
        sHI.put("spbli07", spbli07.getText().toString());

        sHI.put("spbli08", spbli08a.isChecked() ? "1" : spbli08b.isChecked() ? "2"
                : spbli08c.isChecked() ? "3"
                : spbli08d.isChecked() ? "4"
                : spbli08e.isChecked() ? "5"
                : spbli0888.isChecked() ? "88"
                : "0");

        sHI.put("spbli0888x", spbli0888x.getText().toString());


        sHI.put("spbli09", spbli09a.isChecked() ? "1" : spbli09b.isChecked() ? "2"
                : spbli0999.isChecked() ? "99"
                : "0");

        sHI.put("spbli010", spbli010.getText().toString());


        sHI.put("spbli011", spbli011a.isChecked() ? "1" : spbli011b.isChecked() ? "2"
                : spbli01199.isChecked() ? "99"
                : "0");

        sHI.put("spbli012", spbli012.getText().toString());
        sHI.put("spbli013", spbli013.getText().toString());


        sHI.put("spbli014", spbli014a.isChecked() ? "1" : spbli014b.isChecked() ? "2"
                : spbli01499.isChecked() ? "99"
                : "0");

        sHI.put("spbli015", spbli015.getText().toString());


        sHI.put("spbli016", spbli016a.isChecked() ? "1" : spbli016b.isChecked() ? "2"
                : spbli01699.isChecked() ? "99"
                : "0");


        sHI.put("spbli017", spbli017a.isChecked() ? "1" : spbli017b.isChecked() ? "2"
                : spbli017c.isChecked() ? "3"
                : spbli017d.isChecked() ? "4"
                : spbli017e.isChecked() ? "5"
                : spbli017f.isChecked() ? "6"
                : spbli017g.isChecked() ? "7"
                : spbli017h.isChecked() ? "8"
                : spbli017i.isChecked() ? "9"
                : spbli01788.isChecked() ? "88"
                : "0");

        sHI.put("spbli01788x", spbli01788x.getText().toString());


        sHI.put("spbli018", spbli018a.isChecked() ? "1" : spbli018b.isChecked() ? "2"
                : spbli018c.isChecked() ? "3"
                : spbli01888.isChecked() ? "88"
                : "0");

        sHI.put("spbli01888x", spbli01888x.getText().toString());


        sHI.put("spbli019", spbli019a.isChecked() ? "1" : spbli019b.isChecked() ? "2"
                : spbli019c.isChecked() ? "3"
                : spbli019d.isChecked() ? "4"
                : "0");


        sHI.put("spbli020", spbli020a.isChecked() ? "1" : spbli020b.isChecked() ? "2"
                : spbli02099.isChecked() ? "99"
                : "0");


        sHI.put("spbli021", spbli021a.isChecked() ? "1" : spbli021b.isChecked() ? "2"
                : "0");


        sHI.put("spbli021a1", spbli021a1.getText().toString());
        sHI.put("spbli021a2", spbli021a2.getText().toString());


        sHI.put("spbli022", spbli022a.isChecked() ? "1" : spbli022b.isChecked() ? "2"
                : spbli02288.isChecked() ? "88"
                : spbli02299.isChecked() ? "99"
                : "0");

        sHI.put("spbli02288x", spbli02288x.getText().toString());


        sHI.put("spbli023", spbli023a.isChecked() ? "1" : spbli023b.isChecked() ? "2"
                : spbli023c.isChecked() ? "3"
                : spbli023d.isChecked() ? "4"
                : spbli023e.isChecked() ? "5"
                : spbli023f.isChecked() ? "6"
                : spbli02399.isChecked() ? "99"
                : "0");


        sHI.put("spbli024", spbli024a.isChecked() ? "1" : spbli024b.isChecked() ? "2"
                : spbli02499.isChecked() ? "99"
                : "0");


        sHI.put("spbli025", spbli025a.isChecked() ? "1" : spbli025b.isChecked() ? "2"
                : spbli025c.isChecked() ? "3"
                : spbli02588.isChecked() ? "88"
                : spbli02599.isChecked() ? "99"
                : "0");

        sHI.put("spbli02588x", spbli02588x.getText().toString());


        sHI.put("spbli026", spbli026h.isChecked() ? "1" : spbli026d.isChecked() ? "2"
                : spbli026w.isChecked() ? "3"
                : spbli026n.isChecked() ? "4"
                : "0");

        sHI.put("spbli026hr", spbli026hr.getText().toString());
        sHI.put("spbli026day", spbli026day.getText().toString());
        sHI.put("spbli026wk", spbli026wk.getText().toString());

        sHI.put("spbli027", spbli027a.isChecked() ? "1" : spbli027b.isChecked() ? "2"
                : spbli027c.isChecked() ? "3"
                : spbli027d.isChecked() ? "4"
                : spbli027e.isChecked() ? "5"
                : spbli027f.isChecked() ? "6"
                : spbli027g.isChecked() ? "7"
                : spbli027h.isChecked() ? "8"
                : spbli02788.isChecked() ? "88"
                : "0");

        sHI.put("spbli02788x", spbli02788x.getText().toString());


        sHI.put("spbli028", spbli028a.isChecked() ? "1" : spbli028b.isChecked() ? "2"
                : spbli028c.isChecked() ? "3"
                : spbli02888.isChecked() ? "88"
                : "0");

        sHI.put("spbli02888x", spbli02888x.getText().toString());

        MainApp.fc.setsI(String.valueOf(sHI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }
*/
}
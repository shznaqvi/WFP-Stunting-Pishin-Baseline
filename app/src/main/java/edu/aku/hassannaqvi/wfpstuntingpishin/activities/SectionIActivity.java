package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;

//import edu.aku.hassannaqvi.wfpstuntingpishin.R;

public class SectionIActivity extends Activity {
    private static final String TAG = SectionIActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);
    }


    /*@OnClick(R.id.btn_Continue)
    void SaveData() {

        if (ValidateForm()) {
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
        }
    }


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
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.tha03), Toast.LENGTH_SHORT).show();
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
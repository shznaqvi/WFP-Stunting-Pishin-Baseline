package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionDActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnNext)
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


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
    }


    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSHD();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean ValidateForm() {

        //        spbld01
        if (spbld01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbld01a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld01: This data is Required!");
            spbld01a.setFocusable(true);
            spbld01a.setFocusableInTouchMode(true);
            spbld01a.requestFocus();
            return false;
        } else {
            spbld01a.setError(null);
        }


        //        spbld02
        if (spbld02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbld02a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld02: This data is Required!");
            spbld02a.setFocusable(true);
            spbld02a.setFocusableInTouchMode(true);
            spbld02a.requestFocus();
            return false;
        } else {
            spbld02a.setError(null);
        }


        //        spbld03
        if (spbld03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbld03a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld03: This data is Required!");
            spbld03a.setFocusable(true);
            spbld03a.setFocusableInTouchMode(true);
            spbld03a.requestFocus();
            return false;
        } else {
            spbld03a.setError(null);
        }


        //        spbld04
        if (spbld04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbld04a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld04: This data is Required!");
            spbld04a.setFocusable(true);
            spbld04a.setFocusableInTouchMode(true);
            spbld04a.requestFocus();
            return false;
        } else {
            spbld04a.setError(null);
        }


        //        spbld05
        if (spbld05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbld05a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld05: This data is Required!");
            spbld05a.setFocusable(true);
            spbld05a.setFocusableInTouchMode(true);
            spbld05a.requestFocus();
            return false;
        } else {
            spbld05a.setError(null);
        }


        //        spbld06
        if (spbld06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            spbld06a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld06: This data is Required!");
            spbld06a.setFocusable(true);
            spbld06a.setFocusableInTouchMode(true);
            spbld06a.requestFocus();
            return false;
        } else {
            spbld06a.setError(null);
        }

        if (spbld0688x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spbld0688x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld0688x: This data is Required!");
            spbld0688x.requestFocus();
            return false;
        } else {
            spbld0688x.setError(null);
        }


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHD = new JSONObject();

        sHD.put("spbld01", spbld01a.isChecked() ? "1" : spbld01b.isChecked() ? "2"
                : spbld01c.isChecked() ? "3"
                : spbld01d.isChecked() ? "4"
                : "0");

        sHD.put("spbld02", spbld02a.isChecked() ? "1" : spbld02b.isChecked() ? "2" : "0");
        sHD.put("spbld03", spbld03a.isChecked() ? "1"
                : spbld03b.isChecked() ? "2"
                : spbld03c.isChecked() ? "3"
                : spbld03d.isChecked() ? "4"
                : spbld03e.isChecked() ? "5"
                : "0");

        sHD.put("spbld04", spbld04a.isChecked() ? "1" : spbld04b.isChecked() ? "2" : "0");

        sHD.put("spbld05", spbld05a.isChecked() ? "1"
                : spbld05b.isChecked() ? "2"
                : spbld05c.isChecked() ? "3"
                : spbld05d.isChecked() ? "4"
                : spbld05e.isChecked() ? "5"
                : "0");

        sHD.put("spbld06", spbld06a.isChecked() ? "1"
                : spbld06b.isChecked() ? "2"
                : spbld06c.isChecked() ? "3"
                : spbld06d.isChecked() ? "4"
                : spbld06e.isChecked() ? "5"
                : spbld06f.isChecked() ? "6"
                : spbld06g.isChecked() ? "7"
                : spbld06h.isChecked() ? "8"
                : spbld06i.isChecked() ? "9"
                : spbld0688.isChecked() ? "88"
                : "0");


        sHD.put("spbld0688x", spbld0688x.getText().toString());

        sHD.put("appver", MainApp.versionName + "." + MainApp.versionCode);

        MainApp.fc.setsHD(String.valueOf(sHD));
    }
}
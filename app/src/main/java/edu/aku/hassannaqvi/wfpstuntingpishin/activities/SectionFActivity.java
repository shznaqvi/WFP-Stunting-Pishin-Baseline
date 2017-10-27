package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionFActivity extends Activity {
    private static final String TAG = SectionFActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
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

        /*int updcount = db.updateSHF();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;

    }


    private boolean ValidateForm() {

/*
        //        spblf01a
        if (spblf01a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblf01a), Toast.LENGTH_SHORT).show();
            spblf01a.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spblf01a: This data is Required!");
            spblf01a.requestFocus();
            return false;
        } else {
            spblf01a.setError(null);
        }


        //        spblf01b
        if (spblf01b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblf01b), Toast.LENGTH_SHORT).show();
            spblf01b.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spblf01b: This data is Required!");
            spblf01b.requestFocus();
            return false;
        } else {
            spblf01b.setError(null);
        }


        //        spblf01c
        if (spblf01c.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblf01c), Toast.LENGTH_SHORT).show();
            spblf01c.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spblf01c: This data is Required!");
            spblf01c.requestFocus();
            return false;
        } else {
            spblf01c.setError(null);
        }


        //        spblf01d
        if (spblf01d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblf01d), Toast.LENGTH_SHORT).show();
            spblf01d.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spblf01d: This data is Required!");
            spblf01d.requestFocus();
            return false;
        } else {
            spblf01d.setError(null);
        }


        //        spblf01e
        if (spblf01e.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblf01e), Toast.LENGTH_SHORT).show();
            spblf01e.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spblf01e: This data is Required!");
            spblf01e.requestFocus();
            return false;
        } else {
            spblf01e.setError(null);
        }


        //        spblf01f
        if (spblf01f.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblf01f), Toast.LENGTH_SHORT).show();
            spblf01f.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spblf01f: This data is Required!");
            spblf01f.requestFocus();
            return false;
        } else {
            spblf01f.setError(null);
        }

*/

        return true;
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHE = new JSONObject();

        /*sHE.put("spble01a", spble01a.getSelectedItem().toString());


        MainApp.fc.setsHE(String.valueOf(sHE));
*/
    }

}
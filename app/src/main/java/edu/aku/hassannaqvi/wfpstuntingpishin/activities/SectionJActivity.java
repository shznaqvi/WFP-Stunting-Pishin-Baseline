package edu.aku.hassannaqvi.wfpstuntingpishin.activities;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;
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

public class SectionJActivity extends Activity {

    private static final String TAG = SectionJActivity.class.getSimpleName();

    @BindView(R.id.spblj01)
    EditText spblj01;
    @BindView(R.id.spblj0201a)
    Spinner spblj0201a;
    @BindView(R.id.spblj0201b)
    EditText spblj0201b;
    @BindView(R.id.spblj0202a)
    Spinner spblj0202a;
    @BindView(R.id.spblj0202b)
    EditText spblj0202b;
    @BindView(R.id.spblj0301a)
    Spinner spblj0301a;
    @BindView(R.id.spblj0301b)
    EditText spblj0301b;
    @BindView(R.id.spblj0302a)
    Spinner spblj0302a;
    @BindView(R.id.spblj0302b)
    EditText spblj0302b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_j);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        /*if (ValidateForm()) {
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

        Intent secNext = new Intent(this, SectionKActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);


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

        JSONObject sJ = new JSONObject();

        sJ.put("spblj01", spblj01.getText().toString());
        sJ.put("spblj0201a", spblj0201a.getSelectedItem().toString());
        sJ.put("spblj0201b", spblj0201b.getText().toString());
        sJ.put("spblj0202a", spblj0201a.getSelectedItem().toString());
        sJ.put("spblj0202b", spblj0201b.getText().toString());
        sJ.put("spblj0301a", spblj0201a.getSelectedItem().toString());
        sJ.put("spblj0301b", spblj0201b.getText().toString());
        sJ.put("spblj0302a", spblj0201a.getSelectedItem().toString());
        sJ.put("spblj0302b", spblj0201b.getText().toString());

//        MainApp.ims.setsI(String.valueOf(sI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spblj01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj03), Toast.LENGTH_SHORT).show();
            spblj01.setError("This data is Required!");
            Log.i(TAG, "spblj01: This data is Required!");
            spblj01.requestFocus();
            return false;
        } else {
            spblj01.setError(null);
        }

        if (spblj0201a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spblj0201a.getSelectedView()).setText("This Data is Required");
            ((TextView) spblj0201a.getSelectedView()).setTextColor(Color.RED);
            spblj0201a.requestFocus();
            Log.i(TAG, "spblj0201a: This Data is Required!");
            return false;
        } else {
            ((TextView) spblj0201a.getSelectedView()).setError(null);
        }

        if (spblj0201b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
            spblj0201b.setError("This data is Required!");
            Log.i(TAG, "spblj0201b: This data is Required!");
            spblj0201b.requestFocus();
            return false;
        } else {
            spblj0201b.setError(null);
        }

        if (spblj0202a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spblj0202a.getSelectedView()).setText("This Data is Required");
            ((TextView) spblj0202a.getSelectedView()).setTextColor(Color.RED);
            spblj0202a.requestFocus();
            Log.i(TAG, "spblj0202a: This Data is Required!");
            return false;
        } else {
            ((TextView) spblj0202a.getSelectedView()).setError(null);
        }

        if (spblj0202b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
            spblj0202b.setError("This data is Required!");
            Log.i(TAG, "spblj0202b: This data is Required!");
            spblj0202b.requestFocus();
            return false;
        } else {
            spblj0202b.setError(null);
        }


        if (spblj0301a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spblj0301a.getSelectedView()).setText("This Data is Required");
            ((TextView) spblj0301a.getSelectedView()).setTextColor(Color.RED);
            spblj0301a.requestFocus();
            Log.i(TAG, "spblj0301a: This Data is Required!");
            return false;
        } else {
            ((TextView) spblj0301a.getSelectedView()).setError(null);
        }

        if (spblj0301b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
            spblj0301b.setError("This data is Required!");
            Log.i(TAG, "spblj0301b: This data is Required!");
            spblj0301b.requestFocus();
            return false;
        } else {
            spblj0301b.setError(null);
        }

        if (spblj0302a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spblj0302a.getSelectedView()).setText("This Data is Required");
            ((TextView) spblj0302a.getSelectedView()).setTextColor(Color.RED);
            spblj0302a.requestFocus();
            Log.i(TAG, "spblj0302a: This Data is Required!");
            return false;
        } else {
            ((TextView) spblj0302a.getSelectedView()).setError(null);
        }

        if (spblj0302b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
            spblj0302b.setError("This data is Required!");
            Log.i(TAG, "spblj0302b: This data is Required!");
            spblj0302b.requestFocus();
            return false;
        } else {
            spblj0302b.setError(null);
        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}


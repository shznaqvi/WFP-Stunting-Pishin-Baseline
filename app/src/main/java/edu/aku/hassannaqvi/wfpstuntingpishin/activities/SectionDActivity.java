package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.activities.SectionEActivity;

public class SectionDActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getName();


    @BindView(R.id.spbld01)
    RadioGroup spbld01;
    @BindView(R.id.spbld01a)
    RadioButton spbld01a;
    @BindView(R.id.spbld01c)
    RadioButton spbld01c;
    @BindView(R.id.spbld01d)
    RadioButton spbld01d;
    @BindView(R.id.spbld0188)
    RadioButton spbld0188;
    @BindView(R.id.spbld0188x)
    EditText spbld0188x;
    @BindView(R.id.spbld02)
    RadioGroup spbld02;
    @BindView(R.id.spbld02a)
    RadioButton spbld02a;
    @BindView(R.id.spbld02b)
    RadioButton spbld02b;
    @BindView(R.id.spbld03a)
    CheckBox spbld03a;
    @BindView(R.id.spbld03b)
    CheckBox spbld03b;
    @BindView(R.id.spbld03c)
    CheckBox spbld03c;
    @BindView(R.id.spbld03d)
    CheckBox spbld03d;
    @BindView(R.id.spbld0366)
    CheckBox spbld0366;
    @BindView(R.id.spbld04)
    RadioGroup spbld04;
    @BindView(R.id.spbld04a)
    RadioButton spbld04a;
    @BindView(R.id.spbld04b)
    RadioButton spbld04b;
    @BindView(R.id.spbld05a)
    CheckBox spbld05a;
    @BindView(R.id.spbld05b)
    CheckBox spbld05b;
    @BindView(R.id.spbld05c)
    CheckBox spbld05c;
    @BindView(R.id.spbld05d)
    CheckBox spbld05d;
    @BindView(R.id.spbld0566)
    CheckBox spbld0566;
    @BindView(R.id.spbld06a)
    CheckBox spbld06a;
    @BindView(R.id.spbld06b)
    CheckBox spbld06b;
    @BindView(R.id.spbld06c)
    CheckBox spbld06c;
    @BindView(R.id.spbld06d)
    CheckBox spbld06d;
    @BindView(R.id.spbld06e)
    CheckBox spbld06e;
    @BindView(R.id.spbld06f)
    CheckBox spbld06f;
    @BindView(R.id.spbld06g)
    CheckBox spbld06g;
    @BindView(R.id.spbld06h)
    CheckBox spbld06h;
    @BindView(R.id.spbld06i)
    CheckBox spbld06i;
    @BindView(R.id.spbld0688)
    CheckBox spbld0688;
    @BindView(R.id.spbld0688x)
    EditText spbld0688x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);
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


                Intent secNext = new Intent(this, SectionEActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);

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

        /*int updcount = db.updateSD();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_sdORT).sdow();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_sdORT).sdow();
            return false;
        }
*/

        return true;
    }


    private boolean ValidateForm() {
/*

        //        spbld01
        if (spbld01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbld01), Toast.LENGTH_sdORT).sdow();
            spbld0188.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld01: This data is Required!");
            spbld0188.setFocusable(true);
            spbld0188.setFocusableInTouchMode(true);
            spbld0188.requestFocus();
            return false;
        } else {
            spbld0188.setError(null);
        }

            if (spbld0188.isChecked() && spbld0188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_sdORT).sdow();
            spbld0188x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld0188x: This data is Required!");
            spbld0188x.requestFocus();
            return false;
        } else {
            spbld0188x.setError(null);
        }


        //        spbld02
        if (spbld02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbld02), Toast.LENGTH_sdORT).sdow();
            spbld02b.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld02: This data is Required!");
            spbld02b.setFocusable(true);
            spbld02b.setFocusableInTouchMode(true);
            spbld02b.requestFocus();
            return false;
        } else {
            spbld02b.setError(null);
        }


             if (!(spbld03a.isChecked() || spbld03b.isChecked() || spbld03c.isChecked() || spbld03d.isChecked()
                    || spbld0366.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbld03), Toast.LENGTH_SHORT).show();
                spbld0366.setError("This Data is Required");
                Log.d(TAG, "spbld03 :This Data is Required");
            } else {
                spbld0366.setError(null);
            }



        //        spbld04
        if (spbld04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbld04), Toast.LENGTH_sdORT).sdow();
            spbld04b.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld04: This data is Required!");
            spbld04b.setFocusable(true);
            spbld04b.setFocusableInTouchMode(true);
            spbld04b.requestFocus();
            return false;
        } else {
            spbld04b.setError(null);
        }

           if (!(spbld05a.isChecked() || spbld05b.isChecked() || spbld05c.isChecked() || spbld05d.isChecked()
                    || spbld0566.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbld05), Toast.LENGTH_SHORT).show();
                spbld0566.setError("This Data is Required");
                Log.d(TAG, "spbld05 :This Data is Required");
            } else {
                spbld0566.setError(null);
            }


             if (!(spbld06a.isChecked() || spbld06b.isChecked() || spbld06c.isChecked() || spbld06d.isChecked()
             spbld06e.isChecked() || spbld06f.isChecked() || spbld06g.isChecked() || spbld06h.isChecked() ||
                spbld06i.isChecked()    || spbld0688.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbld03), Toast.LENGTH_SHORT).show();
                spbld0688.setError("This Data is Required");
                Log.d(TAG, "spbld06 :This Data is Required");
            } else {
                spbld0688.setError(null);
            }

         if (spbld0688.isChecked() && spbld0688x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_sdORT).sdow();
            spbld0688x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "spbld0688x: This data is Required!");
            spbld0688x.requestFocus();
            return false;
        } else {
            spbld0688x.setError(null);
        }
*/


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        /*JSONObject sd = new JSONObject();

        sd.put("spbld01", spbld01a.isChecked() ? "1" : spbld01b.isChecked() ? "2"
                : spbld01c.isChecked() ? "3"
                : spbld01d.isChecked() ? "4"
                : "0");
        sd.put("spbld0188x", spbld0188x.getText().toString());

        sd.put("spbld02", spbld02a.isChecked() ? "1" : spbld02b.isChecked() ? "2" : "0");

        sd.put("spbld03a", spblh03a.isChecked() ? "1" : "0");
        sd.put("spbld03b", spblh03b.isChecked() ? "2" : "0");
        sd.put("spbld03c", spblh03c.isChecked() ? "3" : "0");
        sd.put("spbld03d", spblh03d.isChecked() ? "4" : "0");
      sd.put("spbld0366", spblh0366.isChecked() ? "66" : "0");

        sd.put("spbld04", spbld04a.isChecked() ? "1" : spbld04b.isChecked() ? "2" : "0");

       sd.put("spbld05a", spblh05a.isChecked() ? "1" : "0");
        sd.put("spbld05b", spblh05b.isChecked() ? "2" : "0");
        sd.put("spbld05c", spblh05c.isChecked() ? "3" : "0");
        sd.put("spbld05d", spblh05d.isChecked() ? "4" : "0");
      sd.put("spbld0566", spblh0566.isChecked() ? "66" : "0");

         sd.put("spbld06a", spblh06a.isChecked() ? "1" : "0");
        sd.put("spbld06b", spblh06b.isChecked() ? "2" : "0");
        sd.put("spbld06c", spblh06c.isChecked() ? "3" : "0");
        sd.put("spbld06d", spblh06d.isChecked() ? "4" : "0");
      sd.put("spbld06e", spblh06e.isChecked() ? "5" : "0");
      sd.put("spbld06f", spblh06f.isChecked() ? "6" : "0");
      sd.put("spbld06g", spblh06g.isChecked() ? "7" : "0");
      sd.put("spbld06h", spblh06h.isChecked() ? "8" : "0");
      sd.put("spbld06i", spblh06i.isChecked() ? "9" : "0");
      sd.put("spbld0688", spblh0688.isChecked() ? "88" : "0");
        sd.put("spbld0688x", spbld0688x.getText().toString());

        sd.put("appver", MainApp.versionName + "." + MainApp.versionCode);

        MainApp.fc.setsd(String.valueOf(sD));*/
    }
}
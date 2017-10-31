package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.FamilyMembersContract;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses.FamilyMembers;

public class SectionBActivity extends Activity
{

    private static final String TAG = SectionBActivity.class.getSimpleName();
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
    @BindView(R.id.spblb07)
    RadioGroup spblb07;
    @BindView(R.id.spblb07a)
    RadioButton spblb07a;
    @BindView(R.id.spblb07b)
    RadioButton spblb07b;
    @BindView(R.id.spblb05)
    RadioGroup spblb05;
    @BindView(R.id.spblb0566)
    RadioButton spblb0566;
    @BindView(R.id.spblb05a)
    RadioButton spblb05a;
    @BindView(R.id.spblb05b)
    RadioButton spblb05b;
    @BindView(R.id.spblb05c)
    RadioButton spblb05c;
    @BindView(R.id.spblb05d)
    RadioButton spblb05d;
    @BindView(R.id.spblb05e)
    RadioButton spblb05e;
    @BindView(R.id.spblb05f)
    RadioButton spblb05f;
    @BindView(R.id.spblb05g)
    RadioButton spblb05g;
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
    @BindViews({R.id.spblb04y, R.id.spblb04m, R.id.spblb04d})
    List<EditText> spblb04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);


//        Fill spinner
        spblb03.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                Arrays.asList(new String[]{"....", "1"})));


        spblb02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (spblb02a.isChecked()) {
                    spblb06a.setEnabled(false);
                    spblb06a.setChecked(false);


                } else {
                    spblb06a.setEnabled(true);

                }
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

        /*long updcount = db.addFamilyMember(MainApp.fmc);

        MainApp.fmc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fmc.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormID();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fmc = new FamilyMembersContract();
        MainApp.fmc.setFormDate(MainApp.fc.getFormDate());
        MainApp.fmc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.fmc.setUser(MainApp.fc.getUser());
        MainApp.fmc.set_UUID(MainApp.fc.get_UID());
        MainApp.fmc.setDevicetagID(sharedPref.getString("tagName", null));

        JSONObject sB = new JSONObject();

        sB.put("spblb01", spblb01.getText().toString());
        sB.put("spblb02", spblb02a.isChecked() ? "1" : spblb02b.isChecked() ? "2" : "0");
        sB.put("spblb03", spblb03.getSelectedItem().toString());
        sB.put("spblb04y", spblb04y.getText().toString());
        sB.put("spblb04m", spblb04m.getText().toString());
        sB.put("spblb04d", spblb04d.getText().toString());
        sB.put("spblb05", spblb05a.isChecked() ? "1" : spblb05b.isChecked() ? "2" : spblb05c.isChecked() ? "3"
                : spblb05d.isChecked() ? "4" : spblb05e.isChecked() ? "5" : spblb05f.isChecked() ? "6" : spblb05g.isChecked() ? "7"
                : spblb0566.isChecked() ? "66" : "0");
        sB.put("spblb06", spblb0677.isChecked() ? "77" : spblb06a.isChecked() ? "1" : spblb06b.isChecked() ? "2" : spblb06c.isChecked() ? "3"
                : spblb06d.isChecked() ? "4" : spblb06e.isChecked() ? "5" : spblb06f.isChecked() ? "6"
                : spblb06g.isChecked() ? "7" : spblb06h.isChecked() ? "8" : spblb06i.isChecked() ? "9"
                : spblb06j.isChecked() ? "10" : "0");
        sB.put("spblb07", spblb07a.isChecked() ? "1" : spblb07b.isChecked() ? "2" : "0");

        MainApp.fmc.setsB(String.valueOf(sB));


//        Checking Type
        String type;
        int childType = checkChildAge(spblb04y.getText().toString(), spblb04m.getText().toString(), spblb04d.getText().toString());
        if (childType == 0) {
            type = spblb02b.isChecked() && spblb07a.isChecked() ? "mw" :
                    spblb02b.isChecked() && spblb07b.isChecked() ? "w" : "m";
        } else {
            type = "ch";
        }


        MainApp.familyMembersList.add(new FamilyMembers(spblb01.getText().toString(), spblb07a.isChecked() ? "Married" : "Un-Married",
                spblb02a.isChecked() ? "Male" : "Female",
                spblb04y.getText().toString() + "-" +
                        spblb04m.getText().toString() + "-" +
                        spblb04d.getText().toString(),
                spblb03.getSelectedItemPosition() != 0 ? "" + spblb03.getSelectedItem().toString() : "N/A",
                type));


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public int checkChildAge(String y, String m, String d) {

        int age = Integer.parseInt(y) * 12 + Integer.parseInt(m) + (Integer.parseInt(d) / 29);

        age = age < 6 ? 1 : age >= 6 && age < 23 ? 2 : age >= 24 && age < 59 ? 3 : 0;

        return age;

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spblb01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb01), Toast.LENGTH_SHORT).show();
            spblb01.setError("This data is required");
            spblb01.requestFocus();
            Log.i(TAG, "spblb01: This Data is Required!");
            return false;
        } else {
            spblb01.setError(null);
        }

        if (spblb02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb02), Toast.LENGTH_SHORT).show();
            spblb02a.setError("This data is required");
            spblb02a.setFocusable(true);
            spblb02a.setFocusableInTouchMode(true);
            spblb02a.requestFocus();
            Log.i(TAG, "spblb02: This Data is Required!");
            return false;
        } else {
            spblb02a.setError(null);
        }

        /*if (spblb03.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb03), Toast.LENGTH_SHORT).show();
            ((TextView) spblb03.getSelectedView()).setText("This Data is Required");
            ((TextView) spblb03.getSelectedView()).setTextColor(Color.RED);
            spblb03.requestFocus();
            Log.i(TAG, "spblb03: This Data is Required!");
            return false;
        } else {
            ((TextView) spblb03.getSelectedView()).setError(null);
        }*/

        if (spblb04y.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb04y), Toast.LENGTH_SHORT).show();
            spblb04y.setError("This data is required");
            spblb04y.requestFocus();
            Log.i(TAG, "spblb04y: This Data is Required!");
            return false;
        } else {
            spblb04y.setError(null);
        }

        if (spblb04m.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb04m), Toast.LENGTH_SHORT).show();
            spblb04m.setError("This data is required");
            spblb04m.requestFocus();
            Log.i(TAG, "spblb04m: This Data is Required!");
            return false;
        } else {
            spblb04m.setError(null);
        }

        if (spblb04d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb04d), Toast.LENGTH_SHORT).show();
            spblb04d.setError("This data is required");
            spblb04d.requestFocus();
            Log.i(TAG, "spblb04d: This Data is Required!");
            return false;
        } else {
            spblb04d.setError(null);
        }
        if (spblb07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb07), Toast.LENGTH_SHORT).show();
            spblb07a.setError("This data is required");
            spblb07a.setFocusable(true);
            spblb07a.setFocusableInTouchMode(true);
            spblb07a.requestFocus();
            Log.i(TAG, "spblb07: This Data is Required!");
            return false;
        } else {
            spblb07a.setError(null);
        }


        if (spblb05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb05), Toast.LENGTH_SHORT).show();
            spblb05a.setError("This data is required");
            spblb05a.setFocusable(true);
            spblb05a.setFocusableInTouchMode(true);
            spblb05a.requestFocus();
            Log.i(TAG, "spblb05: This Data is Required!");
            return false;
        } else {
            spblb05a.setError(null);
        }

        if (spblb06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblb06), Toast.LENGTH_SHORT).show();
            spblb06a.setError("This data is required");
            spblb06a.setFocusable(true);
            spblb06a.setFocusableInTouchMode(true);
            spblb06a.requestFocus();
            Log.i(TAG, "spblb06: This Data is Required!");
            return false;
        } else {
            spblb06a.setError(null);
        }


        return true;
    }



}




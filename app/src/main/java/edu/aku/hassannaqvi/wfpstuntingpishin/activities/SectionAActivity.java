package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.FormsContract;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses.MembersCount;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();
    @BindView(R.id.spbla03)
    Spinner spbla03;
    @BindView(R.id.spbla04)
    EditText spbla04;
    @BindView(R.id.spbla05)
    RadioGroup spbla05;
    @BindView(R.id.spbla05a)
    RadioButton spbla05a;
    @BindView(R.id.spbla05b)
    RadioButton spbla05b;
    @BindView(R.id.spbla05c)
    RadioButton spbla05c;
    @BindView(R.id.spbla06a)
    RadioGroup spbla06a;
    @BindView(R.id.spbla06a1)
    RadioButton spbla06a1;
    @BindView(R.id.spbla06a2)
    RadioButton spbla06a2;
    @BindView(R.id.spbla06b)
    RadioGroup spbla06b;
    @BindView(R.id.spbla06b1)
    RadioButton spbla06b1;
    @BindView(R.id.spbla06b2)
    RadioButton spbla06b2;
    @BindView(R.id.spbla07t)
    EditText spbla07t;
    @BindView(R.id.spbla07pw)
    EditText spbla07pw;
    @BindView(R.id.spbla07lw)
    EditText spbla07lw;
    @BindView(R.id.spbla07mw)
    EditText spbla07mw;
    @BindView(R.id.spbla07m6)
    EditText spbla07m6;
    @BindView(R.id.spbla07f6)
    EditText spbla07f6;
    @BindView(R.id.spbla07m23)
    EditText spbla07m23;
    @BindView(R.id.spbla07f23)
    EditText spbla07f23;
    @BindView(R.id.spbla07m59)
    EditText spbla07m59;
    @BindView(R.id.spbla07f59)
    EditText spbla07f59;
    @BindView(R.id.spbla08)
    RadioGroup spbla08;
    @BindView(R.id.spbla08a)
    RadioButton spbla08a;
    @BindView(R.id.spbla08b)
    RadioButton spbla08b;
    @BindView(R.id.spbla08c)
    RadioButton spbla08c;

    @BindViews({R.id.spbla06a, R.id.spbla06b})
    List<RadioGroup> spbla06;
    @BindView(R.id.btn_Continue)
    Button btn_Continue;
    @BindView(R.id.btn_End)
    Button btn_End;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

        spbla03.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                Arrays.asList(new String[]{"....", "abc"})));

        spbla08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spbla08a.isChecked()) {
                    btn_Continue.setVisibility(View.VISIBLE);
                    btn_End.setVisibility(View.GONE);
                } else {
                    btn_Continue.setVisibility(View.GONE);
                    btn_End.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        MainApp.endActivity(this, this);
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                Intent secNext = new Intent(this, FamilyMemberListActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);
                finish();

            }
        }


    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(new Date().toString());
        MainApp.fc.setUser(MainApp.userName);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.fc.setFormType(MainApp.formType);
//        MainApp.fc.setParticipantID(participantId.getText().toString());

        JSONObject sInfo = new JSONObject();

        sInfo.put("spbla05", spbla05a.isChecked() ? "1" : spbla05b.isChecked() ? "2" : spbla05c.isChecked() ? "3" : "0");
        sInfo.put("spbla06a", spbla06a1.isChecked() ? "1" : spbla06a2.isChecked() ? "2" : "0");
        sInfo.put("spbla06b", spbla06b1.isChecked() ? "1" : spbla06b2.isChecked() ? "2" : "0");
        sInfo.put("spbla07t", spbla07t.getText().toString());
        sInfo.put("spbla07pw", spbla07pw.getText().toString());
        sInfo.put("spbla07lw", spbla07lw.getText().toString());
        sInfo.put("spbla07mw", spbla07mw.getText().toString());
        sInfo.put("spbla07m6", spbla07m6.getText().toString());
        sInfo.put("spbla07f6", spbla07f6.getText().toString());
        sInfo.put("spbla07m23", spbla07m23.getText().toString());
        sInfo.put("spbla07f23", spbla07f23.getText().toString());
        sInfo.put("spbla07m59", spbla07m59.getText().toString());
        sInfo.put("spbla07f59", spbla07f59.getText().toString());
        sInfo.put("spbla08", spbla08a.isChecked() ? "1" : spbla08b.isChecked() ? "2" : spbla08c.isChecked() ? "3" : "0");

        MainApp.fc.setInfo(String.valueOf(sInfo));

        Map<Integer, Map<Integer, String>> children = new HashMap<>();
        Map<Integer, String> child = new HashMap<>();
        child.put(1, spbla07m6.getText().toString());
        child.put(2, spbla07f6.getText().toString());

        children.put(0, child);
        child = new HashMap<>();

        child.put(1, spbla07m23.getText().toString());
        child.put(2, spbla07f23.getText().toString());

        children.put(1, child);
        child = new HashMap<>();

        child.put(1, spbla07m59.getText().toString());
        child.put(2, spbla07f59.getText().toString());

        children.put(2, child);

//        Women
        Map<Integer, String> women = new HashMap<>();
        women.put(0, spbla07pw.getText().toString());
        women.put(1, spbla07lw.getText().toString());
        women.put(2, spbla07mw.getText().toString());

        MainApp.members = new MembersCount(Integer.parseInt(spbla07t.getText().toString()), children, women);

        children = new HashMap<>();
        child = new HashMap<>();
        child.put(1, "0");
        child.put(2, "0");

        children.put(0, child);
        child = new HashMap<>();

        child.put(1, "0");
        child.put(2, "0");

        children.put(1, child);
        child = new HashMap<>();

        child.put(1, "0");
        child.put(2, "0");

        children.put(2, child);

        MainApp.checkMembers = new MembersCount(0, children);

        MainApp.setGPS(this);

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc);

        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormID();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spbla03.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla03), Toast.LENGTH_SHORT).show();
            ((TextView) spbla03.getSelectedView()).setText("This Data is Required");
            ((TextView) spbla03.getSelectedView()).setTextColor(Color.RED);
            spbla03.requestFocus();
            Log.i(TAG, "spbla03: This Data is Required!");
            return false;
        } else {
            ((TextView) spbla03.getSelectedView()).setError(null);
        }

        if (spbla04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla04), Toast.LENGTH_SHORT).show();
            spbla04.setError("This data is Required!");
            Log.i(TAG, "spbla04: This data is Required!");

            spbla04.requestFocus();
            return false;
        } else {
            spbla04.setError(null);
        }

        if (spbla05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla05), Toast.LENGTH_SHORT).show();
            spbla05a.setError("This data is Required!");
            Log.i(TAG, "spbla05: This data is Required!");
            spbla05a.setFocusable(true);
            spbla05a.setFocusableInTouchMode(true);
            spbla05a.requestFocus();
            return false;
        } else {
            spbla05a.setError(null);
        }

        if (spbla06a.getCheckedRadioButtonId() == -1 && spbla06b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla06), Toast.LENGTH_SHORT).show();
            spbla06a1.setError("This data is Required!");
            Log.i(TAG, "spbla05: This data is Required!");
            spbla06a.setFocusable(true);
            spbla06a.setFocusableInTouchMode(true);
            spbla06a.requestFocus();
            return false;
        } else {
            spbla06a1.setError(null);
        }

        if (spbla07t.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07t), Toast.LENGTH_SHORT).show();
            spbla07t.setError("This data is Required!");
            Log.i(TAG, "spbla07t: This data is Required!");

            spbla07t.requestFocus();
            return false;
        } else {
            spbla07t.setError(null);
        }

        if (spbla07pw.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07pw), Toast.LENGTH_SHORT).show();
            spbla07pw.setError("This data is Required!");
            Log.i(TAG, "spbla07pw: This data is Required!");

            spbla07pw.requestFocus();
            return false;
        } else {
            spbla07pw.setError(null);
        }

        if (spbla07lw.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07lw), Toast.LENGTH_SHORT).show();
            spbla07lw.setError("This data is Required!");
            Log.i(TAG, "spbla07lw: This data is Required!");

            spbla07lw.requestFocus();
            return false;
        } else {
            spbla07lw.setError(null);
        }

        if (spbla07mw.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07mw), Toast.LENGTH_SHORT).show();
            spbla07mw.setError("This data is Required!");
            Log.i(TAG, "spbla07mw: This data is Required!");

            spbla07mw.requestFocus();
            return false;
        } else {
            spbla07mw.setError(null);
        }

        if (spbla07m6.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07a), Toast.LENGTH_SHORT).show();
            spbla07m6.setError("This data is Required!");
            Log.i(TAG, "spbla07m6: This data is Required!");

            spbla07m6.requestFocus();
            return false;
        } else {
            spbla07m6.setError(null);
        }

        if (spbla07f6.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07a), Toast.LENGTH_SHORT).show();
            spbla07f6.setError("This data is Required!");
            Log.i(TAG, "spbla07f6: This data is Required!");

            spbla07f6.requestFocus();
            return false;
        } else {
            spbla07f6.setError(null);
        }

        if (spbla07m23.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07b), Toast.LENGTH_SHORT).show();
            spbla07m23.setError("This data is Required!");
            Log.i(TAG, "spbla07m23: This data is Required!");

            spbla07m23.requestFocus();
            return false;
        } else {
            spbla07m23.setError(null);
        }

        if (spbla07f23.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07b), Toast.LENGTH_SHORT).show();
            spbla07f23.setError("This data is Required!");
            Log.i(TAG, "spbla07f23: This data is Required!");

            spbla07f23.requestFocus();
            return false;
        } else {
            spbla07f23.setError(null);
        }


        if (spbla07m59.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07c), Toast.LENGTH_SHORT).show();
            spbla07m59.setError("This data is Required!");
            Log.i(TAG, "spbla07m59: This data is Required!");

            spbla07m59.requestFocus();
            return false;
        } else {
            spbla07m59.setError(null);
        }

        if (spbla07f59.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07c), Toast.LENGTH_SHORT).show();
            spbla07f59.setError("This data is Required!");
            Log.i(TAG, "spbla07f59: This data is Required!");

            spbla07f59.requestFocus();
            return false;
        } else {
            spbla07f59.setError(null);
        }

        if (spbla06a1.isChecked() && Integer.valueOf(spbla07pw.getText().toString()) < 1) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07pw), Toast.LENGTH_SHORT).show();
            spbla07pw.setError("Can not be zero..!");
            Log.i(TAG, "spbla07pw: Can not be zero..!");

            spbla07pw.requestFocus();
            return false;
        } else {
            spbla07pw.setError(null);
        }

        if (spbla06a2.isChecked() && Integer.valueOf(spbla07lw.getText().toString()) < 1) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07lw), Toast.LENGTH_SHORT).show();
            spbla07lw.setError("Can not be zero..!");
            Log.i(TAG, "spbla07lw: Can not be zero..!");

            spbla07lw.requestFocus();
            return false;
        } else {
            spbla07lw.setError(null);
        }

        int sum23M = Integer.valueOf(spbla07m23.getText().toString()) + Integer.valueOf(spbla07f23.getText().toString());
        if (spbla06b1.isChecked() && sum23M < 1) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07b), Toast.LENGTH_SHORT).show();
            spbla07m23.setError("Can not be zero..!");
            spbla07f23.setError("Can not be zero..!");
            Log.i(TAG, "spbla07b: Can not be zero..!");

            spbla07m23.requestFocus();
            return false;
        } else {
            spbla07m23.setError(null);
            spbla07f23.setError(null);

        }

        int sum59M = Integer.valueOf(spbla07m59.getText().toString()) + Integer.valueOf(spbla07f59.getText().toString());

        if (spbla06b2.isChecked() && sum59M < 1) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07c), Toast.LENGTH_SHORT).show();
            spbla07m59.setError("Can not be zero..!");
            spbla07f59.setError("Can not be zero..!");
            Log.i(TAG, "spbla07c: Can not be zero..!");

            spbla07m59.requestFocus();
            return false;
        } else {
            spbla07m59.setError(null);
            spbla07f59.setError(null);
        }

        if (Integer.valueOf(spbla07t.getText().toString()) < (Integer.valueOf(spbla07pw.getText().toString())
                + Integer.valueOf(spbla07lw.getText().toString()) + Integer.valueOf(spbla07mw.getText().toString())
                + Integer.valueOf(spbla07m6.getText().toString()) + Integer.valueOf(spbla07f6.getText().toString())
                + Integer.valueOf(spbla07m23.getText().toString()) + Integer.valueOf(spbla07f23.getText().toString())
                + Integer.valueOf(spbla07m59.getText().toString()) + Integer.valueOf(spbla07f59.getText().toString()))) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07t), Toast.LENGTH_SHORT).show();
            spbla07t.setError("Can not be greater than total members..!");
            Log.i(TAG, "spbla07: Can not be zero..!");

            spbla07t.requestFocus();
            return false;
        } else {
            spbla07t.setError(null);
        }


        if (spbla08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla08), Toast.LENGTH_SHORT).show();
            spbla08a.setError("This data is Required!");
            Log.i(TAG, "spbla08: This data is Required!");
            spbla08a.setFocusable(true);
            spbla08a.setFocusableInTouchMode(true);
            spbla08a.requestFocus();
            return false;
        } else {
            spbla08a.setError(null);
        }


        return true;
    }


}

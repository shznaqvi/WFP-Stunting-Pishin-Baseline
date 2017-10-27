package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
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
    @BindView(R.id.spblm01i)
    RadioGroup spblm01i;
    @BindView(R.id.spblm01i88)
    RadioButton spblm01i88;
    @BindView(R.id.spblm01i00)
    RadioButton spblm01i00;
    @BindView(R.id.spblm01i88x)
    EditText spblm01i88x;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
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
        }
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
        sM.put("spblm01", spblm01i88.isChecked() ? "88" : spblm01i00.isChecked() ? "00" : "0");
        sM.put("spblm01i88x", spblm01i88x.getText().toString());

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

        return true;
    }
}


package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionBActivity extends Activity {

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


                } else {
                    spblb06a.setEnabled(true);

                }
            }
        });




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

        Intent secNext = new Intent(this, SectionCActivity.class);
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

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);


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



//        MainApp.ims.setsI(String.valueOf(sI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

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


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }










}


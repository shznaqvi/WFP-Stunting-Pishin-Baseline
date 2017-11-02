package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionFActivity extends Activity {
    private static final String TAG = SectionFActivity.class.getName();


    @BindView(R.id.spblf01a)
    EditText spblf01a;
    @BindView(R.id.spblf01b)
    EditText spblf01b;
    @BindView(R.id.spblf01c)
    EditText spblf01c;
    @BindView(R.id.spblf01d)
    EditText spblf01d;
    @BindView(R.id.spblf01e)
    EditText spblf01e;
    @BindView(R.id.spblf01f)
    EditText spblf01f;
    @BindView(R.id.spblf01g)
    EditText spblf01g;
    @BindView(R.id.spblf01h)
    EditText spblf01h;
    @BindView(R.id.spblf01i)
    EditText spblf01i;
    @BindView(R.id.spblf01j)
    EditText spblf01j;
    @BindView(R.id.spblf01k)
    EditText spblf01k;
    @BindView(R.id.spblf01l)
    EditText spblf01l;
    @BindView(R.id.spblf01m)
    EditText spblf01m;
    @BindView(R.id.spblf02a)
    EditText spblf02a;
    @BindView(R.id.spblf02b)
    EditText spblf02b;
    @BindView(R.id.spblf02c)
    EditText spblf02c;
    @BindView(R.id.spblf02d)
    EditText spblf02d;
    @BindView(R.id.spblf02e)
    EditText spblf02e;
    @BindView(R.id.spblf02f)
    EditText spblf02f;
    @BindView(R.id.spblf02g)
    EditText spblf02g;
    @BindView(R.id.spblf02h)
    EditText spblf02h;
    @BindView(R.id.spblf02i)
    EditText spblf02i;
    @BindView(R.id.spblf02j)
    EditText spblf02j;
    @BindView(R.id.spblf02k)
    EditText spblf02k;
    @BindView(R.id.spblf02l)
    EditText spblf02l;
    @BindView(R.id.spblf03)
    EditText spblf03;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

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

                Intent secNext = new Intent(this, SectionGActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

        Intent secNext = new Intent(this, SectionGActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);

    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
    }


    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSF();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }



    }


    private boolean ValidateForm() {


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


        return true;
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHE = new JSONObject();

        sHE.put("spblf01a", spblf01a.getText().toString());
        sHE.put("spblf01b", spblf01b.getText().toString());
        sHE.put("spblf01c", spblf01c.getText().toString());
        sHE.put("spblf01d", spblf01d.getText().toString());
        sHE.put("spblf01e", spblf01e.getText().toString());
        sHE.put("spblf01f", spblf01f.getText().toString());
        sHE.put("spblf01g", spblf01g.getText().toString());
        sHE.put("spblf01h", spblf01h.getText().toString());
        sHE.put("spblf01i", spblf01i.getText().toString());
        sHE.put("spblf01j", spblf01j.getText().toString());
        sHE.put("spblf01k", spblf01k.getText().toString());
        sHE.put("spblf01l", spblf01l.getText().toString());
        sHE.put("spblf01m", spblf01m.getText().toString());


        sHE.put("spblf02a", spblf02a.getText().toString());
        sHE.put("spblf02b", spblf02b.getText().toString());
        sHE.put("spblf02c", spblf02c.getText().toString());
        sHE.put("spblf02d", spblf02d.getText().toString());
        sHE.put("spblf02e", spblf02e.getText().toString());
        sHE.put("spblf02f", spblf02f.getText().toString());
        sHE.put("spblf02g", spblf02g.getText().toString());
        sHE.put("spblf02h", spblf02h.getText().toString());
        sHE.put("spblf02i", spblf02i.getText().toString());
        sHE.put("spblf02j", spblf02j.getText().toString());
        sHE.put("spblf02k", spblf02k.getText().toString());


        sHE.put("spblf03", spblf03.getText().toString());


        MainApp.fc.setsF(String.valueOf(sHE));

    }

}
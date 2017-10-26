package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionNActivity extends Activity {

    @BindView(R.id.spbln01)
    Spinner spbln01;
    @BindView(R.id.spbln02)
    EditText spbln02;
    @BindView(R.id.spbln03)
    EditText spbln03;
    @BindView(R.id.spblj0401a)
    Spinner spblj0401a;
    @BindView(R.id.spblj0401b)
    EditText spblj0401b;
    @BindView(R.id.spblj0402a)
    Spinner spblj0402a;
    @BindView(R.id.spblj0402b)
    EditText spblj0402b;
    @BindView(R.id.spblj0501a)
    Spinner spblj0501a;
    @BindView(R.id.spblj0501b)
    EditText spblj0501b;
    @BindView(R.id.spblj0502a)
    Spinner spblj0502a;
    @BindView(R.id.spblj0502b)
    EditText spblj0502b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_n);
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
                startActivity(new Intent(this, SectionOActivity.class));
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

        JSONObject sN = new JSONObject();

//        01
        sN.put("spbln01",spbln01.getSelectedItem().toString());

//        02
        sN.put("spbln02", spbln02.getText().toString());

//        03
        sN.put("spbln03", spbln03.getText().toString());

//        0401a
        sN.put("spblj0401a",spblj0401a.getSelectedItem().toString());

//        0401b
        sN.put("spblj0401b", spblj0401b.getText().toString());

//        0402a
        sN.put("spblj0402a",spblj0402a.getSelectedItem().toString());

//        0402b
        sN.put("spblj0402b", spblj0402b.getText().toString());

//        0501a
        sN.put("spblj0501a",spblj0501a.getSelectedItem().toString());

//        0501b
        sN.put("spblj0501b", spblj0501b.getText().toString());

//        0502a
        sN.put("spblj0502a",spblj0502a.getSelectedItem().toString());

//        0502b
        sN.put("spblj0502b", spblj0502b.getText().toString());

//        MainApp.fc.setsN(String.valueOf(sN));
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        /*int updcount = db.updateSN();

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


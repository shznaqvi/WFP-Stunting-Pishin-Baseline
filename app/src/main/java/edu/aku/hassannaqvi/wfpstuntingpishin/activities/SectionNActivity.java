package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
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
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionNActivity extends Activity {

    private static final String TAG = SectionNActivity.class.getSimpleName();

    @BindView(R.id.spbln01)
    TextView spbln01;
    @BindView(R.id.spbln02)
    EditText spbln02;
    @BindView(R.id.spbln03)
    EditText spbln03;
    @BindView(R.id.spbln0401a)
    Spinner spbln0401a;
    @BindView(R.id.spbln0401b)
    EditText spbln0401b;
    @BindView(R.id.spbln0402a)
    Spinner spbln0402a;
    @BindView(R.id.spbln0402b)
    EditText spbln0402b;
    @BindView(R.id.spbln0501a)
    Spinner spbln0501a;
    @BindView(R.id.spbln0501b)
    EditText spbln0501b;
    @BindView(R.id.spbln0502a)
    Spinner spbln0502a;
    @BindView(R.id.spbln0502b)
    EditText spbln0502b;

    @BindViews({R.id.spbln0401a,R.id.spbln0402a,R.id.spbln0501a,R.id.spbln0502a})
    List<Spinner> spbln045;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_n);
        ButterKnife.bind(this);

        spbln01.setText(getIntent().getStringExtra("getName"));

        String[] users = {"....",MainApp.userName,MainApp.userName2};

        for (Spinner spin : spbln045){
            spin.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item, Arrays.asList(users)));
        }

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
        sN.put("spbln01", spbln01.getText().toString());

//        02
        sN.put("spbln02", spbln02.getText().toString());

//        03
        sN.put("spbln03", spbln03.getText().toString());

//        0401a
        sN.put("spblj0401a", spbln0401a.getSelectedItem().toString());

//        0401b
        sN.put("spbln0401b", spbln0401b.getText().toString());

//        0402a
        sN.put("spblj0402a", spbln0402a.getSelectedItem().toString());

//        0402b
        sN.put("spbln0402b", spbln0402b.getText().toString());

//        0501a
        sN.put("spblj0501a", spbln0501a.getSelectedItem().toString());

//        0501b
        sN.put("spbln0501b", spbln0501b.getText().toString());

//        0502a
        sN.put("spblj0502a", spbln0502a.getSelectedItem().toString());

//        0502b
        sN.put("spbln0502b", spbln0502b.getText().toString());

        MainApp.fc.setsN(String.valueOf(sN));
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSN();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();


        /*if (spbln01.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbln01), Toast.LENGTH_SHORT).show();
            ((TextView) spbln01.getSelectedView()).setText("This Data is Required");
            ((TextView) spbln01.getSelectedView()).setTextColor(Color.RED);
            spblk01.requestFocus();
            Log.i(TAG, "spbln01: This Data is Required!");
            return false;
        } else {
            ((TextView) spbln01.getSelectedView()).setError(null);
        }
*/

        if (spbln03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbln03), Toast.LENGTH_SHORT).show();
            spbln03.setError("This data is Required!");
            Log.i(TAG, "spbln03: This data is Required!");
            spbln03.requestFocus();
            return false;
        } else {
            spbln03.setError(null);
        }

        if (Double.valueOf(spbln03.getText().toString()) < 4.0 || Double.valueOf(spbln03.getText().toString()) > 18.0) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spbln03), Toast.LENGTH_SHORT).show();
            spbln03.setError("Range is 4.0 to 20.0");
            Log.i(TAG, "spbln03: Range is 4.0 to 20.0");
            return false;
        } else {
            spbln03.setError(null);
        }

        if (spbln0401a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spbln0401a.getSelectedView()).setText("This Data is Required");
            ((TextView) spbln0401a.getSelectedView()).setTextColor(Color.RED);
            spbln0401a.requestFocus();
            Log.i(TAG, "spbln0401a: This Data is Required!");
            return false;
        } else {
            ((TextView) spbln0401a.getSelectedView()).setError(null);
        }

        if (spbln0401b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
            spbln0401b.setError("This data is Required!");
            Log.i(TAG, "spblj0201b: This data is Required!");
            spbln0401b.requestFocus();
            return false;
        } else {
            spbln0401b.setError(null);
            if (!spbln0401b.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
                spbln0401b.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "spbln0401b: Invalid Decimal value is Required!");
                return false;
            } else {
                spbln0401b.setError(null);
                if (Double.parseDouble(spbln0401b.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
                    spbln0401b.setError("Invalid: Greater then 0");
                    Log.i(TAG, "spbln0401b: Invalid Greater then 0");
                    return false;
                } else {
                    spbln0401b.setError(null);
                    if (Double.parseDouble(spbln0401b.getText().toString()) < 20 || Double.parseDouble(spbln0401b.getText().toString()) > 120) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
                        spbln0401b.setError("Invalid: Range between 20-120");
                        Log.i(TAG, "spbln0401b: Invalid Range between 20-120");
                        return false;
                    } else {
                        spbln0401b.setError(null);
                    }
                }
            }

        }

        if (spbln0402a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spbln0402a.getSelectedView()).setText("This Data is Required");
            ((TextView) spbln0402a.getSelectedView()).setTextColor(Color.RED);
            spbln0402a.requestFocus();
            Log.i(TAG, "spbln0402a: This Data is Required!");
            return false;
        } else {
            ((TextView) spbln0402a.getSelectedView()).setError(null);
        }

        if (spbln0402b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
            spbln0402b.setError("This data is Required!");
            Log.i(TAG, "spbln0402b: This data is Required!");
            spbln0402b.requestFocus();
            return false;
        } else {
            spbln0402b.setError(null);
            if (!spbln0402b.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
                spbln0402b.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "spbln0402b: Invalid Decimal value is Required!");
                return false;
            } else {
                spbln0402b.setError(null);
                if (Double.parseDouble(spbln0402b.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
                    spbln0402b.setError("Invalid: Greater then 0");
                    Log.i(TAG, "spbln0402b: Invalid Greater then 0");
                    return false;
                } else {
                    spbln0402b.setError(null);
                    if (Double.parseDouble(spbln0402b.getText().toString()) < 20 || Double.parseDouble(spbln0402b.getText().toString()) > 120) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj04), Toast.LENGTH_SHORT).show();
                        spbln0402b.setError("Invalid: Range between 20-120");
                        Log.i(TAG, "spbln0402b: Invalid Range between 20-120");
                        return false;
                    } else {
                        spbln0402b.setError(null);
                    }
                }
            }
        }


        if (spbln0501a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spbln0501a.getSelectedView()).setText("This Data is Required");
            ((TextView) spbln0501a.getSelectedView()).setTextColor(Color.RED);
            spbln0501a.requestFocus();
            Log.i(TAG, "spblj0301a: This Data is Required!");
            return false;
        } else {
            ((TextView) spbln0501a.getSelectedView()).setError(null);
        }

        if (spbln0501b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
            spbln0501b.setError("This data is Required!");
            Log.i(TAG, "spbln0501b: This data is Required!");
            spbln0501b.requestFocus();
            return false;
        } else {
            spbln0501b.setError(null);
            if (!spbln0501b.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
                spbln0501b.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "spbln0501b: Invalid Decimal value is Required!");
                return false;
            } else {
                spbln0501b.setError(null);
                if (Double.parseDouble(spbln0501b.getText().toString()) < 0.9 || Double.parseDouble(spbln0501b.getText().toString()) > 80.0) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
                    spbln0501b.setError("Invalid: Range between 0.9-80.0");
                    Log.i(TAG, "spbln0501b: Invalid Range between 0.9-80.0");
                    return false;
                } else {
                    spbln0501b.setError(null);
                }
            }
        }


        if (spbln0502a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblj0401), Toast.LENGTH_SHORT).show();
            ((TextView) spbln0502a.getSelectedView()).setText("This Data is Required");
            ((TextView) spbln0502a.getSelectedView()).setTextColor(Color.RED);
            spbln0502a.requestFocus();
            Log.i(TAG, "spbln0502a: This Data is Required!");
            return false;
        } else {
            ((TextView) spbln0502a.getSelectedView()).setError(null);
        }

        if (spbln0502b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
            spbln0502b.setError("This data is Required!");
            Log.i(TAG, "spbln0502b: This data is Required!");
            spbln0502b.requestFocus();
            return false;
        } else {
            spbln0502b.setError(null);
            if (!spbln0502b.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
                spbln0502b.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "spbln0502b: Invalid Decimal value is Required!");
                return false;
            } else {
                spbln0502b.setError(null);
                if (Double.parseDouble(spbln0502b.getText().toString()) < 0.9 || Double.parseDouble(spbln0502b.getText().toString()) > 80.0) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.spblj05), Toast.LENGTH_SHORT).show();
                    spbln0502b.setError("Invalid: Range between 0.9-80.0");
                    Log.i(TAG, "spbln0502b: Invalid Range between 0.9-80.0");
                    return false;
                } else {
                    spbln0502b.setError(null);
                }
            }
        }

        return true;
    }
}


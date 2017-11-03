package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionEActivity extends Activity {

    private static final String TAG = SectionEActivity.class.getName();

    @BindView(R.id.spble01a)
    Spinner spble01a;
    @BindView(R.id.spble01a88x)
    EditText spble01a88x;
    @BindView(R.id.spble01b)
    Spinner spble01b;
    @BindView(R.id.spble01b88x)
    EditText spble01b88x;
    @BindView(R.id.spble01c)
    Spinner spble01c;
    @BindView(R.id.spble01c88x)
    EditText spble01c88x;
    @BindView(R.id.spble02)
    EditText spble02;

    @BindView(R.id.spble0299)
    CheckBox spble0299;

    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    Map<String, Integer> lstMap;
    ArrayList<String> arrlst1;
    ArrayList<String> arrlst2;
    ArrayList<String> arrlst3;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);


        arrlst1 = new ArrayList<>();

        final String[] items = {"", "زراعت", "مال مویشی پالنا اور فروخت کرنا",
                "مچھلی کا کاروبار",
                "ہاتھ سے بننے والی اشیاٗ کی فروخت",
                "لکڑیوں کی فروخت",
                "کوئلے کا فروخت",
                "مزدوری زرعی زمینوں پر",
                "مزدوری",
                "گلی میں چیزیں فروخت کرنا",
                "کاروبار /دکان/تجارت",
                "سرکاری /گورنمنٹ کی نوکری",
                "پرائیویٹ نوکری",
                "دیگر وضاحت کریں"};

        lstMap = new HashMap<>();

        arrlst1.add("....");
        for (int i = 1; i < items.length; i++) {
            arrlst1.add(items[i]);
            lstMap.put(items[i], i);
        }

        spble01a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrlst1));

        spble01a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {

                //Other Txt
                if (spble01a.getSelectedItemPosition() == 13) {
                    spble01a88x.setVisibility(View.VISIBLE);
                } else {
                    spble01a88x.setText(null);
                    spble01a88x.setVisibility(View.GONE);
                }

                arrlst2 = new ArrayList<>();
                arrlst2.add("....");

                position = pos;

                if (spble01a.getSelectedItemPosition() != 0) {
                    for (int i = 1; i < items.length; i++) {
                        if (i != pos) {
                            arrlst2.add(items[i]);
                        }
                    }

                    Toast.makeText(getApplicationContext(), lstMap.get(spble01a.getSelectedItem().toString()).toString(), Toast.LENGTH_SHORT).show();

                }

                spble01b88x.setVisibility(View.GONE);
                spble01c88x.setVisibility(View.GONE);

                spble01b.setAdapter(new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, arrlst2));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spble01b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                if (spble01b.getSelectedItemPosition() == arrlst2.size() - 1) {
                    if (spble01b.getSelectedItemPosition() != 0) {
                        spble01b88x.setVisibility(View.VISIBLE);
                    }
                } else {
                    spble01b88x.setText(null);
                    spble01b88x.setVisibility(View.GONE);
                }

                arrlst3 = new ArrayList<>();
                arrlst3.add("....");

                if (spble01b.getSelectedItemPosition() != 0) {
                    for (int i = 1; i < items.length; i++) {
                        if (i != position) {
                            arrlst3.add(items[i]);
                        }
                    }

                    for (int j = 1; j < arrlst3.size(); j++) {
                        if (items[j].contains(items[pos])) {
                            arrlst3.remove(j);
                            break;
                        }
                    }

                    Toast.makeText(getApplicationContext(), lstMap.get(spble01b.getSelectedItem().toString()).toString(), Toast.LENGTH_SHORT).show();
                }
                spble01c.setAdapter(new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, arrlst3));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spble01c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spble01c.getSelectedItemPosition() == arrlst3.size() - 1) {
                    if (spble01c.getSelectedItemPosition() != 0) {
                        spble01c88x.setVisibility(View.VISIBLE);
                    }
                } else {
                    spble01c88x.setText(null);
                    spble01c88x.setVisibility(View.GONE);
                }

                if (spble01c.getSelectedItemPosition() != 0) {
                    Toast.makeText(getApplicationContext(), lstMap.get(spble01c.getSelectedItem().toString()).toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spble0299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (spble0299.isChecked()) {
                    spble02.setText(null);
                    spble02.setVisibility(View.GONE);
                } else {
                    spble02.setVisibility(View.VISIBLE);
                }
            }
        });


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

            Intent secNext = new Intent(this, SectionFActivity.class);
            secNext.putExtra("check", false);
            startActivity(secNext);
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

        int updcount = db.updateSE();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }


    private boolean ValidateForm() {

        //        spble01a
        if (spble01a.getSelectedItem().toString() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01), Toast.LENGTH_SHORT).show();
            ((TextView) spble01a.getSelectedView()).setText("This Data is Required");
            ((TextView) spble01a.getSelectedView()).setTextColor(Color.RED);
            Log.i(TAG, "spble01a: This Data is Required!");
            //spble01a.requestFocus();
            return false;
        } else {
            ((TextView) spble01a.getSelectedView()).setError(null);
        }


        if (spble01a.getSelectedItemPosition() == 13) {

            //        spble01a88x
            if (spble01a88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                spble01a88x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "spble01a88x: This data is Required!");
                spble01a88x.requestFocus();
                return false;
            } else {
                spble01a88x.setError(null);
            }

        }

        //        spble01b
        if (spble01b.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01b), Toast.LENGTH_SHORT).show();
            ((TextView) spble01b.getSelectedView()).setText("This Data is Required");
            ((TextView) spble01b.getSelectedView()).setTextColor(Color.RED);
            spble01b.requestFocus();
            Log.i(TAG, "spble01b: This Data is Required!");
            return false;
        } else {
            ((TextView) spble01b.getSelectedView()).setError(null);
        }


        if (spble01b.getSelectedItemPosition() == 13) {

            //        spble01b88x
            if (spble01b88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                spble01b88x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "spble01b88x: This data is Required!");
                spble01b88x.requestFocus();
                return false;
            } else {
                spble01b88x.setError(null);
            }

        }

        //        spble01c
        if (spble01c.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01c), Toast.LENGTH_SHORT).show();
            ((TextView) spble01c.getSelectedView()).setText("This Data is Required");
            ((TextView) spble01c.getSelectedView()).setTextColor(Color.RED);
            spble01c.requestFocus();
            Log.i(TAG, "spble01c: This Data is Required!");
            return false;
        } else {
            ((TextView) spble01c.getSelectedView()).setError(null);
        }


        if (spble01c.getSelectedItemPosition() == 13) {

            //        spble01c88x
            if (spble01c88x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                spble01c88x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "spble01c88x: This data is Required!");
                spble01c88x.requestFocus();
                return false;
            } else {
                spble01c88x.setError(null);
            }

        }


        if (!spble0299.isChecked()) {

            //        spble02
            if (spble02.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spble02), Toast.LENGTH_SHORT).show();
                spble02.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "spble02: This data is Required!");
                spble02.requestFocus();
                return false;
            } else {
                spble02.setError(null);
            }

        }

        /*if (spble01a.getSelectedItemPosition() == spble01b.getSelectedItemPosition()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01), Toast.LENGTH_SHORT).show();
            ((TextView) spble01b.getSelectedView()).setText("You cannot have two choices similar");
            ((TextView) spble01b.getSelectedView()).setTextColor(Color.RED);
            spble01b.requestFocus();
            Log.i(TAG, "spble01b: This Data is Required!");
            return false;
        }


        if (spble01a.getSelectedItemPosition() == spble01c.getSelectedItemPosition()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01), Toast.LENGTH_SHORT).show();
            ((TextView) spble01c.getSelectedView()).setText("You cannot have two choices similar");
            ((TextView) spble01c.getSelectedView()).setTextColor(Color.RED);
            spble01c.requestFocus();
            Log.i(TAG, "spble01c: This Data is Required!");
            return false;
        }*/

        return true;
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHE = new JSONObject();

        sHE.put("spble01a", lstMap.get(spble01a.getSelectedItem().toString()));
        sHE.put("spble01a88x", spble01a88x.getText().toString());

        sHE.put("spble01b", lstMap.get(spble01b.getSelectedItem().toString()));
        sHE.put("spble01b88x", spble01b88x.getText().toString());


        sHE.put("spble01c", lstMap.get(spble01c.getSelectedItem().toString()));
        sHE.put("spble01c88x", spble01c88x.getText().toString());


        if (spble0299.isChecked()) {
            sHE.put("spble02", "");
        } else {
            sHE.put("spble02", spble02.getText().toString());
        }

        //sHE.put("appver", MainApp.versionName + "." + MainApp.versionCode);

        MainApp.fc.setsE(String.valueOf(sHE));

    }
}
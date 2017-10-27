package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);


        ArrayList<String> arrlst = new ArrayList<>();

        arrlst.add(0, "....");
        arrlst.add(1, "زراعت");
        arrlst.add(2, "مال مویشی پالنا اور فروخت کرنا");
        arrlst.add(3, "مچھلی کا کاروبار");
        arrlst.add(4, "ہاتھ سے بننے والی اشیاٗ کی فروخت");
        arrlst.add(5, "لکڑیوں کی فروخت");
        arrlst.add(6, "کوئلے کا فروخت");
        arrlst.add(7, "مزدوری زرعی زمینوں پر");
        arrlst.add(8, "مزدوری");
        arrlst.add(9, "گلی میں چیزیں فروخت کرنا");
        arrlst.add(10, "کاروبار /دکان/تجارت");
        arrlst.add(11, "سرکاری /گورنمنٹ کی نوکری");
        arrlst.add(12, "پرائیویٹ نوکری");
        arrlst.add(13, "دیگر وضاحت کریں");



        spble01a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrlst));

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
        }

        Intent secNext = new Intent(this, SectionFActivity.class);
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

        /*int updcount = db.updateSHE();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
*/

        return true;
    }


    private boolean ValidateForm() {

        //        spble01a
        if (spble01a.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01a), Toast.LENGTH_SHORT).show();
            ((TextView) spble01a.getSelectedView()).setText("This Data is Required");
            ((TextView) spble01a.getSelectedView()).setTextColor(Color.RED);
            spble01a.requestFocus();
            Log.i(TAG, "spble01a: This Data is Required!");
            return false;
        } else {
            ((TextView) spble01a.getSelectedView()).setError(null);
        }


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


        /*//        spble01b
        if (spble01b.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01b), Toast.LENGTH_SHORT).show();
            ((TextView) spble01b.getSelectedView()).setText("This Data is Required");
            ((TextView) spble01b.getSelectedView()).setTextColor(Color.RED);
            spble01b.requestFocus();
            Log.i(TAG, "spble01b: This Data is Required!");
            return false;
        } else {
            ((TextView) spble01b.getSelectedView()).setError(null);
        }*/


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


        /*//        spble01c
        if (spble01c.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spble01c), Toast.LENGTH_SHORT).show();
            ((TextView) spble01c.getSelectedView()).setText("This Data is Required");
            ((TextView) spble01c.getSelectedView()).setTextColor(Color.RED);
            spble01c.requestFocus();
            Log.i(TAG, "spble01c: This Data is Required!");
            return false;
        } else {
            ((TextView) spble01c.getSelectedView()).setError(null);
        }*/


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


        return true;
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHE = new JSONObject();

        sHE.put("spble01a", spble01a.getSelectedItem().toString());
        sHE.put("spble01a88x", spble01a88x.getText().toString());

        sHE.put("spble01b", spble01b.getSelectedItem().toString());
        sHE.put("spble01b88x", spble01b88x.getText().toString());


        sHE.put("spble01c", spble01c.getSelectedItem().toString());
        sHE.put("spble01c88x", spble01c88x.getText().toString());

        sHE.put("spble02", spble02.getText().toString());

        //sHE.put("appver", MainApp.versionName + "." + MainApp.versionCode);

        //MainApp.fc.setsHE(String.valueOf(sHE));

    }
}
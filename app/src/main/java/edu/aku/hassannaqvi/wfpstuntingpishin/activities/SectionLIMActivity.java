package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;

public class SectionLIMActivity extends Activity
{

    private static final String TAG = SectionLIMActivity.class.getSimpleName();

    @BindView(R.id.spblName)
    Spinner spblName;
    @BindView(R.id.scbirth)
    NestedScrollView scbirth;
    @BindView(R.id.sc1)
    NestedScrollView sc1;
    @BindView(R.id.fldGrpBcgM)
    LinearLayout fldGrpBcgM;
    @BindView(R.id.bcgM)
    RadioGroup bcgM;
    @BindView(R.id.bcgM01)
    RadioButton bcgM01;
    @BindView(R.id.bcgM02)
    RadioButton bcgM02;
    @BindView(R.id.fldGrpBcgC)
    LinearLayout fldGrpBcgC;
    @BindView(R.id.bcgC)
    RadioGroup bcgC;
    @BindView(R.id.bcgC01)
    RadioButton bcgC01;
    @BindView(R.id.bcgC02)
    RadioButton bcgC02;
    @BindView(R.id.sc2)
    NestedScrollView sc2;
    @BindView(R.id.fldGrpOpv0M)
    LinearLayout fldGrpOpv0M;
    @BindView(R.id.opv0M)
    RadioGroup opv0M;
    @BindView(R.id.opv0M01)
    RadioButton opv0M01;
    @BindView(R.id.opv0M02)
    RadioButton opv0M02;
    @BindView(R.id.fldGrpopv0C)
    LinearLayout fldGrpopv0C;
    @BindView(R.id.opv0C)
    RadioGroup opv0C;
    @BindView(R.id.opv0C01)
    RadioButton opv0C01;
    @BindView(R.id.opv0C02)
    RadioButton opv0C02;
    @BindView(R.id.sc6wks)
    NestedScrollView sc6wks;
    @BindView(R.id.sc3)
    NestedScrollView sc3;
    @BindView(R.id.fldGrpopv1M)
    LinearLayout fldGrpopv1M;
    @BindView(R.id.opv1M)
    RadioGroup opv1M;
    @BindView(R.id.opv1M01)
    RadioButton opv1M01;
    @BindView(R.id.opv1M02)
    RadioButton opv1M02;
    @BindView(R.id.fldGrpopv1C)
    LinearLayout fldGrpopv1C;
    @BindView(R.id.opv1C)
    RadioGroup opv1C;
    @BindView(R.id.opv1C01)
    RadioButton opv1C01;
    @BindView(R.id.opv1C02)
    RadioButton opv1C02;
    @BindView(R.id.sc4)
    NestedScrollView sc4;
    @BindView(R.id.fldGrpPenta1M)
    LinearLayout fldGrpPenta1M;
    @BindView(R.id.penta1M)
    RadioGroup penta1M;
    @BindView(R.id.penta1M01)
    RadioButton penta1M01;
    @BindView(R.id.Penta1M02)
    RadioButton penta1M02;
    @BindView(R.id.fldGrpPenta1C)
    LinearLayout fldGrpPenta1C;
    @BindView(R.id.penta1C)
    RadioGroup penta1C;
    @BindView(R.id.penta1C01)
    RadioButton penta1C01;
    @BindView(R.id.penta1C02)
    RadioButton penta1C02;
    @BindView(R.id.sc5)
    NestedScrollView sc5;
    @BindView(R.id.fldGrppneumo1M)
    LinearLayout fldGrppneumo1M;
    @BindView(R.id.pneumo1M)
    RadioGroup pneumo1M;
    @BindView(R.id.pneumo1M01)
    RadioButton pneumo1M01;
    @BindView(R.id.pneumo1M02)
    RadioButton pneumo1M02;
    @BindView(R.id.fldGrppneumo1C)
    LinearLayout fldGrppneumo1C;
    @BindView(R.id.pneumo1C)
    RadioGroup pneumo1C;
    @BindView(R.id.pneumo1C01)
    RadioButton pneumo1C01;
    @BindView(R.id.pneumo1C02)
    RadioButton pneumo1C02;
    @BindView(R.id.sc10wks)
    NestedScrollView sc10wks;
    @BindView(R.id.sc6)
    NestedScrollView sc6;
    @BindView(R.id.fldGrpopv2M)
    LinearLayout fldGrpopv2M;
    @BindView(R.id.opv2M)
    RadioGroup opv2M;
    @BindView(R.id.opv2M01)
    RadioButton opv2M01;
    @BindView(R.id.opv2M02)
    RadioButton opv2M02;
    @BindView(R.id.fldGrpopv2C)
    LinearLayout fldGrpopv2C;
    @BindView(R.id.opv2C)
    RadioGroup opv2C;
    @BindView(R.id.opv2C01)
    RadioButton opv2C01;
    @BindView(R.id.opv2C02)
    RadioButton opv2C02;
    @BindView(R.id.sc7)
    NestedScrollView sc7;
    @BindView(R.id.fldGrppenta2M)
    LinearLayout fldGrppenta2M;
    @BindView(R.id.penta2M)
    RadioGroup penta2M;
    @BindView(R.id.penta2M01)
    RadioButton penta2M01;
    @BindView(R.id.penta2M02)
    RadioButton penta2M02;
    @BindView(R.id.fldGrppenta2C)
    LinearLayout fldGrppenta2C;
    @BindView(R.id.penta2C)
    RadioGroup penta2C;
    @BindView(R.id.penta2C01)
    RadioButton penta2C01;
    @BindView(R.id.penta2C02)
    RadioButton penta2C02;
    @BindView(R.id.sc8)
    NestedScrollView sc8;
    @BindView(R.id.fldGrppneumo2M)
    LinearLayout fldGrppneumo2M;
    @BindView(R.id.pneumo2M)
    RadioGroup pneumo2M;
    @BindView(R.id.pneumo2M01)
    RadioButton pneumo2M01;
    @BindView(R.id.pneumo2M02)
    RadioButton pneumo2M02;
    @BindView(R.id.fldGrppneumo2C)
    LinearLayout fldGrppneumo2C;
    @BindView(R.id.pneumo2C)
    RadioGroup pneumo2C;
    @BindView(R.id.pneumo2C01)
    RadioButton pneumo2C01;
    @BindView(R.id.pneumo2C02)
    RadioButton pneumo2C02;
    @BindView(R.id.sc14wks)
    NestedScrollView sc14wks;
    @BindView(R.id.sc9)
    NestedScrollView sc9;
    @BindView(R.id.fldGrpopv3M)
    LinearLayout fldGrpopv3M;
    @BindView(R.id.opv3M)
    RadioGroup opv3M;
    @BindView(R.id.opv3M01)
    RadioButton opv3M01;
    @BindView(R.id.opv3M02)
    RadioButton opv3M02;
    @BindView(R.id.fldGrpopv3C)
    LinearLayout fldGrpopv3C;
    @BindView(R.id.opv3C)
    RadioGroup opv3C;
    @BindView(R.id.opv3C01)
    RadioButton opv3C01;
    @BindView(R.id.opv3C02)
    RadioButton opv3C02;
    @BindView(R.id.sc10)
    NestedScrollView sc10;
    @BindView(R.id.fldGrpPenta3M)
    LinearLayout fldGrpPenta3M;
    @BindView(R.id.penta3M)
    RadioGroup penta3M;
    @BindView(R.id.penta3M01)
    RadioButton penta3M01;
    @BindView(R.id.penta3M02)
    RadioButton penta3M02;
    @BindView(R.id.fldGrpenta3C)
    LinearLayout fldGrpenta3C;
    @BindView(R.id.penta3C)
    RadioGroup penta3C;
    @BindView(R.id.penta3C01)
    RadioButton penta3C01;
    @BindView(R.id.penta3C02)
    RadioButton penta3C02;
    @BindView(R.id.sc11)
    NestedScrollView sc11;
    @BindView(R.id.fldGrppneumo3M)
    LinearLayout fldGrppneumo3M;
    @BindView(R.id.pneumo3M)
    RadioGroup pneumo3M;
    @BindView(R.id.pneumo3M01)
    RadioButton pneumo3M01;
    @BindView(R.id.pneumo3M02)
    RadioButton pneumo3M02;
    @BindView(R.id.fldGrppneumo3C)
    LinearLayout fldGrppneumo3C;
    @BindView(R.id.pneumo3C)
    RadioGroup pneumo3C;
    @BindView(R.id.pneumo3C01)
    RadioButton pneumo3C01;
    @BindView(R.id.pneumo3C02)
    RadioButton pneumo3C02;
    @BindView(R.id.sc12)
    NestedScrollView sc12;
    @BindView(R.id.fldGrpipvM)
    LinearLayout fldGrpipvM;
    @BindView(R.id.ipvM)
    RadioGroup ipvM;
    @BindView(R.id.ipvM01)
    RadioButton ipvM01;
    @BindView(R.id.ipvM02)
    RadioButton ipvM02;
    @BindView(R.id.fldGrpipvC)
    LinearLayout fldGrpipvC;
    @BindView(R.id.ipvC)
    RadioGroup ipvC;
    @BindView(R.id.ipvC01)
    RadioButton ipvC01;
    @BindView(R.id.ipvC02)
    RadioButton ipvC02;
    @BindView(R.id.sc9M)
    NestedScrollView sc9M;
    @BindView(R.id.sc13)
    NestedScrollView sc13;
    @BindView(R.id.fldGrpMeasles1M)
    LinearLayout fldGrpMeasles1M;
    @BindView(R.id.measles1M)
    RadioGroup measles1M;
    @BindView(R.id.measles1M01)
    RadioButton measles1M01;
    @BindView(R.id.measles1M02)
    RadioButton measles1M02;
    @BindView(R.id.fldGrpmeasles1C)
    LinearLayout fldGrpmeasles1C;
    @BindView(R.id.measles1C)
    RadioGroup measles1C;
    @BindView(R.id.measles1C01)
    RadioButton measles1C01;
    @BindView(R.id.measles1C02)
    RadioButton measles1C02;
    @BindView(R.id.sc15M)
    NestedScrollView sc15M;
    @BindView(R.id.sc14)
    NestedScrollView sc14;
    @BindView(R.id.fldGrpMeasles2M)
    LinearLayout fldGrpMeasles2M;
    @BindView(R.id.measles2M)
    RadioGroup measles2M;
    @BindView(R.id.measles2M01)
    RadioButton measles2M01;
    @BindView(R.id.measles2M02)
    RadioButton measles2M02;
    @BindView(R.id.fldGrpmeasles2C)
    LinearLayout fldGrpmeasles2C;
    @BindView(R.id.measles2C)
    RadioGroup measles2C;
    @BindView(R.id.measles2C01)
    RadioButton measles2C01;
    @BindView(R.id.measles2C02)
    RadioButton measles2C02;
    @BindView(R.id.sc15)
    NestedScrollView sc15;
    @BindView(R.id.fldGrpVitaminAM)
    LinearLayout fldGrpVitaminAM;
    @BindView(R.id.vitaminAM)
    RadioGroup vitaminAM;
    @BindView(R.id.vitaminAM01)
    RadioButton vitaminAM01;
    @BindView(R.id.VitaminAM02)
    RadioButton vitaminAM02;
    @BindView(R.id.fldGrpVitaminAC)
    LinearLayout fldGrpVitaminAC;
    @BindView(R.id.vitaminAC)
    RadioGroup vitaminAC;
    @BindView(R.id.vitaminAC01)
    RadioButton vitaminAC01;
    @BindView(R.id.vitaminAC02)
    RadioButton vitaminAC02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l_im);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

    }


    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);


        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        /*MainApp.ims = new SectionIIMContract();

        MainApp.ims.set_UUID(MainApp.fc.getUID());
        MainApp.ims.setFormDate(MainApp.fc.getFormDate());
        MainApp.ims.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.ims.setUser(MainApp.fc.getUser());
        MainApp.ims.setDevicetagID(sharedPref.getString("tagName", null));
*/
        JSONObject sI = new JSONObject();

        /*sI.put("ta01", MainApp.cluster);
        sI.put("ta05h", MainApp.hhno);
        sI.put("ta05u", MainApp.billno);
*/
        //sI.put("tiImsSerial", MainApp.childsMap.get(tiname.getSelectedItem().toString()).getSerialNo());

        sI.put("bcgM", bcgM01.isChecked() ? "1" : bcgM02.isChecked() ? "2" : "0");
        sI.put("bcgC", bcgC01.isChecked() ? "1" : bcgC02.isChecked() ? "2" : "0");
        sI.put("opv0M", opv0M01.isChecked() ? "1" : opv0M02.isChecked() ? "2" : "0");
        sI.put("opv0C", opv0C01.isChecked() ? "1" : opv0C02.isChecked() ? "2" : "0");
        sI.put("penta1M", penta1M01.isChecked() ? "1" : penta1M02.isChecked() ? "2" : "0");
        sI.put("penta1C", penta1C01.isChecked() ? "1" : penta1C02.isChecked() ? "2" : "0");
        sI.put("pneumo1M", pneumo1M01.isChecked() ? "1" : pneumo1M02.isChecked() ? "2" : "0");
        sI.put("pneumo1C", pneumo1C01.isChecked() ? "1" : pneumo1C02.isChecked() ? "2" : "0");
        sI.put("opv1M", opv1M01.isChecked() ? "1" : opv1M02.isChecked() ? "2" : "0");
        sI.put("opv1C", opv1C01.isChecked() ? "1" : opv1C02.isChecked() ? "2" : "0");
        sI.put("penta2M", penta2M01.isChecked() ? "1" : penta2M02.isChecked() ? "2" : "0");
        sI.put("penta2C", penta2C01.isChecked() ? "1" : penta2C02.isChecked() ? "2" : "0");
        sI.put("pneumo2M", pneumo2M01.isChecked() ? "1" : pneumo2M02.isChecked() ? "2" : "0");
        sI.put("pneumo2C", pneumo2C01.isChecked() ? "1" : pneumo2C02.isChecked() ? "2" : "0");

        sI.put("opv2M", opv2M01.isChecked() ? "1" : opv2M02.isChecked() ? "2" : "0");
        sI.put("opv2C", opv2C01.isChecked() ? "1" : opv2C02.isChecked() ? "2" : "0");
        sI.put("penta3M", penta3M01.isChecked() ? "1" : penta3M02.isChecked() ? "2" : "0");
        sI.put("penta3C", penta3C01.isChecked() ? "1" : penta3C02.isChecked() ? "2" : "0");
        sI.put("pneumo3M", pneumo3M01.isChecked() ? "1" : pneumo3M02.isChecked() ? "2" : "0");
        sI.put("pneumo3C", pneumo3C01.isChecked() ? "1" : pneumo3C02.isChecked() ? "2" : "0");
        sI.put("opv3M", opv3M01.isChecked() ? "1" : opv3M02.isChecked() ? "2" : "0");
        sI.put("opv3C", opv3C01.isChecked() ? "1" : opv3C02.isChecked() ? "2" : "0");
        // pneumo 3 at 14 weeks
        sI.put("ipvM", ipvM01.isChecked() ? "1" : ipvM02.isChecked() ? "2" : "0");
        sI.put("ipvC", ipvC01.isChecked() ? "1" : ipvC02.isChecked() ? "2" : "0");

        sI.put("measles1M", measles1M01.isChecked() ? "1" : measles1M02.isChecked() ? "2" : "0");
        sI.put("measles1C", measles1C01.isChecked() ? "1" : measles1C02.isChecked() ? "2" : "0");

        sI.put("measles2M", measles2M01.isChecked() ? "1" : measles2M02.isChecked() ? "2" : "0");
        sI.put("measles2C", measles2C01.isChecked() ? "1" : measles2C02.isChecked() ? "2" : "0");
        sI.put("vitaminAM", vitaminAM01.isChecked() ? "1" : vitaminAM02.isChecked() ? "2" : "0");
        sI.put("vitaminAC", vitaminAC01.isChecked() ? "1" : vitaminAC02.isChecked() ? "2" : "0");

//        MainApp.ims.setsI(String.valueOf(sI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spblName.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblName), Toast.LENGTH_SHORT).show();
            ((TextView) spblName.getSelectedView()).setText("This Data is Required");
            ((TextView) spblName.getSelectedView()).setTextColor(Color.RED);
            spblName.requestFocus();
            Log.i(TAG, "spblname: This Data is Required!");
            return false;
        } else {
            ((TextView) spblName.getSelectedView()).setError(null);
        }


        //============ BCG / Mother ==========
        if (bcgM.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
            bcgM02.setError("This data is Required!");
            Log.i(TAG, "bcgM: This data is Required!");
            bcgM02.setFocusable(true);
            bcgM02.setFocusableInTouchMode(true);
            bcgM02.requestFocus();
            return false;
        } else {
            bcgM02.setError(null);
        }


        //if (ti03a.isChecked()) {
        //============ BCG / Card Present ==========
        if (bcgC.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
            bcgC02.setError("This data is Required!");
            Log.i(TAG, "bcgC: This data is Required!");
            bcgC02.setFocusable(true);
            bcgC02.setFocusableInTouchMode(true);
            bcgC02.requestFocus();

            return false;
        } else {
            bcgC02.setError(null);
        }


//            }


        //============ Polio 0 / Mother ==========
        if (opv0M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
            opv0M02.setError("This data is Required!");
            Log.i(TAG, "opv0M: This data is Required!");
            opv0M02.setFocusable(true);
            opv0M02.setFocusableInTouchMode(true);
            opv0M02.requestFocus();
            return false;
        } else {
            opv0M02.setError(null);
        }


        //if (ti03a.isChecked()) {
        //============ Polio 0 / Card Present ==========
        if (opv0C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
            opv0C02.setError("This data is Required!");
            Log.i(TAG, "opv0C: This data is Required!");
            opv0C02.setFocusable(true);
            opv0C02.setFocusableInTouchMode(true);
            opv0C02.requestFocus();
            return false;
        } else {
            opv0C02.setError(null);
        }


        //============ OPV 1 / Mother ==========
        if (opv1M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
            opv1M02.setError("This data is Required!");
            Log.i(TAG, "opv1M: This data is Required!");
            opv1M02.setFocusable(true);
            opv1M02.setFocusableInTouchMode(true);
            opv1M02.requestFocus();
            return false;
        } else {
            opv1M02.setError(null);
        }

        //============ OPV 1 / Card Present ==========
        if (opv1C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
            opv1C02.setError("This data is Required!");
            Log.i(TAG, "opv1C: This data is Required!");
            opv1C02.setFocusable(true);
            opv1C02.setFocusableInTouchMode(true);
            opv1C02.requestFocus();
            return false;
        } else {
            opv1C02.setError(null);
        }


        //============ Penta 1 / Mother ==========
        if (penta1M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
            penta1M02.setError("This data is Required!");
            Log.i(TAG, "penta1M: This data is Required!");
            penta1M02.setFocusable(true);
            penta1M02.setFocusableInTouchMode(true);
            penta1M02.requestFocus();
            return false;
        } else {
            penta1M02.setError(null);
        }


        //============ Penta 1 / Card Present ==========
        if (penta1C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
            penta1C02.setError("This data is Required!");
            Log.i(TAG, "penta1C: This data is Required!");
            penta1C02.setFocusable(true);
            penta1C02.setFocusableInTouchMode(true);
            penta1C02.requestFocus();
            return false;
        } else {
            penta1C02.setError(null);
        }

        //============ pneumo 1 / Mother ==========
        if (pneumo1M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo1), Toast.LENGTH_SHORT).show();
            pneumo1M02.setError("This data is Required!");
            Log.i(TAG, "pneumo1M: This data is Required!");
            pneumo1M02.setFocusable(true);
            pneumo1M02.setFocusableInTouchMode(true);
            pneumo1M02.requestFocus();
            return false;
        } else {
            pneumo1M02.setError(null);
        }


        //============ pneumo 1 / Card Present ==========
        if (pneumo1C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo1), Toast.LENGTH_SHORT).show();
            pneumo1C02.setError("This data is Required!");
            Log.i(TAG, "pneumo1C: This data is Required!");
            pneumo1C02.setFocusable(true);
            pneumo1C02.setFocusableInTouchMode(true);
            pneumo1C02.requestFocus();
            return false;
        } else {
            pneumo1C02.setError(null);
        }

        //============ OPV 2 / Mother ==========
        if (opv2M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
            opv2M02.setError("This data is Required!");
            Log.i(TAG, "opv2M: This data is Required!");
            opv2M02.setFocusable(true);
            opv2M02.setFocusableInTouchMode(true);
            opv2M02.requestFocus();
            return false;
        } else {
            opv2M02.setError(null);
        }

        //============ OPV 2 / Card Present ==========
        if (opv2C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
            opv2C02.setError("This data is Required!");
            Log.i(TAG, "opv2C: This data is Required!");
            opv2C02.setFocusable(true);
            opv2C02.setFocusableInTouchMode(true);
            opv2C02.requestFocus();
            return false;
        } else {
            opv2C02.setError(null);
        }


        //============ Penta 2 / Mother ==========
        if (penta2M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
            penta2M02.setError("This data is Required!");
            Log.i(TAG, "penta2M: This data is Required!");
            penta2M02.setFocusable(true);
            penta2M02.setFocusableInTouchMode(true);
            penta2M02.requestFocus();
            return false;
        } else {
            penta2M02.setError(null);
        }

        //============ Penta 2 / Card Present ==========
        if (penta2C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
            penta2C02.setError("This data is Required!");
            Log.i(TAG, "penta2C: This data is Required!");
            penta2C02.setFocusable(true);
            penta2C02.setFocusableInTouchMode(true);
            penta2C02.requestFocus();
            return false;
        } else {
            penta2C02.setError(null);
        }


        //============ pneumo 2 / Mother ==========
        if (pneumo2M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo2), Toast.LENGTH_SHORT).show();
            pneumo2M02.setError("This data is Required!");
            Log.i(TAG, "pneumo2M: This data is Required!");
            pneumo2M02.setFocusable(true);
            pneumo2M02.setFocusableInTouchMode(true);
            pneumo2M02.requestFocus();
            return false;
        } else {
            pneumo2M02.setError(null);
        }

        //============ pneumo 2 / Card Present ==========
        if (pneumo2C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo2), Toast.LENGTH_SHORT).show();
            pneumo2C02.setError("This data is Required!");
            Log.i(TAG, "pneumo2C: This data is Required!");
            pneumo2C02.setFocusable(true);
            pneumo2C02.setFocusableInTouchMode(true);
            pneumo2C02.requestFocus();
            return false;
        } else {
            pneumo2C02.setError(null);
        }


        //============ OPV 3 / Mother ==========
        if (opv3M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
            opv3M02.setError("This data is Required!");
            Log.i(TAG, "opv3M: This data is Required!");
            opv3M02.setFocusable(true);
            opv3M02.setFocusableInTouchMode(true);
            opv3M02.requestFocus();
            return false;
        } else {
            opv3M02.setError(null);
        }

        //============ OPV 3 / Card Present ==========
        if (opv3C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
            opv3C02.setError("This data is Required!");
            Log.i(TAG, "opv3C: This data is Required!");
            opv3C02.setFocusable(true);
            opv3C02.setFocusableInTouchMode(true);
            opv3C02.requestFocus();
            return false;
        } else {
            opv3C02.setError(null);
        }


        //============ Penta 3 / Mother ==========
        if (penta3M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
            penta3M02.setError("This data is Required!");
            Log.i(TAG, "penta3M: This data is Required!");
            penta3M02.setFocusable(true);
            penta3M02.setFocusableInTouchMode(true);
            penta3M02.requestFocus();
            return false;
        } else {
            penta3M02.setError(null);
        }


        //============ Penta 3 / Card Present ==========
        if (penta3C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
            penta3C02.setError("This data is Required!");
            Log.i(TAG, "penta3C: This data is Required!");
            penta3C02.setFocusable(true);
            penta3C02.setFocusableInTouchMode(true);
            penta3C02.requestFocus();
            return false;
        } else {
            penta3C02.setError(null);
        }


        //============ pneumo / Mother ==========
        if (pneumo3M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo3), Toast.LENGTH_SHORT).show();
            pneumo3M02.setError("This data is Required!");
            Log.i(TAG, "pneumo3M: This data is Required!");
            pneumo3M02.setFocusable(true);
            pneumo3M02.setFocusableInTouchMode(true);
            pneumo3M02.requestFocus();
            return false;
        } else {
            pneumo3M02.setError(null);
        }

        //============ pneumo 3 / Card Present ==========
        if (pneumo3C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.pneumo3), Toast.LENGTH_SHORT).show();
            pneumo3C02.setError("This data is Required!");
            Log.i(TAG, "pneumo3C: This data is Required!");
            pneumo3C02.setFocusable(true);
            pneumo3C02.setFocusableInTouchMode(true);
            pneumo3C02.requestFocus();
            return false;
        } else {
            pneumo3C02.setError(null);
        }


        //============ IPV / Mother ==========
        if (ipvM.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
            ipvM02.setError("This data is Required!");
            Log.i(TAG, "ipvM: This data is Required!");
            ipvM02.setFocusable(true);
            ipvM02.setFocusableInTouchMode(true);
            ipvM02.requestFocus();
            return false;
        } else {
            ipvM02.setError(null);
        }

        //============ IPV / Card Present ==========
        if (ipvC.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
            ipvC02.setError("This data is Required!");
            Log.i(TAG, "ipvC: This data is Required!");
            ipvC02.setFocusable(true);
            ipvC02.setFocusableInTouchMode(true);
            ipvC02.requestFocus();
            return false;
        } else {
            ipvC02.setError(null);
        }

        //============ measles1 / Mother ==========
        if (measles1M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
            measles1M02.setError("This data is Required!");
            Log.i(TAG, "measles1M: This data is Required!");
            measles1M02.setFocusable(true);
            measles1M02.setFocusableInTouchMode(true);
            measles1M02.requestFocus();
            return false;
        } else {
            measles1M02.setError(null);
        }

        //============ measles1 / Card Present ==========
        if (measles1C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
            measles1C02.setError("This data is Required!");
            Log.i(TAG, "measles1C: This data is Required!");
            measles1C02.setFocusable(true);
            measles1C02.setFocusableInTouchMode(true);
            measles1C02.requestFocus();
            return false;
        } else {
            measles1C02.setError(null);
        }


        //============ measles2 / Mother ==========
        if (measles2M.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
            measles2M02.setError("This data is Required!");
            Log.i(TAG, "measles2M: This data is Required!");
            measles2M02.setFocusable(true);
            measles2M02.setFocusableInTouchMode(true);
            measles2M02.requestFocus();
            return false;
        } else {
            measles2M02.setError(null);
        }
        //============ measles2 / Card Present ==========
        if (measles2C.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
            measles2C02.setError("This data is Required!");
            Log.i(TAG, "measles2C: This data is Required!");
            measles2C02.setFocusable(true);
            measles2C02.setFocusableInTouchMode(true);
            measles2C02.requestFocus();
            return false;
        } else {
            measles2C02.setError(null);
        }


        //============ Vitamin A / Mother ==========
        if (vitaminAM.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vitaminA), Toast.LENGTH_SHORT).show();
            vitaminAM02.setError("This data is Required!");
            Log.i(TAG, "vitaminAM: This data is Required!");
            vitaminAM02.setFocusable(true);
            vitaminAM02.setFocusableInTouchMode(true);
            vitaminAM02.requestFocus();
            return false;
        } else {
            vitaminAM02.setError(null);
        }
        //============ measles2 / Card Present ==========
        if (vitaminAC.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.vitaminA), Toast.LENGTH_SHORT).show();
            vitaminAC02.setError("This data is Required!");
            Log.i(TAG, "vitaminAC: This data is Required!");
            vitaminAC02.setFocusable(true);
            vitaminAC02.setFocusableInTouchMode(true);
            vitaminAC02.requestFocus();
            return false;
        } else {
            vitaminAC02.setError(null);
        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }



}

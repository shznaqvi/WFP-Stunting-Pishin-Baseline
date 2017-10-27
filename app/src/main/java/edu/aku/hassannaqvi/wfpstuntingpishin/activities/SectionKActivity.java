package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionKActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener
{
    private static final String TAG = SectionKActivity.class.getSimpleName();

    @BindView(R.id.spblk01)
    Spinner spblk01;
    @BindView(R.id.spblk04)
    DatePickerInputEditText spblk04;
    @BindView(R.id.spblk05)
    RadioGroup spblk05;
    @BindView(R.id.spblk05a)
    RadioButton spblk05a;
    @BindView(R.id.spblk05b)
    RadioButton spblk05b;
    @BindView(R.id.spblk0599)
    RadioButton spblk0599;
    @BindView(R.id.spblk06)
    EditText spblk06;
    @BindView(R.id.spblk07)
    RadioGroup spblk07;
    @BindView(R.id.spblk07a)
    RadioButton spblk07a;
    @BindView(R.id.spblk07b)
    RadioButton spblk07b;
    @BindView(R.id.spblk08)
    RadioGroup spblk08;
    @BindView(R.id.spblk08a)
    RadioButton spblk08a;
    @BindView(R.id.spblk08b)
    RadioButton spblk08b;
    @BindView(R.id.spblk08c)
    RadioButton spblk08c;
    @BindView(R.id.spblk08bx)
    EditText spblk08bx;
    @BindView(R.id.spblk08cx)
    EditText spblk08cx;
    @BindView(R.id.spblk09)
    RadioGroup spblk09;
    @BindView(R.id.spblk09a)
    RadioButton spblk09a;
    @BindView(R.id.spblk09b)
    RadioButton spblk09b;
    @BindView(R.id.spblk0999)
    RadioButton spblk0999;
    @BindView(R.id.spblk10)
    RadioGroup spblk10;
    @BindView(R.id.spblk10a)
    RadioButton spblk10a;
    @BindView(R.id.spblk10b)
    RadioButton spblk10b;
    @BindView(R.id.spblk1099)
    RadioButton spblk1099;
    @BindView(R.id.spblk11)
    RadioGroup spblk11;
    @BindView(R.id.spblk11a)
    RadioButton spblk11a;
    @BindView(R.id.spblk11b)
    RadioButton spblk11b;
    @BindView(R.id.spblk1199)
    RadioButton spblk1199;
    @BindView(R.id.spblk12)
    RadioGroup spblk12;
    @BindView(R.id.spblk12a)
    RadioButton spblk12a;
    @BindView(R.id.spblk12b)
    RadioButton spblk12b;
    @BindView(R.id.spblk1299)
    RadioButton spblk1299;
    @BindView(R.id.spblk1301)
    RadioGroup spblk1301;
    @BindView(R.id.spblk1301a)
    RadioButton spblk1301a;
    @BindView(R.id.spblk1301b)
    RadioButton spblk1301b;
    @BindView(R.id.spblk130199)
    RadioButton spblk130199;
    @BindView(R.id.spblk1302)
    RadioGroup spblk1302;
    @BindView(R.id.spblk1302a)
    RadioButton spblk1302a;
    @BindView(R.id.spblk1302b)
    RadioButton spblk1302b;
    @BindView(R.id.spblk130299)
    RadioButton spblk130299;
    @BindView(R.id.spblk1302x)
    EditText spblk1302x;
    @BindView(R.id.spblk1303)
    RadioGroup spblk1303;
    @BindView(R.id.spblk1303a)
    RadioButton spblk1303a;
    @BindView(R.id.spblk1303b)
    RadioButton spblk1303b;
    @BindView(R.id.spblk130399)
    RadioButton spblk130399;
    @BindView(R.id.spblk1303x)
    EditText spblk1303x;
    @BindView(R.id.spblk1304)
    RadioGroup spblk1304;
    @BindView(R.id.spblk1304a)
    RadioButton spblk1304a;
    @BindView(R.id.spblk1304b)
    RadioButton spblk1304b;
    @BindView(R.id.spblk130499)
    RadioButton spblk130499;
    @BindView(R.id.spblk1305)
    RadioGroup spblk1305;
    @BindView(R.id.spblk1305a)
    RadioButton spblk1305a;
    @BindView(R.id.spblk1305b)
    RadioButton spblk1305b;
    @BindView(R.id.spblk130599)
    RadioButton spblk130599;
    @BindView(R.id.spblk1306)
    RadioGroup spblk1306;
    @BindView(R.id.spblk1306a)
    RadioButton spblk1306a;
    @BindView(R.id.spblk1306b)
    RadioButton spblk1306b;
    @BindView(R.id.spblk130699)
    RadioButton spblk130699;
    @BindView(R.id.spblk1306x)
    EditText spblk1306x;
    @BindView(R.id.spblk1307)
    RadioGroup spblk1307;
    @BindView(R.id.spblk1307a)
    RadioButton spblk1307a;
    @BindView(R.id.spblk1307b)
    RadioButton spblk1307b;
    @BindView(R.id.spblk130799)
    RadioButton spblk130799;
    @BindView(R.id.spblk1308)
    RadioGroup spblk1308;
    @BindView(R.id.spblk1308a)
    RadioButton spblk1308a;
    @BindView(R.id.spblk1308b)
    RadioButton spblk1308b;
    @BindView(R.id.spblk130899)
    RadioButton spblk130899;
    @BindView(R.id.spblk1309)
    RadioGroup spblk1309;
    @BindView(R.id.spblk1309a)
    RadioButton spblk1309a;
    @BindView(R.id.spblk1309b)
    RadioButton spblk1309b;
    @BindView(R.id.spblk130999)
    RadioButton spblk130999;
    @BindView(R.id.spblk1401)
    RadioGroup spblk1401;
    @BindView(R.id.spblk1401a)
    RadioButton spblk1401a;
    @BindView(R.id.spblk1401b)
    RadioButton spblk1401b;
    @BindView(R.id.spblk140199)
    RadioButton spblk140199;
    @BindView(R.id.spblk1402)
    RadioGroup spblk1402;
    @BindView(R.id.spblk1402a)
    RadioButton spblk1402a;
    @BindView(R.id.spblk1402b)
    RadioButton spblk1402b;
    @BindView(R.id.spblk140299)
    RadioButton spblk140299;
    @BindView(R.id.spblk1403)
    RadioGroup spblk1403;
    @BindView(R.id.spblk1403a)
    RadioButton spblk1403a;
    @BindView(R.id.spblk1403b)
    RadioButton spblk1403b;
    @BindView(R.id.spblk140399)
    RadioButton spblk140399;
    @BindView(R.id.spblk1404)
    RadioGroup spblk1404;
    @BindView(R.id.spblk1404a)
    RadioButton spblk1404a;
    @BindView(R.id.spblk1404b)
    RadioButton spblk1404b;
    @BindView(R.id.spblk140499)
    RadioButton spblk140499;
    @BindView(R.id.spblk1405)
    RadioGroup spblk1405;
    @BindView(R.id.spblk1405a)
    RadioButton spblk1405a;
    @BindView(R.id.spblk1405b)
    RadioButton spblk1405b;
    @BindView(R.id.spblk140599)
    RadioButton spblk140599;
    @BindView(R.id.spblk1406)
    RadioGroup spblk1406;
    @BindView(R.id.spblk1406a)
    RadioButton spblk1406a;
    @BindView(R.id.spblk1406b)
    RadioButton spblk1406b;
    @BindView(R.id.spblk140699)
    RadioButton spblk140699;
    @BindView(R.id.spblk1407)
    RadioGroup spblk1407;
    @BindView(R.id.spblk1407a)
    RadioButton spblk1407a;
    @BindView(R.id.spblk1407b)
    RadioButton spblk1407b;
    @BindView(R.id.spblk140799)
    RadioButton spblk140799;
    @BindView(R.id.spblk1408)
    RadioGroup spblk1408;
    @BindView(R.id.spblk1408a)
    RadioButton spblk1408a;
    @BindView(R.id.spblk1408b)
    RadioButton spblk1408b;
    @BindView(R.id.spblk140899)
    RadioButton spblk140899;
    @BindView(R.id.spblk1409)
    RadioGroup spblk1409;
    @BindView(R.id.spblk1409a)
    RadioButton spblk1409a;
    @BindView(R.id.spblk1409b)
    RadioButton spblk1409b;
    @BindView(R.id.spblk140999)
    RadioButton spblk140999;
    @BindView(R.id.spblk1410)
    RadioGroup spblk1410;
    @BindView(R.id.spblk1410a)
    RadioButton spblk1410a;
    @BindView(R.id.spblk1410b)
    RadioButton spblk1410b;
    @BindView(R.id.spblk141099)
    RadioButton spblk141099;
    @BindView(R.id.spblk1411)
    RadioGroup spblk1411;
    @BindView(R.id.spblk1411a)
    RadioButton spblk1411a;
    @BindView(R.id.spblk1411b)
    RadioButton spblk1411b;
    @BindView(R.id.spblk141199)
    RadioButton spblk141199;
    @BindView(R.id.spblk1412)
    RadioGroup spblk1412;
    @BindView(R.id.spblk1412a)
    RadioButton spblk1412a;
    @BindView(R.id.spblk1412b)
    RadioButton spblk1412b;
    @BindView(R.id.spblk141299)
    RadioButton spblk141299;
    @BindView(R.id.spblk1413)
    RadioGroup spblk1413;
    @BindView(R.id.spblk1413a)
    RadioButton spblk1413a;
    @BindView(R.id.spblk1413b)
    RadioButton spblk1413b;
    @BindView(R.id.spblk141399)
    RadioButton spblk141399;
    @BindView(R.id.spblk1414)
    RadioGroup spblk1414;
    @BindView(R.id.spblk1414a)
    RadioButton spblk1414a;
    @BindView(R.id.spblk1414b)
    RadioButton spblk1414b;
    @BindView(R.id.spblk141499)
    RadioButton spblk141499;
    @BindView(R.id.spblk1415)
    RadioGroup spblk1415;
    @BindView(R.id.spblk1415a)
    RadioButton spblk1415a;
    @BindView(R.id.spblk1415b)
    RadioButton spblk1415b;
    @BindView(R.id.spblk141599)
    RadioButton spblk141599;
    @BindView(R.id.spblk1416)
    RadioGroup spblk1416;
    @BindView(R.id.spblk1416a)
    RadioButton spblk1416a;
    @BindView(R.id.spblk1416b)
    RadioButton spblk1416b;
    @BindView(R.id.spblk141699)
    RadioButton spblk141699;
    @BindView(R.id.spblk15)
    RadioGroup spblk15;
    @BindView(R.id.spblk15a)
    RadioButton spblk15a;
    @BindView(R.id.spblk15b)
    RadioButton spblk15b;
    @BindView(R.id.spblk1599)
    RadioButton spblk1599;
    @BindView(R.id.spblk16)
    RadioGroup spblk16;
    @BindView(R.id.spblk16a)
    RadioButton spblk16a;
    @BindView(R.id.spblk1699)
    RadioButton spblk1699;
    @BindView(R.id.spblk16x)
    EditText spblk16x;
    @BindView(R.id.spblk17)
    RadioGroup spblk17;
    @BindView(R.id.spblk17a)
    RadioButton spblk17a;
    @BindView(R.id.spblk17b)
    RadioButton spblk17b;
    @BindView(R.id.spblk1799)
    RadioButton spblk1799;
    @BindView(R.id.spblk18)
    RadioGroup spblk18;
    @BindView(R.id.spblk18a)
    RadioButton spblk18a;
    @BindView(R.id.spblk18b)
    RadioButton spblk18b;
    @BindView(R.id.spblk1899)
    RadioButton spblk1899;
    @BindView(R.id.spblk19)
    RadioGroup spblk19;
    @BindView(R.id.spblk19a)
    RadioButton spblk19a;
    @BindView(R.id.spblk19b)
    RadioButton spblk19b;
    @BindView(R.id.spblk1999)
    RadioButton spblk1999;
    @BindView(R.id.spblk20)
    RadioGroup spblk20;
    @BindView(R.id.spblk20a)
    RadioButton spblk20a;
    @BindView(R.id.spblk20b)
    RadioButton spblk20b;
    @BindView(R.id.spblk2099)
    RadioButton spblk2099;
    @BindView(R.id.spblk21)
    RadioGroup spblk21;
    @BindView(R.id.spblk21a)
    RadioButton spblk21a;
    @BindView(R.id.spblk21b)
    RadioButton spblk21b;
    @BindView(R.id.spblk2199)
    RadioButton spblk2199;
    @BindView(R.id.fldGrpspblk08)
    LinearLayout fldGrpspblk08;
    @BindView(R.id.fldGrpspblk09)
    LinearLayout fldGrpspblk09;
    @BindView(R.id.fldGrpspblk10)
    LinearLayout fldGrpspblk10;
    @BindView(R.id.fldGrpspblk15)
    LinearLayout fldGrpspblk15;
    @BindView(R.id.fldGrpspblk16)
    LinearLayout fldGrpspblk16;

    @BindViews({R.id.spblk1401, R.id.spblk1402, R.id.spblk1403, R.id.spblk1404, R.id.spblk1405, R.id.spblk1406, R.id.spblk1407,
            R.id.spblk1408, R.id.spblk1409, R.id.spblk1410, R.id.spblk1411, R.id.spblk1412, R.id.spblk1413, R.id.spblk1414,
            R.id.spblk1415, R.id.spblk1416})
    List<RadioGroup> spblk14;

    @BindViews({R.id.spblk1401b, R.id.spblk1402b, R.id.spblk1403b, R.id.spblk1404b, R.id.spblk1405b, R.id.spblk1406b,
            R.id.spblk1407b, R.id.spblk1408b, R.id.spblk1409b, R.id.spblk1410b, R.id.spblk1411b, R.id.spblk1412b,
            R.id.spblk1413b, R.id.spblk1414b, R.id.spblk1415b, R.id.spblk1416b})
    List<RadioButton> spblk14b;

    @BindViews({R.id.spblk140199, R.id.spblk140299, R.id.spblk140399, R.id.spblk140499, R.id.spblk140599, R.id.spblk140699,
            R.id.spblk140799, R.id.spblk140899, R.id.spblk140999, R.id.spblk141099, R.id.spblk141199, R.id.spblk141299,
            R.id.spblk141399, R.id.spblk141499, R.id.spblk141599, R.id.spblk141699})
    List<RadioButton> spblk1499;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_k);
        ButterKnife.bind(this);

        spblk07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblk07a.isChecked()) {
                    fldGrpspblk08.setVisibility(View.VISIBLE);
                    fldGrpspblk09.setVisibility(View.VISIBLE);

                } else {
                    fldGrpspblk08.setVisibility(View.GONE);
                    fldGrpspblk09.setVisibility(View.GONE);
                    spblk08.clearCheck();
                    spblk09.clearCheck();
                    spblk08bx.setText(null);
                    spblk08cx.setText(null);
                }
            }
        });

        spblk09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblk09a.isChecked()) {
                    fldGrpspblk10.setVisibility(View.GONE);
                    spblk10.clearCheck();
                } else {
                    fldGrpspblk10.setVisibility(View.VISIBLE);
                }
            }
        });

        spblk1302.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblk1302a.isChecked()) {
                    spblk1302x.setVisibility(View.VISIBLE);
                } else {
                    spblk1302x.setVisibility(View.GONE);
                    spblk1302x.setText(null);
                }
            }
        });

        spblk1303.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblk1303a.isChecked()) {
                    spblk1303x.setVisibility(View.VISIBLE);
                } else {
                    spblk1303x.setVisibility(View.GONE);
                    spblk1303x.setText(null);
                }
            }
        });

        spblk1306.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spblk1306a.isChecked()) {
                    spblk1306x.setVisibility(View.VISIBLE);
                } else {
                    spblk1306x.setVisibility(View.GONE);
                    spblk1306x.setText(null);
                }
            }
        });

        spblk1699.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    spblk16x.setVisibility(View.GONE);
                    spblk16x.setText(null);
                } else {
                    spblk16x.setVisibility(View.VISIBLE);
                }
            }
        });

        for (RadioGroup rg : spblk14) {
            rg.setOnCheckedChangeListener(this);
        }



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

        Intent secNext = new Intent(this, SectionLIMActivity.class);
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


        JSONObject sK = new JSONObject();

        sK.put("spblk01", spblk01.getSelectedItem().toString());
        sK.put("spblk02", spblk01.getSelectedItem().toString());
        sK.put("spblk03", spblk01.getSelectedItem().toString());
        sK.put("spblk04", spblk04.getText().toString());
        sK.put("spblk05", spblk05a.isChecked() ? "1" : spblk05b.isChecked() ? "2" : spblk0599.isChecked() ? "99" : "0");
        sK.put("spblk06", spblk06.getText().toString());
        sK.put("spblk07", spblk07a.isChecked() ? "1" : spblk07b.isChecked() ? "2" : "0");
        sK.put("spblk08", spblk08a.isChecked() ? "1" : spblk08b.isChecked() ? "2" : spblk08c.isChecked() ? "3" : "0");
        sK.put("spblk08bx", spblk08bx.getText().toString());
        sK.put("spblk08cx", spblk08cx.getText().toString());
        sK.put("spblk09", spblk09a.isChecked() ? "1" : spblk09b.isChecked() ? "2" : spblk0999.isChecked() ? "99" : "0");
        sK.put("spblk10", spblk10a.isChecked() ? "1" : spblk10b.isChecked() ? "2" : spblk1099.isChecked() ? "99" : "0");
        sK.put("spblk11", spblk11a.isChecked() ? "1" : spblk11b.isChecked() ? "2" : spblk1199.isChecked() ? "99" : "0");
        sK.put("spblk12", spblk12a.isChecked() ? "1" : spblk12b.isChecked() ? "2" : spblk1299.isChecked() ? "99" : "0");
        sK.put("spblk1301", spblk1301a.isChecked() ? "1" : spblk1301b.isChecked() ? "2" : spblk130199.isChecked() ? "99" : "0");
        sK.put("spblk1302", spblk1302a.isChecked() ? "1" : spblk1302b.isChecked() ? "2" : spblk130299.isChecked() ? "99" : "0");
        sK.put("spblk1303", spblk1303a.isChecked() ? "1" : spblk1303b.isChecked() ? "2" : spblk130399.isChecked() ? "99" : "0");
        sK.put("spblk1304", spblk1304a.isChecked() ? "1" : spblk1304b.isChecked() ? "2" : spblk130499.isChecked() ? "99" : "0");
        sK.put("spblk1305", spblk1305a.isChecked() ? "1" : spblk1305b.isChecked() ? "2" : spblk130599.isChecked() ? "99" : "0");
        sK.put("spblk1306", spblk1306a.isChecked() ? "1" : spblk1306b.isChecked() ? "2" : spblk130699.isChecked() ? "99" : "0");
        sK.put("spblk1307", spblk1307a.isChecked() ? "1" : spblk1307b.isChecked() ? "2" : spblk130799.isChecked() ? "99" : "0");
        sK.put("spblk1308", spblk1308a.isChecked() ? "1" : spblk1308b.isChecked() ? "2" : spblk130899.isChecked() ? "99" : "0");
        sK.put("spblk1309", spblk1309a.isChecked() ? "1" : spblk1309b.isChecked() ? "2" : spblk130999.isChecked() ? "99" : "0");
        sK.put("spblk1401", spblk1401a.isChecked() ? "1" : spblk1401b.isChecked() ? "2" : spblk140199.isChecked() ? "99" : "0");
        sK.put("spblk1402", spblk1402a.isChecked() ? "1" : spblk1402b.isChecked() ? "2" : spblk140299.isChecked() ? "99" : "0");
        sK.put("spblk1403", spblk1403a.isChecked() ? "1" : spblk1403b.isChecked() ? "2" : spblk140399.isChecked() ? "99" : "0");
        sK.put("spblk1404", spblk1404a.isChecked() ? "1" : spblk1404b.isChecked() ? "2" : spblk140499.isChecked() ? "99" : "0");
        sK.put("spblk1405", spblk1405a.isChecked() ? "1" : spblk1405b.isChecked() ? "2" : spblk140599.isChecked() ? "99" : "0");
        sK.put("spblk1406", spblk1406a.isChecked() ? "1" : spblk1406b.isChecked() ? "2" : spblk140699.isChecked() ? "99" : "0");
        sK.put("spblk1407", spblk1407a.isChecked() ? "1" : spblk1407b.isChecked() ? "2" : spblk140799.isChecked() ? "99" : "0");
        sK.put("spblk1408", spblk1408a.isChecked() ? "1" : spblk1408b.isChecked() ? "2" : spblk140899.isChecked() ? "99" : "0");
        sK.put("spblk1409", spblk1409a.isChecked() ? "1" : spblk1409b.isChecked() ? "2" : spblk140999.isChecked() ? "99" : "0");
        sK.put("spblk1410", spblk1410a.isChecked() ? "1" : spblk1410b.isChecked() ? "2" : spblk141099.isChecked() ? "99" : "0");
        sK.put("spblk1411", spblk1411a.isChecked() ? "1" : spblk1411b.isChecked() ? "2" : spblk141199.isChecked() ? "99" : "0");
        sK.put("spblk1412", spblk1412a.isChecked() ? "1" : spblk1412b.isChecked() ? "2" : spblk141299.isChecked() ? "99" : "0");
        sK.put("spblk1413", spblk1413a.isChecked() ? "1" : spblk1413b.isChecked() ? "2" : spblk141399.isChecked() ? "99" : "0");
        sK.put("spblk1414", spblk1414a.isChecked() ? "1" : spblk1414b.isChecked() ? "2" : spblk141499.isChecked() ? "99" : "0");
        sK.put("spblk1415", spblk1415a.isChecked() ? "1" : spblk1415b.isChecked() ? "2" : spblk141599.isChecked() ? "99" : "0");
        sK.put("spblk1416", spblk1416a.isChecked() ? "1" : spblk1416b.isChecked() ? "2" : spblk141699.isChecked() ? "99" : "0");
        sK.put("spblk15", spblk15a.isChecked() ? "1" : spblk15b.isChecked() ? "2" : spblk1599.isChecked() ? "99" : "0");
        sK.put("spblk16", spblk16a.isChecked() ? "1" : spblk1699.isChecked() ? "99" : "0");
        sK.put("spblk16x", spblk16x.getText().toString());
        sK.put("spblk17", spblk17a.isChecked() ? "1" : spblk17b.isChecked() ? "2" : spblk1799.isChecked() ? "99" : "0");
        sK.put("spblk18", spblk18a.isChecked() ? "1" : spblk18b.isChecked() ? "2" : spblk1899.isChecked() ? "99" : "0");
        sK.put("spblk19", spblk19a.isChecked() ? "1" : spblk19b.isChecked() ? "2" : spblk1999.isChecked() ? "99" : "0");
        sK.put("spblk20", spblk20a.isChecked() ? "1" : spblk20b.isChecked() ? "2" : spblk2099.isChecked() ? "99" : "0");
        sK.put("spblk21", spblk21a.isChecked() ? "1" : spblk21b.isChecked() ? "2" : spblk2199.isChecked() ? "99" : "0");

//        MainApp.ims.setsI(String.valueOf(sI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spblk01.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk01), Toast.LENGTH_SHORT).show();
            ((TextView) spblk01.getSelectedView()).setText("This Data is Required");
            ((TextView) spblk01.getSelectedView()).setTextColor(Color.RED);
            spblk01.requestFocus();
            Log.i(TAG, "spblk01: This Data is Required!");
            return false;
        } else {
            ((TextView) spblk01.getSelectedView()).setError(null);
        }

        if (spblk04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk04), Toast.LENGTH_SHORT).show();
            spblk04.setError("This Data is Required!");
            spblk04.requestFocus();
            Log.i(TAG, "spblk01: This Data is Required!");
            return false;
        } else {
            spblk04.setError(null);
        }


        if (spblk05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk05), Toast.LENGTH_SHORT).show();
            spblk05a.setError("This data is Required!");
            Log.i(TAG, "spblk05: This data is Required!");
            spblk05a.setFocusable(true);
            spblk05a.setFocusableInTouchMode(true);
            spblk05a.requestFocus();
            return false;
        } else {
            spblk05a.setError(null);
        }

        if (spblk06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
            spblk06.setError("This Data is Required!");
            spblk06.requestFocus();
            Log.i(TAG, "spblk06: This Data is Required!");
            return false;
        } else {
            spblk06.setError(null);
        }

        if (Integer.valueOf(spblk06.getText().toString()) < 0 || Integer.valueOf(spblk06.getText().toString()) > 23) {
            Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
            spblk06.setError("Age Range is 0 to 23 months");
            spblk06.requestFocus();
            Log.i(TAG, "spblk06: Age Range is 0 to 23 months");
            return false;
        } else {
            spblk06.setError(null);
        }

        if (spblk07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk07), Toast.LENGTH_SHORT).show();
            spblk07a.setError("This data is Required!");
            Log.i(TAG, "spblk07: This data is Required!");
            spblk07a.setFocusable(true);
            spblk07a.setFocusableInTouchMode(true);
            spblk07a.requestFocus();
            return false;
        } else {
            spblk07a.setError(null);
        }

        if (spblk07a.isChecked()) {
            if (spblk08.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk08), Toast.LENGTH_SHORT).show();
                spblk08a.setError("This data is Required!");
                Log.i(TAG, "spblk08: This data is Required!");
                spblk08a.setFocusable(true);
                spblk08a.setFocusableInTouchMode(true);
                spblk08a.requestFocus();
                return false;
            } else {
                spblk08a.setError(null);
            }

            if (spblk08b.isChecked() && spblk08bx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.hour), Toast.LENGTH_SHORT).show();
                spblk08bx.setError("This Data is Required!");
                spblk08bx.requestFocus();
                Log.i(TAG, "spblk08bx: This Data is Required!");
                return false;
            } else {
                spblk08bx.setError(null);
            }

            if (spblk08c.isChecked() && spblk08cx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                spblk08cx.setError("This Data is Required!");
                spblk08cx.requestFocus();
                Log.i(TAG, "spblk08cx: This Data is Required!");
                return false;
            } else {
                spblk08cx.setError(null);
            }


            if (spblk09.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk09), Toast.LENGTH_SHORT).show();
                spblk09a.setError("This data is Required!");
                Log.i(TAG, "spblk09: This data is Required!");
                spblk09a.setFocusable(true);
                spblk09a.setFocusableInTouchMode(true);
                spblk09a.requestFocus();
                return false;
            } else {
                spblk09a.setError(null);
            }

        }




        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

        if (is14AllNo()) {
            // Show answer here
            fldGrpspblk15.setVisibility(View.VISIBLE);
            fldGrpspblk15.setVisibility(View.GONE);
            spblk16x.setText(null);
            spblk16.clearCheck();

        } else {
            fldGrpspblk15.setVisibility(View.GONE);
            fldGrpspblk15.setVisibility(View.VISIBLE);
            spblk15.clearCheck();
        }

    }

    public boolean is14AllNo() {

        int i = 0;
        for (RadioButton rg : spblk14b) {
            if (rg.isChecked())
                i++;
        }

        // Show answer here
        return i == spblk14b.size();
    }

}

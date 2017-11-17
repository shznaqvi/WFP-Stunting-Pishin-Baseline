package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses.FamilyMembers;
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
    @BindView(R.id.spblk06m)
    EditText spblk06m;
    @BindView(R.id.spblk06d)
    EditText spblk06d;
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
    @BindView(R.id.motherName)
    TextView motherName;

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


    private boolean userIsInteracting = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_k);
        ButterKnife.bind(this);

        String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        String maxDate2year = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (MainApp.MILLISECONDS_IN_2YEAR));

        MainApp.childMap.put("....", null);
        MainApp.lstChild.add("....");

        for (byte i = 0; i < MainApp.familyMembersList.size(); i++) {
            if (MainApp.familyMembersList.get(i).getType().equals("ch") && Integer.valueOf(MainApp.familyMembersList.get(i).getDob().substring(0, 1)) < 2) {


                MainApp.childMap.put(MainApp.familyMembersList.get(i).getMemberName(), new FamilyMembers(MainApp.familyMembersList.get(i)));
                MainApp.lstChild.add(MainApp.familyMembersList.get(i).getMemberName());



            }
        }

        spblk01.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, MainApp.lstChild));

        spblk01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                MainApp.position = i;
                if (userIsInteracting) {
                    motherName.setText(MainApp.childMap.get(spblk01.getSelectedItem().toString()).getMotherName());
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //motherName.setText(childMap.get(spblk01.getSelectedItem().toString()));

        spblk04.setManager(getSupportFragmentManager());
        spblk04.setMaxDate(dateToday);
        spblk04.setMinDate(maxDate2year);

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

        spblk08b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    spblk08bx.setVisibility(View.VISIBLE);
                } else {
                    spblk08bx.setVisibility(View.GONE);
                    spblk08bx.setText(null);
                }
            }
        });

        spblk08c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    spblk08cx.setVisibility(View.VISIBLE);
                } else {
                    spblk08cx.setVisibility(View.GONE);
                    spblk08cx.setText(null);
                }
            }
        });



    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        userIsInteracting = true;
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();


                Intent secNext = new Intent(this, SectionLIMActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }


    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        MainApp.endActivity(this, this);

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);
        int updcount = db.updateSK();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }



    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sK = new JSONObject();

        sK.put("mother_name", motherName.getText().toString());
        sK.put("motherserial", MainApp.childMap.get(spblk01.getSelectedItem().toString()).getMother_serial());
        sK.put("spblk01", spblk01.getSelectedItem().toString());
        sK.put("spblk02", MainApp.childMap.get(spblk01.getSelectedItem().toString()).getSerial());
        sK.put("spblk03", MainApp.childMap.get(spblk01.getSelectedItem().toString()).getGender());
        sK.put("spblk04", spblk04.getText().toString());
        sK.put("spblk05", spblk05a.isChecked() ? "1" : spblk05b.isChecked() ? "2" : spblk0599.isChecked() ? "99" : "0");
        sK.put("spblk06m", spblk06m.getText().toString());
        sK.put("spblk06d", spblk06d.getText().toString());
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

        MainApp.fc.setsK(String.valueOf(sK));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        /*if (spblk01.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk01), Toast.LENGTH_SHORT).show();
            ((TextView) spblk01.getSelectedView()).setText("This Data is Required");
            ((TextView) spblk01.getSelectedView()).setTextColor(Color.RED);
            spblk01.requestFocus();
            Log.i(TAG, "spblk01: This Data is Required!");
            return false;
        } else {
            ((TextView) spblk01.getSelectedView()).setError(null);
        }
*/
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

        if (spblk06m.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
            spblk06m.setError("This Data is Required!");
            spblk06m.requestFocus();
            Log.i(TAG, "spblk06: This Data is Required!");
            return false;
        } else {
            spblk06m.setError(null);
        }

        if (Integer.valueOf(spblk06m.getText().toString()) < 0 || Integer.valueOf(spblk06m.getText().toString()) > 23) {
            Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
            spblk06m.setError("Age Range is 0 to 23 months");
            spblk06m.requestFocus();
            Log.i(TAG, "spblk06: Age Range is 0 to 23 months");
            return false;
        } else {
            spblk06m.setError(null);
        }

        if (spblk06d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
            spblk06d.setError("This Data is Required!");
            spblk06d.requestFocus();
            Log.i(TAG, "spblk06: This Data is Required!");
            return false;
        } else {
            spblk06d.setError(null);
        }

        if (Integer.valueOf(spblk06m.getText().toString()) < 1) {
            if (Integer.valueOf(spblk06d.getText().toString()) < 1 || Integer.valueOf(spblk06d.getText().toString()) > 29) {
                Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.spblk06), Toast.LENGTH_SHORT).show();
                spblk06d.setError("Age Range is 0 to 29 days");
                spblk06d.requestFocus();
                Log.i(TAG, "spblk06: Age Range is 0 to 29 days");
                return false;
            } else {
                spblk06d.setError(null);
            }
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

            if (spblk08b.isChecked()) {

                if (spblk08bx.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.hour), Toast.LENGTH_SHORT).show();
                    spblk08bx.setError("This Data is Required!");
                    spblk08bx.requestFocus();
                    Log.i(TAG, "spblk08bx: This Data is Required!");
                    return false;
                } else {
                    spblk08bx.setError(null);
                }

                if (Integer.valueOf(spblk08bx.getText().toString()) < 1 || Integer.valueOf(spblk08bx.getText().toString()) > 23) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.hour), Toast.LENGTH_SHORT).show();
                    spblk08bx.setError("Range is 1 to 23 hours");
                    spblk08bx.requestFocus();
                    Log.i(TAG, "spblk08bx: Range is 1 to 23 hours");
                    return false;
                } else {
                    spblk08bx.setError(null);
                }
            }

            if (spblk08c.isChecked()) {
                if (spblk08cx.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                    spblk08cx.setError("This Data is Required!");
                    spblk08cx.requestFocus();
                    Log.i(TAG, "spblk08cx: This Data is Required!");
                    return false;
                } else {
                    spblk08cx.setError(null);
                }

                if (Integer.valueOf(spblk08cx.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblk08) + " - " + getString(R.string.day), Toast.LENGTH_SHORT).show();
                    spblk08cx.setError("Can not be zero");
                    spblk08cx.requestFocus();
                    Log.i(TAG, "spblk08bx: Can not be zero");
                    return false;
                } else {
                    spblk08cx.setError(null);
                }
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

        if (spblk07b.isChecked() || !spblk09a.isChecked()) {
            if (spblk10.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk10), Toast.LENGTH_SHORT).show();
                spblk10a.setError("This data is Required!");
                Log.i(TAG, "spblk10: This data is Required!");
                spblk10a.setFocusable(true);
                spblk10a.setFocusableInTouchMode(true);
                spblk10a.requestFocus();
                return false;
            } else {
                spblk10a.setError(null);
            }
        }
        if (spblk11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk11), Toast.LENGTH_SHORT).show();
            spblk11a.setError("This data is Required!");
            Log.i(TAG, "spblk11: This data is Required!");
            spblk11a.setFocusable(true);
            spblk11a.setFocusableInTouchMode(true);
            spblk11a.requestFocus();
            return false;
        } else {
            spblk11a.setError(null);
        }

        if (spblk12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk12), Toast.LENGTH_SHORT).show();
            spblk12a.setError("This data is Required!");
            Log.i(TAG, "spblk12: This data is Required!");
            spblk12a.setFocusable(true);
            spblk12a.setFocusableInTouchMode(true);
            spblk12a.requestFocus();
            return false;
        } else {
            spblk12a.setError(null);
        }

        if (spblk1301.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1301), Toast.LENGTH_SHORT).show();
            spblk1301a.setError("This data is Required!");
            Log.i(TAG, "spblk1301: This data is Required!");
            spblk1301a.setFocusable(true);
            spblk1301a.setFocusableInTouchMode(true);
            spblk1301a.requestFocus();
            return false;
        } else {
            spblk1301a.setError(null);
        }

        if (spblk1302.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1302), Toast.LENGTH_SHORT).show();
            spblk1302a.setError("This data is Required!");
            Log.i(TAG, "spblk1302: This data is Required!");
            spblk1302a.setFocusable(true);
            spblk1302a.setFocusableInTouchMode(true);
            spblk1302a.requestFocus();
            return false;
        } else {
            spblk1302a.setError(null);
        }


        if (spblk1302a.isChecked()) {
            if (spblk1302x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1302) + "-" + getString(R.string.times), Toast.LENGTH_SHORT).show();
                spblk1302x.setError("This data is Required!");
                Log.i(TAG, "spblk1302x: This data is Required!");
                spblk1302x.requestFocus();
                return false;
            } else {
                spblk1302x.setError(null);
            }

            if (Integer.valueOf(spblk1302x.getText().toString()) < 1 || Integer.valueOf(spblk1302x.getText().toString()) > 20) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                spblk1302x.setError("Range is 1 to 20 times...");
                spblk1302x.requestFocus();
                Log.i(TAG, "spblk1302x: Range is 1 to 20 times...");
                return false;
            } else {
                spblk1302x.setError(null);
            }
        }


        if (spblk1303.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1303), Toast.LENGTH_SHORT).show();
            spblk1303a.setError("This data is Required!");
            Log.i(TAG, "spblk1303: This data is Required!");
            spblk1303a.setFocusable(true);
            spblk1303a.setFocusableInTouchMode(true);
            spblk1303a.requestFocus();
            return false;
        } else {
            spblk1303a.setError(null);
        }

        if (spblk1303a.isChecked()) {
            if (spblk1302x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1303) + "-" + getString(R.string.times), Toast.LENGTH_SHORT).show();
                spblk1303x.setError("This data is Required!");
                Log.i(TAG, "spblk1303x: This data is Required!");
                spblk1303x.requestFocus();
                return false;
            } else {
                spblk1303x.setError(null);
            }

            if (Integer.valueOf(spblk1303x.getText().toString()) < 1 || Integer.valueOf(spblk1303x.getText().toString()) > 20) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                spblk1303x.setError("Range is 1 to 20 times...");
                spblk1303x.requestFocus();
                Log.i(TAG, "spblk1303x: Range is 1 to 20 times...");
                return false;
            } else {
                spblk1303x.setError(null);
            }
        }

        if (spblk1304.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1304), Toast.LENGTH_SHORT).show();
            spblk1304a.setError("This data is Required!");
            Log.i(TAG, "spblk1304: This data is Required!");
            spblk1304a.setFocusable(true);
            spblk1304a.setFocusableInTouchMode(true);
            spblk1304a.requestFocus();
            return false;
        } else {
            spblk1304a.setError(null);
        }

        if (spblk1305.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1305), Toast.LENGTH_SHORT).show();
            spblk1305a.setError("This data is Required!");
            Log.i(TAG, "spblk1305: This data is Required!");
            spblk1305a.setFocusable(true);
            spblk1305a.setFocusableInTouchMode(true);
            spblk1305a.requestFocus();
            return false;
        } else {
            spblk1305a.setError(null);
        }

        if (spblk1306.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1306), Toast.LENGTH_SHORT).show();
            spblk1306a.setError("This data is Required!");
            Log.i(TAG, "spblk1306: This data is Required!");
            spblk1306a.setFocusable(true);
            spblk1306a.setFocusableInTouchMode(true);
            spblk1306a.requestFocus();
            return false;
        } else {
            spblk1306a.setError(null);
        }

        if (spblk1306a.isChecked()) {
            if (spblk1306x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1306) + "-" + getString(R.string.times), Toast.LENGTH_SHORT).show();
                spblk1306x.setError("This data is Required!");
                Log.i(TAG, "spblk1306x: This data is Required!");
                spblk1306x.requestFocus();
                return false;
            } else {
                spblk1303x.setError(null);
            }

            if (Integer.valueOf(spblk1306x.getText().toString()) < 1 || Integer.valueOf(spblk1306x.getText().toString()) > 5) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                spblk1306x.setError("Range is 1 to 5 times...");
                spblk1306x.requestFocus();
                Log.i(TAG, "spblk1306x: Range is 1 to 5 times...");
                return false;
            } else {
                spblk1306x.setError(null);
            }
        }

        if (spblk1307.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1307), Toast.LENGTH_SHORT).show();
            spblk1307a.setError("This data is Required!");
            Log.i(TAG, "spblk1307: This data is Required!");
            spblk1307a.setFocusable(true);
            spblk1307a.setFocusableInTouchMode(true);
            spblk1307a.requestFocus();
            return false;
        } else {
            spblk1307a.setError(null);
        }

        if (spblk1308.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1308), Toast.LENGTH_SHORT).show();
            spblk1308a.setError("This data is Required!");
            Log.i(TAG, "spblk1308: This data is Required!");
            spblk1308a.setFocusable(true);
            spblk1308a.setFocusableInTouchMode(true);
            spblk1308a.requestFocus();
            return false;
        } else {
            spblk1308a.setError(null);
        }

        if (spblk1309.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1309), Toast.LENGTH_SHORT).show();
            spblk1309a.setError("This data is Required!");
            Log.i(TAG, "spblk1309: This data is Required!");
            spblk1309a.setFocusable(true);
            spblk1309a.setFocusableInTouchMode(true);
            spblk1309a.requestFocus();
            return false;
        } else {
            spblk1309a.setError(null);
        }

        if (spblk1401.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1401), Toast.LENGTH_SHORT).show();
            spblk1401a.setError("This data is Required!");
            Log.i(TAG, "spblk1401: This data is Required!");
            spblk1401a.setFocusable(true);
            spblk1401a.setFocusableInTouchMode(true);
            spblk1401a.requestFocus();
            return false;
        } else {
            spblk1401a.setError(null);
        }

        if (spblk1402.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1402), Toast.LENGTH_SHORT).show();
            spblk1402a.setError("This data is Required!");
            Log.i(TAG, "spblk1402: This data is Required!");
            spblk1402a.setFocusable(true);
            spblk1402a.setFocusableInTouchMode(true);
            spblk1402a.requestFocus();
            return false;
        } else {
            spblk1402a.setError(null);
        }

        if (spblk1403.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1403), Toast.LENGTH_SHORT).show();
            spblk1403a.setError("This data is Required!");
            Log.i(TAG, "spblk1403: This data is Required!");
            spblk1403a.setFocusable(true);
            spblk1403a.setFocusableInTouchMode(true);
            spblk1403a.requestFocus();
            return false;
        } else {
            spblk1403a.setError(null);
        }

        if (spblk1404.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1404), Toast.LENGTH_SHORT).show();
            spblk1404a.setError("This data is Required!");
            Log.i(TAG, "spblk1404: This data is Required!");
            spblk1404a.setFocusable(true);
            spblk1404a.setFocusableInTouchMode(true);
            spblk1404a.requestFocus();
            return false;
        } else {
            spblk1404a.setError(null);
        }

        if (spblk1405.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1405), Toast.LENGTH_SHORT).show();
            spblk1405a.setError("This data is Required!");
            Log.i(TAG, "spblk1405: This data is Required!");
            spblk1405a.setFocusable(true);
            spblk1405a.setFocusableInTouchMode(true);
            spblk1405a.requestFocus();
            return false;
        } else {
            spblk1405a.setError(null);
        }

        if (spblk1406.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1406), Toast.LENGTH_SHORT).show();
            spblk1406a.setError("This data is Required!");
            Log.i(TAG, "spblk1406: This data is Required!");
            spblk1406a.setFocusable(true);
            spblk1406a.setFocusableInTouchMode(true);
            spblk1406a.requestFocus();
            return false;
        } else {
            spblk1406a.setError(null);
        }

        if (spblk1407.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1407), Toast.LENGTH_SHORT).show();
            spblk1407a.setError("This data is Required!");
            Log.i(TAG, "spblk1407: This data is Required!");
            spblk1407a.setFocusable(true);
            spblk1407a.setFocusableInTouchMode(true);
            spblk1407a.requestFocus();
            return false;
        } else {
            spblk1407a.setError(null);
        }

        if (spblk1408.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1408), Toast.LENGTH_SHORT).show();
            spblk1408a.setError("This data is Required!");
            Log.i(TAG, "spblk1408: This data is Required!");
            spblk1408a.setFocusable(true);
            spblk1408a.setFocusableInTouchMode(true);
            spblk1408a.requestFocus();
            return false;
        } else {
            spblk1408a.setError(null);
        }

        if (spblk1409.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1409), Toast.LENGTH_SHORT).show();
            spblk1409a.setError("This data is Required!");
            Log.i(TAG, "spblk1409: This data is Required!");
            spblk1409a.setFocusable(true);
            spblk1409a.setFocusableInTouchMode(true);
            spblk1409a.requestFocus();
            return false;
        } else {
            spblk1409a.setError(null);
        }

        if (spblk1410.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1410), Toast.LENGTH_SHORT).show();
            spblk1410a.setError("This data is Required!");
            Log.i(TAG, "spblk1410: This data is Required!");
            spblk1410a.setFocusable(true);
            spblk1410a.setFocusableInTouchMode(true);
            spblk1410a.requestFocus();
            return false;
        } else {
            spblk1410a.setError(null);
        }

        if (spblk1411.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1411), Toast.LENGTH_SHORT).show();
            spblk1411a.setError("This data is Required!");
            Log.i(TAG, "spblk1411: This data is Required!");
            spblk1411a.setFocusable(true);
            spblk1411a.setFocusableInTouchMode(true);
            spblk1411a.requestFocus();
            return false;
        } else {
            spblk1411a.setError(null);
        }

        if (spblk1412.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1412), Toast.LENGTH_SHORT).show();
            spblk1412a.setError("This data is Required!");
            Log.i(TAG, "spblk1412: This data is Required!");
            spblk1412a.setFocusable(true);
            spblk1412a.setFocusableInTouchMode(true);
            spblk1412a.requestFocus();
            return false;
        } else {
            spblk1412a.setError(null);
        }


        if (spblk1413.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1413), Toast.LENGTH_SHORT).show();
            spblk1413a.setError("This data is Required!");
            Log.i(TAG, "spblk1413: This data is Required!");
            spblk1413a.setFocusable(true);
            spblk1413a.setFocusableInTouchMode(true);
            spblk1413a.requestFocus();
            return false;
        } else {
            spblk1413a.setError(null);
        }

        if (spblk1414.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1414), Toast.LENGTH_SHORT).show();
            spblk1414a.setError("This data is Required!");
            Log.i(TAG, "spblk1414: This data is Required!");
            spblk1414a.setFocusable(true);
            spblk1414a.setFocusableInTouchMode(true);
            spblk1414a.requestFocus();
            return false;
        } else {
            spblk1414a.setError(null);
        }


        if (spblk1415.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1415), Toast.LENGTH_SHORT).show();
            spblk1415a.setError("This data is Required!");
            Log.i(TAG, "spblk1415: This data is Required!");
            spblk1415a.setFocusable(true);
            spblk1415a.setFocusableInTouchMode(true);
            spblk1415a.requestFocus();
            return false;
        } else {
            spblk1415a.setError(null);
        }

        if (spblk1416.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk1416), Toast.LENGTH_SHORT).show();
            spblk1416a.setError("This data is Required!");
            Log.i(TAG, "spblk1416: This data is Required!");
            spblk1416a.setFocusable(true);
            spblk1416a.setFocusableInTouchMode(true);
            spblk1416a.requestFocus();
            return false;
        } else {
            spblk1416a.setError(null);
        }


        if (is14AllNo()) {
            //============ Q 8 ==========
            if (spblk15.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk15), Toast.LENGTH_SHORT).show();
                spblk15a.setError("This data is Required!");
                spblk15a.setFocusable(true);
                spblk15a.setFocusableInTouchMode(true);
                spblk15a.requestFocus();
                Log.i(TAG, "spblk15: This data is Required!");
                return false;
            } else {
                spblk15a.setError(null);
            }

            if (is14AllNo() && spblk15a.isChecked()) {
                Toast.makeText(this, "ERROR: " + getString(R.string.spblk1401) + "Atleast one should be Yes", Toast.LENGTH_SHORT).show();
                spblk15a.setError("Atlease one should be yes Other wise Select no in " + getString(R.string.spblk15));
                spblk1401a.setError("Atlease one should be yes Other wise Select no in " + getString(R.string.spblk15));
                spblk15a.setFocusable(true);
                spblk15a.setFocusableInTouchMode(true);
                spblk15a.requestFocus();
                Log.i(TAG, "spblk1401: This data is Required!");
                return false;
            } else {
                spblk15a.setError(null);
                spblk1401a.setError(null);
            }

            if (!is14AllNo() && spblk15b.isChecked()) {
                Toast.makeText(this, "ERROR: " + getString(R.string.spblk15) + "Can not be no", Toast.LENGTH_SHORT).show();
                spblk15a.setError("Can not be no in " + getString(R.string.spblk15));
                spblk1401a.setError("Atlease one should be yes Other wise Select no in " + getString(R.string.spblk15));
                spblk15a.setFocusable(true);
                spblk15a.setFocusableInTouchMode(true);
                spblk15a.requestFocus();
                Log.i(TAG, "spblk15: This data is Required!");
                return false;
            } else {
                spblk15a.setError(null);
                spblk1401a.setError(null);
            }
        }


        if (!is14AllNo()) {
            //============ Q 9 ==========

            if (spblk16.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk16), Toast.LENGTH_SHORT).show();
                spblk16a.setError("This data is Required!");
                spblk16a.setFocusable(true);
                spblk16a.setFocusableInTouchMode(true);
                spblk16a.requestFocus();
                Log.i(TAG, "spblk16: This data is Required!");
                return false;
            } else {
                spblk16a.setError(null);
            }

//            if (crf0801.isChecked()) {
            if (spblk16a.isChecked()) {
                if (spblk16x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk16), Toast.LENGTH_SHORT).show();
                    spblk16x.setError("This data is Required!");
                    spblk16x.requestFocus();
                    Log.i(TAG, "spblk16: This data is Required!");
                    return false;
                } else {
                    spblk16x.setError(null);
                }


                if (Integer.valueOf(spblk16x.getText().toString()) < 1 || Integer.valueOf(spblk16x.getText().toString()) > 10) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                    spblk16x.setError("Range is 1 to 10 times...");
                    spblk16x.requestFocus();
                    Log.i(TAG, "spblk16x: Range is 1 to 10 times...");
                    return false;
                } else {
                    spblk16x.setError(null);
                }
            }
        }

        if (spblk17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk17), Toast.LENGTH_SHORT).show();
            spblk17a.setError("This data is Required!");
            spblk17a.setFocusable(true);
            spblk17a.setFocusableInTouchMode(true);
            spblk17a.requestFocus();
            Log.i(TAG, "spblk17: This data is Required!");
            return false;
        } else {
            spblk17a.setError(null);
        }

        if (spblk18.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk18), Toast.LENGTH_SHORT).show();
            spblk18a.setError("This data is Required!");
            spblk18a.setFocusable(true);
            spblk18a.setFocusableInTouchMode(true);
            spblk18a.requestFocus();
            Log.i(TAG, "spblk18: This data is Required!");
            return false;
        } else {
            spblk18a.setError(null);
        }

        if (spblk19.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk19), Toast.LENGTH_SHORT).show();
            spblk19a.setError("This data is Required!");
            spblk19a.setFocusable(true);
            spblk19a.setFocusableInTouchMode(true);
            spblk19a.requestFocus();
            Log.i(TAG, "spblk19: This data is Required!");
            return false;
        } else {
            spblk19a.setError(null);
        }

        if (spblk20.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk20), Toast.LENGTH_SHORT).show();
            spblk20a.setError("This data is Required!");
            spblk20a.setFocusable(true);
            spblk20a.setFocusableInTouchMode(true);
            spblk20a.requestFocus();
            Log.i(TAG, "spblk20: This data is Required!");
            return false;
        } else {
            spblk20a.setError(null);
        }

        if (spblk21.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblk21), Toast.LENGTH_SHORT).show();
            spblk21a.setError("This data is Required!");
            spblk21a.setFocusable(true);
            spblk21a.setFocusableInTouchMode(true);
            spblk21a.requestFocus();
            Log.i(TAG, "spblk21: This data is Required!");
            return false;
        } else {
            spblk21a.setError(null);
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
            fldGrpspblk16.setVisibility(View.GONE);
            spblk16x.setText(null);
            spblk16.clearCheck();

        } else {
            fldGrpspblk15.setVisibility(View.GONE);
            fldGrpspblk16.setVisibility(View.VISIBLE);
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

package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.FormsContract;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.TehsilContract;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.UCsContract;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.VillagesContract;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses.MembersCount;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();
    @BindView(R.id.spTehsil)
    Spinner spTehsil;
    @BindView(R.id.spUCs)
    Spinner spUCs;
    @BindView(R.id.spbla03)
    Spinner spbla03;
    @BindView(R.id.spbla04)
    EditText spbla04;
    @BindView(R.id.respname)
    EditText respname;
    @BindView(R.id.respage)
    EditText respage;
    @BindView(R.id.respedu)
    RadioGroup respedu;
    @BindView(R.id.respedu66)
    RadioButton respedu66;
    @BindView(R.id.respedua)
    RadioButton respedua;
    @BindView(R.id.respedub)
    RadioButton respedub;
    @BindView(R.id.respeduc)
    RadioButton respeduc;
    @BindView(R.id.respedud)
    RadioButton respedud;
    @BindView(R.id.respedue)
    RadioButton respedue;
    @BindView(R.id.respeduf)
    RadioButton respeduf;
    @BindView(R.id.respedug)
    RadioButton respedug;
    @BindView(R.id.respocc)
    RadioGroup respocc;
    @BindView(R.id.respocc77)
    RadioButton respocc77;
    @BindView(R.id.respocca)
    RadioButton respocca;
    @BindView(R.id.respoccb)
    RadioButton respoccb;
    @BindView(R.id.respoccc)
    RadioButton respoccc;
    @BindView(R.id.respoccd)
    RadioButton respoccd;
    @BindView(R.id.respocce)
    RadioButton respocce;
    @BindView(R.id.respoccf)
    RadioButton respoccf;
    @BindView(R.id.respoccg)
    RadioButton respoccg;
    @BindView(R.id.respocch)
    RadioButton respocch;
    @BindView(R.id.respocci)
    RadioButton respocci;
    @BindView(R.id.respoccj)
    RadioButton respoccj;
    @BindView(R.id.spbla05)
    RadioGroup spbla05;
    @BindView(R.id.spbla05a)
    RadioButton spbla05a;
    @BindView(R.id.spbla05b)
    RadioButton spbla05b;
    @BindView(R.id.spbla05c)
    RadioButton spbla05c;
    @BindView(R.id.spbla06a)
    CheckBox spbla06a;
    @BindView(R.id.spbla06b)
    CheckBox spbla06b;
    @BindView(R.id.spbla06c)
    CheckBox spbla06c;
    @BindView(R.id.spbla06d)
    CheckBox spbla06d;
    @BindView(R.id.spbla07t)
    EditText spbla07t;
    @BindView(R.id.spbla07pw)
    EditText spbla07pw;
    @BindView(R.id.spbla07lw)
    EditText spbla07lw;
    @BindView(R.id.spbla07mw)
    EditText spbla07mw;
    @BindView(R.id.spbla07m6)
    EditText spbla07m6;
    @BindView(R.id.spbla07f6)
    EditText spbla07f6;
    @BindView(R.id.spbla07m23)
    EditText spbla07m23;
    @BindView(R.id.spbla07f23)
    EditText spbla07f23;
    @BindView(R.id.spbla07m59)
    EditText spbla07m59;
    @BindView(R.id.spbla07f59)
    EditText spbla07f59;
    @BindView(R.id.spbla08)
    RadioGroup spbla08;
    @BindView(R.id.spbla08a)
    RadioButton spbla08a;
    @BindView(R.id.spbla08b)
    RadioButton spbla08b;
    @BindView(R.id.spbla08c)
    RadioButton spbla08c;

    @BindView(R.id.fldGrprespname)
    LinearLayout fldGrprespname;


    /*@BindViews({R.id.spbla06a, R.id.spbla06b})
    List<RadioGroup> spbla06;*/
    @BindView(R.id.btn_Continue)
    Button btn_Continue;
    @BindView(R.id.btn_End)
    Button btn_End;

    ArrayList<String> lablesTehsil;
    Collection<TehsilContract> TehsilList;
    Map<String, String> tehsilMap;

    ArrayList<String> lablesUCs;
    Collection<UCsContract> UcsList;
    Map<String, String> ucsMap;

    ArrayList<String> lablesVillages;
    Collection<VillagesContract> VillagesList;
    Map<String, String> VillagesMap;

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

        spbla03.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                Arrays.asList(new String[]{"....", "abc"})));


        spbla08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (spbla08a.isChecked()) {
                    btn_Continue.setVisibility(View.VISIBLE);
                    btn_End.setVisibility(View.GONE);
                    fldGrprespname.setVisibility(View.VISIBLE);
                    respname.requestFocus();
                } else {

                    respname.setText(null);
                    respage.setText(null);
                    respedu.clearCheck();
                    respocc.clearCheck();
                    spbla05.clearCheck();
                    spbla06a.setChecked(false);
                    spbla06b.setChecked(false);
                    spbla06c.setChecked(false);
                    spbla06d.setChecked(false);

                    spbla07t.setText(null);
                    spbla07pw.setText(null);
                    spbla07lw.setText(null);
                    spbla07mw.setText(null);
                    spbla07m6.setText(null);
                    spbla07f6.setText(null);
                    spbla07m23.setText(null);
                    spbla07f23.setText(null);
                    spbla07m59.setText(null);
                    spbla07f59.setText(null);


                    btn_Continue.setVisibility(View.GONE);
                    btn_End.setVisibility(View.VISIBLE);
                    fldGrprespname.setVisibility(View.GONE);
                }
            }
        });

        db = new DatabaseHelper(this);

        populateSpinner(this);

    }


    public void populateSpinner(final Context context) {

        final Context mContext = context;

        // Populate Tehsils list
        TehsilList = db.getAllTehsils();

        lablesTehsil = new ArrayList<>();
        tehsilMap = new HashMap<>();

        lablesTehsil.add("Select Taluka..");

        for (TehsilContract taluka : TehsilList) {
            lablesTehsil.add(taluka.getTehsil_name());

            tehsilMap.put(taluka.getTehsil_name(), taluka.getTehsilcode());
        }

        spTehsil.setAdapter(new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, lablesTehsil));

        spTehsil.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Populate UCs list

                if (spTehsil.getSelectedItemPosition() != 0) {
                    MainApp.tehsilCode = Integer.valueOf(tehsilMap.get(spTehsil.getSelectedItem().toString()));
                }

                lablesUCs = new ArrayList<>();
                ucsMap = new HashMap<>();
                lablesUCs.add("Select UC..");

                if (spTehsil.getSelectedItemPosition() != 0) {
                    UcsList = db.getAllUCs(String.valueOf(MainApp.tehsilCode));
                    for (UCsContract ucs : UcsList) {
                        lablesUCs.add(ucs.getUcs());
                        ucsMap.put(ucs.getUcs(), ucs.getUccode());
                    }
                }
                spUCs.setAdapter(new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, lablesUCs));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spUCs.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Populate UCs list

                if (spUCs.getSelectedItemPosition() != 0) {
                    MainApp.ucCode = Integer.valueOf(ucsMap.get(spUCs.getSelectedItem().toString()));
                }

                lablesVillages = new ArrayList<>();
                VillagesMap = new HashMap<>();
                lablesVillages.add("Select Village..");

                VillagesList = db.getVillages(String.valueOf(MainApp.ucCode));

                if (VillagesList.size() != 0) {
                    for (VillagesContract vil : VillagesList) {
                        lablesVillages.add(vil.getVillagename());
                        VillagesMap.put(vil.getVillagename(), vil.getVillagecode());
                    }
                }

                spbla03.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, lablesVillages));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spbla03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (spbla03.getSelectedItemPosition() != 0) {
                    MainApp.villageCode = Integer.valueOf(VillagesMap.get(spbla03.getSelectedItem().toString()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                MainApp.endActivity(this, this);
            }
        }
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                Intent secNext = new Intent(this, FamilyMemberListActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);
                finish();

            }
        }


    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(new Date().toString());
        MainApp.fc.setInterviewer01(MainApp.userName);
        MainApp.fc.setInterviewer02(MainApp.userName2);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        MainApp.fc.setAppVersion(MainApp.versionName + "." + MainApp.versionCode);

        JSONObject sInfo = new JSONObject();

        sInfo.put("tehsil_code", String.valueOf(MainApp.tehsilCode));
        sInfo.put("uc_code", String.valueOf(MainApp.ucCode));
        sInfo.put("village_code", String.valueOf(MainApp.villageCode));
        sInfo.put("resp_name", respname.getText().toString());
        sInfo.put("resp_age", respage.getText());
        sInfo.put("resp_edu", respedua.isChecked() ? "1" : respedub.isChecked() ? "2" : respeduc.isChecked() ? "3"
                : respedud.isChecked() ? "4" : respedue.isChecked() ? "5" : respeduf.isChecked() ? "6" : respedug.isChecked() ? "7"
                : respedu66.isChecked() ? "66" : "0");
        sInfo.put("resp_occ", respocc77.isChecked() ? "77" : respocca.isChecked() ? "1" : respoccb.isChecked() ? "2"
                : respoccc.isChecked() ? "3"
                : respoccd.isChecked() ? "4" : respocce.isChecked() ? "5" : respoccf.isChecked() ? "6"
                : respoccg.isChecked() ? "7" : respocch.isChecked() ? "8" : respocci.isChecked() ? "9"
                : respoccj.isChecked() ? "10" : "0");
        sInfo.put("spbla05", spbla05a.isChecked() ? "1" : spbla05b.isChecked() ? "2" : spbla05c.isChecked() ? "3" : "0");
        sInfo.put("spbla06a", spbla06a.isChecked() ? "1" : "0");
        sInfo.put("spbla06b", spbla06b.isChecked() ? "2" : "0");
        sInfo.put("spbla06c", spbla06c.isChecked() ? "3" : "0");
        sInfo.put("spbla06d", spbla06d.isChecked() ? "4" : "0");
        sInfo.put("spbla07t", spbla07t.getText().toString());
        sInfo.put("spbla07pw", spbla07pw.getText().toString());
        sInfo.put("spbla07lw", spbla07lw.getText().toString());
        sInfo.put("spbla07mw", spbla07mw.getText().toString());
        sInfo.put("spbla07m6", spbla07m6.getText().toString());
        sInfo.put("spbla07f6", spbla07f6.getText().toString());
        sInfo.put("spbla07m23", spbla07m23.getText().toString());
        sInfo.put("spbla07f23", spbla07f23.getText().toString());
        sInfo.put("spbla07m59", spbla07m59.getText().toString());
        sInfo.put("spbla07f59", spbla07f59.getText().toString());
        sInfo.put("spbla08", spbla08a.isChecked() ? "1" : spbla08b.isChecked() ? "2" : spbla08c.isChecked() ? "3" : "0");

        MainApp.fc.setsA(String.valueOf(sInfo));

        MainApp.familyMembersList = new ArrayList<>();

        if (spbla08a.isChecked()) {


            Map<Integer, Map<Integer, String>> children = new HashMap<>();
            Map<Integer, String> child = new HashMap<>();
            child.put(1, spbla07m6.getText().toString());
            child.put(2, spbla07f6.getText().toString());

            children.put(0, child);
            child = new HashMap<>();

            child.put(1, spbla07m23.getText().toString());
            child.put(2, spbla07f23.getText().toString());

            children.put(1, child);
            child = new HashMap<>();

            child.put(1, spbla07m59.getText().toString());
            child.put(2, spbla07f59.getText().toString());

            children.put(2, child);

//        Women
            Map<Integer, String> women = new HashMap<>();
            women.put(0, spbla07pw.getText().toString());
            women.put(1, spbla07lw.getText().toString());
            women.put(2, spbla07mw.getText().toString());

            MainApp.members = new MembersCount(Integer.parseInt(spbla07t.getText().toString()), children, women);

            children = new HashMap<>();
            child = new HashMap<>();
            child.put(1, "0");
            child.put(2, "0");

            children.put(0, child);
            child = new HashMap<>();

            child.put(1, "0");
            child.put(2, "0");

            children.put(1, child);
            child = new HashMap<>();

            child.put(1, "0");
            child.put(2, "0");

            children.put(2, child);

            MainApp.checkMembers = new MembersCount(0, children);
        }
        MainApp.setGPS(this);

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(MainApp.fc);

        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc.set_UID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormID();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (spbla03.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla03), Toast.LENGTH_SHORT).show();
            ((TextView) spbla03.getSelectedView()).setText("This Data is Required");
            ((TextView) spbla03.getSelectedView()).setTextColor(Color.RED);
            spbla03.requestFocus();
            Log.i(TAG, "spbla03: This Data is Required!");
            return false;
        } else {
            ((TextView) spbla03.getSelectedView()).setError(null);
        }

        if (spbla04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla04), Toast.LENGTH_SHORT).show();
            spbla04.setError("This data is Required!");
            Log.i(TAG, "spbla04: This data is Required!");

            spbla04.requestFocus();
            return false;
        } else {
            spbla04.setError(null);
        }


        if (spbla08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla08), Toast.LENGTH_SHORT).show();
            spbla08a.setError("This data is Required!");
            Log.i(TAG, "spbla08: This data is Required!");
            spbla08a.setFocusable(true);
            spbla08a.setFocusableInTouchMode(true);
            spbla08a.requestFocus();
            return false;
        } else {
            spbla08a.setError(null);
        }


        if (spbla08a.isChecked()) {


            if (respname.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla11), Toast.LENGTH_SHORT).show();
                respname.setError("This data is Required!");
                Log.i(TAG, "respname: This data is Required!");

                respname.requestFocus();
                return false;
            } else {
                respname.setError(null);
            }


            if (respage.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla12), Toast.LENGTH_SHORT).show();
                respage.setError("This data is Required!");
                Log.i(TAG, "respage: This data is Required!");

                respage.requestFocus();
                return false;
            } else {
                respage.setError(null);
            }

            if (Integer.valueOf(respage.getText().toString()) < 15 && Integer.valueOf(respage.getText().toString()) > 49) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla12), Toast.LENGTH_SHORT).show();
                respage.setError("Age should be 15 to 49 years");
                Log.i(TAG, "respage: Age should be 15 to 49 years!");

                respage.requestFocus();
                return false;
            } else {
                respage.setError(null);
            }


            if (respedu.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla13), Toast.LENGTH_SHORT).show();
                respedua.setError("This data is required");
                respedua.setFocusable(true);
                respedua.setFocusableInTouchMode(true);
                respedua.requestFocus();
                Log.i(TAG, "respedu: This Data is Required!");
                return false;
            } else {
                respedua.setError(null);
            }

            if (respocc.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spbla14), Toast.LENGTH_SHORT).show();
                respocca.setError("This data is required");
                respocca.setFocusable(true);
                respocca.setFocusableInTouchMode(true);
                respocca.requestFocus();
                Log.i(TAG, "respocc: This Data is Required!");
                return false;
            } else {
                respocca.setError(null);
            }

            if (spbla05.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla05), Toast.LENGTH_SHORT).show();
                spbla05a.setError("This data is Required!");
                Log.i(TAG, "spbla05: This data is Required!");
                spbla05a.setFocusable(true);
                spbla05a.setFocusableInTouchMode(true);
                spbla05a.requestFocus();
                return false;
            } else {
                spbla05a.setError(null);
            }

            if (!(spbla06a.isChecked() || spbla06b.isChecked() || spbla06c.isChecked() || spbla06d.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla06), Toast.LENGTH_SHORT).show();
                spbla06a.setError("This data is Required!");
                Log.i(TAG, "spbla06: This data is Required!");
                spbla06a.setFocusable(true);
                spbla06a.setFocusableInTouchMode(true);
                spbla06a.requestFocus();
                return false;
            } else {
                spbla06a.setError(null);
            }

            if (spbla05a.isChecked() && !spbla06a.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla06), Toast.LENGTH_SHORT).show();
                spbla05a.setError("Check again!");
                spbla06a.setError("Check again!");
                Log.i(TAG, "spbla05: Check again");
                spbla05a.setFocusable(true);
                spbla05a.setFocusableInTouchMode(true);
                spbla05a.requestFocus();
                spbla06a.setFocusable(true);
                return false;
            } else {
                spbla05a.setError(null);
                spbla06a.setError(null);
            }

            if (spbla05b.isChecked() && !spbla06b.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla06), Toast.LENGTH_SHORT).show();
                spbla05b.setError("Check again!");
                spbla06b.setError("Check again!");
                Log.i(TAG, "spbla05: Check again");
                spbla05b.setFocusable(true);
                spbla05b.setFocusableInTouchMode(true);
                spbla05b.requestFocus();
                return false;
            } else {
                spbla05b.setError(null);
                spbla06b.setError(null);
            }

            if (spbla05c.isChecked() && (!spbla06c.isChecked() || !spbla06d.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla06), Toast.LENGTH_SHORT).show();
                spbla05c.setError("Check again!");
                spbla06c.setError("Check again!");
                Log.i(TAG, "spbla05: Check again");
                spbla05b.setFocusable(true);
                spbla05b.setFocusableInTouchMode(true);
                spbla05b.requestFocus();
                return false;
            } else {
                spbla05b.setError(null);
                spbla06c.setError(null);
            }


            if (spbla07t.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07t), Toast.LENGTH_SHORT).show();
                spbla07t.setError("This data is Required!");
                Log.i(TAG, "spbla07t: This data is Required!");

                spbla07t.requestFocus();
                return false;
            } else {
                spbla07t.setError(null);
            }

            if (spbla07pw.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07pw), Toast.LENGTH_SHORT).show();
                spbla07pw.setError("This data is Required!");
                Log.i(TAG, "spbla07pw: This data is Required!");

                spbla07pw.requestFocus();
                return false;
            } else {
                spbla07pw.setError(null);
            }

            if (spbla07lw.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07lw), Toast.LENGTH_SHORT).show();
                spbla07lw.setError("This data is Required!");
                Log.i(TAG, "spbla07lw: This data is Required!");

                spbla07lw.requestFocus();
                return false;
            } else {
                spbla07lw.setError(null);
            }

            if (spbla07mw.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07mw), Toast.LENGTH_SHORT).show();
                spbla07mw.setError("This data is Required!");
                Log.i(TAG, "spbla07mw: This data is Required!");

                spbla07mw.requestFocus();
                return false;
            } else {
                spbla07mw.setError(null);
            }

            if (spbla07m6.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07a), Toast.LENGTH_SHORT).show();
                spbla07m6.setError("This data is Required!");
                Log.i(TAG, "spbla07m6: This data is Required!");

                spbla07m6.requestFocus();
                return false;
            } else {
                spbla07m6.setError(null);
            }

            if (spbla07f6.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07a), Toast.LENGTH_SHORT).show();
                spbla07f6.setError("This data is Required!");
                Log.i(TAG, "spbla07f6: This data is Required!");

                spbla07f6.requestFocus();
                return false;
            } else {
                spbla07f6.setError(null);
            }

            if (spbla07m23.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07b), Toast.LENGTH_SHORT).show();
                spbla07m23.setError("This data is Required!");
                Log.i(TAG, "spbla07m23: This data is Required!");

                spbla07m23.requestFocus();
                return false;
            } else {
                spbla07m23.setError(null);
            }

            if (spbla07f23.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spbla07b), Toast.LENGTH_SHORT).show();
                spbla07f23.setError("This data is Required!");
                Log.i(TAG, "spbla07f23: This data is Required!");

                spbla07f23.requestFocus();
                return false;
            } else {
                spbla07f23.setError(null);
            }


            if (spbla07m59.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07c), Toast.LENGTH_SHORT).show();
                spbla07m59.setError("This data is Required!");
                Log.i(TAG, "spbla07m59: This data is Required!");

                spbla07m59.requestFocus();
                return false;
            } else {
                spbla07m59.setError(null);
            }

            if (spbla07f59.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07c), Toast.LENGTH_SHORT).show();
                spbla07f59.setError("This data is Required!");
                Log.i(TAG, "spbla07f59: This data is Required!");

                spbla07f59.requestFocus();
                return false;
            } else {
                spbla07f59.setError(null);
            }

            if (spbla06a.isChecked() && Integer.valueOf(spbla07pw.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07pw), Toast.LENGTH_SHORT).show();
                spbla07pw.setError("Can not be zero..!");
                Log.i(TAG, "spbla07pw: Can not be zero..!");

                spbla07pw.requestFocus();
                return false;
            } else {
                spbla07pw.setError(null);
            }

            if (spbla06b.isChecked() && Integer.valueOf(spbla07lw.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07lw), Toast.LENGTH_SHORT).show();
                spbla07lw.setError("Can not be zero..!");
                Log.i(TAG, "spbla07lw: Can not be zero..!");

                spbla07lw.requestFocus();
                return false;
            } else {
                spbla07lw.setError(null);
            }

            if (spbla05c.isChecked() && Integer.valueOf(spbla07mw.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07mw), Toast.LENGTH_SHORT).show();
                spbla07mw.setError("Can not be zero..!");
                Log.i(TAG, "spbla07mw: Can not be zero..!");

                spbla07mw.requestFocus();
                return false;
            } else {
                spbla07mw.setError(null);
            }

            int sum23M = Integer.valueOf(spbla07m23.getText().toString()) + Integer.valueOf(spbla07f23.getText().toString());
            if (spbla06c.isChecked() && sum23M < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07b), Toast.LENGTH_SHORT).show();
                spbla07m23.setError("Can not be zero..!");
                spbla07f23.setError("Can not be zero..!");
                Log.i(TAG, "spbla07b: Can not be zero..!");

                spbla07m23.requestFocus();
                return false;
            } else {
                spbla07m23.setError(null);
                spbla07f23.setError(null);

            }

            int sum59M = Integer.valueOf(spbla07m59.getText().toString()) + Integer.valueOf(spbla07f59.getText().toString());

            if (spbla06d.isChecked() && sum59M < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07c), Toast.LENGTH_SHORT).show();
                spbla07m59.setError("Can not be zero..!");
                spbla07f59.setError("Can not be zero..!");
                Log.i(TAG, "spbla07c: Can not be zero..!");

                spbla07m59.requestFocus();
                return false;
            } else {
                spbla07m59.setError(null);
                spbla07f59.setError(null);
            }

            if (Integer.valueOf(spbla07t.getText().toString()) < (Integer.valueOf(spbla07pw.getText().toString())
                    + Integer.valueOf(spbla07lw.getText().toString()) + Integer.valueOf(spbla07mw.getText().toString())
                    + Integer.valueOf(spbla07m6.getText().toString()) + Integer.valueOf(spbla07f6.getText().toString())
                    + Integer.valueOf(spbla07m23.getText().toString()) + Integer.valueOf(spbla07f23.getText().toString())
                    + Integer.valueOf(spbla07m59.getText().toString()) + Integer.valueOf(spbla07f59.getText().toString()))) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spbla07t), Toast.LENGTH_SHORT).show();
                spbla07t.setError("Can not be greater than total members..!");
                Log.i(TAG, "spbla07: Can not be zero..!");

                spbla07t.requestFocus();
                return false;
            } else {
                spbla07t.setError(null);
            }


        }


        return true;
    }


}

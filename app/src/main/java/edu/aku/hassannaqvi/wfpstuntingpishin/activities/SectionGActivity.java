package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionGActivity extends Activity {

    private static final String TAG = SectionGActivity.class.getSimpleName();

    @BindView(R.id.spblg0101)
    RadioGroup spblg0101;
    @BindView(R.id.spblg0101a)
    RadioButton spblg0101a;
    @BindView(R.id.spblg0101b)
    RadioButton spblg0101b;
    @BindView(R.id.fldGrpspblg0101)
    LinearLayout fldGrpspblg0101;
    @BindView(R.id.spblg0101num)
    EditText spblg0101num;
    @BindView(R.id.spblg0101src)
    EditText spblg0101src;
    @BindView(R.id.spblg0102)
    RadioGroup spblg0102;
    @BindView(R.id.spblg010201)
    RadioButton spblg010201;
    @BindView(R.id.spblg010202)
    RadioButton spblg010202;
    @BindView(R.id.fldGrpspblg0102)
    LinearLayout fldGrpspblg0102;
    @BindView(R.id.spblg0102num)
    EditText spblg0102num;
    @BindView(R.id.spblg0102src)
    EditText spblg0102src;
    @BindView(R.id.spblg0103)
    RadioGroup spblg0103;
    @BindView(R.id.spblg010301)
    RadioButton spblg010301;
    @BindView(R.id.spblg010302)
    RadioButton spblg010302;
    @BindView(R.id.fldGrpspblg0103)
    LinearLayout fldGrpspblg0103;
    @BindView(R.id.spblg0103num)
    EditText spblg0103num;
    @BindView(R.id.spblg0103src)
    EditText spblg0103src;
    @BindView(R.id.spblg0104)
    RadioGroup spblg0104;
    @BindView(R.id.spblg010401)
    RadioButton spblg010401;
    @BindView(R.id.spblg010402)
    RadioButton spblg010402;
    @BindView(R.id.fldGrpspblg0104)
    LinearLayout fldGrpspblg0104;
    @BindView(R.id.spblg0104num)
    EditText spblg0104num;
    @BindView(R.id.spblg0104src)
    EditText spblg0104src;
    @BindView(R.id.spblg0105)
    RadioGroup spblg0105;
    @BindView(R.id.spblg010501)
    RadioButton spblg010501;
    @BindView(R.id.spblg010502)
    RadioButton spblg010502;
    @BindView(R.id.fldGrpspblg0105)
    LinearLayout fldGrpspblg0105;
    @BindView(R.id.spblg0105num)
    EditText spblg0105num;
    @BindView(R.id.spblg0105src)
    EditText spblg0105src;
    @BindView(R.id.spblg0106)
    RadioGroup spblg0106;
    @BindView(R.id.spblg010601)
    RadioButton spblg010601;
    @BindView(R.id.spblg010602)
    RadioButton spblg010602;
    @BindView(R.id.fldGrpspblg0106)
    LinearLayout fldGrpspblg0106;
    @BindView(R.id.spblg0106num)
    EditText spblg0106num;
    @BindView(R.id.spblg0106src)
    EditText spblg0106src;
    @BindView(R.id.spblg01g)
    RadioGroup spblg01g;
    @BindView(R.id.spblg01g01)
    RadioButton spblg01g01;
    @BindView(R.id.spblg01g02)
    RadioButton spblg01g02;
    @BindView(R.id.fldGrpcrj01g)
    LinearLayout fldGrpspblg01g;
    @BindView(R.id.spblg01gnum)
    EditText spblg01gnum;
    @BindView(R.id.spblg01gsrc)
    EditText spblg01gsrc;
    @BindView(R.id.spblg0108)
    RadioGroup spblg0108;
    @BindView(R.id.spblg010801)
    RadioButton spblg010801;
    @BindView(R.id.spblg010802)
    RadioButton spblg010802;
    @BindView(R.id.fldGrpcrj01h)
    LinearLayout fldGrpspblg0108;
    @BindView(R.id.spblg0108num)
    EditText spblg0108num;
    @BindView(R.id.spblg0108src)
    EditText spblg0108src;
    @BindView(R.id.spblg0109)
    RadioGroup spblg0109;
    @BindView(R.id.spblg010901)
    RadioButton spblg010901;
    @BindView(R.id.spblg010902)
    RadioButton spblg010902;
    @BindView(R.id.fldGrpspblg0109)
    LinearLayout fldGrpspblg0109;
    @BindView(R.id.spblg0109num)
    EditText spblg0109num;
    @BindView(R.id.spblg0109src)
    EditText spblg0109src;
    @BindView(R.id.spblg0110)
    RadioGroup spblg0110;
    @BindView(R.id.spblg011001)
    RadioButton spblg011001;
    @BindView(R.id.spblg011002)
    RadioButton spblg011002;
    @BindView(R.id.fldGrpspblg0110)
    LinearLayout fldGrpspblg0110;
    @BindView(R.id.spblg0110num)
    EditText spblg0110num;
    @BindView(R.id.spblg0110src)
    EditText spblg0110src;
    @BindView(R.id.spblg0111)
    RadioGroup spblg0111;
    @BindView(R.id.spblg011101)
    RadioButton spblg011101;
    @BindView(R.id.spblg011102)
    RadioButton spblg011102;
    @BindView(R.id.fldGrpspblg0111)
    LinearLayout fldGrpspblg0111;
    @BindView(R.id.spblg0111num)
    EditText spblg0111num;
    @BindView(R.id.spblg0111src)
    EditText spblg0111src;
    @BindView(R.id.spblg0112)
    RadioGroup spblg0112;
    @BindView(R.id.spblg011201)
    RadioButton spblg011201;
    @BindView(R.id.spblg011202)
    RadioButton spblg011202;
    @BindView(R.id.fldGrpspblg0112)
    LinearLayout fldGrpspblg0112;
    @BindView(R.id.spblg0112num)
    EditText spblg0112num;
    @BindView(R.id.spblg0112src)
    EditText spblg0112src;
    @BindView(R.id.spblg0113)
    RadioGroup spblg0113;
    @BindView(R.id.spblg011301)
    RadioButton spblg011301;
    @BindView(R.id.spblg011302)
    RadioButton spblg011302;
    @BindView(R.id.fldGrpspblg0113)
    LinearLayout fldGrpspblg0113;
    @BindView(R.id.spblg0113num)
    EditText spblg0113num;
    @BindView(R.id.spblg0113src)
    EditText spblg0113src;
    @BindView(R.id.spblg0114)
    RadioGroup spblg0114;
    @BindView(R.id.spblg011401)
    RadioButton spblg011401;
    @BindView(R.id.spblg011402)
    RadioButton spblg011402;
    @BindView(R.id.fldGrpspblg0114)
    LinearLayout fldGrpspblg0114;
    @BindView(R.id.spblg0114num)
    EditText spblg0114num;
    @BindView(R.id.spblg0114src)
    EditText spblg0114src;
    @BindView(R.id.spblg0115)
    RadioGroup spblg0115;
    @BindView(R.id.spblg011501)
    RadioButton spblg011501;
    @BindView(R.id.spblg011502)
    RadioButton spblg011502;
    @BindView(R.id.fldGrpspblg0115)
    LinearLayout fldGrpspblg0115;
    @BindView(R.id.spblg0115x)
    EditText spblg0115x;
    @BindView(R.id.spblg0115num)
    EditText spblg0115num;
    @BindView(R.id.spblg0115src)
    EditText spblg0115src;
    @BindView(R.id.spblg0116)
    RadioGroup spblg0116;
    @BindView(R.id.spblg011601)
    RadioButton spblg011601;
    @BindView(R.id.spblg011602)
    RadioButton spblg011602;
    @BindView(R.id.fldGrpspblg0116)
    LinearLayout fldGrpspblg0116;
    @BindView(R.id.spblg0116x)
    EditText spblg0116x;
    @BindView(R.id.spblg0116num)
    EditText spblg0116num;
    @BindView(R.id.spblg0116src)
    EditText spblg0116src;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g);
        ButterKnife.bind(this);

        spblg0101a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0101.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0101.setVisibility(View.GONE);
                    spblg0101num.setText(null);
                    spblg0101src.setText(null);
                }
            }
        });

        spblg010201.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0102.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0102.setVisibility(View.GONE);
                    spblg0102num.setText(null);
                    spblg0102src.setText(null);
                }
            }
        });

        spblg010301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0103.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0103.setVisibility(View.GONE);
                    spblg0103num.setText(null);
                    spblg0103src.setText(null);
                }
            }
        });

        spblg010401.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0104.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0104.setVisibility(View.GONE);
                    spblg0104num.setText(null);
                    spblg0104src.setText(null);
                }
            }
        });

        spblg010501.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0105.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0105.setVisibility(View.GONE);
                    spblg0105num.setText(null);
                    spblg0105src.setText(null);
                }
            }
        });

        spblg010601.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0106.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0106.setVisibility(View.GONE);
                    spblg0106num.setText(null);
                    spblg0106src.setText(null);
                }
            }
        });

        spblg01g01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01g.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01g.setVisibility(View.GONE);
                    spblg01gnum.setText(null);
                    spblg01gsrc.setText(null);
                }
            }
        });

        spblg010801.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0108.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0108.setVisibility(View.GONE);
                    spblg0108num.setText(null);
                    spblg0108src.setText(null);
                }
            }
        });

        spblg010901.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0109.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0109.setVisibility(View.GONE);
                    spblg0109num.setText(null);
                    spblg0109src.setText(null);
                }
            }
        });

        spblg011001.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0110.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0110.setVisibility(View.GONE);
                    spblg0110num.setText(null);
                    spblg0110src.setText(null);
                }
            }
        });

        spblg011101.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0111.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0111.setVisibility(View.GONE);
                    spblg0111num.setText(null);
                    spblg0111src.setText(null);
                }
            }
        });

        spblg011201.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0112.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0112.setVisibility(View.GONE);
                    spblg0112num.setText(null);
                    spblg0112src.setText(null);
                }
            }
        });

        spblg011301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0113.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0113.setVisibility(View.GONE);
                    spblg0113num.setText(null);
                    spblg0113src.setText(null);
                }
            }
        });

        spblg011401.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0114.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0114.setVisibility(View.GONE);
                    spblg0114num.setText(null);
                    spblg0114src.setText(null);
                }
            }
        });

        spblg011501.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0115.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0115.setVisibility(View.GONE);
                    spblg0115num.setText(null);
                    spblg0115x.setText(null);
                    spblg0115src.setText(null);
                }
            }
        });

        spblg011601.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0116.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0116.setVisibility(View.GONE);
                    spblg0116num.setText(null);
                    spblg0116x.setText(null);
                    spblg0116src.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        if (ValidateForm()) {
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
        }
    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        /*Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);*/
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//       }

        MainApp.endActivity(this, this);

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

     /*   int updcount = db.updateSG();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }*/

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject sg = new JSONObject();

        sg.put("spblg0101", spblg0101a.isChecked() ? "1" : spblg0101b.isChecked() ? "2" : "0");
        sg.put("spblg0101num", spblg0101num.getText().toString());
        sg.put("spblg0101src", spblg0101src.getText().toString());
        sg.put("spblg0102", spblg010201.isChecked() ? "1" : spblg010202.isChecked() ? "2" : "0");
        sg.put("spblg0102num", spblg0102num.getText().toString());
        sg.put("spblg0102src", spblg0102src.getText().toString());
        sg.put("spblg0103", spblg010301.isChecked() ? "1" : spblg010302.isChecked() ? "2" : "0");
        sg.put("spblg0103num", spblg0103num.getText().toString());
        sg.put("spblg0103src", spblg0103src.getText().toString());
        sg.put("spblg0104", spblg010401.isChecked() ? "1" : spblg010402.isChecked() ? "2" : "0");
        sg.put("spblg0104num", spblg0104num.getText().toString());
        sg.put("spblg0104src", spblg0104src.getText().toString());
        sg.put("spblg0105", spblg010501.isChecked() ? "1" : spblg010502.isChecked() ? "2" : "0");
        sg.put("spblg0105num", spblg0105num.getText().toString());
        sg.put("spblg0105src", spblg0105src.getText().toString());
        sg.put("spblg0106", spblg010601.isChecked() ? "1" : spblg010602.isChecked() ? "2" : "0");
        sg.put("spblg0106num", spblg0106num.getText().toString());
        sg.put("spblg0106src", spblg0106src.getText().toString());
        sg.put("spblg01g", spblg01g01.isChecked() ? "1" : spblg01g02.isChecked() ? "2" : "0");
        sg.put("spblg01gnum", spblg01gnum.getText().toString());
        sg.put("spblg01gsrc", spblg01gsrc.getText().toString());
        sg.put("spblg0108", spblg010801.isChecked() ? "1" : spblg010802.isChecked() ? "2" : "0");
        sg.put("spblg0108num", spblg0108num.getText().toString());
        sg.put("spblg0108src", spblg0108src.getText().toString());
        sg.put("spblg0109", spblg010901.isChecked() ? "1" : spblg010902.isChecked() ? "2" : "0");
        sg.put("spblg0109num", spblg0109num.getText().toString());
        sg.put("spblg0109src", spblg0109src.getText().toString());
        sg.put("spblg0110", spblg011001.isChecked() ? "1" : spblg011002.isChecked() ? "2" : "0");
        sg.put("spblg0110num", spblg0110num.getText().toString());
        sg.put("spblg0110src", spblg0110src.getText().toString());
        sg.put("spblg0111", spblg011101.isChecked() ? "1" : spblg011102.isChecked() ? "2" : "0");
        sg.put("spblg0111num", spblg0111num.getText().toString());
        sg.put("spblg0111src", spblg0111src.getText().toString());
        sg.put("spblg0112", spblg011201.isChecked() ? "1" : spblg011202.isChecked() ? "2" : "0");
        sg.put("spblg0112num", spblg0112num.getText().toString());
        sg.put("spblg0112src", spblg0112src.getText().toString());
        sg.put("spblg0113", spblg011301.isChecked() ? "1" : spblg011302.isChecked() ? "2" : "0");
        sg.put("spblg0113num", spblg0113num.getText().toString());
        sg.put("spblg0113src", spblg0113src.getText().toString());
        sg.put("spblg0114", spblg011401.isChecked() ? "1" : spblg011402.isChecked() ? "2" : "0");
        sg.put("spblg0114num", spblg0114num.getText().toString());
        sg.put("spblg0114src", spblg0114src.getText().toString());
        sg.put("spblg0115", spblg011501.isChecked() ? "1" : spblg011502.isChecked() ? "2" : "0");
        sg.put("spblg0115num", spblg0115num.getText().toString());
        sg.put("spblg0115x", spblg0115x.getText().toString());
        sg.put("spblg0115src", spblg0115src.getText().toString());
        sg.put("spblg0116", spblg011601.isChecked() ? "1" : spblg011602.isChecked() ? "2" : "0");
        sg.put("spblg0116num", spblg0116num.getText().toString());
        sg.put("spblg0116x", spblg0116x.getText().toString());
        sg.put("spblg0116src", spblg0116src.getText().toString());

        //   MainApp.fc.setsG(String.valueOf(sg));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== spblg0101 ==============
        if (spblg0101.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0101), Toast.LENGTH_SHORT).show();
            spblg0101b.setError("This data is Required!");
            spblg0101b.setFocusableInTouchMode(true);
            spblg0101b.setFocusable(true);
            spblg0101b.requestFocus();
            Log.i(TAG, "spblg0101: This data is Required!");
            return false;
        } else {
            spblg0101b.setError(null);
        }
        if (spblg0101a.isChecked()) {
            if (spblg0101num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0101num.setError("This data is Required!");
                spblg0101num.requestFocus();
                Log.i(TAG, "spblg0101num: This data is Required!");
                return false;
            } else {
                spblg0101num.setError(null);
            }

            if (spblg0101src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0101src.setError("This data is Required!");
                spblg0101src.requestFocus();
                Log.i(TAG, "spblg0101src: This data is Required!");
                return false;
            } else {
                spblg0101src.setError(null);
            }

        }

        //=================== spblg0102 ==============
        if (spblg0102.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0102), Toast.LENGTH_SHORT).show();
            spblg010202.setError("This data is Required!");
            spblg010202.setFocusableInTouchMode(true);
            spblg010202.setFocusable(true);
            spblg010202.requestFocus();
            Log.i(TAG, "spblg0102: This data is Required!");
            return false;
        } else {
            spblg010202.setError(null);
        }
        if (spblg010201.isChecked()) {
            if (spblg0102num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0102num.setError("This data is Required!");
                spblg0102num.requestFocus();
                Log.i(TAG, "spblg0102num: This data is Required!");
                return false;
            } else {
                spblg0102num.setError(null);
            }

            if (spblg0102src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0102src.setError("This data is Required!");
                spblg0102src.requestFocus();
                Log.i(TAG, "spblg0102src: This data is Required!");
                return false;
            } else {
                spblg0102src.setError(null);
            }

        }

        //=================== spblg0103 ==============
        if (spblg0103.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0103), Toast.LENGTH_SHORT).show();
            spblg010302.setError("This data is Required!");
            spblg010302.setFocusableInTouchMode(true);
            spblg010302.setFocusable(true);
            spblg010302.requestFocus();
            Log.i(TAG, "spblg0103: This data is Required!");
            return false;
        } else {
            spblg010302.setError(null);
        }
        if (spblg010301.isChecked()) {
            if (spblg0103num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0103num.setError("This data is Required!");
                spblg0103num.requestFocus();
                Log.i(TAG, "spblg0103num: This data is Required!");
                return false;
            } else {
                spblg0103num.setError(null);
            }

            if (spblg0103src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0103src.setError("This data is Required!");
                spblg0103src.requestFocus();
                Log.i(TAG, "spblg0103src: This data is Required!");
                return false;
            } else {
                spblg0103src.setError(null);
            }

        }

        //=================== spblg0104 ==============
        if (spblg0104.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0104), Toast.LENGTH_SHORT).show();
            spblg010402.setError("This data is Required!");
            spblg010402.setFocusableInTouchMode(true);
            spblg010402.setFocusable(true);
            spblg010402.requestFocus();
            Log.i(TAG, "spblg0104: This data is Required!");
            return false;
        } else {
            spblg010402.setError(null);
        }
        if (spblg010401.isChecked()) {
            if (spblg0104num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0104num.setError("This data is Required!");
                spblg0104num.requestFocus();
                Log.i(TAG, "spblg0104num: This data is Required!");
                return false;
            } else {
                spblg0104num.setError(null);
            }

            if (spblg0104src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0104src.setError("This data is Required!");
                spblg0104src.requestFocus();
                Log.i(TAG, "spblg0104src: This data is Required!");
                return false;
            } else {
                spblg0104src.setError(null);
            }

        }

        //=================== spblg0105 ==============
        if (spblg0105.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0105), Toast.LENGTH_SHORT).show();
            spblg010502.setError("This data is Required!");
            spblg010502.setFocusableInTouchMode(true);
            spblg010502.setFocusable(true);
            spblg010502.requestFocus();
            Log.i(TAG, "spblg0105: This data is Required!");
            return false;
        } else {
            spblg010502.setError(null);
        }
        if (spblg010501.isChecked()) {
            if (spblg0105num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0105num.setError("This data is Required!");
                spblg0105num.requestFocus();
                Log.i(TAG, "spblg0105num: This data is Required!");
                return false;
            } else {
                spblg0105num.setError(null);
            }

            if (spblg0105src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0105src.setError("This data is Required!");
                spblg0105src.requestFocus();
                Log.i(TAG, "spblg0105src: This data is Required!");
                return false;
            } else {
                spblg0105src.setError(null);
            }

        }

        //=================== spblg0106 ==============
        if (spblg0106.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0106), Toast.LENGTH_SHORT).show();
            spblg010602.setError("This data is Required!");
            spblg010602.setFocusableInTouchMode(true);
            spblg010602.setFocusable(true);
            spblg010602.requestFocus();
            Log.i(TAG, "spblg0106: This data is Required!");
            return false;
        } else {
            spblg010602.setError(null);
        }

        if (spblg010601.isChecked()) {
            if (spblg0106num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0106num.setError("This data is Required!");
                spblg0106num.requestFocus();
                Log.i(TAG, "spblg0106num: This data is Required!");
                return false;
            } else {
                spblg0106num.setError(null);
            }

            if (spblg0106src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0106src.setError("This data is Required!");
                spblg0106src.requestFocus();
                Log.i(TAG, "spblg0106src: This data is Required!");
                return false;
            } else {
                spblg0106src.setError(null);
            }

        }

        //=================== spblg01g ==============
        if (spblg01g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01g), Toast.LENGTH_SHORT).show();
            spblg01g02.setError("This data is Required!");
            spblg01g02.setFocusableInTouchMode(true);
            spblg01g02.setFocusable(true);
            spblg01g02.requestFocus();
            Log.i(TAG, "spblg01g: This data is Required!");
            return false;
        } else {
            spblg01g02.setError(null);
        }
        if (spblg01g01.isChecked()) {
            if (spblg01gnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01gnum.setError("This data is Required!");
                spblg01gnum.requestFocus();
                Log.i(TAG, "spblg01gnum: This data is Required!");
                return false;
            } else {
                spblg01gnum.setError(null);
            }

            if (spblg01gsrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01gsrc.setError("This data is Required!");
                spblg01gsrc.requestFocus();
                Log.i(TAG, "spblg01gsrc: This data is Required!");
                return false;
            } else {
                spblg01gsrc.setError(null);
            }

        }

        //=================== spblg0108 ==============
        if (spblg0108.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0108), Toast.LENGTH_SHORT).show();
            spblg010802.setError("This data is Required!");
            spblg010802.setFocusableInTouchMode(true);
            spblg010802.setFocusable(true);
            spblg010802.requestFocus();
            Log.i(TAG, "spblg0108: This data is Required!");
            return false;
        } else {
            spblg010802.setError(null);
        }
        if (spblg010801.isChecked()) {
            if (spblg0108num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0108num.setError("This data is Required!");
                spblg0108num.requestFocus();
                Log.i(TAG, "spblg0108num: This data is Required!");
                return false;
            } else {
                spblg0108num.setError(null);
            }

            if (spblg0108src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0108src.setError("This data is Required!");
                spblg0108src.requestFocus();
                Log.i(TAG, "spblg0108src: This data is Required!");
                return false;
            } else {
                spblg0108src.setError(null);
            }

        }

        //=================== spblg0109 ==============
        if (spblg0109.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0109), Toast.LENGTH_SHORT).show();
            spblg010902.setError("This data is Required!");
            spblg010902.setFocusableInTouchMode(true);
            spblg010902.setFocusable(true);
            spblg010902.requestFocus();
            Log.i(TAG, "spblg0109: This data is Required!");
            return false;
        } else {
            spblg010902.setError(null);
        }
        if (spblg010901.isChecked()) {
            if (spblg0109num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0109num.setError("This data is Required!");
                spblg0109num.requestFocus();
                Log.i(TAG, "spblg0109num: This data is Required!");
                return false;
            } else {
                spblg0109num.setError(null);
            }

            if (spblg0109src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0109src.setError("This data is Required!");
                spblg0109src.requestFocus();
                Log.i(TAG, "spblg0109src: This data is Required!");
                return false;
            } else {
                spblg0109src.setError(null);
            }

        }

        //=================== spblg0110 ==============
        if (spblg0110.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0110), Toast.LENGTH_SHORT).show();
            spblg011002.setError("This data is Required!");
            spblg011002.setFocusableInTouchMode(true);
            spblg011002.setFocusable(true);
            spblg011002.requestFocus();
            Log.i(TAG, "spblg0110: This data is Required!");
            return false;
        } else {
            spblg011002.setError(null);
        }
        if (spblg011001.isChecked()) {
            if (spblg0110num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0110num.setError("This data is Required!");
                spblg0110num.requestFocus();
                Log.i(TAG, "spblg0110num: This data is Required!");
                return false;
            } else {
                spblg0110num.setError(null);
            }

            if (spblg0110src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0110src.setError("This data is Required!");
                spblg0110src.requestFocus();
                Log.i(TAG, "spblg0110src: This data is Required!");
                return false;
            } else {
                spblg0110src.setError(null);
            }

        }

        //=================== spblg0111 ==============
        if (spblg0111.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0111), Toast.LENGTH_SHORT).show();
            spblg011102.setError("This data is Required!");
            spblg011102.setFocusableInTouchMode(true);
            spblg011102.setFocusable(true);
            spblg011102.requestFocus();
            Log.i(TAG, "spblg0111: This data is Required!");
            return false;
        } else {
            spblg011102.setError(null);
        }
        if (spblg011101.isChecked()) {
            if (spblg0111num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0111num.setError("This data is Required!");
                spblg0111num.requestFocus();
                Log.i(TAG, "spblg0111num: This data is Required!");
                return false;
            } else {
                spblg0111num.setError(null);
            }

            if (spblg0111src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0111src.setError("This data is Required!");
                spblg0111src.requestFocus();
                Log.i(TAG, "spblg0111src: This data is Required!");
                return false;
            } else {
                spblg0111src.setError(null);
            }

        }

        //=================== spblg0112 ==============
        if (spblg0112.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0112), Toast.LENGTH_SHORT).show();
            spblg011202.setError("This data is Required!");
            spblg011202.setFocusableInTouchMode(true);
            spblg011202.setFocusable(true);
            spblg011202.requestFocus();
            Log.i(TAG, "spblg0112: This data is Required!");
            return false;
        } else {
            spblg011202.setError(null);
        }
        if (spblg011201.isChecked()) {
            if (spblg0112num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0112num.setError("This data is Required!");
                spblg0112num.requestFocus();
                Log.i(TAG, "spblg0112num: This data is Required!");
                return false;
            } else {
                spblg0112num.setError(null);
            }

            if (spblg0112src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0112src.setError("This data is Required!");
                spblg0112src.requestFocus();
                Log.i(TAG, "spblg0112src: This data is Required!");
                return false;
            } else {
                spblg0112src.setError(null);
            }

        }

        //=================== spblg0113 ==============
        if (spblg0113.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0113), Toast.LENGTH_SHORT).show();
            spblg011302.setError("This data is Required!");
            spblg011302.setFocusableInTouchMode(true);
            spblg011302.setFocusable(true);
            spblg011302.requestFocus();
            Log.i(TAG, "spblg0113: This data is Required!");
            return false;
        } else {
            spblg011302.setError(null);
        }

        if (spblg011301.isChecked()) {
            if (spblg0113num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0113num.setError("This data is Required!");
                spblg0113num.requestFocus();
                Log.i(TAG, "spblg0113num: This data is Required!");
                return false;
            } else {
                spblg0113num.setError(null);
            }

            if (spblg0113src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0113src.setError("This data is Required!");
                spblg0113src.requestFocus();
                Log.i(TAG, "spblg0113src: This data is Required!");
                return false;
            } else {
                spblg0113src.setError(null);
            }

        }

        //=================== spblg0114 ==============
        if (spblg0114.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0114), Toast.LENGTH_SHORT).show();
            spblg011402.setError("This data is Required!");
            spblg011402.setFocusableInTouchMode(true);
            spblg011402.setFocusable(true);
            spblg011402.requestFocus();
            Log.i(TAG, "spblg0114: This data is Required!");
            return false;
        } else {
            spblg011402.setError(null);
        }
        if (spblg011401.isChecked()) {
            if (spblg0114num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0114num.setError("This data is Required!");
                spblg0114num.requestFocus();
                Log.i(TAG, "spblg0114num: This data is Required!");
                return false;
            } else {
                spblg0114num.setError(null);
            }

            if (spblg0114src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0114src.setError("This data is Required!");
                spblg0114src.requestFocus();
                Log.i(TAG, "spblg0114src: This data is Required!");
                return false;
            } else {
                spblg0114src.setError(null);
            }

        }

        //=================== spblg0115 ==============
        if (spblg0115.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0115), Toast.LENGTH_SHORT).show();
            spblg011502.setError("This data is Required!");
            spblg011502.setFocusableInTouchMode(true);
            spblg011502.setFocusable(true);
            spblg011502.requestFocus();
            Log.i(TAG, "spblg0115: This data is Required!");
            return false;
        } else {
            spblg011502.setError(null);
        }
        if (spblg011501.isChecked()) {

            if (spblg0115x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0115), Toast.LENGTH_SHORT).show();
                spblg0115x.setError("This data is Required!");
                spblg0115x.requestFocus();
                Log.i(TAG, "spblg0115x: This data is Required!");
                return false;
            } else {
                spblg0115x.setError(null);
            }

            if (spblg0115num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0115num.setError("This data is Required!");
                spblg0115num.requestFocus();
                Log.i(TAG, "spblg0115num: This data is Required!");
                return false;
            } else {
                spblg0115num.setError(null);
            }

            if (spblg0115src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0115src.setError("This data is Required!");
                spblg0115src.requestFocus();
                Log.i(TAG, "spblg0115src: This data is Required!");
                return false;
            } else {
                spblg0115src.setError(null);
            }
        }

        //=================== spblg0116 ==============
        if (spblg0116.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0116), Toast.LENGTH_SHORT).show();
            spblg011602.setError("This data is Required!");
            spblg011602.setFocusableInTouchMode(true);
            spblg011602.setFocusable(true);
            spblg011602.requestFocus();
            Log.i(TAG, "spblg0116: This data is Required!");
            return false;
        } else {
            spblg011602.setError(null);
        }

        if (spblg011601.isChecked()) {

            if (spblg0116x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0116), Toast.LENGTH_SHORT).show();
                spblg0116x.setError("This data is Required!");
                spblg0116x.requestFocus();
                Log.i(TAG, "spblg0116x: This data is Required!");
                return false;
            } else {
                spblg0116x.setError(null);
            }

            if (spblg0116num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0116num.setError("This data is Required!");
                spblg0116num.requestFocus();
                Log.i(TAG, "spblg0116num: This data is Required!");
                return false;
            } else {
                spblg0116num.setError(null);
            }

            if (spblg0116src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0116src.setError("This data is Required!");
                spblg0116src.requestFocus();
                Log.i(TAG, "spblg0116src: This data is Required!");
                return false;
            } else {
                spblg0116src.setError(null);
            }
        }



        return true;

    }

}

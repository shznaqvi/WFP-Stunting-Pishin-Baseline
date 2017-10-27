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
    @BindView(R.id.spblg0102a)
    RadioButton spblg0102a;
    @BindView(R.id.spblg0102b)
    RadioButton spblg0102b;
    @BindView(R.id.fldGrpspblg0102)
    LinearLayout fldGrpspblg0102;
    @BindView(R.id.spblg0102num)
    EditText spblg0102num;
    @BindView(R.id.spblg0102src)
    EditText spblg0102src;
    @BindView(R.id.spblg0103)
    RadioGroup spblg0103;
    @BindView(R.id.spblg0103a)
    RadioButton spblg0103a;
    @BindView(R.id.spblg0103b)
    RadioButton spblg0103b;
    @BindView(R.id.fldGrpspblg0103)
    LinearLayout fldGrpspblg0103;
    @BindView(R.id.spblg0103num)
    EditText spblg0103num;
    @BindView(R.id.spblg0103src)
    EditText spblg0103src;
    @BindView(R.id.spblg0104)
    RadioGroup spblg0104;
    @BindView(R.id.spblg0104a)
    RadioButton spblg0104a;
    @BindView(R.id.spblg0104b)
    RadioButton spblg0104b;
    @BindView(R.id.fldGrpspblg0104)
    LinearLayout fldGrpspblg0104;
    @BindView(R.id.spblg0104num)
    EditText spblg0104num;
    @BindView(R.id.spblg0104src)
    EditText spblg0104src;
    @BindView(R.id.spblg0105)
    RadioGroup spblg0105;
    @BindView(R.id.spblg0105a)
    RadioButton spblg0105a;
    @BindView(R.id.spblg0105b)
    RadioButton spblg0105b;
    @BindView(R.id.fldGrpspblg0105)
    LinearLayout fldGrpspblg0105;
    @BindView(R.id.spblg0105num)
    EditText spblg0105num;
    @BindView(R.id.spblg0105src)
    EditText spblg0105src;
    @BindView(R.id.spblg0106)
    RadioGroup spblg0106;
    @BindView(R.id.spblg0106a)
    RadioButton spblg0106a;
    @BindView(R.id.spblg0106b)
    RadioButton spblg0106b;
    @BindView(R.id.fldGrpspblg0106)
    LinearLayout fldGrpspblg0106;
    @BindView(R.id.spblg0106num)
    EditText spblg0106num;
    @BindView(R.id.spblg0106src)
    EditText spblg0106src;
    @BindView(R.id.spblg0107)
    RadioGroup spblg0107;
    @BindView(R.id.spblg0107a)
    RadioButton spblg0107a;
    @BindView(R.id.spblg0107b)
    RadioButton spblg0107b;
    @BindView(R.id.fldGrpcrj01g)
    LinearLayout fldGrpspblg0107;
    @BindView(R.id.spblg0107num)
    EditText spblg0107num;
    @BindView(R.id.spblg0107src)
    EditText spblg0107src;
    @BindView(R.id.spblg0108)
    RadioGroup spblg0108;
    @BindView(R.id.spblg0108a)
    RadioButton spblg0108a;
    @BindView(R.id.spblg0108b)
    RadioButton spblg0108b;
    @BindView(R.id.fldGrpspblg0108)
    LinearLayout fldGrpspblg0108;
    @BindView(R.id.spblg0108num)
    EditText spblg0108num;
    @BindView(R.id.spblg0108src)
    EditText spblg0108src;
    @BindView(R.id.spblg0109)
    RadioGroup spblg0109;
    @BindView(R.id.spblg0109a)
    RadioButton spblg0109a;
    @BindView(R.id.spblg0109b)
    RadioButton spblg0109b;
    @BindView(R.id.fldGrpspblg0109)
    LinearLayout fldGrpspblg0109;
    @BindView(R.id.spblg0109num)
    EditText spblg0109num;
    @BindView(R.id.spblg0109src)
    EditText spblg0109src;
    @BindView(R.id.spblg0110)
    RadioGroup spblg0110;
    @BindView(R.id.spblg0110a)
    RadioButton spblg0110a;
    @BindView(R.id.spblg0110b)
    RadioButton spblg0110b;
    @BindView(R.id.fldGrpspblg0110)
    LinearLayout fldGrpspblg0110;
    @BindView(R.id.spblg0110num)
    EditText spblg0110num;
    @BindView(R.id.spblg0110src)
    EditText spblg0110src;
    @BindView(R.id.spblg0111)
    RadioGroup spblg0111;
    @BindView(R.id.spblg0111a)
    RadioButton spblg0111a;
    @BindView(R.id.spblg0111b)
    RadioButton spblg0111b;
    @BindView(R.id.fldGrpspblg0111)
    LinearLayout fldGrpspblg0111;
    @BindView(R.id.spblg0111num)
    EditText spblg0111num;
    @BindView(R.id.spblg0111src)
    EditText spblg0111src;
    @BindView(R.id.spblg0112)
    RadioGroup spblg0112;
    @BindView(R.id.spblg0112a)
    RadioButton spblg0112a;
    @BindView(R.id.spblg0112b)
    RadioButton spblg0112b;
    @BindView(R.id.fldGrpspblg0112)
    LinearLayout fldGrpspblg0112;
    @BindView(R.id.spblg0112num)
    EditText spblg0112num;
    @BindView(R.id.spblg0112src)
    EditText spblg0112src;
    @BindView(R.id.spblg0113)
    RadioGroup spblg0113;
    @BindView(R.id.spblg0113a)
    RadioButton spblg0113a;
    @BindView(R.id.spblg0113b)
    RadioButton spblg0113b;
    @BindView(R.id.fldGrpspblg0113)
    LinearLayout fldGrpspblg0113;
    @BindView(R.id.spblg0113num)
    EditText spblg0113num;
    @BindView(R.id.spblg0113src)
    EditText spblg0113src;
    @BindView(R.id.spblg0114)
    RadioGroup spblg0114;
    @BindView(R.id.spblg0114a)
    RadioButton spblg0114a;
    @BindView(R.id.spblg0114b)
    RadioButton spblg0114b;
    @BindView(R.id.fldGrpspblg0114)
    LinearLayout fldGrpspblg0114;
    @BindView(R.id.spblg0114num)
    EditText spblg0114num;
    @BindView(R.id.spblg0114src)
    EditText spblg0114src;
    @BindView(R.id.spblg0115)
    RadioGroup spblg0115;
    @BindView(R.id.spblg0115a)
    RadioButton spblg0115a;
    @BindView(R.id.spblg0115b)
    RadioButton spblg0115b;
    @BindView(R.id.fldGrpspblg0115)
    LinearLayout fldGrpspblg0115;
    @BindView(R.id.spblg0115x)
    EditText spblg0115x;
    @BindView(R.id.spblg0115num)
    EditText spblg0115num;
    @BindView(R.id.spblg0115src)
    EditText spblg0115src;
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

        spblg0102a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0103a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0104a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0105a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0106a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0107a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg0107.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg0107.setVisibility(View.GONE);
                    spblg0107num.setText(null);
                    spblg0107src.setText(null);
                }
            }
        });

        spblg0108a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0109a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0110a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0111a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0112a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0113a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0114a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        spblg0115a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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


    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
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

        Intent secNext = new Intent(this, SectionHActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);

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
        sg.put("spblg0102", spblg0102a.isChecked() ? "1" : spblg0102b.isChecked() ? "2" : "0");
        sg.put("spblg0102num", spblg0102num.getText().toString());
        sg.put("spblg0102src", spblg0102src.getText().toString());
        sg.put("spblg0103", spblg0103a.isChecked() ? "1" : spblg0103b.isChecked() ? "2" : "0");
        sg.put("spblg0103num", spblg0103num.getText().toString());
        sg.put("spblg0103src", spblg0103src.getText().toString());
        sg.put("spblg0104", spblg0104a.isChecked() ? "1" : spblg0104b.isChecked() ? "2" : "0");
        sg.put("spblg0104num", spblg0104num.getText().toString());
        sg.put("spblg0104src", spblg0104src.getText().toString());
        sg.put("spblg0105", spblg0105a.isChecked() ? "1" : spblg0105b.isChecked() ? "2" : "0");
        sg.put("spblg0105num", spblg0105num.getText().toString());
        sg.put("spblg0105src", spblg0105src.getText().toString());
        sg.put("spblg0106", spblg0106a.isChecked() ? "1" : spblg0106b.isChecked() ? "2" : "0");
        sg.put("spblg0106num", spblg0106num.getText().toString());
        sg.put("spblg0106src", spblg0106src.getText().toString());
        sg.put("spblg0107", spblg0107a.isChecked() ? "1" : spblg0107b.isChecked() ? "2" : "0");
        sg.put("spblg0107num", spblg0107num.getText().toString());
        sg.put("spblg0107src", spblg0107src.getText().toString());
        sg.put("spblg0108", spblg0108a.isChecked() ? "1" : spblg0108b.isChecked() ? "2" : "0");
        sg.put("spblg0108num", spblg0108num.getText().toString());
        sg.put("spblg0108src", spblg0108src.getText().toString());
        sg.put("spblg0109", spblg0109a.isChecked() ? "1" : spblg0109b.isChecked() ? "2" : "0");
        sg.put("spblg0109num", spblg0109num.getText().toString());
        sg.put("spblg0109src", spblg0109src.getText().toString());
        sg.put("spblg0110", spblg0110a.isChecked() ? "1" : spblg0110b.isChecked() ? "2" : "0");
        sg.put("spblg0110num", spblg0110num.getText().toString());
        sg.put("spblg0110src", spblg0110src.getText().toString());
        sg.put("spblg0111", spblg0111a.isChecked() ? "1" : spblg0111b.isChecked() ? "2" : "0");
        sg.put("spblg0111num", spblg0111num.getText().toString());
        sg.put("spblg0111src", spblg0111src.getText().toString());
        sg.put("spblg0112", spblg0112a.isChecked() ? "1" : spblg0112b.isChecked() ? "2" : "0");
        sg.put("spblg0112num", spblg0112num.getText().toString());
        sg.put("spblg0112src", spblg0112src.getText().toString());
        sg.put("spblg0113", spblg0113a.isChecked() ? "1" : spblg0113b.isChecked() ? "2" : "0");
        sg.put("spblg0113num", spblg0113num.getText().toString());
        sg.put("spblg0113src", spblg0113src.getText().toString());
        sg.put("spblg0114", spblg0114a.isChecked() ? "1" : spblg0114b.isChecked() ? "2" : "0");
        sg.put("spblg0114num", spblg0114num.getText().toString());
        sg.put("spblg0114src", spblg0114src.getText().toString());
        sg.put("spblg0115", spblg0115a.isChecked() ? "1" : spblg0115b.isChecked() ? "2" : "0");
        sg.put("spblg0115num", spblg0115num.getText().toString());
        sg.put("spblg0115x", spblg0115x.getText().toString());
        sg.put("spblg0115src", spblg0115src.getText().toString());

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
            spblg0102b.setError("This data is Required!");
            spblg0102b.setFocusableInTouchMode(true);
            spblg0102b.setFocusable(true);
            spblg0102b.requestFocus();
            Log.i(TAG, "spblg0102: This data is Required!");
            return false;
        } else {
            spblg0102b.setError(null);
        }
        if (spblg0102a.isChecked()) {
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
            spblg0103b.setError("This data is Required!");
            spblg0103b.setFocusableInTouchMode(true);
            spblg0103b.setFocusable(true);
            spblg0103b.requestFocus();
            Log.i(TAG, "spblg0103: This data is Required!");
            return false;
        } else {
            spblg0103b.setError(null);
        }
        if (spblg0103a.isChecked()) {
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
            spblg0104b.setError("This data is Required!");
            spblg0104b.setFocusableInTouchMode(true);
            spblg0104b.setFocusable(true);
            spblg0104b.requestFocus();
            Log.i(TAG, "spblg0104: This data is Required!");
            return false;
        } else {
            spblg0104b.setError(null);
        }
        if (spblg0104a.isChecked()) {
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
            spblg0105b.setError("This data is Required!");
            spblg0105b.setFocusableInTouchMode(true);
            spblg0105b.setFocusable(true);
            spblg0105b.requestFocus();
            Log.i(TAG, "spblg0105: This data is Required!");
            return false;
        } else {
            spblg0105b.setError(null);
        }
        if (spblg0105a.isChecked()) {
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
            spblg0106b.setError("This data is Required!");
            spblg0106b.setFocusableInTouchMode(true);
            spblg0106b.setFocusable(true);
            spblg0106b.requestFocus();
            Log.i(TAG, "spblg0106: This data is Required!");
            return false;
        } else {
            spblg0106b.setError(null);
        }

        if (spblg0106a.isChecked()) {
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

        //=================== spblg0107 ==============
        if (spblg0107.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0107), Toast.LENGTH_SHORT).show();
            spblg0107b.setError("This data is Required!");
            spblg0107b.setFocusableInTouchMode(true);
            spblg0107b.setFocusable(true);
            spblg0107b.requestFocus();
            Log.i(TAG, "spblg0107: This data is Required!");
            return false;
        } else {
            spblg0107b.setError(null);
        }
        if (spblg0107a.isChecked()) {
            if (spblg0107num.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg0107num.setError("This data is Required!");
                spblg0107num.requestFocus();
                Log.i(TAG, "spblg0107num: This data is Required!");
                return false;
            } else {
                spblg0107num.setError(null);
            }

            if (spblg0107src.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg0107src.setError("This data is Required!");
                spblg0107src.requestFocus();
                Log.i(TAG, "spblg0107src: This data is Required!");
                return false;
            } else {
                spblg0107src.setError(null);
            }

        }

        //=================== spblg0108 ==============
        if (spblg0108.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg0108), Toast.LENGTH_SHORT).show();
            spblg0108b.setError("This data is Required!");
            spblg0108b.setFocusableInTouchMode(true);
            spblg0108b.setFocusable(true);
            spblg0108b.requestFocus();
            Log.i(TAG, "spblg0108: This data is Required!");
            return false;
        } else {
            spblg0108b.setError(null);
        }
        if (spblg0108a.isChecked()) {
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
            spblg0109b.setError("This data is Required!");
            spblg0109b.setFocusableInTouchMode(true);
            spblg0109b.setFocusable(true);
            spblg0109b.requestFocus();
            Log.i(TAG, "spblg0109: This data is Required!");
            return false;
        } else {
            spblg0109b.setError(null);
        }
        if (spblg0109a.isChecked()) {
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
            spblg0110b.setError("This data is Required!");
            spblg0110b.setFocusableInTouchMode(true);
            spblg0110b.setFocusable(true);
            spblg0110b.requestFocus();
            Log.i(TAG, "spblg0110: This data is Required!");
            return false;
        } else {
            spblg0110b.setError(null);
        }
        if (spblg0110a.isChecked()) {
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
            spblg0111b.setError("This data is Required!");
            spblg0111b.setFocusableInTouchMode(true);
            spblg0111b.setFocusable(true);
            spblg0111b.requestFocus();
            Log.i(TAG, "spblg0111: This data is Required!");
            return false;
        } else {
            spblg0111b.setError(null);
        }
        if (spblg0111a.isChecked()) {
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
            spblg0112b.setError("This data is Required!");
            spblg0112b.setFocusableInTouchMode(true);
            spblg0112b.setFocusable(true);
            spblg0112b.requestFocus();
            Log.i(TAG, "spblg0112: This data is Required!");
            return false;
        } else {
            spblg0112b.setError(null);
        }
        if (spblg0112a.isChecked()) {
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
            spblg0113b.setError("This data is Required!");
            spblg0113b.setFocusableInTouchMode(true);
            spblg0113b.setFocusable(true);
            spblg0113b.requestFocus();
            Log.i(TAG, "spblg0113: This data is Required!");
            return false;
        } else {
            spblg0113b.setError(null);
        }

        if (spblg0113a.isChecked()) {
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
            spblg0114b.setError("This data is Required!");
            spblg0114b.setFocusableInTouchMode(true);
            spblg0114b.setFocusable(true);
            spblg0114b.requestFocus();
            Log.i(TAG, "spblg0114: This data is Required!");
            return false;
        } else {
            spblg0114b.setError(null);
        }
        if (spblg0114a.isChecked()) {
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
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            spblg0115b.setError("This data is Required!");
            spblg0115b.setFocusableInTouchMode(true);
            spblg0115b.setFocusable(true);
            spblg0115b.requestFocus();
            Log.i(TAG, "spblg0115: This data is Required!");
            return false;
        } else {
            spblg0115b.setError(null);
        }
        if (spblg0115a.isChecked()) {

            if (spblg0115x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
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





        return true;

    }

}

package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.SourceNGOContract;
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
    Spinner spblg0101src;
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
    Spinner spblg0102src;
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
    Spinner spblg0103src;
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
    Spinner spblg0104src;
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
    Spinner spblg0105src;
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
    Spinner spblg0106src;
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
    Spinner spblg0107src;
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
    Spinner spblg0108src;
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
    Spinner spblg0109src;
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
    Spinner spblg0110src;
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
    Spinner spblg0111src;
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
    Spinner spblg0112src;
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
    Spinner spblg0113src;
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
    Spinner spblg0114src;
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
    Spinner spblg0115src;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;


    Map<String, String> getAllNGOsMap;
    List<String> NGOs;

    @BindViews({R.id.spblg0101src,R.id.spblg0102src,R.id.spblg0103src,R.id.spblg0104src,R.id.spblg0105src,R.id.spblg0106src,R.id.spblg0107src,
            R.id.spblg0108src,R.id.spblg0109src,R.id.spblg0110src,R.id.spblg0111src,R.id.spblg0112src,R.id.spblg0113src,R.id.spblg0114src,R.id.spblg0115src})
    List<Spinner> spblg01src;

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
                    spblg0101src.setSelection(0);
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
                    spblg0102src.setSelection(0);
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
                    spblg0103src.setSelection(0);
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
                    spblg0104src.setSelection(0);
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
                    spblg0105src.setSelection(0);
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
                    spblg0106src.setSelection(0);
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
                    spblg0107src.setSelection(0);
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
                    spblg0108src.setSelection(0);
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
                    spblg0109src.setSelection(0);
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
                    spblg0110src.setSelection(0);
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
                    spblg0111src.setSelection(0);
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
                    spblg0112src.setSelection(0);
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
                    spblg0113src.setSelection(0);
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
                    spblg0114src.setSelection(0);
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
                    spblg0115src.setSelection(0);
                }
            }
        });

//        Get All NGOs spinner

        DatabaseHelper db = new DatabaseHelper(this);
        Collection<SourceNGOContract> allNGOs = db.getAllNGOs();

        getAllNGOsMap = new HashMap<>();
        NGOs = new ArrayList<>();
        if (allNGOs.size() != 0) {

            NGOs.add("....");

            for (SourceNGOContract aNGO : allNGOs) {
                getAllNGOsMap.put(aNGO.getSourceName(), aNGO.getSourceId());
                NGOs.add(aNGO.getSourceName());
            }

            /*String[] ngo = new String[]{"NGO 1", "NGOs 2", "NGO 3", "NGO 4", "NGO 5", "NGO 6", "NGO 7"};
            for (byte i = 0; i < ngo.length; i++) {
                NGOs.add(ngo[i]);
                getAllNGOsMap.put(ngo[i], String.valueOf(i + 1));
            }*/

            for (Spinner spin : spblg01src){
                spin.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            }

        }

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


                Intent endSec = new Intent(this, SectionHActivity.class);
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

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSG();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        JSONObject sg = new JSONObject();

        sg.put("spblg0101", spblg0101a.isChecked() ? "1" : spblg0101b.isChecked() ? "2" : "0");
        sg.put("spblg0101num", spblg0101num.getText().toString());
        if (spblg0101src.getSelectedItemPosition()!=0) {
            sg.put("spblg0101src", getAllNGOsMap.get(spblg0101src.getSelectedItem().toString()));
        }
        sg.put("spblg0102", spblg0102a.isChecked() ? "1" : spblg0102b.isChecked() ? "2" : "0");
        sg.put("spblg0102num", spblg0102num.getText().toString());
        if (spblg0102src.getSelectedItemPosition()!=0) {
            sg.put("spblg0102src", getAllNGOsMap.get(spblg0102src.getSelectedItem().toString()));
        }
        sg.put("spblg0103", spblg0103a.isChecked() ? "1" : spblg0103b.isChecked() ? "2" : "0");
        sg.put("spblg0103num", spblg0103num.getText().toString());
        if (spblg0103src.getSelectedItemPosition()!=0) {
            sg.put("spblg0103src", getAllNGOsMap.get(spblg0103src.getSelectedItem().toString()));
        }
        sg.put("spblg0104", spblg0104a.isChecked() ? "1" : spblg0104b.isChecked() ? "2" : "0");
        sg.put("spblg0104num", spblg0104num.getText().toString());
        if (spblg0104src.getSelectedItemPosition()!=0) {
            sg.put("spblg0104src", getAllNGOsMap.get(spblg0104src.getSelectedItem().toString()));
        }
        sg.put("spblg0105", spblg0105a.isChecked() ? "1" : spblg0105b.isChecked() ? "2" : "0");
        sg.put("spblg0105num", spblg0105num.getText().toString());
        if (spblg0105src.getSelectedItemPosition()!=0) {
            sg.put("spblg0105src", getAllNGOsMap.get(spblg0105src.getSelectedItem().toString()));
        }
        sg.put("spblg0106", spblg0106a.isChecked() ? "1" : spblg0106b.isChecked() ? "2" : "0");
        sg.put("spblg0106num", spblg0106num.getText().toString());
        if (spblg0106src.getSelectedItemPosition()!=0) {
            sg.put("spblg0106src", getAllNGOsMap.get(spblg0106src.getSelectedItem().toString()));
        }
        sg.put("spblg0107", spblg0107a.isChecked() ? "1" : spblg0107b.isChecked() ? "2" : "0");
        sg.put("spblg0107num", spblg0107num.getText().toString());
        if (spblg0107src.getSelectedItemPosition()!=0) {
            sg.put("spblg0107src", getAllNGOsMap.get(spblg0107src.getSelectedItem().toString()));
        }
        sg.put("spblg0108", spblg0108a.isChecked() ? "1" : spblg0108b.isChecked() ? "2" : "0");
        sg.put("spblg0108num", spblg0108num.getText().toString());
        if (spblg0108src.getSelectedItemPosition()!=0) {
            sg.put("spblg0108src", getAllNGOsMap.get(spblg0108src.getSelectedItem().toString()));
        }
        sg.put("spblg0109", spblg0109a.isChecked() ? "1" : spblg0109b.isChecked() ? "2" : "0");
        sg.put("spblg0109num", spblg0109num.getText().toString());
        if (spblg0109src.getSelectedItemPosition()!=0) {
            sg.put("spblg0109src", getAllNGOsMap.get(spblg0109src.getSelectedItem().toString()));
        }
        sg.put("spblg0110", spblg0110a.isChecked() ? "1" : spblg0110b.isChecked() ? "2" : "0");
        sg.put("spblg0110num", spblg0110num.getText().toString());
        if (spblg0110src.getSelectedItemPosition()!=0) {
            sg.put("spblg0110src", getAllNGOsMap.get(spblg0110src.getSelectedItem().toString()));
        }
        sg.put("spblg0111", spblg0111a.isChecked() ? "1" : spblg0111b.isChecked() ? "2" : "0");
        sg.put("spblg0111num", spblg0111num.getText().toString());
        if (spblg0111src.getSelectedItemPosition()!=0) {
            sg.put("spblg0111src", getAllNGOsMap.get(spblg0111src.getSelectedItem().toString()));
        }
        sg.put("spblg0112", spblg0112a.isChecked() ? "1" : spblg0112b.isChecked() ? "2" : "0");
        sg.put("spblg0112num", spblg0112num.getText().toString());
        if (spblg0112src.getSelectedItemPosition()!=0) {
            sg.put("spblg0112src", getAllNGOsMap.get(spblg0112src.getSelectedItem().toString()));
        }
        sg.put("spblg0113", spblg0113a.isChecked() ? "1" : spblg0113b.isChecked() ? "2" : "0");
        sg.put("spblg0113num", spblg0113num.getText().toString());
        if (spblg0113src.getSelectedItemPosition()!=0) {
            sg.put("spblg0113src", getAllNGOsMap.get(spblg0113src.getSelectedItem().toString()));
        }
        sg.put("spblg0114", spblg0114a.isChecked() ? "1" : spblg0114b.isChecked() ? "2" : "0");
        sg.put("spblg0114num", spblg0114num.getText().toString());
        if (spblg0114src.getSelectedItemPosition()!=0) {
            sg.put("spblg0114src", getAllNGOsMap.get(spblg0114src.getSelectedItem().toString()));
        }
        sg.put("spblg0115", spblg0115a.isChecked() ? "1" : spblg0115b.isChecked() ? "2" : "0");
        sg.put("spblg0115num", spblg0115num.getText().toString());
        sg.put("spblg0115x", spblg0115x.getText().toString());
        if (spblg0115src.getSelectedItemPosition()!=0) {
            sg.put("spblg0115src", getAllNGOsMap.get(spblg0115src.getSelectedItem().toString()));
        }

        MainApp.fc.setsG(String.valueOf(sg));

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

            if (spblg0101src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0101), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0101src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0101src.getSelectedView()).setTextColor(Color.RED);
                spblg0101src.requestFocus();
                Log.i(TAG, "spblg0101src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0101src.getSelectedView()).setError(null);
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

            if (spblg0102src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0102), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0102src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0102src.getSelectedView()).setTextColor(Color.RED);
                spblg0102src.requestFocus();
                Log.i(TAG, "spblg0102src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0102src.getSelectedView()).setError(null);
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

            if (spblg0103src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0103), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0103src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0103src.getSelectedView()).setTextColor(Color.RED);
                spblg0103src.requestFocus();
                Log.i(TAG, "spblg0103src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0103src.getSelectedView()).setError(null);
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

            if (spblg0104src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0104), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0104src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0104src.getSelectedView()).setTextColor(Color.RED);
                spblg0104src.requestFocus();
                Log.i(TAG, "spblg0104src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0104src.getSelectedView()).setError(null);
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

            if (spblg0105src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0105), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0105src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0105src.getSelectedView()).setTextColor(Color.RED);
                spblg0105src.requestFocus();
                Log.i(TAG, "spblg0105src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0105src.getSelectedView()).setError(null);
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

            if (spblg0106src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0106), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0106src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0106src.getSelectedView()).setTextColor(Color.RED);
                spblg0106src.requestFocus();
                Log.i(TAG, "spblg0106src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0106src.getSelectedView()).setError(null);
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

            if (spblg0107src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0107), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0107src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0107src.getSelectedView()).setTextColor(Color.RED);
                spblg0107src.requestFocus();
                Log.i(TAG, "spblg0107src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0107src.getSelectedView()).setError(null);
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

            if (spblg0108src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0108), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0108src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0108src.getSelectedView()).setTextColor(Color.RED);
                spblg0108src.requestFocus();
                Log.i(TAG, "spblg0108src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0108src.getSelectedView()).setError(null);
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

            if (spblg0109src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0109), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0109src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0109src.getSelectedView()).setTextColor(Color.RED);
                spblg0109src.requestFocus();
                Log.i(TAG, "spblg0109src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0109src.getSelectedView()).setError(null);
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

            if (spblg0110src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0110), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0110src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0110src.getSelectedView()).setTextColor(Color.RED);
                spblg0110src.requestFocus();
                Log.i(TAG, "spblg0110src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0110src.getSelectedView()).setError(null);
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

            if (spblg0111src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0111), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0111src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0111src.getSelectedView()).setTextColor(Color.RED);
                spblg0111src.requestFocus();
                Log.i(TAG, "spblg0111src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0111src.getSelectedView()).setError(null);
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

            if (spblg0112src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0112), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0112src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0112src.getSelectedView()).setTextColor(Color.RED);
                spblg0112src.requestFocus();
                Log.i(TAG, "spblg0112src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0112src.getSelectedView()).setError(null);
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

            if (spblg0113src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0113), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0113src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0113src.getSelectedView()).setTextColor(Color.RED);
                spblg0113src.requestFocus();
                Log.i(TAG, "spblg0113src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0113src.getSelectedView()).setError(null);
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

            if (spblg0114src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.spblg0114), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0114src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0114src.getSelectedView()).setTextColor(Color.RED);
                spblg0114src.requestFocus();
                Log.i(TAG, "spblg0114src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0114src.getSelectedView()).setError(null);
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

            if (spblg0115src.getSelectedItem() == "....") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.other), Toast.LENGTH_SHORT).show();
                ((TextView) spblg0115src.getSelectedView()).setText("This Data is Required");
                ((TextView) spblg0115src.getSelectedView()).setTextColor(Color.RED);
                spblg0115src.requestFocus();
                Log.i(TAG, "spblg0115src: This Data is Required!");
                return false;
            } else {
                ((TextView) spblg0115src.getSelectedView()).setError(null);
            }
        }


        return true;

    }

}

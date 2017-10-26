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

    @BindView(R.id.spblg01a)
    RadioGroup spblg01a;
    @BindView(R.id.spblg01a01)
    RadioButton spblg01a01;
    @BindView(R.id.spblg01a02)
    RadioButton spblg01a02;
    @BindView(R.id.fldGrpspblg01a)
    LinearLayout fldGrpspblg01a;
    @BindView(R.id.spblg01anum)
    EditText spblg01anum;
    @BindView(R.id.spblg01asrc)
    EditText spblg01asrc;
    @BindView(R.id.spblg01b)
    RadioGroup spblg01b;
    @BindView(R.id.spblg01b01)
    RadioButton spblg01b01;
    @BindView(R.id.spblg01b02)
    RadioButton spblg01b02;
    @BindView(R.id.fldGrpspblg01b)
    LinearLayout fldGrpspblg01b;
    @BindView(R.id.spblg01bnum)
    EditText spblg01bnum;
    @BindView(R.id.spblg01bsrc)
    EditText spblg01bsrc;
    @BindView(R.id.spblg01c)
    RadioGroup spblg01c;
    @BindView(R.id.spblg01c01)
    RadioButton spblg01c01;
    @BindView(R.id.spblg01c02)
    RadioButton spblg01c02;
    @BindView(R.id.fldGrpspblg01c)
    LinearLayout fldGrpspblg01c;
    @BindView(R.id.spblg01cnum)
    EditText spblg01cnum;
    @BindView(R.id.spblg01csrc)
    EditText spblg01csrc;
    @BindView(R.id.spblg01d)
    RadioGroup spblg01d;
    @BindView(R.id.spblg01d01)
    RadioButton spblg01d01;
    @BindView(R.id.spblg01d02)
    RadioButton spblg01d02;
    @BindView(R.id.fldGrpspblg01d)
    LinearLayout fldGrpspblg01d;
    @BindView(R.id.spblg01dnum)
    EditText spblg01dnum;
    @BindView(R.id.spblg01dsrc)
    EditText spblg01dsrc;
    @BindView(R.id.spblg01e)
    RadioGroup spblg01e;
    @BindView(R.id.spblg01e01)
    RadioButton spblg01e01;
    @BindView(R.id.spblg01e02)
    RadioButton spblg01e02;
    @BindView(R.id.fldGrpspblg01e)
    LinearLayout fldGrpspblg01e;
    @BindView(R.id.spblg01enum)
    EditText spblg01enum;
    @BindView(R.id.spblg01esrc)
    EditText spblg01esrc;
    @BindView(R.id.spblg01f)
    RadioGroup spblg01f;
    @BindView(R.id.spblg01f01)
    RadioButton spblg01f01;
    @BindView(R.id.spblg01f02)
    RadioButton spblg01f02;
    @BindView(R.id.fldGrpspblg01f)
    LinearLayout fldGrpspblg01f;
    @BindView(R.id.spblg01fnum)
    EditText spblg01fnum;
    @BindView(R.id.spblg01fsrc)
    EditText spblg01fsrc;
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
    @BindView(R.id.spblg01h)
    RadioGroup spblg01h;
    @BindView(R.id.spblg01h01)
    RadioButton spblg01h01;
    @BindView(R.id.spblg01h02)
    RadioButton spblg01h02;
    @BindView(R.id.fldGrpcrj01h)
    LinearLayout fldGrpspblg01h;
    @BindView(R.id.spblg01hnum)
    EditText spblg01hnum;
    @BindView(R.id.spblg01hsrc)
    EditText spblg01hsrc;
    @BindView(R.id.spblg01i)
    RadioGroup spblg01i;
    @BindView(R.id.spblg01i01)
    RadioButton spblg01i01;
    @BindView(R.id.spblg01i02)
    RadioButton spblg01i02;
    @BindView(R.id.fldGrpspblg01i)
    LinearLayout fldGrpspblg01i;
    @BindView(R.id.spblg01inum)
    EditText spblg01inum;
    @BindView(R.id.spblg01isrc)
    EditText spblg01isrc;
    @BindView(R.id.spblg01j)
    RadioGroup spblg01j;
    @BindView(R.id.spblg01j01)
    RadioButton spblg01j01;
    @BindView(R.id.spblg01j02)
    RadioButton spblg01j02;
    @BindView(R.id.fldGrpspblg01j)
    LinearLayout fldGrpspblg01j;
    @BindView(R.id.spblg01jnum)
    EditText spblg01jnum;
    @BindView(R.id.spblg01jsrc)
    EditText spblg01jsrc;
    @BindView(R.id.spblg01k)
    RadioGroup spblg01k;
    @BindView(R.id.spblg01k01)
    RadioButton spblg01k01;
    @BindView(R.id.spblg01k02)
    RadioButton spblg01k02;
    @BindView(R.id.fldGrpspblg01k)
    LinearLayout fldGrpspblg01k;
    @BindView(R.id.spblg01knum)
    EditText spblg01knum;
    @BindView(R.id.spblg01ksrc)
    EditText spblg01ksrc;
    @BindView(R.id.spblg01l)
    RadioGroup spblg01l;
    @BindView(R.id.spblg01l01)
    RadioButton spblg01l01;
    @BindView(R.id.spblg01l02)
    RadioButton spblg01l02;
    @BindView(R.id.fldGrpspblg01l)
    LinearLayout fldGrpspblg01l;
    @BindView(R.id.spblg01lnum)
    EditText spblg01lnum;
    @BindView(R.id.spblg01lsrc)
    EditText spblg01lsrc;
    @BindView(R.id.spblg01m)
    RadioGroup spblg01m;
    @BindView(R.id.spblg01m01)
    RadioButton spblg01m01;
    @BindView(R.id.spblg01m02)
    RadioButton spblg01m02;
    @BindView(R.id.fldGrpspblg01m)
    LinearLayout fldGrpspblg01m;
    @BindView(R.id.spblg01mnum)
    EditText spblg01mnum;
    @BindView(R.id.spblg01msrc)
    EditText spblg01msrc;
    @BindView(R.id.spblg01n)
    RadioGroup spblg01n;
    @BindView(R.id.spblg01n01)
    RadioButton spblg01n01;
    @BindView(R.id.spblg01n02)
    RadioButton spblg01n02;
    @BindView(R.id.fldGrpspblg01n)
    LinearLayout fldGrpspblg01n;
    @BindView(R.id.spblg01nnum)
    EditText spblg01nnum;
    @BindView(R.id.spblg01nsrc)
    EditText spblg01nsrc;
    @BindView(R.id.spblg01o)
    RadioGroup spblg01o;
    @BindView(R.id.spblg01o01)
    RadioButton spblg01o01;
    @BindView(R.id.spblg01o02)
    RadioButton spblg01o02;
    @BindView(R.id.fldGrpspblg01o)
    LinearLayout fldGrpspblg01o;
    @BindView(R.id.spblg01ox)
    EditText spblg01ox;
    @BindView(R.id.spblg01onum)
    EditText spblg01onum;
    @BindView(R.id.spblg01osrc)
    EditText spblg01osrc;
    @BindView(R.id.spblg01p)
    RadioGroup spblg01p;
    @BindView(R.id.spblg01p01)
    RadioButton spblg01p01;
    @BindView(R.id.spblg01p02)
    RadioButton spblg01p02;
    @BindView(R.id.fldGrpspblg01p)
    LinearLayout fldGrpspblg01p;
    @BindView(R.id.spblg01px)
    EditText spblg01px;
    @BindView(R.id.spblg01pnum)
    EditText spblg01pnum;
    @BindView(R.id.spblg01psrc)
    EditText spblg01psrc;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g);
        ButterKnife.bind(this);

        spblg01a01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01a.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01a.setVisibility(View.GONE);
                    spblg01anum.setText(null);
                    spblg01asrc.setText(null);
                }
            }
        });

        spblg01b01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01b.setVisibility(View.GONE);
                    spblg01bnum.setText(null);
                    spblg01bsrc.setText(null);
                }
            }
        });

        spblg01c01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01c.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01c.setVisibility(View.GONE);
                    spblg01cnum.setText(null);
                    spblg01csrc.setText(null);
                }
            }
        });

        spblg01d01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01d.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01d.setVisibility(View.GONE);
                    spblg01dnum.setText(null);
                    spblg01dsrc.setText(null);
                }
            }
        });

        spblg01e01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01e.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01e.setVisibility(View.GONE);
                    spblg01enum.setText(null);
                    spblg01esrc.setText(null);
                }
            }
        });

        spblg01f01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01f.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01f.setVisibility(View.GONE);
                    spblg01fnum.setText(null);
                    spblg01fsrc.setText(null);
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

        spblg01h01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01h.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01h.setVisibility(View.GONE);
                    spblg01hnum.setText(null);
                    spblg01hsrc.setText(null);
                }
            }
        });

        spblg01i01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01i.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01i.setVisibility(View.GONE);
                    spblg01inum.setText(null);
                    spblg01isrc.setText(null);
                }
            }
        });

        spblg01j01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01j.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01j.setVisibility(View.GONE);
                    spblg01jnum.setText(null);
                    spblg01jsrc.setText(null);
                }
            }
        });

        spblg01k01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01k.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01k.setVisibility(View.GONE);
                    spblg01knum.setText(null);
                    spblg01ksrc.setText(null);
                }
            }
        });

        spblg01l01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01l.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01l.setVisibility(View.GONE);
                    spblg01lnum.setText(null);
                    spblg01lsrc.setText(null);
                }
            }
        });

        spblg01m01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01m.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01m.setVisibility(View.GONE);
                    spblg01mnum.setText(null);
                    spblg01msrc.setText(null);
                }
            }
        });

        spblg01n01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01n.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01n.setVisibility(View.GONE);
                    spblg01nnum.setText(null);
                    spblg01nsrc.setText(null);
                }
            }
        });

        spblg01o01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01o.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01o.setVisibility(View.GONE);
                    spblg01onum.setText(null);
                    spblg01ox.setText(null);
                    spblg01osrc.setText(null);
                }
            }
        });

        spblg01p01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpspblg01p.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblg01p.setVisibility(View.GONE);
                    spblg01pnum.setText(null);
                    spblg01px.setText(null);
                    spblg01psrc.setText(null);
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

        sg.put("spblg01a", spblg01a01.isChecked() ? "1" : spblg01a02.isChecked() ? "2" : "0");
        sg.put("spblg01anum", spblg01anum.getText().toString());
        sg.put("spblg01asrc", spblg01asrc.getText().toString());
        sg.put("spblg01b", spblg01b01.isChecked() ? "1" : spblg01b02.isChecked() ? "2" : "0");
        sg.put("spblg01bnum", spblg01bnum.getText().toString());
        sg.put("spblg01bsrc", spblg01bsrc.getText().toString());
        sg.put("spblg01c", spblg01c01.isChecked() ? "1" : spblg01c02.isChecked() ? "2" : "0");
        sg.put("spblg01cnum", spblg01cnum.getText().toString());
        sg.put("spblg01csrc", spblg01csrc.getText().toString());
        sg.put("spblg01d", spblg01d01.isChecked() ? "1" : spblg01d02.isChecked() ? "2" : "0");
        sg.put("spblg01dnum", spblg01dnum.getText().toString());
        sg.put("spblg01dsrc", spblg01dsrc.getText().toString());
        sg.put("spblg01e", spblg01e01.isChecked() ? "1" : spblg01e02.isChecked() ? "2" : "0");
        sg.put("spblg01enum", spblg01enum.getText().toString());
        sg.put("spblg01esrc", spblg01esrc.getText().toString());
        sg.put("spblg01f", spblg01f01.isChecked() ? "1" : spblg01f02.isChecked() ? "2" : "0");
        sg.put("spblg01fnum", spblg01fnum.getText().toString());
        sg.put("spblg01fsrc", spblg01fsrc.getText().toString());
        sg.put("spblg01g", spblg01g01.isChecked() ? "1" : spblg01g02.isChecked() ? "2" : "0");
        sg.put("spblg01gnum", spblg01gnum.getText().toString());
        sg.put("spblg01gsrc", spblg01gsrc.getText().toString());
        sg.put("spblg01h", spblg01h01.isChecked() ? "1" : spblg01h02.isChecked() ? "2" : "0");
        sg.put("spblg01hnum", spblg01hnum.getText().toString());
        sg.put("spblg01hsrc", spblg01hsrc.getText().toString());
        sg.put("spblg01i", spblg01i01.isChecked() ? "1" : spblg01i02.isChecked() ? "2" : "0");
        sg.put("spblg01inum", spblg01inum.getText().toString());
        sg.put("spblg01isrc", spblg01isrc.getText().toString());
        sg.put("spblg01j", spblg01j01.isChecked() ? "1" : spblg01j02.isChecked() ? "2" : "0");
        sg.put("spblg01jnum", spblg01jnum.getText().toString());
        sg.put("spblg01jsrc", spblg01jsrc.getText().toString());
        sg.put("spblg01k", spblg01k01.isChecked() ? "1" : spblg01k02.isChecked() ? "2" : "0");
        sg.put("spblg01knum", spblg01knum.getText().toString());
        sg.put("spblg01ksrc", spblg01ksrc.getText().toString());
        sg.put("spblg01l", spblg01l01.isChecked() ? "1" : spblg01l02.isChecked() ? "2" : "0");
        sg.put("spblg01lnum", spblg01lnum.getText().toString());
        sg.put("spblg01lsrc", spblg01lsrc.getText().toString());
        sg.put("spblg01m", spblg01m01.isChecked() ? "1" : spblg01m02.isChecked() ? "2" : "0");
        sg.put("spblg01mnum", spblg01mnum.getText().toString());
        sg.put("spblg01msrc", spblg01msrc.getText().toString());
        sg.put("spblg01n", spblg01n01.isChecked() ? "1" : spblg01n02.isChecked() ? "2" : "0");
        sg.put("spblg01nnum", spblg01nnum.getText().toString());
        sg.put("spblg01nsrc", spblg01nsrc.getText().toString());
        sg.put("spblg01o", spblg01o01.isChecked() ? "1" : spblg01o02.isChecked() ? "2" : "0");
        sg.put("spblg01onum", spblg01onum.getText().toString());
        sg.put("spblg01ox", spblg01ox.getText().toString());
        sg.put("spblg01osrc", spblg01osrc.getText().toString());
        sg.put("spblg01p", spblg01p01.isChecked() ? "1" : spblg01p02.isChecked() ? "2" : "0");
        sg.put("spblg01pnum", spblg01pnum.getText().toString());
        sg.put("spblg01px", spblg01px.getText().toString());
        sg.put("spblg01psrc", spblg01psrc.getText().toString());

        //   MainApp.fc.setsG(String.valueOf(sg));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== splg01a ==============

        //================== 1.1===================
        if (spblg01a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01a), Toast.LENGTH_SHORT).show();
            spblg01a02.setError("This data is Required!");
            spblg01a02.setFocusableInTouchMode(true);
            spblg01a02.setFocusable(true);
            spblg01a02.requestFocus();
            Log.i(TAG, "spblg01a: This data is Required!");
            return false;
        } else {
            spblg01a02.setError(null);
        }
        if (spblg01a01.isChecked()) {
            if (spblg01anum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01anum.setError("This data is Required!");
                spblg01anum.requestFocus();
                Log.i(TAG, "spblg01anum: This data is Required!");
                return false;
            } else {
                spblg01anum.setError(null);
            }

            if (spblg01asrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01asrc.setError("This data is Required!");
                spblg01asrc.requestFocus();
                Log.i(TAG, "spblg01asrc: This data is Required!");
                return false;
            } else {
                spblg01asrc.setError(null);
            }

        }

        if (spblg01b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01b), Toast.LENGTH_SHORT).show();
            spblg01b02.setError("This data is Required!");
            spblg01b02.setFocusableInTouchMode(true);
            spblg01b02.setFocusable(true);
            spblg01b02.requestFocus();
            Log.i(TAG, "spblg01b: This data is Required!");
            return false;
        } else {
            spblg01b02.setError(null);
        }
        if (spblg01b01.isChecked()) {
            if (spblg01bnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01bnum.setError("This data is Required!");
                spblg01bnum.requestFocus();
                Log.i(TAG, "spblg01bnum: This data is Required!");
                return false;
            } else {
                spblg01bnum.setError(null);
            }

            if (spblg01bsrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01bsrc.setError("This data is Required!");
                spblg01bsrc.requestFocus();
                Log.i(TAG, "spblg01bsrc: This data is Required!");
                return false;
            } else {
                spblg01bsrc.setError(null);
            }

        }

        if (spblg01c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01c), Toast.LENGTH_SHORT).show();
            spblg01c02.setError("This data is Required!");
            spblg01c02.setFocusableInTouchMode(true);
            spblg01c02.setFocusable(true);
            spblg01c02.requestFocus();
            Log.i(TAG, "spblg01c: This data is Required!");
            return false;
        } else {
            spblg01c02.setError(null);
        }
        if (spblg01c01.isChecked()) {
            if (spblg01cnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01cnum.setError("This data is Required!");
                spblg01cnum.requestFocus();
                Log.i(TAG, "spblg01cnum: This data is Required!");
                return false;
            } else {
                spblg01cnum.setError(null);
            }

            if (spblg01csrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01csrc.setError("This data is Required!");
                spblg01csrc.requestFocus();
                Log.i(TAG, "spblg01csrc: This data is Required!");
                return false;
            } else {
                spblg01csrc.setError(null);
            }

        }

        if (spblg01d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01d), Toast.LENGTH_SHORT).show();
            spblg01d02.setError("This data is Required!");
            spblg01d02.setFocusableInTouchMode(true);
            spblg01d02.setFocusable(true);
            spblg01d02.requestFocus();
            Log.i(TAG, "spblg01d: This data is Required!");
            return false;
        } else {
            spblg01d02.setError(null);
        }
        if (spblg01d01.isChecked()) {
            if (spblg01dnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01dnum.setError("This data is Required!");
                spblg01dnum.requestFocus();
                Log.i(TAG, "spblg01dnum: This data is Required!");
                return false;
            } else {
                spblg01dnum.setError(null);
            }

            if (spblg01dsrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01dsrc.setError("This data is Required!");
                spblg01dsrc.requestFocus();
                Log.i(TAG, "spblg01dsrc: This data is Required!");
                return false;
            } else {
                spblg01dsrc.setError(null);
            }

        }

        if (spblg01e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01e), Toast.LENGTH_SHORT).show();
            spblg01e02.setError("This data is Required!");
            spblg01e02.setFocusableInTouchMode(true);
            spblg01e02.setFocusable(true);
            spblg01e02.requestFocus();
            Log.i(TAG, "spblg01e: This data is Required!");
            return false;
        } else {
            spblg01e02.setError(null);
        }
        if (spblg01e01.isChecked()) {
            if (spblg01enum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01enum.setError("This data is Required!");
                spblg01enum.requestFocus();
                Log.i(TAG, "spblg01enum: This data is Required!");
                return false;
            } else {
                spblg01enum.setError(null);
            }

            if (spblg01esrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01esrc.setError("This data is Required!");
                spblg01esrc.requestFocus();
                Log.i(TAG, "spblg01esrc: This data is Required!");
                return false;
            } else {
                spblg01esrc.setError(null);
            }

        }

        if (spblg01f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01f), Toast.LENGTH_SHORT).show();
            spblg01f02.setError("This data is Required!");
            spblg01f02.setFocusableInTouchMode(true);
            spblg01f02.setFocusable(true);
            spblg01f02.requestFocus();
            Log.i(TAG, "spblg01f: This data is Required!");
            return false;
        } else {
            spblg01f02.setError(null);
        }
        if (spblg01f01.isChecked()) {
            if (spblg01fnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01fnum.setError("This data is Required!");
                spblg01fnum.requestFocus();
                Log.i(TAG, "spblg01fnum: This data is Required!");
                return false;
            } else {
                spblg01fnum.setError(null);
            }

            if (spblg01fsrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01fsrc.setError("This data is Required!");
                spblg01fsrc.requestFocus();
                Log.i(TAG, "spblg01fsrc: This data is Required!");
                return false;
            } else {
                spblg01fsrc.setError(null);
            }

        }

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

        if (spblg01h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01h), Toast.LENGTH_SHORT).show();
            spblg01h02.setError("This data is Required!");
            spblg01h02.setFocusableInTouchMode(true);
            spblg01h02.setFocusable(true);
            spblg01h02.requestFocus();
            Log.i(TAG, "spblg01h: This data is Required!");
            return false;
        } else {
            spblg01h02.setError(null);
        }
        if (spblg01h01.isChecked()) {
            if (spblg01hnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01hnum.setError("This data is Required!");
                spblg01hnum.requestFocus();
                Log.i(TAG, "spblg01hnum: This data is Required!");
                return false;
            } else {
                spblg01hnum.setError(null);
            }

            if (spblg01hsrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01hsrc.setError("This data is Required!");
                spblg01hsrc.requestFocus();
                Log.i(TAG, "spblg01hsrc: This data is Required!");
                return false;
            } else {
                spblg01hsrc.setError(null);
            }

        }

        if (spblg01i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01i), Toast.LENGTH_SHORT).show();
            spblg01i02.setError("This data is Required!");
            spblg01i02.setFocusableInTouchMode(true);
            spblg01i02.setFocusable(true);
            spblg01i02.requestFocus();
            Log.i(TAG, "spblg01i: This data is Required!");
            return false;
        } else {
            spblg01i02.setError(null);
        }
        if (spblg01i01.isChecked()) {
            if (spblg01inum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01inum.setError("This data is Required!");
                spblg01inum.requestFocus();
                Log.i(TAG, "spblg01inum: This data is Required!");
                return false;
            } else {
                spblg01inum.setError(null);
            }

            if (spblg01isrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01isrc.setError("This data is Required!");
                spblg01isrc.requestFocus();
                Log.i(TAG, "spblg01isrc: This data is Required!");
                return false;
            } else {
                spblg01isrc.setError(null);
            }

        }

        if (spblg01j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01j), Toast.LENGTH_SHORT).show();
            spblg01j02.setError("This data is Required!");
            spblg01j02.setFocusableInTouchMode(true);
            spblg01j02.setFocusable(true);
            spblg01j02.requestFocus();
            Log.i(TAG, "spblg01j: This data is Required!");
            return false;
        } else {
            spblg01j02.setError(null);
        }
        if (spblg01j01.isChecked()) {
            if (spblg01jnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01jnum.setError("This data is Required!");
                spblg01jnum.requestFocus();
                Log.i(TAG, "spblg01jnum: This data is Required!");
                return false;
            } else {
                spblg01jnum.setError(null);
            }

            if (spblg01jsrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01jsrc.setError("This data is Required!");
                spblg01jsrc.requestFocus();
                Log.i(TAG, "spblg01jsrc: This data is Required!");
                return false;
            } else {
                spblg01jsrc.setError(null);
            }

        }

        if (spblg01k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01k), Toast.LENGTH_SHORT).show();
            spblg01k02.setError("This data is Required!");
            spblg01k02.setFocusableInTouchMode(true);
            spblg01k02.setFocusable(true);
            spblg01k02.requestFocus();
            Log.i(TAG, "spblg01k: This data is Required!");
            return false;
        } else {
            spblg01k02.setError(null);
        }
        if (spblg01k01.isChecked()) {
            if (spblg01knum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01knum.setError("This data is Required!");
                spblg01knum.requestFocus();
                Log.i(TAG, "spblg01knum: This data is Required!");
                return false;
            } else {
                spblg01knum.setError(null);
            }

            if (spblg01ksrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01ksrc.setError("This data is Required!");
                spblg01ksrc.requestFocus();
                Log.i(TAG, "spblg01ksrc: This data is Required!");
                return false;
            } else {
                spblg01ksrc.setError(null);
            }

        }

        if (spblg01l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblg01l), Toast.LENGTH_SHORT).show();
            spblg01l02.setError("This data is Required!");
            spblg01l02.setFocusableInTouchMode(true);
            spblg01l02.setFocusable(true);
            spblg01l02.requestFocus();
            Log.i(TAG, "spblg01l: This data is Required!");
            return false;
        } else {
            spblg01l02.setError(null);
        }
        if (spblg01l01.isChecked()) {
            if (spblg01lnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                spblg01lnum.setError("This data is Required!");
                spblg01lnum.requestFocus();
                Log.i(TAG, "spblg01lnum: This data is Required!");
                return false;
            } else {
                spblg01lnum.setError(null);
            }

            if (spblg01lsrc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.src), Toast.LENGTH_SHORT).show();
                spblg01lsrc.setError("This data is Required!");
                spblg01lsrc.requestFocus();
                Log.i(TAG, "spblg01lsrc: This data is Required!");
                return false;
            } else {
                spblg01lsrc.setError(null);
            }

        }



        return true;

    }

}

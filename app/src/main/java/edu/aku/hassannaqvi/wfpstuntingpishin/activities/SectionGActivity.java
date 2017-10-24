package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
    @BindView(R.id.crj01g)
    RadioGroup crj01g;
    @BindView(R.id.crj01g01)
    RadioButton crj01g01;
    @BindView(R.id.crj01g02)
    RadioButton crj01g02;
    @BindView(R.id.fldGrpcrj01g)
    LinearLayout fldGrpcrj01g;
    @BindView(R.id.crj01gnum)
    EditText crj01gnum;
    @BindView(R.id.spblg01gsrc)
    EditText spblg01gsrc;
    @BindView(R.id.crj01h)
    RadioGroup crj01h;
    @BindView(R.id.crj01h01)
    RadioButton crj01h01;
    @BindView(R.id.crj01h02)
    RadioButton crj01h02;
    @BindView(R.id.fldGrpcrj01h)
    LinearLayout fldGrpcrj01h;
    @BindView(R.id.crj01hnum)
    EditText crj01hnum;
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

        //   MainApp.fc.setsG(String.valueOf(sg));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== splg01a ==============

        return true;

    }

}

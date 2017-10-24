package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

public class SectionHActivity extends Activity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.spblh01)
    Spinner spblh01;
    @BindView(R.id.spblh02)
    RadioGroup spblh02;
    @BindView(R.id.spblh02a)
    RadioButton spblh02a;
    @BindView(R.id.spblh02b)
    RadioButton spblh02b;
    @BindView(R.id.spblh0299)
    RadioButton spblh0299;
    @BindView(R.id.fldGrpspblh02)
    LinearLayout fldGrpspblh02;
    @BindView(R.id.spblh03a)
    CheckBox spblh03a;
    @BindView(R.id.spblh03b)
    CheckBox spblh03b;
    @BindView(R.id.spblh03c)
    CheckBox spblh03c;
    @BindView(R.id.spblh03d)
    CheckBox spblh03d;
    @BindView(R.id.spblh03e)
    CheckBox spblh03e;
    @BindView(R.id.spblh03f)
    CheckBox spblh03f;
    @BindView(R.id.spblh03g)
    CheckBox spblh03g;
    @BindView(R.id.spblh0399)
    CheckBox spblh0399;
    @BindView(R.id.spblh0388)
    CheckBox spblh0388;
    @BindView(R.id.spblh0388x)
    EditText spblh0388x;
    @BindView(R.id.spblh04a)
    CheckBox spblh04a;
    @BindView(R.id.spblh04b)
    CheckBox spblh04b;
    @BindView(R.id.spblh0499)
    CheckBox spblh0499;
    @BindView(R.id.spblh0488)
    CheckBox spblh0488;
    @BindView(R.id.spblh0488x)
    EditText spblh0488x;
    @BindView(R.id.spblh05)
    RadioGroup spblh05;
    @BindView(R.id.spblh05a)
    RadioButton spblh05a;
    @BindView(R.id.spblh05b)
    RadioButton spblh05b;
    @BindView(R.id.spblh0599)
    RadioButton spblh0599;
    @BindView(R.id.fldGrpspblh05)
    LinearLayout fldGrpspblh05;
    @BindView(R.id.spblh06a)
    CheckBox spblh06a;
    @BindView(R.id.spblh06b)
    CheckBox spblh06b;
    @BindView(R.id.spblh06c)
    CheckBox spblh06c;
    @BindView(R.id.spblh06d)
    CheckBox spblh06d;
    @BindView(R.id.spblh06e)
    CheckBox spblh06e;
    @BindView(R.id.spblh06f)
    CheckBox spblh06f;
    @BindView(R.id.spblh06g)
    CheckBox spblh06g;
    @BindView(R.id.spblh06h)
    CheckBox spblh06h;
    @BindView(R.id.spblh0699)
    CheckBox spblh0699;
    @BindView(R.id.spblh0688)
    CheckBox spblh0688;
    @BindView(R.id.spblh0688x)
    EditText spblh0688x;
    @BindView(R.id.spblh07a)
    CheckBox spblh07a;
    @BindView(R.id.spblh07b)
    CheckBox spblh07b;
    @BindView(R.id.spblh07c)
    CheckBox spblh07c;
    @BindView(R.id.spblh07d)
    CheckBox spblh07d;
    @BindView(R.id.spblh07e)
    CheckBox spblh07e;
    @BindView(R.id.spblh07f)
    CheckBox spblh07f;
    @BindView(R.id.spblh07g)
    CheckBox spblh07g;
    @BindView(R.id.spblh07h)
    CheckBox spblh07h;
    @BindView(R.id.spblh0799)
    CheckBox spblh0799;
    @BindView(R.id.spblh0788)
    CheckBox spblh0788;
    @BindView(R.id.spblh0788x)
    EditText spblh0788x;
    @BindView(R.id.spblh08)
    RadioGroup spblh08;
    @BindView(R.id.spblh08a)
    RadioButton spblh08a;
    @BindView(R.id.spblh08b)
    RadioButton spblh08b;
    @BindView(R.id.spblh0899)
    RadioButton spblh0899;
    @BindView(R.id.fldGrpspblh08)
    LinearLayout fldGrpspblh08;
    @BindView(R.id.spblh09a)
    CheckBox spblh09a;
    @BindView(R.id.spblh09b)
    CheckBox spblh09b;
    @BindView(R.id.spblh09c)
    CheckBox spblh09c;
    @BindView(R.id.spblh09d)
    CheckBox spblh09d;
    @BindView(R.id.spblh09e)
    CheckBox spblh09e;
    @BindView(R.id.spblh0999)
    CheckBox spblh0999;
    @BindView(R.id.spblh0988)
    CheckBox spblh0988;
    @BindView(R.id.spblh0988x)
    EditText spblh0988x;
    @BindView(R.id.spblh10a)
    CheckBox spblh10a;
    @BindView(R.id.spblh10b)
    CheckBox spblh10b;
    @BindView(R.id.spblh10c)
    CheckBox spblh10c;
    @BindView(R.id.spblh10d)
    CheckBox spblh10d;
    @BindView(R.id.spblh1099)
    CheckBox spblh1099;
    @BindView(R.id.spblh1088)
    CheckBox spblh1088;
    @BindView(R.id.spblh1088x)
    EditText spblh1088x;
    @BindView(R.id.spblh11)
    RadioGroup spblh11;
    @BindView(R.id.spblh11a)
    RadioButton spblh11a;
    @BindView(R.id.spblh11b)
    RadioButton spblh11b;
    @BindView(R.id.spblh1199)
    RadioButton spblh1199;
    @BindView(R.id.fldGrpspblh11)
    LinearLayout fldGrpspblh11;
    @BindView(R.id.spblh12a)
    CheckBox spblh12a;
    @BindView(R.id.spblh12b)
    CheckBox spblh12b;
    @BindView(R.id.spblh12c)
    CheckBox spblh12c;
    @BindView(R.id.spblh12d)
    CheckBox spblh12d;
    @BindView(R.id.spblh12e)
    CheckBox spblh12e;
    @BindView(R.id.spblh12f)
    CheckBox spblh12f;
    @BindView(R.id.spblh1299)
    CheckBox spblh1299;
    @BindView(R.id.spblh1288)
    CheckBox spblh1288;
    @BindView(R.id.spblh1288x)
    EditText spblh1288x;
    @BindView(R.id.spblh13a)
    CheckBox spblh13a;
    @BindView(R.id.spblh13b)
    CheckBox spblh13b;
    @BindView(R.id.spblh13c)
    CheckBox spblh13c;
    @BindView(R.id.spblh1399)
    CheckBox spblh1399;
    @BindView(R.id.spblh1388)
    CheckBox spblh1388;
    @BindView(R.id.spblh1388x)
    EditText spblh1388x;
    @BindView(R.id.spblh14)
    RadioGroup spblh14;
    @BindView(R.id.spblh14a)
    RadioButton spblh14a;
    @BindView(R.id.spblh14b)
    RadioButton spblh14b;
    @BindView(R.id.spblh1499)
    RadioButton spblh1499;
    @BindView(R.id.fldGrpspblh14)
    LinearLayout fldGrpspblh14;
    @BindView(R.id.spblh15a)
    CheckBox spblh15a;
    @BindView(R.id.spblh15b)
    CheckBox spblh15b;
    @BindView(R.id.spblh15c)
    CheckBox spblh15c;
    @BindView(R.id.spblh15d)
    CheckBox spblh15d;
    @BindView(R.id.spblh15e)
    CheckBox spblh15e;
    @BindView(R.id.spblh15f)
    CheckBox spblh15f;
    @BindView(R.id.spblh15g)
    CheckBox spblh15g;
    @BindView(R.id.spblh15h)
    CheckBox spblh15h;
    @BindView(R.id.spblh1599)
    CheckBox spblh1599;
    @BindView(R.id.spblh1588)
    CheckBox spblh1588;
    @BindView(R.id.spblh1588x)
    EditText spblh1588x;
    @BindView(R.id.spblh16a)
    CheckBox spblh16a;
    @BindView(R.id.spblh16b)
    CheckBox spblh16b;
    @BindView(R.id.spblh16c)
    CheckBox spblh16c;
    @BindView(R.id.spblh16d)
    CheckBox spblh16d;
    @BindView(R.id.spblh16e)
    CheckBox spblh16e;
    @BindView(R.id.spblh16f)
    CheckBox spblh16f;
    @BindView(R.id.spblh16g)
    CheckBox spblh16g;
    @BindView(R.id.spblh16h)
    CheckBox spblh16h;
    @BindView(R.id.spblh16i)
    CheckBox spblh16i;
    @BindView(R.id.spblh1699)
    CheckBox spblh1699;
    @BindView(R.id.spblh1688)
    CheckBox spblh1688;
    @BindView(R.id.spblh1688x)
    EditText spblh1688x;
    @BindView(R.id.spblh17)
    RadioGroup spblh17;
    @BindView(R.id.spblh17a)
    RadioButton spblh17a;
    @BindView(R.id.spblh17b)
    RadioButton spblh17b;
    @BindView(R.id.spblh1799)
    RadioButton spblh1799;
    @BindView(R.id.fldGrpspblh17)
    LinearLayout fldGrpspblh17;
    @BindView(R.id.spblh18a)
    CheckBox spblh18a;
    @BindView(R.id.spblh18b)
    CheckBox spblh18b;
    @BindView(R.id.spblh18c)
    CheckBox spblh18c;
    @BindView(R.id.spblh18d)
    CheckBox spblh18d;
    @BindView(R.id.spblh18e)
    CheckBox spblh18e;
    @BindView(R.id.spblh18f)
    CheckBox spblh18f;
    @BindView(R.id.spblh18g)
    CheckBox spblh18g;
    @BindView(R.id.spblh18h)
    CheckBox spblh18h;
    @BindView(R.id.spblh1899)
    CheckBox spblh1899;
    @BindView(R.id.spblh1888)
    CheckBox spblh1888;
    @BindView(R.id.spblh1888x)
    EditText spblh1888x;
    @BindView(R.id.spblh19a)
    CheckBox spblh19a;
    @BindView(R.id.spblh19b)
    CheckBox spblh19b;
    @BindView(R.id.spblh19c)
    CheckBox spblh19c;
    @BindView(R.id.spblh19d)
    CheckBox spblh19d;
    @BindView(R.id.spblh19e)
    CheckBox spblh19e;
    @BindView(R.id.spblh1999)
    CheckBox spblh1999;
    @BindView(R.id.spblh1988)
    CheckBox spblh1988;
    @BindView(R.id.spblh1988x)
    EditText spblh1988x;
    @BindView(R.id.spblh20)
    RadioGroup spblh20;
    @BindView(R.id.spblh20a)
    RadioButton spblh20a;
    @BindView(R.id.spblh20b)
    RadioButton spblh20b;
    @BindView(R.id.spblh2099)
    RadioButton spblh2099;
    @BindView(R.id.fldGrpspblh20)
    LinearLayout fldGrpspblh20;
    @BindView(R.id.spblh21a)
    CheckBox spblh21a;
    @BindView(R.id.spblh21b)
    CheckBox spblh21b;
    @BindView(R.id.spblh21c)
    CheckBox spblh21c;
    @BindView(R.id.spblh21d)
    CheckBox spblh21d;
    @BindView(R.id.spblh21e)
    CheckBox spblh21e;
    @BindView(R.id.spblh21f)
    CheckBox spblh21f;
    @BindView(R.id.spblh2199)
    CheckBox spblh2199;
    @BindView(R.id.spblh2188)
    CheckBox spblh2188;
    @BindView(R.id.spblh2188x)
    EditText spblh2188x;
    @BindView(R.id.spblh22a)
    CheckBox spblh22a;
    @BindView(R.id.spblh22b)
    CheckBox spblh22b;
    @BindView(R.id.spblh22c)
    CheckBox spblh22c;
    @BindView(R.id.spblh2299)
    CheckBox spblh2299;
    @BindView(R.id.spblh2288)
    CheckBox spblh2288;
    @BindView(R.id.spblh2288x)
    EditText spblh2288x;
    @BindView(R.id.spblh23)
    RadioGroup spblh23;
    @BindView(R.id.spblh23a)
    RadioButton spblh23a;
    @BindView(R.id.spblh23b)
    RadioButton spblh23b;
    @BindView(R.id.spblh2399)
    RadioButton spblh2399;
    @BindView(R.id.fldGrpspblh23)
    LinearLayout fldGrpspblh23;
    @BindView(R.id.spblh24)
    RadioGroup spblh24;
    @BindView(R.id.spblh24a)
    RadioButton spblh24a;
    @BindView(R.id.spblh24b)
    RadioButton spblh24b;
    @BindView(R.id.spblh2499)
    RadioButton spblh2499;
    @BindView(R.id.fldGrpspblh24)
    LinearLayout fldGrpspblh24;
    @BindView(R.id.spblh25a)
    CheckBox spblh25a;
    @BindView(R.id.spblh25b)
    CheckBox spblh25b;
    @BindView(R.id.spblh25c)
    CheckBox spblh25c;
    @BindView(R.id.spblh25d)
    CheckBox spblh25d;
    @BindView(R.id.spblh25e)
    CheckBox spblh25e;
    @BindView(R.id.spblh25f)
    CheckBox spblh25f;
    @BindView(R.id.spblh2599)
    CheckBox spblh2599;
    @BindView(R.id.spblh2588)
    CheckBox spblh2588;
    @BindView(R.id.spblh2588x)
    EditText spblh2588x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
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

     /*   int updcount = db.updateSH();

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

        JSONObject sh = new JSONObject();


        //   MainApp.fc.setsH(String.valueOf(sh));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== splh01a ==============

        return true;

    }


}


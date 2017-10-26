package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
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
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionKActivity extends AppCompatActivity
{

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
    @BindView(R.id.spbl08bx)
    EditText spbl08bx;
    @BindView(R.id.spbl08cx)
    EditText spbl08cx;
    @BindView(R.id.spblk09)
    RadioGroup spblk09;
    @BindView(R.id.spblk09a)
    RadioButton spblk09a;
    @BindView(R.id.spblk09b)
    RadioButton spblk09b;
    @BindView(R.id.spblk09c)
    RadioButton spblk09c;
    @BindView(R.id.spblk10)
    RadioGroup spblk10;
    @BindView(R.id.spblk10a)
    RadioButton spblk10a;
    @BindView(R.id.spblk10b)
    RadioButton spblk10b;
    @BindView(R.id.spblk10c)
    RadioButton spblk10c;
    @BindView(R.id.spblk11)
    RadioGroup spblk11;
    @BindView(R.id.spblk11a)
    RadioButton spblk11a;
    @BindView(R.id.spblk11b)
    RadioButton spblk11b;
    @BindView(R.id.spblk11c)
    RadioButton spblk11c;
    @BindView(R.id.spblk12)
    RadioGroup spblk12;
    @BindView(R.id.spblk12a)
    RadioButton spblk12a;
    @BindView(R.id.spblk12b)
    RadioButton spblk12b;
    @BindView(R.id.spblk12c)
    RadioButton spblk12c;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_k);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

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


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }



}

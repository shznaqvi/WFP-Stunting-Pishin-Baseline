package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.wfpstuntingpishin.FormsList;
import edu.aku.hassannaqvi.wfpstuntingpishin.contracts.FormsContract;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.get.GetUsers;
import edu.aku.hassannaqvi.wfpstuntingpishin.sync.SyncForms10;
import edu.aku.hassannaqvi.wfpstuntingpishin.sync.SyncForms3;
import edu.aku.hassannaqvi.wfpstuntingpishin.sync.SyncForms8;
import edu.aku.hassannaqvi.wfpstuntingpishin.sync.SyncForms9;

public class MainActivity extends Activity {

    private final String TAG = "MainActivity";

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(edu.aku.hassannaqvi.wfpstuntingpishin.R.id.adminsec)
    LinearLayout adminsec;
    @BindView(edu.aku.hassannaqvi.wfpstuntingpishin.R.id.lblheader)
    TextView lblheader;
    @BindView(edu.aku.hassannaqvi.wfpstuntingpishin.R.id.recordSummary)
    TextView recordSummary;

    @BindView(edu.aku.hassannaqvi.wfpstuntingpishin.R.id.syncDevice)
    Button syncDevice;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";
    private ProgressDialog pd;
    private Boolean exit = false;
    private String rSumText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(edu.aku.hassannaqvi.wfpstuntingpishin.R.layout.activity_main);

        ButterKnife.bind(this);

        lblheader.setText("Welcome! You're assigned to block ' " + MainApp.regionDss + " '" + MainApp.userName);

        if (MainApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
        } else {
            adminsec.setVisibility(View.GONE);
        }

        // Reset working variables
        MainApp.child_name = "Test";

        /*TagID Start*/
        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        ImageView img = new ImageView(getApplicationContext());
        img.setImageResource(edu.aku.hassannaqvi.wfpstuntingpishin.R.drawable.tagimg);
        img.setPadding(0, 15, 0, 15);
        builder.setCustomTitle(img);

        final EditText input = new EditText(MainActivity.this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                if (!m_Text.equals("")) {
                    editor.putString("tagName", m_Text);
                    editor.commit();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        if (sharedPref.getString("tagName", null) == "" || sharedPref.getString("tagName", null) == null) {
            builder.show();
        }
        /*TagID End*/


        DatabaseHelper db = new DatabaseHelper(this);
        Collection<FormsContract> todaysForms = db.getTodayForms();
        Collection<FormsContract> unsyncedForms3 = db.getUnsyncedForms3();
        Collection<FormsContract> unsyncedForms8 = db.getUnsyncedForms8();
     /*   Collection<FetusContract> unsyncedFetus = db.getUnsyncedFetus();*/
        Collection<FormsContract> unsyncedForms9 = db.getUnsyncedForms9();
        Collection<FormsContract> unsyncedForms10 = db.getUnsyncedForms10();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";

        rSumText += "=======================\r\n";
        rSumText += "\r\n";
        rSumText += "Total Forms Today: " + todaysForms.size() + "\r\n";
        rSumText += "\r\n";
        if (todaysForms.size() > 0) {
            rSumText += "\tFORMS' LIST: \r\n";
            String iStatus;
            rSumText += "--------------------------------------------------\r\n";
            rSumText += "[ DSS_ID ] \t[Form Status] \t[Sync Status]----------\r\n";
            rSumText += "--------------------------------------------------\r\n";

            for (FormsContract fc : todaysForms) {
                if (fc.getIstatus() != null) {
                    switch (fc.getIstatus()) {
                        case "1":
                            iStatus = "\tComplete";
                            break;
                        case "2":
                            iStatus = "\tIncomplete";
                            break;
                        case "3":
                            iStatus = "\tRefused";
                            break;
                        case "4":
                            iStatus = "\tRefused";
                            break;
                        default:
                            iStatus = "\tN/A";
                    }
                } else {
                    iStatus = "\tN/A";
                }

                rSumText += fc.getFormType();

                rSumText += " " + iStatus + " ";

                rSumText += (fc.getSynced() == null ? "\t\tNot Synced" : "\t\tSynced");
                rSumText += "\r\n";
                rSumText += "--------------------------------------------------\r\n";
            }
        }

        if (MainApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Data Download: \t" + syncPref.getString("LastDownSyncServer", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Data Upload: \t" + syncPref.getString("LastUpSyncServer", "Never Synced");
            rSumText += "\r\n";
            rSumText += "\r\n";
            rSumText += "Unsynced Forms3: \t" + unsyncedForms3.size();
            rSumText += "\r\n";
            rSumText += "Unsynced Forms8: \t" + unsyncedForms8.size();
            rSumText += "\r\n";
            /*rSumText += "Unsynced Fetus: \t" + unsyncedFetus.size();
            rSumText += "\r\n";*/
            rSumText += "Unsynced Forms9: \t" + unsyncedForms9.size();
            rSumText += "\r\n";
            rSumText += "Unsynced Forms10: \t" + unsyncedForms10.size();
            rSumText += "\r\n";
        }
        Log.d(TAG, "onCreate: " + rSumText);
        recordSummary.setText(rSumText);


    }

    public void openForm(View v) {
        if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null && !MainApp.userName.equals("0000")) {
          /*  Intent oF = new Intent(MainActivity.this, F03AActivity.class);
            MainApp.formType = "3";
            startActivity(oF);*/
        } else {

            builder = new AlertDialog.Builder(MainActivity.this);
            ImageView img = new ImageView(getApplicationContext());
            img.setImageResource(edu.aku.hassannaqvi.wfpstuntingpishin.R.drawable.tagimg);
            img.setPadding(0, 15, 0, 15);
            builder.setCustomTitle(img);

            final EditText input = new EditText(MainActivity.this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    m_Text = input.getText().toString();
                    if (!m_Text.equals("")) {
                        editor.putString("tagName", m_Text);
                        editor.commit();

                        if (!MainApp.userName.equals("0000")) {
                           /* Intent oF = new Intent(MainActivity.this, F03AActivity.class);
                            MainApp.formType = "3";
                            startActivity(oF);*/
                        }
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
        }
    }

    /*public void motherForm(View v) {
        if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null && !MainApp.userName.equals("0000")) {
            Intent oF = new Intent(MainActivity.this, MotherListActivity.class);
            startActivity(oF);
        } else {

            builder = new AlertDialog.Builder(MainActivity.this);
            ImageView img = new ImageView(getApplicationContext());
            img.setImageResource(R.drawable.tagimg);
            img.setPadding(0, 15, 0, 15);
            builder.setCustomTitle(img);

            final EditText input = new EditText(MainActivity.this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    m_Text = input.getText().toString();
                    if (!m_Text.equals("")) {
                        editor.putString("tagName", m_Text);
                        editor.commit();

                        if (!MainApp.userName.equals("0000")) {
                            Intent oF = new Intent(MainActivity.this, MotherListActivity.class);
                            startActivity(oF);
                        }
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
        }
    }

    public void openMembers(View v) {
        Intent iMem = new Intent(this, MotherListActivity.class);
        startActivity(iMem);
    }
*/
    public void openForm4(View v) {
        Intent iA = new Intent(this, IdentificationActivity.class);
        MainApp.formType = "4";
        startActivity(iA);
    }

    public void openForm7(View v) {
        Intent iA = new Intent(this, IdentificationActivity.class);
        MainApp.formType = "7";
        startActivity(iA);
    }

    public void openForm8(View v) {
        Intent iA = new Intent(this, IdentificationActivity.class);
        MainApp.formType = "8";
        startActivity(iA);
    }

    public void openForm9(View v) {
        Intent iA = new Intent(this, IdentificationActivity.class);
        MainApp.formType = "9";
        startActivity(iA);
    }

    public void openForm10(View v) {
        Intent iA = new Intent(this, IdentificationActivity.class);
        MainApp.formType = "10";
        startActivity(iA);
    }

    public void openB(View v) {
      /*  Intent iB = new Intent(this, F04AActivity.class);
        startActivity(iB);*/
    }

    public void openC(View v) {
        /*Intent iC = new Intent(this, SectionCActivity.class);
        startActivity(iC);*/
    }

    public void openD(View v) {
        /*Intent iD = new Intent(this, SectionDActivity.class);
        startActivity(iD);*/
    }

    public void openE(View v) {
        /*Intent iD = new Intent(this, SectionEActivity.class);
        startActivity(iD);*/
    }

    public void openF(View v) {
        /*Intent iD = new Intent(this, SectionFActivity.class);
        startActivity(iD);*/
    }

    public void openG(View v) {
        /*Intent iG = new Intent(this, SectionGActivity.class);
        startActivity(iG);*/
    }

    public void openH(View v) {
        /*Intent iEnd = new Intent(this, SectionHActivity.class);
        startActivity(iEnd);*/
    }

    public void openI(View v) {
        /*Intent iEnd = new Intent(this, SectionIActivity.class);
        startActivity(iEnd);*/
    }

    public void openJ(View v) {
        /*Intent iEnd = new Intent(this, SectionJActivity.class);
        startActivity(iEnd);*/
    }

    public void openK(View v) {
        /*Intent iEnd = new Intent(this, SectionKActivity.class);
        startActivity(iEnd);*/
    }

    public void openL(View v) {
        /*Intent iEnd = new Intent(this, SectionLActivity.class);
        startActivity(iEnd);*/
    }

    public void openM(View v) {
        /*Intent iEnd = new Intent(this, SectionMActivity.class);
        startActivity(iEnd);*/
    }

    public void testGPS(View v) {

        SharedPreferences sharedPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
        Log.d("MAP", "testGPS: " + sharedPref.getAll().toString());
        Map<String, ?> allEntries = sharedPref.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            Log.d("Map", entry.getKey() + ": " + entry.getValue().toString());
        }

    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void CheckCluster(View v) {
        Intent cluster_list = new Intent(getApplicationContext(), FormsList.class);
        cluster_list.putExtra("dssid", MainApp.regionDss);
        startActivity(cluster_list);

    }

    public void syncServer(View view) {
        Log.e(TAG, "syncServer: 1");
        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        Log.e(TAG, "syncServer: 2");
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms3(this).execute();
            new SyncForms8(this).execute();
//            new SyncFetus(this).execute();
            new SyncForms9(this).execute();
            new SyncForms10(this).execute();

           /* Toast.makeText(getApplicationContext(), "Syncing Participants", Toast.LENGTH_SHORT).show();
            new SyncParticipants(this).execute();*/


//            Toast.makeText(getApplicationContext(), "Syncing Mother", Toast.LENGTH_SHORT).show();
//            new SyncMother(this).execute();


            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {
        if (isNetworkAvailable()) {


            GetUsers gu = new GetUsers(this);
            Toast.makeText(getApplicationContext(), "Syncing Users", Toast.LENGTH_SHORT).show();
            gu.execute();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastDownSyncServer", dtToday);

            editor.apply();
        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity

            startActivity(new Intent(this, LoginActivity.class));

        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }

}
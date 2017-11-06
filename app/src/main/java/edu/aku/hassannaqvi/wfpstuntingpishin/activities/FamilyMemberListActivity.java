package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.DatabaseHelper;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses.FamilyMembers;

public class FamilyMemberListActivity extends Activity implements View.OnKeyListener {

    private static final String TAG = FamilyMemberListActivity.class.getName();
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

    @BindView(R.id.btn_Continue)
    Button btn_Continue;
    @BindView(R.id.btn_addMember)
    Button btn_addMember;

    @BindView(R.id.recycler_noMembers)
    RecyclerView recyclerNoMembers;

    familyMembersAdapter mAdapter;

    Boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member_list);
        ButterKnife.bind(this);

//        Filling values

        spbla07t.setText(String.valueOf(MainApp.members.getCount()));
        spbla07pw.setText(String.valueOf(MainApp.members.getWomen().get(0)));
        spbla07lw.setText(String.valueOf(MainApp.members.getWomen().get(1)));
        spbla07mw.setText(String.valueOf(MainApp.members.getWomen().get(2)));
        spbla07m6.setText(String.valueOf(MainApp.members.getChildren().get(0).get(1)));
        spbla07f6.setText(String.valueOf(MainApp.members.getChildren().get(0).get(2)));
        spbla07m23.setText(String.valueOf(MainApp.members.getChildren().get(1).get(1)));
        spbla07f23.setText(String.valueOf(MainApp.members.getChildren().get(1).get(2)));
        spbla07m59.setText(String.valueOf(MainApp.members.getChildren().get(2).get(1)));
        spbla07f59.setText(String.valueOf(MainApp.members.getChildren().get(2).get(2)));

//        Recycler View

        mAdapter = new familyMembersAdapter(MainApp.familyMembersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerNoMembers.setLayoutManager(mLayoutManager);
        recyclerNoMembers.setItemAnimator(new DefaultItemAnimator());
        recyclerNoMembers.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();

//        Text Watchers


        spbla07t.setOnKeyListener(this);
        spbla07t.addTextChangedListener(new CustomTextWatcher(spbla07t));
        spbla07m6.setOnKeyListener(this);
        spbla07m6.addTextChangedListener(new CustomTextWatcher(spbla07m6));
        spbla07f6.setOnKeyListener(this);
        spbla07f6.addTextChangedListener(new CustomTextWatcher(spbla07f6));
        spbla07m23.setOnKeyListener(this);
        spbla07m23.addTextChangedListener(new CustomTextWatcher(spbla07m23));
        spbla07f23.setOnKeyListener(this);
        spbla07f23.addTextChangedListener(new CustomTextWatcher(spbla07f23));
        spbla07m59.setOnKeyListener(this);
        spbla07m59.addTextChangedListener(new CustomTextWatcher(spbla07m59));
        spbla07f59.setOnKeyListener(this);
        spbla07f59.addTextChangedListener(new CustomTextWatcher(spbla07f59));

        spbla07pw.addTextChangedListener(new CustomTextWatcher(spbla07pw));
        spbla07lw.addTextChangedListener(new CustomTextWatcher(spbla07lw));
        spbla07mw.addTextChangedListener(new CustomTextWatcher(spbla07mw));


    }

    @Override
    public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
        if (keyCode == KeyEvent.KEYCODE_DEL) {
            switch (view.getId()) {

                case R.id.spbla07m6:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(1)) < Integer.valueOf(spbla07m6.getText().toString())) {
                        return false;
                    }
                    break;
                case R.id.spbla07f6:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(2)) < Integer.valueOf(spbla07f6.getText().toString())) {
                        return false;
                    }
                    break;
                case R.id.spbla07m23:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(1)) < Integer.valueOf(spbla07m23.getText().toString())) {
                        return false;
                    }
                    break;
                case R.id.spbla07f23:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(2)) < Integer.valueOf(spbla07f23.getText().toString())) {
                        return false;
                    }
                    break;
                case R.id.spbla07m59:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(1)) < Integer.valueOf(spbla07m59.getText().toString())) {
                        return false;
                    }
                    break;
                case R.id.spbla07f59:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(2)) < Integer.valueOf(spbla07f59.getText().toString())) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public void createToast(String msg, EditText name) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Fix Error to open buttons!", Toast.LENGTH_SHORT).show();
        EditText edit = name;
        edit.setError("Invalid");

        btn_Continue.setEnabled(false);
        btn_addMember.setEnabled(false);

        flag = false;
    }

    @OnClick(R.id.btn_addMember)
    void onBtnAddMemberClick() {
        //TODO implement

        if (formValidation(false)) {
            startActivity(new Intent(this, SectionBActivity.class));
        }
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        if (formValidation(true)) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();
                startActivity(new Intent(this, SectionCActivity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private void SaveDraft() throws JSONException {

        JSONObject count = new JSONObject();
        count.put("spbla07t_r", spbla07t.getText().toString());
        count.put("spbla07pw_r", spbla07pw.getText().toString());
        count.put("spbla07lw_r", spbla07lw.getText().toString());
        count.put("spbla07mw_r", spbla07mw.getText().toString());
        count.put("spbla07m6_r", spbla07m6.getText().toString());
        count.put("spbla07f6_r", spbla07f6.getText().toString());
        count.put("spbla07m23_r", spbla07m23.getText().toString());
        count.put("spbla07f23_r", spbla07f23.getText().toString());
        count.put("spbla07m59_r", spbla07m59.getText().toString());
        count.put("spbla07f59_r", spbla07f59.getText().toString());

        MainApp.fc.setsCount(String.valueOf(count));
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSCount();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    @Override
    protected void onResume() {
        super.onResume();

        mAdapter.notifyDataSetChanged();

        resumeWork();

    }

    public void resumeWork() {
        if (MainApp.members.getCount() == MainApp.checkMembers.getCount()
                &&
                Integer.valueOf(MainApp.members.getChildren().get(0).get(1)) == Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(1))
                &&
                Integer.valueOf(MainApp.members.getChildren().get(0).get(2)) == Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(2))
                &&
                Integer.valueOf(MainApp.members.getChildren().get(1).get(1)) == Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(1))
                &&
                Integer.valueOf(MainApp.members.getChildren().get(1).get(2)) == Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(2))
                &&
                Integer.valueOf(MainApp.members.getChildren().get(2).get(1)) == Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(1))
                &&
                Integer.valueOf(MainApp.members.getChildren().get(2).get(2)) == Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(2))) {

            btn_addMember.setEnabled(false);
            btn_Continue.setEnabled(true);
        } else {
            btn_addMember.setEnabled(true);
            btn_Continue.setEnabled(false);
        }
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
    }

    public boolean formValidation(boolean flag1) {

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

//        Main Validation
        if (flag1) {
            Boolean check = false;
            for (FamilyMembers mem : MainApp.familyMembersList) {
                if (mem.getType().equals("mw")) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }

            if (check) {
                Toast.makeText(this, "ERROR(Invalid): Fill Women", Toast.LENGTH_SHORT).show();
                switch (MainApp.selectedMom) {
                    case 0:
                        spbla07pw.setError("Fill atleast 1");
                        return false;
                    case 1:
                        spbla07lw.setError("Fill atleast 1");
                        return false;
                    case 2:
                        spbla07mw.setError("Fill atleast 1");
                        return false;
                }
            }
        }

        return true;
    }

    private class CustomTextWatcher implements TextWatcher {
        private EditText edit;

        public CustomTextWatcher(EditText e) {
            edit = e;
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {

            Map<Integer, Map<Integer, String>> children = new HashMap<>();
            Map<Integer, String> child = new HashMap<>();

            switch (edit.getId()) {

                case R.id.spbla07t:
                    if (!spbla07t.getText().toString().isEmpty()) {
                        MainApp.members.setCount(Integer.valueOf(spbla07t.getText().toString()));
                        if (Integer.valueOf(spbla07t.getText().toString()) > MainApp.checkMembers.getCount()) {
                            btn_addMember.setEnabled(true);
                            btn_Continue.setEnabled(false);
                        } else {
                            btn_Continue.setEnabled(true);
                            btn_addMember.setEnabled(false);
                        }
                    }
                    break;

                case R.id.spbla07m6:
                case R.id.spbla07f6:

                    if (!spbla07m6.getText().toString().isEmpty()) {
                        if (Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(1)) > Integer.valueOf(spbla07m6.getText().toString())) {
//                            spbla07m6.setText(spbla07m6.getText().toString());
                            createToast("Can't subtract already added", spbla07m6);
                        } else {
                            if (R.id.spbla07f6 != edit.getId()) {
                                flag = true;
                                btn_Continue.setEnabled(true);
                                btn_addMember.setEnabled(true);
                            }
                            spbla07m6.setError(null);
                        }
                    }

                    if (!spbla07f6.getText().toString().isEmpty()) {
                        if (Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(2)) > Integer.valueOf(spbla07f6.getText().toString())) {
//                            spbla07f6.setText(spbla07f6.getText().toString());
                            createToast("Can't subtract already added", spbla07f6);
                        } else {
                            if (R.id.spbla07m6 != edit.getId()) {
                                flag = true;
                                btn_Continue.setEnabled(true);
                                btn_addMember.setEnabled(true);
                            }
                            spbla07f6.setError(null);
                        }
                    }
                    child.put(1, spbla07m6.getText().toString());
                    child.put(2, spbla07f6.getText().toString());

                    children.put(0, child);
                    MainApp.members.setChildren(0, child);

                    break;

                case R.id.spbla07m23:
                case R.id.spbla07f23:

                    if (!spbla07m23.getText().toString().isEmpty()) {
                        if (Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(1)) > Integer.valueOf(spbla07m23.getText().toString())) {
//                            spbla07m23.setText(spbla07m23.getText().toString());
                            createToast("Can't subtract already added", spbla07m23);
                        } else {
                            if (R.id.spbla07f23 != edit.getId()) {
                                flag = true;
                                btn_Continue.setEnabled(true);
                                btn_addMember.setEnabled(true);
                            }
                            spbla07f23.setError(null);
                        }
                    }

                    if (!spbla07f23.getText().toString().isEmpty()) {
                        if (Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(2)) > Integer.valueOf(spbla07f23.getText().toString())) {
//                            spbla07f23.setText(spbla07f23.getText().toString());
                            createToast("Can't subtract already added", spbla07f23);
                        } else {

                            if (R.id.spbla07m23 != edit.getId()) {
                                flag = true;
                                btn_Continue.setEnabled(true);
                                btn_addMember.setEnabled(true);
                            }
                            spbla07f23.setError(null);
                        }
                    }

                    child.put(1, spbla07m23.getText().toString());
                    child.put(2, spbla07f23.getText().toString());

                    children.put(1, child);
                    MainApp.members.setChildren(1, child);

                    break;

                case R.id.spbla07m59:
                case R.id.spbla07f59:

                    if (!spbla07m59.getText().toString().isEmpty()) {
                        if (Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(1)) > Integer.valueOf(spbla07m59.getText().toString())) {
//                            spbla07m59.setText(spbla07m59.getText().toString());
                            createToast("Can't subtract already added", spbla07m59);
                        }
                    } else {
                        if (R.id.spbla07f59 != edit.getId()) {
                            flag = true;
                            btn_Continue.setEnabled(true);
                            btn_addMember.setEnabled(true);
                        }
                        spbla07m59.setError(null);
                    }

                    if (!spbla07f59.getText().toString().isEmpty()) {
                        if (Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(2)) > Integer.valueOf(spbla07f59.getText().toString())) {
//                            spbla07f59.setText(spbla07f59.getText().toString());
                            createToast("Can't subtract already added", spbla07f59);
                        }
                    } else {
                        if (R.id.spbla07m59 != edit.getId()) {
                            flag = true;
                            btn_Continue.setEnabled(true);
                            btn_addMember.setEnabled(true);
                        }
                        spbla07f59.setError(null);
                    }

                    child.put(1, spbla07m59.getText().toString());
                    child.put(2, spbla07f59.getText().toString());

                    children.put(2, child);
                    MainApp.members.setChildren(2, child);

                    break;

                case R.id.spbla07pw:

                    if (!spbla07pw.getText().toString().isEmpty()) {
                        if (MainApp.selectedMom == 0 && Integer.valueOf(spbla07pw.getText().toString()) < 1) {
                            createToast("Can't be less than 1", spbla07pw);
                        } else if (Integer.valueOf(spbla07t.getText().toString()) > MainApp.checkMembers.getCount()) {
                            btn_addMember.setEnabled(true);
                            btn_Continue.setEnabled(false);
                        } else {
                            btn_Continue.setEnabled(true);
                            btn_addMember.setEnabled(false);
                        }
                    }

                    break;
                case R.id.spbla07lw:
                    if (!spbla07lw.getText().toString().isEmpty()) {
                        if (MainApp.selectedMom == 1 && Integer.valueOf(spbla07lw.getText().toString()) < 1) {
                            createToast("Can't be less than 1", spbla07lw);
                        } else if (Integer.valueOf(spbla07t.getText().toString()) > MainApp.checkMembers.getCount()) {
                            btn_addMember.setEnabled(true);
                            btn_Continue.setEnabled(false);
                        } else {
                            btn_Continue.setEnabled(true);
                            btn_addMember.setEnabled(false);
                        }
                    }

                    break;
                case R.id.spbla07mw:
                    if (!spbla07mw.getText().toString().isEmpty()) {
                        if (MainApp.selectedMom == 2 && Integer.valueOf(spbla07mw.getText().toString()) < 1) {
                            createToast("Can't be less than 1", spbla07mw);
                        } else if (Integer.valueOf(spbla07t.getText().toString()) > MainApp.checkMembers.getCount()) {
                            btn_addMember.setEnabled(true);
                            btn_Continue.setEnabled(false);
                        } else {
                            btn_Continue.setEnabled(true);
                            btn_addMember.setEnabled(false);
                        }
                    }

                    break;
            }

//        Women
            Map<Integer, String> women = new HashMap<>();
            women.put(0, spbla07pw.getText().toString());
            women.put(1, spbla07lw.getText().toString());
            women.put(2, spbla07mw.getText().toString());

            MainApp.members.setWomen(women);


        }

        public void afterTextChanged(Editable s) {
            if (flag && !(spbla07pw.getText().toString().isEmpty() && spbla07lw.getText().toString().isEmpty() &&
                    spbla07mw.getText().toString().isEmpty() && spbla07t.getText().toString().isEmpty() &&
                    spbla07m6.getText().toString().isEmpty() && spbla07f6.getText().toString().isEmpty() &&
                    spbla07m23.getText().toString().isEmpty() && spbla07f23.getText().toString().isEmpty() &&
                    spbla07m59.getText().toString().isEmpty() && spbla07f59.getText().toString().isEmpty())) {
                resumeWork();
            }
        }
    }

    public class familyMembersAdapter extends RecyclerView.Adapter<familyMembersAdapter.viewHolder> {

        private List<FamilyMembers> familyMembersList;

        public familyMembersAdapter(List<FamilyMembers> familyMembersList) {
            this.familyMembersList = familyMembersList;
        }

        @Override
        public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.familymemberslist, parent, false);

            return new viewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(viewHolder holder, int position) {
            FamilyMembers familyMembers = MainApp.familyMembersList.get(position);

            holder.memberName.setText(familyMembers.getMemberName());
            holder.gender.setText(familyMembers.getGender());
            holder.motherName.setText("Mother:" + familyMembers.getMotherName());
            holder.type.setText(memberType(familyMembers.getType()));

            String[] dob = familyMembers.getDob().split("-");

            holder.age.setText(dob[0] + "y - " + dob[1] + "m - " + dob[2] + "d");
        }

        public String memberType(String type) {
            String value = "";
            switch (type) {
                case "mw":
                    value = "Married-Women";
                    break;
                case "w":
                    value = "Women";
                    break;
                case "m":
                    value = "Men";
                    break;
                case "ch":
                    value = "Child";
                    break;
            }
            return value;
        }

        @Override
        public int getItemCount() {
            return familyMembersList.size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {
            @BindView(R.id.memberName)
            TextView memberName;
            @BindView(R.id.gender)
            TextView gender;
            @BindView(R.id.age)
            TextView age;
            @BindView(R.id.type)
            TextView type;
            @BindView(R.id.motherName)
            TextView motherName;

            public viewHolder(View view) {
                super(view);
                ButterKnife.bind(this, view);
            }
        }
    }


}

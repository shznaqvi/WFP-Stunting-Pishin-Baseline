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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;
import edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses.FamilyMembers;
import edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses.MembersCount;

public class FamilyMemberListActivity extends Activity implements TextWatcher {

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

    @BindView(R.id.recycler_noMembers)
    RecyclerView recyclerNoMembers;

    familyMembersAdapter mAdapter;

    @BindViews({R.id.spbla07t,
            R.id.spbla07m6,
            R.id.spbla07f6,
            R.id.spbla07m23,
            R.id.spbla07f23,
            R.id.spbla07m59,
            R.id.spbla07f59})
    List<EditText> spbla07;

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

        MainApp.familyMembersList = new ArrayList<>();

        mAdapter = new familyMembersAdapter(MainApp.familyMembersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerNoMembers.setLayoutManager(mLayoutManager);
        recyclerNoMembers.setItemAnimator(new DefaultItemAnimator());
        recyclerNoMembers.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();

//        Text Watchers

        spbla07t.addTextChangedListener(new CustomTextWatcher(spbla07t));
        spbla07m6.addTextChangedListener(new CustomTextWatcher(spbla07m6));
        spbla07f6.addTextChangedListener(new CustomTextWatcher(spbla07f6));
        spbla07m23.addTextChangedListener(new CustomTextWatcher(spbla07m23));
        spbla07f23.addTextChangedListener(new CustomTextWatcher(spbla07f23));
        spbla07m59.addTextChangedListener(new CustomTextWatcher(spbla07m59));
        spbla07f59.addTextChangedListener(new CustomTextWatcher(spbla07f59));


    }

/*    //        Key pressed events
    @OnTextChanged(value = {R.id.spbla07t,
            R.id.spbla07m6,
            R.id.spbla07f6,
            R.id.spbla07m23,
            R.id.spbla07f23,
            R.id.spbla07m59,
            R.id.spbla07f59}, callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED)
    public void listener(Editable edit) {


    }*/

    private class CustomTextWatcher implements TextWatcher {
        private EditText edit;

        public CustomTextWatcher(EditText e) {
            edit = e;
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        public void afterTextChanged(Editable s) {
            Map<Integer, Map<Integer, String>> children = new HashMap<>();
            Map<Integer, String> child = new HashMap<>();

            switch (edit.getId()) {

                case R.id.spbla07m6:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(1)) < Integer.valueOf(spbla07m6.getText().toString())) {
                        child.put(1, spbla07m6.getText().toString());
                    } else {
                        createToast("Can't subtract already added", spbla07m6);
                    }
                    break;

                case R.id.spbla07f6:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(0).get(2)) < Integer.valueOf(spbla07f6.getText().toString())) {
                        child.put(2, spbla07f6.getText().toString());
                    } else {
                        createToast("Can't subtract already added", spbla07f6);
                    }

                    children.put(0, child);
                    child = new HashMap<>();

                    break;

                case R.id.spbla07m23:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(1)) < Integer.valueOf(spbla07m23.getText().toString())) {
                        child.put(1, spbla07m23.getText().toString());
                    } else {
                        createToast("Can't subtract already added", spbla07m23);
                    }
                    break;

                case R.id.spbla07f23:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(1).get(2)) < Integer.valueOf(spbla07f23.getText().toString())) {
                        child.put(2, spbla07f23.getText().toString());
                    } else {
                        createToast("Can't subtract already added", spbla07f23);
                    }

                    children.put(1, child);
                    child = new HashMap<>();

                    break;

                case R.id.spbla07m59:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(1)) < Integer.valueOf(spbla07m59.getText().toString())) {
                        child.put(1, spbla07m59.getText().toString());
                    } else {
                        createToast("Can't subtract already added", spbla07m59);
                    }
                    break;

                case R.id.spbla07f59:
                    if (Integer.valueOf(MainApp.checkMembers.getChildren().get(2).get(2)) < Integer.valueOf(spbla07f59.getText().toString())) {
                        child.put(2, spbla07f59.getText().toString());
                    } else {
                        createToast("Can't subtract already added", spbla07f59);
                    }

                    children.put(2, child);

                    break;

            }


//        Women
            Map<Integer, String> women = new HashMap<>();
            women.put(0, spbla07pw.getText().toString());
            women.put(1, spbla07lw.getText().toString());
            women.put(2, spbla07mw.getText().toString());

            MainApp.members = new MembersCount(Integer.parseInt(spbla07t.getText().toString()), children, women);
        }
    }

    public void createToast(String msg, EditText name) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        EditText edit = name;
        edit.setText("Invalid");
    }

    @OnClick(R.id.btn_addMember)
    void onBtnAddMemberClick() {
        //TODO implement

        startActivity(new Intent(this, SectionBActivity.class));

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        if (formValidation()) {
            finish();
            startActivity(new Intent(this, SectionDActivity.class));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        mAdapter.notifyDataSetChanged();
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        MainApp.endActivity(this, this);
    }

    public boolean formValidation() {

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

//        Main Validation


        return true;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {


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
            holder.martialStatus.setText(familyMembers.getmStatus());

            String[] dob = familyMembers.getDob().split("-");

            holder.age.setText(dob[0] + "y - " + dob[1] + "m - " + dob[2] + "d");
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
            @BindView(R.id.martialStatus)
            TextView martialStatus;
            @BindView(R.id.motherName)
            TextView motherName;

            public viewHolder(View view) {
                super(view);
                ButterKnife.bind(this, view);
            }
        }
    }


}

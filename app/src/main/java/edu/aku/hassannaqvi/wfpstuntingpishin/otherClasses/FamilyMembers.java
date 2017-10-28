package edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses;

/**
 * Created by Ali on 04-Feb-17.
 */

public class FamilyMembers {
    String memberName;
    String mStatus;
    String gender;
    String dob;
    String motherName;

    public String getMotherName() {
        return motherName;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getmStatus() {
        return mStatus;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public FamilyMembers(String memberName, String mStatus, String gender, String dob, String motherName) {
        this.memberName = memberName;
        this.mStatus = mStatus;
        this.gender = gender;
        this.dob = dob;
        this.motherName = motherName;
    }
}

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
    String type;

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

    public String getType() {
        return type;
    }

    public FamilyMembers(String memberName, String mStatus, String gender, String dob, String motherName, String type) {
        this.memberName = memberName;
        this.mStatus = mStatus;
        this.gender = gender;
        this.dob = dob;
        this.motherName = motherName;
        this.type = type;
    }
}

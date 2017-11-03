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
    String serial;

    public FamilyMembers(String memberName, String serial, String gender, String dob, String motherName, String type) {
        this.memberName = memberName;
        this.serial = serial;
        this.gender = gender;
        this.dob = dob;
        this.motherName = motherName;
        this.type = type;
    }

    public FamilyMembers(FamilyMembers fm) {
        this.memberName = fm.memberName;
        this.serial = fm.serial;
        this.gender = fm.gender;
        this.dob = fm.dob;
        this.motherName = fm.motherName;
        this.type = fm.type;
    }

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

    public String getSerial() {
        return serial;
    }
}

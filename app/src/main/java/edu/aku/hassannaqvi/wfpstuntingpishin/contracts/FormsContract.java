package edu.aku.hassannaqvi.wfpstuntingpishin.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    private final String projectName = "WFP Stunting Pishin, Baseline";
    //private final String surveyType = "SN";
    private String _ID = "";
    private String _UID = "";
    private String formDate = ""; // Date
    private String interviewer01 = ""; // Interviewer 01
    private String interviewer02 = ""; // Interviewer 02
    private String istatus = ""; // Interview Status
    private String sA = "";
    private String sC = "";
    private String sD = "";
    private String sE = "";
    private String sF = "";
    private String sG = "";
    private String sH = "";
    private String sI = "";
    private String sJ = "";
    private String sK = "";
    private String sL = "";
    private String sM = "";
    private String sN = "";
    private String sO = "";
    private String sP = "";
    private String sQ = "";
    private String sCount = "";

    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String appVersion = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }


    public FormsContract Sync(JSONObject jsonObject) throws JSONException {

        this._ID = jsonObject.getString(FormsTable.COLUMN__ID);
        this._UID = jsonObject.getString(FormsTable.COLUMN__UID);
        this.interviewer01 = jsonObject.getString(FormsTable.COLUMN_INTERVIEWER01);
        this.interviewer02 = jsonObject.getString(FormsTable.COLUMN_INTERVIEWER02);
        this.formDate = jsonObject.getString(FormsTable.COLUMN_FORMDATE);
        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.sA = jsonObject.getString(FormsTable.COLUMN_SA);
        this.sC = jsonObject.getString(FormsTable.COLUMN_SC);
        this.sD = jsonObject.getString(FormsTable.COLUMN_SD);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);
        this.sF = jsonObject.getString(FormsTable.COLUMN_SF);
        this.sG = jsonObject.getString(FormsTable.COLUMN_SG);
        this.sH = jsonObject.getString(FormsTable.COLUMN_SH);
        this.sI = jsonObject.getString(FormsTable.COLUMN_SI);
        this.sJ = jsonObject.getString(FormsTable.COLUMN_SJ);
        this.sK = jsonObject.getString(FormsTable.COLUMN_SK);
        this.sL = jsonObject.getString(FormsTable.COLUMN_SL);
        this.sM = jsonObject.getString(FormsTable.COLUMN_SM);
        this.sN = jsonObject.getString(FormsTable.COLUMN_SN);
        this.sO = jsonObject.getString(FormsTable.COLUMN_SO);
        this.sP = jsonObject.getString(FormsTable.COLUMN_SP);
        this.sQ = jsonObject.getString(FormsTable.COLUMN_SQ);
        this.sCount = jsonObject.getString(FormsTable.COLUMN_SCOUNT);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsDT = jsonObject.getString(FormsTable.COLUMN_GPSDT);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.devicetagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.appVersion = jsonObject.getString(FormsTable.COLUMN_APPVERSION);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);


        return this;

    }

    public FormsContract Hydrate(Cursor cursor) {

        this._ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN__ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN__UID));
        this.interviewer01 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_INTERVIEWER01));
        this.interviewer02 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_INTERVIEWER02));
        this.formDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMDATE));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.sA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA));
        this.sC = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC));
        this.sD = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SG));
        this.sH = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH));
        this.sI = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SI));
        this.sJ = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SJ));
        this.sK = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SK));
        this.sL = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SL));
        this.sM = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SM));
        this.sN = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SN));
        this.sO = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SO));
        this.sP = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SP));
        this.sQ = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SQ));
        this.sCount = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SCOUNT));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSDT));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appVersion = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));


        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FormsTable.COLUMN__ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(FormsTable.COLUMN__UID, this._UID == null ? JSONObject.NULL : this._UID);
        json.put(FormsTable.COLUMN_INTERVIEWER01, this.interviewer01 == null ? JSONObject.NULL : this.interviewer01);
        json.put(FormsTable.COLUMN_INTERVIEWER02, this.interviewer02 == null ? JSONObject.NULL : this.interviewer02);
        json.put(FormsTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);

        try {
            if (!this.sA.equals("")) {
                json.put(FormsTable.COLUMN_SA, this.sA == null ? JSONObject.NULL : new JSONObject(this.sA));
            }
        } catch (Exception e) {

        }
        try {
            if (!this.sC.equals("")) {
                json.put(FormsTable.COLUMN_SC, this.sC == null ? JSONObject.NULL : new JSONObject(this.sC));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sD.equals("")) {

                json.put(FormsTable.COLUMN_SD, this.sD == null ? JSONObject.NULL : new JSONObject(this.sD));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sE.equals("")) {
                json.put(FormsTable.COLUMN_SE, this.sE == null ? JSONObject.NULL : new JSONObject(this.sE));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sF.equals("")) {
                json.put(FormsTable.COLUMN_SF, this.sF == null ? JSONObject.NULL : new JSONObject(this.sF));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sG.equals("")) {
                json.put(FormsTable.COLUMN_SG, this.sG == null ? JSONObject.NULL : new JSONObject(this.sG));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sH.equals("")) {
                json.put(FormsTable.COLUMN_SH, this.sH == null ? JSONObject.NULL : new JSONObject(this.sH));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sI.equals("")) {
                json.put(FormsTable.COLUMN_SI, this.sI == null ? JSONObject.NULL : new JSONObject(this.sI));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sJ.equals("")) {
                json.put(FormsTable.COLUMN_SJ, this.sJ == null ? JSONObject.NULL : new JSONObject(this.sJ));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sK.equals("")) {
                json.put(FormsTable.COLUMN_SK, this.sK == null ? JSONObject.NULL : new JSONObject(this.sK));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sL.equals("")) {
                json.put(FormsTable.COLUMN_SL, this.sL == null ? JSONObject.NULL : new JSONObject(this.sL));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sM.equals("")) {
                json.put(FormsTable.COLUMN_SM, this.sM == null ? JSONObject.NULL : new JSONObject(this.sM));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sN.equals("")) {
                json.put(FormsTable.COLUMN_SN, this.sN == null ? JSONObject.NULL : new JSONObject(this.sN));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sO.equals("")) {
                json.put(FormsTable.COLUMN_SO, this.sO == null ? JSONObject.NULL : new JSONObject(this.sO));
            }
        } catch (Exception e) {

        }

        try {
            if (!this.sP.equals("")) {
                json.put(FormsTable.COLUMN_SP, this.sP == null ? JSONObject.NULL : new JSONObject(this.sP));
            }
        } catch (Exception e) {

        }


        try {
            if (!this.sQ.equals("")) {
                json.put(FormsTable.COLUMN_SQ, this.sQ == null ? JSONObject.NULL : new JSONObject(this.sQ));
            }
        } catch (Exception e) {

        }


        try {
            if (!this.sCount.equals("")) {
                json.put(FormsTable.COLUMN_SCOUNT, this.sCount == null ? JSONObject.NULL : new JSONObject(this.sCount));
            }
        } catch (Exception e) {

        }


        json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_GPSDT, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
        json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
        json.put(FormsTable.COLUMN_APPVERSION, this.appVersion == null ? JSONObject.NULL : this.appVersion);
        json.put(FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public String getProjectName() {
        return projectName;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getInterviewer01() {
        return interviewer01;
    }

    public void setInterviewer01(String interviewer01) {
        this.interviewer01 = interviewer01;
    }

    public String getInterviewer02() {
        return interviewer02;
    }

    public void setInterviewer02(String interviewer02) {
        this.interviewer02 = interviewer02;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getsA() {
        return sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }


    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }

    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }

    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }

    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }

    public String getsJ() {
        return sJ;
    }

    public void setsJ(String sJ) {
        this.sJ = sJ;
    }

    public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }

    public String getsL() {
        return sL;
    }

    public void setsL(String sL) {
        this.sL = sL;
    }

    public String getsM() {
        return sM;
    }

    public void setsM(String sM) {
        this.sM = sM;
    }

    public String getsN() {
        return sN;
    }

    public void setsN(String sN) {
        this.sN = sN;
    }

    public String getsO() {
        return sO;
    }

    public void setsO(String sO) {
        this.sO = sO;
    }

    public String getsP() {
        return sP;
    }

    public void setsP(String sP) {
        this.sP = sP;
    }

    public String getsQ() {
        return sQ;
    }

    public void setsQ(String sQ) {
        this.sQ = sQ;
    }


    public String getsCount() {
        return sCount;
    }

    public void setsCount(String sCount) {
        this.sCount = sCount;
    }


    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN__UID = "_uid";
        public static final String COLUMN_INTERVIEWER01 = "interviewer01";
        public static final String COLUMN_INTERVIEWER02 = "interviewer02";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SC = "sc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";
        public static final String COLUMN_SH = "sh";
        public static final String COLUMN_SI = "si";
        public static final String COLUMN_SJ = "sj";
        public static final String COLUMN_SK = "sk";
        public static final String COLUMN_SL = "sl";
        public static final String COLUMN_SM = "sm";
        public static final String COLUMN_SN = "sn";
        public static final String COLUMN_SO = "so";
        public static final String COLUMN_SP = "sp";
        public static final String COLUMN_SQ = "sq";
        public static final String COLUMN_SCOUNT = "scount";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSDT = "gpsdt";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

        public static String _URL = "forms.php";
    }
}
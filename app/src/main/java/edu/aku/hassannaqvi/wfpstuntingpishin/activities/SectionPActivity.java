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

public class SectionPActivity extends Activity {

    @BindView(R.id.spblp0101a)
    EditText spblp0101a;
    @BindView(R.id.fldGrpspblp0101b)
    LinearLayout fldGrpspblp0101b;
    @BindView(R.id.spblp0101b)
    RadioGroup spblp0101b;
    @BindView(R.id.spblp0101ba)
    RadioButton spblp0101ba;
    @BindView(R.id.spblp0101bb)
    RadioButton spblp0101bb;
    @BindView(R.id.spblp0101bc)
    RadioButton spblp0101bc;
    @BindView(R.id.spblp0101bd)
    RadioButton spblp0101bd;
    @BindView(R.id.spblp0101be)
    RadioButton spblp0101be;
    @BindView(R.id.spblp0101bf)
    RadioButton spblp0101bf;
    @BindView(R.id.spblp0101bg)
    RadioButton spblp0101bg;
    @BindView(R.id.spblp0101bh)
    RadioButton spblp0101bh;
    @BindView(R.id.spblp0101bi)
    RadioButton spblp0101bi;
    @BindView(R.id.spblp0101bj)
    RadioButton spblp0101bj;
    @BindView(R.id.spblp0102a)
    EditText spblp0102a;
    @BindView(R.id.fldGrpspblp0102b)
    LinearLayout fldGrpspblp0102b;
    @BindView(R.id.spblp0102b)
    RadioGroup spblp0102b;
    @BindView(R.id.spblp0102ba)
    RadioButton spblp0102ba;
    @BindView(R.id.spblp02bb)
    RadioButton spblp02bb;
    @BindView(R.id.spblp02bc)
    RadioButton spblp02bc;
    @BindView(R.id.spblp02bd)
    RadioButton spblp02bd;
    @BindView(R.id.spblp02be)
    RadioButton spblp02be;
    @BindView(R.id.spblp02bf)
    RadioButton spblp02bf;
    @BindView(R.id.spblp02bg)
    RadioButton spblp02bg;
    @BindView(R.id.spblp02bh)
    RadioButton spblp02bh;
    @BindView(R.id.spblp02bi)
    RadioButton spblp02bi;
    @BindView(R.id.spblp02bj)
    RadioButton spblp02bj;
    @BindView(R.id.spblp0103a)
    EditText spblp0103a;
    @BindView(R.id.fldGrpspblp0103b)
    LinearLayout fldGrpspblp0103b;
    @BindView(R.id.spblp0103b)
    RadioGroup spblp0103b;
    @BindView(R.id.spblp0103ba)
    RadioButton spblp0103ba;
    @BindView(R.id.spblp0103bb)
    RadioButton spblp0103bb;
    @BindView(R.id.spblp0103bc)
    RadioButton spblp0103bc;
    @BindView(R.id.spblp0103bd)
    RadioButton spblp0103bd;
    @BindView(R.id.spblp0103be)
    RadioButton spblp0103be;
    @BindView(R.id.spblp0103bf)
    RadioButton spblp0103bf;
    @BindView(R.id.spblp0103bg)
    RadioButton spblp0103bg;
    @BindView(R.id.spblp0103bh)
    RadioButton spblp0103bh;
    @BindView(R.id.spblp0103bi)
    RadioButton spblp0103bi;
    @BindView(R.id.spblp0103bj)
    RadioButton spblp0103bj;
    @BindView(R.id.spblp0104a)
    EditText spblp0104a;
    @BindView(R.id.fldGrpspblp0104)
    LinearLayout fldGrpspblp0104;
    @BindView(R.id.fldGrpspblp0104b)
    LinearLayout fldGrpspblp0104b;
    @BindView(R.id.spblp0104b)
    RadioGroup spblp0104b;
    @BindView(R.id.spblp0104ba)
    RadioButton spblp0104ba;
    @BindView(R.id.spblp0104bb)
    RadioButton spblp0104bb;
    @BindView(R.id.spblp0104bc)
    RadioButton spblp0104bc;
    @BindView(R.id.spblp0104bd)
    RadioButton spblp0104bd;
    @BindView(R.id.spblp0104be)
    RadioButton spblp0104be;
    @BindView(R.id.spblp0104bf)
    RadioButton spblp0104bf;
    @BindView(R.id.spblp0104bg)
    RadioButton spblp0104bg;
    @BindView(R.id.spblp0104bh)
    RadioButton spblp0104bh;
    @BindView(R.id.spblp0104bi)
    RadioButton spblp0104bi;
    @BindView(R.id.spblp0104bj)
    RadioButton spblp0104bj;
    @BindView(R.id.spblp010401a)
    EditText spblp010401a;
    @BindView(R.id.fldGrpspblp010401b)
    LinearLayout fldGrpspblp010401b;
    @BindView(R.id.spblp010401b)
    RadioGroup spblp010401b;
    @BindView(R.id.spblp010401ba)
    RadioButton spblp010401ba;
    @BindView(R.id.spblp010401bb)
    RadioButton spblp010401bb;
    @BindView(R.id.spblp010401bc)
    RadioButton spblp010401bc;
    @BindView(R.id.spblp010401bd)
    RadioButton spblp010401bd;
    @BindView(R.id.spblp010401be)
    RadioButton spblp010401be;
    @BindView(R.id.spblp010401bf)
    RadioButton spblp010401bf;
    @BindView(R.id.spblp010401bg)
    RadioButton spblp010401bg;
    @BindView(R.id.spblp010401bh)
    RadioButton spblp010401bh;
    @BindView(R.id.spblp010401bi)
    RadioButton spblp010401bi;
    @BindView(R.id.spblp010401bj)
    RadioButton spblp010401bj;
    @BindView(R.id.spblp010402a)
    EditText spblp010402a;
    @BindView(R.id.fldGrpspblp010402b)
    LinearLayout fldGrpspblp010402b;
    @BindView(R.id.spblp010402b)
    RadioGroup spblp010402b;
    @BindView(R.id.spblp010402ba)
    RadioButton spblp010402ba;
    @BindView(R.id.spblp010402bb)
    RadioButton spblp010402bb;
    @BindView(R.id.spblp010402bc)
    RadioButton spblp010402bc;
    @BindView(R.id.spblp010402bd)
    RadioButton spblp010402bd;
    @BindView(R.id.spblp010402be)
    RadioButton spblp010402be;
    @BindView(R.id.spblp010402bf)
    RadioButton spblp010402bf;
    @BindView(R.id.spblp010402bg)
    RadioButton spblp010402bg;
    @BindView(R.id.spblp010402bh)
    RadioButton spblp010402bh;
    @BindView(R.id.spblp010402bi)
    RadioButton spblp010402bi;
    @BindView(R.id.spblp010402bj)
    RadioButton spblp010402bj;
    @BindView(R.id.spblp010403a)
    EditText spblp010403a;
    @BindView(R.id.fldGrpspblp010403b)
    LinearLayout fldGrpspblp010403b;
    @BindView(R.id.spblp010403b)
    RadioGroup spblp010403b;
    @BindView(R.id.spblp010403ba)
    RadioButton spblp010403ba;
    @BindView(R.id.spblp010403bb)
    RadioButton spblp010403bb;
    @BindView(R.id.spblp010403bc)
    RadioButton spblp010403bc;
    @BindView(R.id.spblp010403bd)
    RadioButton spblp010403bd;
    @BindView(R.id.spblp010403be)
    RadioButton spblp010403be;
    @BindView(R.id.spblp010403bf)
    RadioButton spblp010403bf;
    @BindView(R.id.spblp010403bg)
    RadioButton spblp010403bg;
    @BindView(R.id.spblp010403bh)
    RadioButton spblp010403bh;
    @BindView(R.id.spblp010403bi)
    RadioButton spblp010403bi;
    @BindView(R.id.spblp010403bj)
    RadioButton spblp010403bj;
    @BindView(R.id.spblp010404a)
    EditText spblp010404a;
    @BindView(R.id.fldGrpspblp010404b)
    LinearLayout fldGrpspblp010404b;
    @BindView(R.id.spblp010404b)
    RadioGroup spblp010404b;
    @BindView(R.id.spblp010404b01)
    RadioButton spblp010404b01;
    @BindView(R.id.spblp010404b02)
    RadioButton spblp010404b02;
    @BindView(R.id.spblp010404b03)
    RadioButton spblp010404b03;
    @BindView(R.id.spblp010404b04)
    RadioButton spblp010404b04;
    @BindView(R.id.spblp010404b05)
    RadioButton spblp010404b05;
    @BindView(R.id.spblp010404b06)
    RadioButton spblp010404b06;
    @BindView(R.id.spblp010404b07)
    RadioButton spblp010404b07;
    @BindView(R.id.spblp010404b08)
    RadioButton spblp010404b08;
    @BindView(R.id.spblp010404b09)
    RadioButton spblp010404b09;
    @BindView(R.id.spblp010404b10)
    RadioButton spblp010404b10;
    @BindView(R.id.spblp0105a)
    EditText spblp0105a;
    @BindView(R.id.fldGrpspblp0105)
    LinearLayout fldGrpspblp0105;
    @BindView(R.id.fldGrpspblp0105b)
    LinearLayout fldGrpspblp0105b;
    @BindView(R.id.spblp0105b)
    RadioGroup spblp0105b;
    @BindView(R.id.spblp0105ba)
    RadioButton spblp0105ba;
    @BindView(R.id.spblp0105bb)
    RadioButton spblp0105bb;
    @BindView(R.id.spblp0105bc)
    RadioButton spblp0105bc;
    @BindView(R.id.spblp0105bd)
    RadioButton spblp0105bd;
    @BindView(R.id.spblp0105be)
    RadioButton spblp0105be;
    @BindView(R.id.spblp0105bf)
    RadioButton spblp0105bf;
    @BindView(R.id.spblp0105bg)
    RadioButton spblp0105bg;
    @BindView(R.id.spblp0105bh)
    RadioButton spblp0105bh;
    @BindView(R.id.spblp0105bi)
    RadioButton spblp0105bi;
    @BindView(R.id.spblp0105bj)
    RadioButton spblp0105bj;
    @BindView(R.id.spblp010501a)
    EditText spblp010501a;
    @BindView(R.id.fldGrpspblp010501b)
    LinearLayout fldGrpspblp010501b;
    @BindView(R.id.spblp010501b)
    RadioGroup spblp010501b;
    @BindView(R.id.spblp010501ba)
    RadioButton spblp010501ba;
    @BindView(R.id.spblp010501bb)
    RadioButton spblp010501bb;
    @BindView(R.id.spblp010501bc)
    RadioButton spblp010501bc;
    @BindView(R.id.spblp010501bd)
    RadioButton spblp010501bd;
    @BindView(R.id.spblp010501be)
    RadioButton spblp010501be;
    @BindView(R.id.spblp010501bf)
    RadioButton spblp010501bf;
    @BindView(R.id.spblp010501bg)
    RadioButton spblp010501bg;
    @BindView(R.id.spblp010501bh)
    RadioButton spblp010501bh;
    @BindView(R.id.spblp010501bi)
    RadioButton spblp010501bi;
    @BindView(R.id.spblp010501bj)
    RadioButton spblp010501bj;
    @BindView(R.id.spblp010502a)
    EditText spblp010502a;
    @BindView(R.id.fldGrpspblp010502b)
    LinearLayout fldGrpspblp010502b;
    @BindView(R.id.spblp010502b)
    RadioGroup spblp010502b;
    @BindView(R.id.spblp010502ba)
    RadioButton spblp010502ba;
    @BindView(R.id.spblp010502bb)
    RadioButton spblp010502bb;
    @BindView(R.id.spblp010502bc)
    RadioButton spblp010502bc;
    @BindView(R.id.spblp010502bd)
    RadioButton spblp010502bd;
    @BindView(R.id.spblp010502be)
    RadioButton spblp010502be;
    @BindView(R.id.spblp010502bf)
    RadioButton spblp010502bf;
    @BindView(R.id.spblp010502bg)
    RadioButton spblp010502bg;
    @BindView(R.id.spblp010502bh)
    RadioButton spblp010502bh;
    @BindView(R.id.spblp010502bi)
    RadioButton spblp010502bi;
    @BindView(R.id.spblp010502bj)
    RadioButton spblp010502bj;
    @BindView(R.id.spblp0106a)
    EditText spblp0106a;
    @BindView(R.id.fldGrpspblp0106)
    LinearLayout fldGrpspblp0106;
    @BindView(R.id.fldGrpspblp0106b)
    LinearLayout fldGrpspblp0106b;
    @BindView(R.id.spblp0106b)
    RadioGroup spblp0106b;
    @BindView(R.id.spblp0106ba)
    RadioButton spblp0106ba;
    @BindView(R.id.spblp0106bb)
    RadioButton spblp0106bb;
    @BindView(R.id.spblp0106bc)
    RadioButton spblp0106bc;
    @BindView(R.id.spblp0106bd)
    RadioButton spblp0106bd;
    @BindView(R.id.spblp0106be)
    RadioButton spblp0106be;
    @BindView(R.id.spblp0106bf)
    RadioButton spblp0106bf;
    @BindView(R.id.spblp0106bg)
    RadioButton spblp0106bg;
    @BindView(R.id.spblp0106bh)
    RadioButton spblp0106bh;
    @BindView(R.id.spblp0106bi)
    RadioButton spblp0106bi;
    @BindView(R.id.spblp0106bj)
    RadioButton spblp0106bj;
    @BindView(R.id.spblp010601a)
    EditText spblp010601a;
    @BindView(R.id.fldGrpspblp010601b)
    LinearLayout fldGrpspblp010601b;
    @BindView(R.id.spblp010601b)
    RadioGroup spblp010601b;
    @BindView(R.id.spblp010601ba)
    RadioButton spblp010601ba;
    @BindView(R.id.spblp010601bb)
    RadioButton spblp010601bb;
    @BindView(R.id.spblp010601bc)
    RadioButton spblp010601bc;
    @BindView(R.id.spblp010601bd)
    RadioButton spblp010601bd;
    @BindView(R.id.spblp010601be)
    RadioButton spblp010601be;
    @BindView(R.id.spblp010601bf)
    RadioButton spblp010601bf;
    @BindView(R.id.spblp010601bg)
    RadioButton spblp010601bg;
    @BindView(R.id.spblp010601bh)
    RadioButton spblp010601bh;
    @BindView(R.id.spblp010601bi)
    RadioButton spblp010601bi;
    @BindView(R.id.spblp010601bj)
    RadioButton spblp010601bj;
    @BindView(R.id.spblp0107a)
    EditText spblp0107a;
    @BindView(R.id.fldGrpspblp0107b)
    LinearLayout fldGrpspblp0107b;
    @BindView(R.id.spblp0107b)
    RadioGroup spblp0107b;
    @BindView(R.id.spblp0107ba)
    RadioButton spblp0107ba;
    @BindView(R.id.spblp0107bb)
    RadioButton spblp0107bb;
    @BindView(R.id.spblp0107bc)
    RadioButton spblp0107bc;
    @BindView(R.id.spblp0107bd)
    RadioButton spblp0107bd;
    @BindView(R.id.spblp0107be)
    RadioButton spblp0107be;
    @BindView(R.id.spblp0107bf)
    RadioButton spblp0107bf;
    @BindView(R.id.spblp0107bg)
    RadioButton spblp0107bg;
    @BindView(R.id.spblp0107bh)
    RadioButton spblp0107bh;
    @BindView(R.id.spblp0107bi)
    RadioButton spblp0107bi;
    @BindView(R.id.spblp0107bj)
    RadioButton spblp0107bj;
    @BindView(R.id.spblp0108a)
    EditText spblp0108a;
    @BindView(R.id.fldGrpspblp0108b)
    LinearLayout fldGrpspblp0108b;
    @BindView(R.id.spblp0108b)
    RadioGroup spblp0108b;
    @BindView(R.id.spblp0108ba)
    RadioButton spblp0108ba;
    @BindView(R.id.spblp0108bb)
    RadioButton spblp0108bb;
    @BindView(R.id.spblp0108bc)
    RadioButton spblp0108bc;
    @BindView(R.id.spblp0108bd)
    RadioButton spblp0108bd;
    @BindView(R.id.spblp0108be)
    RadioButton spblp0108be;
    @BindView(R.id.spblp0108bf)
    RadioButton spblp0108bf;
    @BindView(R.id.spblp0108bg)
    RadioButton spblp0108bg;
    @BindView(R.id.spblp0108bh)
    RadioButton spblp0108bh;
    @BindView(R.id.spblp0108bi)
    RadioButton spblp0108bi;
    @BindView(R.id.spblp0108bj)
    RadioButton spblp0108bj;
    @BindView(R.id.spblp0109a)
    EditText spblp0109a;
    @BindView(R.id.fldGrpspblp0109b)
    LinearLayout fldGrpspblp0109b;
    @BindView(R.id.spblp0109b)
    RadioGroup spblp0109b;
    @BindView(R.id.spblp0109ba)
    RadioButton spblp0109ba;
    @BindView(R.id.spblp0109bb)
    RadioButton spblp0109bb;
    @BindView(R.id.spblp0109bc)
    RadioButton spblp0109bc;
    @BindView(R.id.spblp0109bd)
    RadioButton spblp0109bd;
    @BindView(R.id.spblp0109be)
    RadioButton spblp0109be;
    @BindView(R.id.spblp0109bf)
    RadioButton spblp0109bf;
    @BindView(R.id.spblp0109bg)
    RadioButton spblp0109bg;
    @BindView(R.id.spblp0109bh)
    RadioButton spblp0109bh;
    @BindView(R.id.spblp0109bi)
    RadioButton spblp0109bi;
    @BindView(R.id.spblp0109bj)
    RadioButton spblp0109bj;
    @BindView(R.id.spblp0201)
    RadioGroup spblp0201;
    @BindView(R.id.spblp0201a)
    RadioButton spblp0201a;
    @BindView(R.id.spblp0201b)
    RadioButton spblp0201b;
    @BindView(R.id.spblp0201c)
    RadioButton spblp0201c;
    @BindView(R.id.spblp0201d)
    RadioButton spblp0201d;
    @BindView(R.id.spblp0201e)
    RadioButton spblp0201e;
    @BindView(R.id.spblp0201f)
    RadioButton spblp0201f;
    @BindView(R.id.spblp0201g)
    RadioButton spblp0201g;
    @BindView(R.id.spblp0202)
    RadioGroup spblp0202;
    @BindView(R.id.spblp0202a)
    RadioButton spblp0202a;
    @BindView(R.id.spblp0202b)
    RadioButton spblp0202b;
    @BindView(R.id.spblp0202c)
    RadioButton spblp0202c;
    @BindView(R.id.spblp0202d)
    RadioButton spblp0202d;
    @BindView(R.id.spblp0202e)
    RadioButton spblp0202e;
    @BindView(R.id.spblp0202f)
    RadioButton spblp0202f;
    @BindView(R.id.spblp0202g)
    RadioButton spblp0202g;
    @BindView(R.id.spblp0203)
    RadioGroup spblp0203;
    @BindView(R.id.spblp0203a)
    RadioButton spblp0203a;
    @BindView(R.id.spblp0203b)
    RadioButton spblp0203b;
    @BindView(R.id.spblp0203c)
    RadioButton spblp0203c;
    @BindView(R.id.spblp0203d)
    RadioButton spblp0203d;
    @BindView(R.id.spblp0203e)
    RadioButton spblp0203e;
    @BindView(R.id.spblp0203f)
    RadioButton spblp0203f;
    @BindView(R.id.spblp0203g)
    RadioButton spblp0203g;
    @BindView(R.id.spblp0204)
    RadioGroup spblp0204;
    @BindView(R.id.spblp0204a)
    RadioButton spblp0204a;
    @BindView(R.id.spblp0204b)
    RadioButton spblp0204b;
    @BindView(R.id.spblp0204c)
    RadioButton spblp0204c;
    @BindView(R.id.spblp0204d)
    RadioButton spblp0204d;
    @BindView(R.id.spblp0204e)
    RadioButton spblp0204e;
    @BindView(R.id.spblp0204f)
    RadioButton spblp0204f;
    @BindView(R.id.spblp0204g)
    RadioButton spblp0204g;
    @BindView(R.id.spblp0205)
    RadioGroup spblp0205;
    @BindView(R.id.spblp0205a)
    RadioButton spblp0205a;
    @BindView(R.id.spblp0205b)
    RadioButton spblp0205b;
    @BindView(R.id.spblp0205c)
    RadioButton spblp0205c;
    @BindView(R.id.spblp0205d)
    RadioButton spblp0205d;
    @BindView(R.id.spblp0205e)
    RadioButton spblp0205e;
    @BindView(R.id.spblp0205f)
    RadioButton spblp0205f;
    @BindView(R.id.spblp0205g)
    RadioButton spblp0205g;
    @BindView(R.id.spblp0301)
    RadioGroup spblp0301;
    @BindView(R.id.spblp0301a)
    RadioButton spblp0301a;
    @BindView(R.id.spblp0301b)
    RadioButton spblp0301b;
    @BindView(R.id.spblp0301c)
    RadioButton spblp0301c;
    @BindView(R.id.spblp0301d)
    RadioButton spblp0301d;
    @BindView(R.id.spblp0302)
    RadioGroup spblp0302;
    @BindView(R.id.spblp0302a)
    RadioButton spblp0302a;
    @BindView(R.id.spblp0302b)
    RadioButton spblp0302b;
    @BindView(R.id.spblp0302c)
    RadioButton spblp0302c;
    @BindView(R.id.spblp0302d)
    RadioButton spblp0302d;
    @BindView(R.id.spblp0303)
    RadioGroup spblp0303;
    @BindView(R.id.spblp0303a)
    RadioButton spblp0303a;
    @BindView(R.id.spblp0303b)
    RadioButton spblp0303b;
    @BindView(R.id.spblp0303c)
    RadioButton spblp0303c;
    @BindView(R.id.spblp0303d)
    RadioButton spblp0303d;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_p);
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


        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

     /*   int updcount = db.updateSP();

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

        JSONObject sp = new JSONObject();


        //   MainApp.fc.setsP(String.valueOf(sp));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        //=================== spblp01a ==============

        return true;

    }

}



package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
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

    private static final String TAG = SectionPActivity.class.getSimpleName();

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
    @BindView(R.id.spblp0102bb)
    RadioButton spblp0102bb;
    @BindView(R.id.spblp0102bc)
    RadioButton spblp0102bc;
    @BindView(R.id.spblp0102bd)
    RadioButton spblp0102bd;
    @BindView(R.id.spblp0102be)
    RadioButton spblp0102be;
    @BindView(R.id.spblp0102bf)
    RadioButton spblp0102bf;
    @BindView(R.id.spblp0102bg)
    RadioButton spblp0102bg;
    @BindView(R.id.spblp0102bh)
    RadioButton spblp0102bh;
    @BindView(R.id.spblp0102bi)
    RadioButton spblp0102bi;
    @BindView(R.id.spblp0102bj)
    RadioButton spblp0102bj;
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
    @BindView(R.id.spblp010404ba)
    RadioButton spblp010404ba;
    @BindView(R.id.spblp010404bb)
    RadioButton spblp010404bb;
    @BindView(R.id.spblp010404bc)
    RadioButton spblp010404bc;
    @BindView(R.id.spblp010404bd)
    RadioButton spblp010404bd;
    @BindView(R.id.spblp010404be)
    RadioButton spblp010404be;
    @BindView(R.id.spblp010404bf)
    RadioButton spblp010404bf;
    @BindView(R.id.spblp010404bg)
    RadioButton spblp010404bg;
    @BindView(R.id.spblp010404bh)
    RadioButton spblp010404bh;
    @BindView(R.id.spblp010404bi)
    RadioButton spblp010404bi;
    @BindView(R.id.spblp010404bj)
    RadioButton spblp010404bj;
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

        //=============== Q 1B Skip Pattern==============
        spblp0101a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0101a.getText().toString().isEmpty() ? "0" : spblp0101a.getText().toString()) > 0) {
                    fldGrpspblp0101b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0101b.setVisibility(View.GONE);
                    spblp0101b.clearCheck();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 2B Skip Pattern==============
        spblp0102a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0102a.getText().toString().isEmpty() ? "0" : spblp0102a.getText().toString()) > 0) {
                    fldGrpspblp0102b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0102b.setVisibility(View.GONE);
                    spblp0102b.clearCheck();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 3B Skip Pattern==============
        spblp0103a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0103a.getText().toString().isEmpty() ? "0" : spblp0103a.getText().toString()) > 0) {
                    fldGrpspblp0103b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0103b.setVisibility(View.GONE);
                    spblp0103b.clearCheck();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4B Skip Pattern==============
        spblp0104a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0104a.getText().toString().isEmpty() ? "0" : spblp0104a.getText().toString()) > 0) {
                    fldGrpspblp0104b.setVisibility(View.VISIBLE);
                    fldGrpspblp0104.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0104.setVisibility(View.GONE);
                    fldGrpspblp0104b.setVisibility(View.GONE);
                    spblp0104b.clearCheck();
                    spblp010401a.setText(null);
                    spblp010401b.clearCheck();
                    spblp010402a.setText(null);
                    spblp010402b.clearCheck();
                    spblp010403a.setText(null);
                    spblp010403b.clearCheck();
                    spblp010404a.setText(null);
                    spblp010404b.clearCheck();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.1 B Skip Pattern==============
        spblp010401a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp010401a.getText().toString().isEmpty() ? "0" : spblp010401a.getText().toString()) > 0) {
                    fldGrpspblp010401b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp010401b.setVisibility(View.GONE);
                    spblp010401b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.2 B Skip Pattern==============
        spblp010402a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp010402a.getText().toString().isEmpty() ? "0" : spblp010402a.getText().toString()) > 0) {
                    fldGrpspblp010402b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp010402b.setVisibility(View.GONE);
                    spblp010402b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.3 B Skip Pattern==============
        spblp010403a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp010403a.getText().toString().isEmpty() ? "0" : spblp010403a.getText().toString()) > 0) {
                    fldGrpspblp010403b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp010403b.setVisibility(View.GONE);
                    spblp010403b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.4 B Skip Pattern==============
        spblp010404a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp010404a.getText().toString().isEmpty() ? "0" : spblp010404a.getText().toString()) > 0) {
                    fldGrpspblp010404b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp010404b.setVisibility(View.GONE);
                    spblp010404b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5B Skip Pattern==============
        spblp0105a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0105a.getText().toString().isEmpty() ? "0" : spblp0105a.getText().toString()) > 0) {
                    fldGrpspblp0105b.setVisibility(View.VISIBLE);
                    fldGrpspblp0105.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0105b.setVisibility(View.GONE);
                    fldGrpspblp0105.setVisibility(View.GONE);
                    spblp0105b.clearCheck();
                    spblp010501a.setText(null);
                    spblp010501b.clearCheck();
                    spblp010502a.setText(null);
                    spblp010502b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.1 B Skip Pattern==============
        spblp010501a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp010501a.getText().toString().isEmpty() ? "0" : spblp010501a.getText().toString()) > 0) {
                    spblp010501b.setVisibility(View.VISIBLE);
                } else {
                    spblp010501b.setVisibility(View.GONE);
                    spblp010501b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.2 B Skip Pattern==============
        spblp010502a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp010502a.getText().toString().isEmpty() ? "0" : spblp010502a.getText().toString()) > 0) {
                    spblp010502b.setVisibility(View.VISIBLE);
                } else {
                    spblp010502b.setVisibility(View.GONE);
                    spblp010502b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 6B Skip Pattern==============
        spblp0106a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0106a.getText().toString().isEmpty() ? "0" : spblp0106a.getText().toString()) > 0) {
                    fldGrpspblp0106b.setVisibility(View.VISIBLE);
                    fldGrpspblp0106.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0106b.setVisibility(View.GONE);
                    fldGrpspblp0106.setVisibility(View.GONE);
                    spblp0106b.clearCheck();
                    spblp010601a.setText(null);
                    spblp010601b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 6.1 B Skip Pattern==============
        spblp010601a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp010601a.getText().toString().isEmpty() ? "0" : spblp010601a.getText().toString()) > 0) {
                    fldGrpspblp010601b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp010601b.setVisibility(View.GONE);
                    spblp010601b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 7B Skip Pattern==============
        spblp0107a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0107a.getText().toString().isEmpty() ? "0" : spblp0107a.getText().toString()) > 0) {
                    fldGrpspblp0107b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0107b.setVisibility(View.GONE);
                    spblp0107b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 8B Skip Pattern==============
        spblp0108a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0108a.getText().toString().isEmpty() ? "0" : spblp0108a.getText().toString()) > 0) {
                    fldGrpspblp0108b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0108b.setVisibility(View.GONE);
                    spblp0108b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 9B Skip Pattern==============
        spblp0109a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(spblp0109a.getText().toString().isEmpty() ? "0" : spblp0109a.getText().toString()) > 0) {
                    fldGrpspblp0109b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpspblp0109b.setVisibility(View.GONE);
                    spblp0109b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {


        Intent secNext = new Intent(this, SectionQActivity.class);
        secNext.putExtra("check", false);
        startActivity(secNext);

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

        sp.put("spblp0101a", spblp0101a.getText().toString());
        sp.put("spblp0101b", spblp0101ba.isChecked() ? "1" : spblp0101bb.isChecked() ? "2" : spblp0101bc.isChecked() ? "3"
                : spblp0101bd.isChecked() ? "4" : spblp0101be.isChecked() ? "5" : spblp0101bf.isChecked() ? "6" : spblp0101bg.isChecked() ? "7"
                : spblp0101bh.isChecked() ? "8" : spblp0101bi.isChecked() ? "9" : spblp0101bj.isChecked() ? "10" : "0");

        sp.put("spblp0102a", spblp0102a.getText().toString());
        sp.put("spblp0102b", spblp0102ba.isChecked() ? "1" : spblp0102bb.isChecked() ? "2" : spblp0102bc.isChecked() ? "3"
                : spblp0102bd.isChecked() ? "4" : spblp0102be.isChecked() ? "5" : spblp0102bf.isChecked() ? "6" : spblp0102bg.isChecked() ? "7"
                : spblp0102bh.isChecked() ? "8" : spblp0102bi.isChecked() ? "9" : spblp0102bj.isChecked() ? "10" : "0");

        sp.put("spblp0103a", spblp0103a.getText().toString());
        sp.put("spblp0103b", spblp0103ba.isChecked() ? "1" : spblp0103bb.isChecked() ? "2" : spblp0103bc.isChecked() ? "3"
                : spblp0103bd.isChecked() ? "4" : spblp0103be.isChecked() ? "5" : spblp0103bf.isChecked() ? "6" : spblp0103bg.isChecked() ? "7"
                : spblp0103bh.isChecked() ? "8" : spblp0103bi.isChecked() ? "9" : spblp0103bj.isChecked() ? "10" : "0");

        sp.put("spblp0104a", spblp0104a.getText().toString());
        sp.put("spblp0104b", spblp0104ba.isChecked() ? "1" : spblp0104bb.isChecked() ? "2" : spblp0104bc.isChecked() ? "3"
                : spblp0104bd.isChecked() ? "4" : spblp0104be.isChecked() ? "5" : spblp0104bf.isChecked() ? "6" : spblp0104bg.isChecked() ? "7"
                : spblp0104bh.isChecked() ? "8" : spblp0104bi.isChecked() ? "9" : spblp0104bj.isChecked() ? "10" : "0");

        sp.put("spblp010401a", spblp010401a.getText().toString());
        sp.put("spblp010401b", spblp010401ba.isChecked() ? "1" : spblp010401bb.isChecked() ? "2" : spblp010401bc.isChecked() ? "3"
                : spblp010401bd.isChecked() ? "4" : spblp010401be.isChecked() ? "5" : spblp010401bf.isChecked() ? "6" : spblp010401bg.isChecked() ? "7"
                : spblp010401bh.isChecked() ? "8" : spblp010401bi.isChecked() ? "9" : spblp010401bj.isChecked() ? "10" : "0");

        sp.put("spblp010402a", spblp010402a.getText().toString());
        sp.put("spblp010402b", spblp010402ba.isChecked() ? "1" : spblp010402bb.isChecked() ? "2" : spblp010402bc.isChecked() ? "3"
                : spblp010402bd.isChecked() ? "4" : spblp010402be.isChecked() ? "5" : spblp010402bf.isChecked() ? "6" : spblp010402bg.isChecked() ? "7"
                : spblp010402bh.isChecked() ? "8" : spblp010402bi.isChecked() ? "9" : spblp010402bj.isChecked() ? "10" : "0");

        sp.put("spblp010403a", spblp010403a.getText().toString());
        sp.put("spblp010403b", spblp010403ba.isChecked() ? "1" : spblp010403bb.isChecked() ? "2" : spblp010403bc.isChecked() ? "3"
                : spblp010403bd.isChecked() ? "4" : spblp010403be.isChecked() ? "5" : spblp010403bf.isChecked() ? "6" : spblp010403bg.isChecked() ? "7"
                : spblp010403bh.isChecked() ? "8" : spblp010403bi.isChecked() ? "9" : spblp010403bj.isChecked() ? "10" : "0");

        sp.put("spblp010404a", spblp010404a.getText().toString());
        sp.put("spblp010404b", spblp010404ba.isChecked() ? "1" : spblp010404bb.isChecked() ? "2" : spblp010404bc.isChecked() ? "3"
                : spblp010404bd.isChecked() ? "4" : spblp010404be.isChecked() ? "5" : spblp010404bf.isChecked() ? "6" : spblp010404bg.isChecked() ? "7"
                : spblp010404bh.isChecked() ? "8" : spblp010404bi.isChecked() ? "9" : spblp010404bj.isChecked() ? "10" : "0");

        sp.put("spblp0105a", spblp0105a.getText().toString());
        sp.put("spblp0105b", spblp0105ba.isChecked() ? "1" : spblp0105bb.isChecked() ? "2" : spblp0105bc.isChecked() ? "3"
                : spblp0105bd.isChecked() ? "4" : spblp0105be.isChecked() ? "5" : spblp0105bf.isChecked() ? "6" : spblp0105bg.isChecked() ? "7"
                : spblp0105bh.isChecked() ? "8" : spblp0105bi.isChecked() ? "9" : spblp0105bj.isChecked() ? "10" : "0");

        sp.put("spblp010501a", spblp010501a.getText().toString());
        sp.put("spblp010501b", spblp010501ba.isChecked() ? "1" : spblp010501bb.isChecked() ? "2" : spblp010501bc.isChecked() ? "3"
                : spblp010501bd.isChecked() ? "4" : spblp010501be.isChecked() ? "5" : spblp010501bf.isChecked() ? "6" : spblp010501bg.isChecked() ? "7"
                : spblp010501bh.isChecked() ? "8" : spblp010501bi.isChecked() ? "9" : spblp010501bj.isChecked() ? "10" : "0");

        sp.put("spblp010502a", spblp010502a.getText().toString());
        sp.put("spblp010502b", spblp010502ba.isChecked() ? "1" : spblp010502bb.isChecked() ? "2" : spblp010502bc.isChecked() ? "3"
                : spblp010502bd.isChecked() ? "4" : spblp010502be.isChecked() ? "5" : spblp010502bf.isChecked() ? "6" : spblp010502bg.isChecked() ? "7"
                : spblp010502bh.isChecked() ? "8" : spblp010502bi.isChecked() ? "9" : spblp010502bj.isChecked() ? "10" : "0");

        sp.put("spblp0106a", spblp0106a.getText().toString());
        sp.put("spblp0106b", spblp0106ba.isChecked() ? "1" : spblp0106bb.isChecked() ? "2" : spblp0106bc.isChecked() ? "3"
                : spblp0106bd.isChecked() ? "4" : spblp0106be.isChecked() ? "5" : spblp0106bf.isChecked() ? "6" : spblp0106bg.isChecked() ? "7"
                : spblp0106bh.isChecked() ? "8" : spblp0106bi.isChecked() ? "9" : spblp0106bj.isChecked() ? "10" : "0");

        sp.put("spblp010601a", spblp010601a.getText().toString());
        sp.put("spblp010601b", spblp010601ba.isChecked() ? "1" : spblp010601bb.isChecked() ? "2" : spblp010601bc.isChecked() ? "3"
                : spblp010601bd.isChecked() ? "4" : spblp010601be.isChecked() ? "5" : spblp010601bf.isChecked() ? "6" : spblp010601bg.isChecked() ? "7"
                : spblp010601bh.isChecked() ? "8" : spblp010601bi.isChecked() ? "9" : spblp010601bj.isChecked() ? "10" : "0");


        sp.put("spblp0107a", spblp0107a.getText().toString());
        sp.put("spblp0107b", spblp0107ba.isChecked() ? "1" : spblp0107bb.isChecked() ? "2" : spblp0107bc.isChecked() ? "3"
                : spblp0107bd.isChecked() ? "4" : spblp0107be.isChecked() ? "5" : spblp0107bf.isChecked() ? "6" : spblp0107bg.isChecked() ? "7"
                : spblp0107bh.isChecked() ? "8" : spblp0107bi.isChecked() ? "9" : spblp0107bj.isChecked() ? "10" : "0");

        sp.put("spblp0108a", spblp0108a.getText().toString());
        sp.put("spblp0108b", spblp0108ba.isChecked() ? "1" : spblp0108bb.isChecked() ? "2" : spblp0108bc.isChecked() ? "3"
                : spblp0108bd.isChecked() ? "4" : spblp0108be.isChecked() ? "5" : spblp0108bf.isChecked() ? "6" : spblp0108bg.isChecked() ? "7"
                : spblp0108bh.isChecked() ? "8" : spblp0108bi.isChecked() ? "9" : spblp0108bj.isChecked() ? "10" : "0");

        sp.put("spblp0109a", spblp0109a.getText().toString());
        sp.put("spblp0109b", spblp0109ba.isChecked() ? "1" : spblp0109bb.isChecked() ? "2" : spblp0109bc.isChecked() ? "3"
                : spblp0109bd.isChecked() ? "4" : spblp0109be.isChecked() ? "5" : spblp0109bf.isChecked() ? "6" : spblp0109bg.isChecked() ? "7"
                : spblp0109bh.isChecked() ? "8" : spblp0109bi.isChecked() ? "9" : spblp0109bj.isChecked() ? "10" : "0");

        sp.put("spblp0201", spblp0201a.isChecked() ? "1" : spblp0201b.isChecked() ? "2" : spblp0201c.isChecked() ? "3"
                : spblp0201d.isChecked() ? "4" : spblp0201e.isChecked() ? "5" : spblp0201f.isChecked() ? "6"
                : spblp0201g.isChecked() ? "7" : "0");

        sp.put("spblp0202", spblp0202a.isChecked() ? "1" : spblp0202b.isChecked() ? "2" : spblp0202c.isChecked() ? "3"
                : spblp0202d.isChecked() ? "4" : spblp0202e.isChecked() ? "5" : spblp0202f.isChecked() ? "6"
                : spblp0202g.isChecked() ? "7" : "0");

        sp.put("spblp0203", spblp0203a.isChecked() ? "1" : spblp0203b.isChecked() ? "2" : spblp0203c.isChecked() ? "3"
                : spblp0203d.isChecked() ? "4" : spblp0203e.isChecked() ? "5" : spblp0203f.isChecked() ? "6"
                : spblp0203g.isChecked() ? "7" : "0");

        sp.put("spblp0204", spblp0204a.isChecked() ? "1" : spblp0204b.isChecked() ? "2" : spblp0204c.isChecked() ? "3"
                : spblp0204d.isChecked() ? "4" : spblp0204e.isChecked() ? "5" : spblp0204f.isChecked() ? "6"
                : spblp0204g.isChecked() ? "7" : "0");

        sp.put("spblp0205", spblp0205a.isChecked() ? "1" : spblp0205b.isChecked() ? "2" : spblp0205c.isChecked() ? "3"
                : spblp0205d.isChecked() ? "4" : spblp0205e.isChecked() ? "5" : spblp0205f.isChecked() ? "6"
                : spblp0205g.isChecked() ? "7" : "0");

        sp.put("spblp0301", spblp0301a.isChecked() ? "1" : spblp0301b.isChecked() ? "2" : spblp0301c.isChecked() ? "3"
                : spblp0301d.isChecked() ? "4" : "0");

        sp.put("spblp0302", spblp0302a.isChecked() ? "1" : spblp0302b.isChecked() ? "2" : spblp0302c.isChecked() ? "3"
                : spblp0302d.isChecked() ? "4" : "0");

        sp.put("spblp0303", spblp0303a.isChecked() ? "1" : spblp0303b.isChecked() ? "2" : spblp0303c.isChecked() ? "3"
                : spblp0303d.isChecked() ? "4" : "0");




        //   MainApp.fc.setsP(String.valueOf(sp));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {


        //======================= Q 0101 ===============
        if (spblp0101a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0101), Toast.LENGTH_SHORT).show();
            spblp0101a.setError("This data is Required!");
            spblp0101a.requestFocus();
            Log.i(TAG, "spblp0101a: This data is Required!");
            return false;
        } else {
            spblp0101a.setError(null);
        }

        if (Integer.valueOf(spblp0101a.getText().toString()) < 0 || Integer.valueOf(spblp0101a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0101), Toast.LENGTH_SHORT).show();
            spblp0101a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0101a: This data is Required!");
            return false;
        } else {
            spblp0101a.setError(null);
        }

        if (Integer.valueOf(spblp0101a.getText().toString()) > 0) {
            if (spblp0101b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0101) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0101bj.setError("This data is Required!");
                spblp0101bj.setFocusableInTouchMode(true);
                spblp0101bj.setFocusable(true);
                spblp0101bj.requestFocus();
                Log.i(TAG, "spblp0102b: This data is Required!");
                return false;
            } else {
                spblp0101bj.setError(null);
            }
        }

        //======================= Q 0102 ===============
        if (spblp0102a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0102), Toast.LENGTH_SHORT).show();
            spblp0102a.setError("This data is Required!");
            spblp0102a.requestFocus();
            Log.i(TAG, "spblp0102a: This data is Required!");
            return false;
        } else {
            spblp0102a.setError(null);
        }

        if (Integer.valueOf(spblp0102a.getText().toString()) < 0 || Integer.valueOf(spblp0102a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0102), Toast.LENGTH_SHORT).show();
            spblp0102a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0102a: This data is Required!");
            return false;
        } else {
            spblp0102a.setError(null);
        }

        if (Integer.valueOf(spblp0102a.getText().toString()) > 0) {
            if (spblp0102b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0102) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0102bj.setError("This data is Required!");
                spblp0102bj.setFocusableInTouchMode(true);
                spblp0102bj.setFocusable(true);
                spblp0102bj.requestFocus();
                Log.i(TAG, "spblp0102b: This data is Required!");
                return false;
            } else {
                spblp0102bj.setError(null);
            }
        }

        //======================= Q 0103 ===============
        if (spblp0103a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0103), Toast.LENGTH_SHORT).show();
            spblp0103a.setError("This data is Required!");
            spblp0103a.requestFocus();
            Log.i(TAG, "spblp0103a: This data is Required!");
            return false;
        } else {
            spblp0103a.setError(null);
        }

        if (Integer.valueOf(spblp0103a.getText().toString()) < 0 || Integer.valueOf(spblp0103a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0103), Toast.LENGTH_SHORT).show();
            spblp0103a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0103a: This data is Required!");
            return false;
        } else {
            spblp0103a.setError(null);
        }

        if (Integer.valueOf(spblp0103a.getText().toString()) > 0) {
            if (spblp0103b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0103) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0103bj.setError("This data is Required!");
                spblp0103bj.setFocusableInTouchMode(true);
                spblp0103bj.setFocusable(true);
                spblp0103bj.requestFocus();
                Log.i(TAG, "spblp0103b: This data is Required!");
                return false;
            } else {
                spblp0103bj.setError(null);
            }
        }
        //======================= Q 0104 ===============
        if (spblp0104a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0104), Toast.LENGTH_SHORT).show();
            spblp0104a.setError("This data is Required!");
            spblp0104a.requestFocus();
            Log.i(TAG, "spblp0104a: This data is Required!");
            return false;
        } else {
            spblp0104a.setError(null);
        }

        if (Integer.valueOf(spblp0104a.getText().toString()) < 0 || Integer.valueOf(spblp0104a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0104), Toast.LENGTH_SHORT).show();
            spblp0104a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0104a: This data is Required!");
            return false;
        } else {
            spblp0104a.setError(null);
        }

        if (Integer.valueOf(spblp0104a.getText().toString()) > 0) {
            if (spblp0104b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0104) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0104bj.setError("This data is Required!");
                spblp0104bj.setFocusableInTouchMode(true);
                spblp0104bj.setFocusable(true);
                spblp0104bj.requestFocus();
                Log.i(TAG, "spblp0104b: This data is Required!");
                return false;
            } else {
                spblp0104bj.setError(null);
            }


            //======================= Q 4.1 ===============
            if (spblp010401a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010401) + getString(R.string.spblp01sub2), Toast.LENGTH_SHORT).show();
                spblp010401a.setError("This data is Required!");
                spblp010401a.requestFocus();
                Log.i(TAG, "spblp010401a: This data is Required!");
                return false;
            } else {
                spblp010401a.setError(null);
            }

            if (Integer.valueOf(spblp010401a.getText().toString()) < 0 || Integer.valueOf(spblp010401a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp010401), Toast.LENGTH_SHORT).show();
                spblp010401a.setError("Range is 0 - 7 days");
                Log.i(TAG, "spblp010401a: This data is Required!");
                return false;
            } else {
                spblp010401a.setError(null);
            }

            if (Integer.valueOf(spblp010401a.getText().toString()) > 0) {
                if (spblp010401b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010401) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                    spblp010401bj.setError("This data is Required!");
                    spblp010401bj.setFocusableInTouchMode(true);
                    spblp010401bj.setFocusable(true);
                    spblp010401bj.requestFocus();
                    Log.i(TAG, "spblp010401b: This data is Required!");
                    return false;
                } else {
                    spblp010401bj.setError(null);
                }

            }

            //======================= Q 4.2 ===============
            if (spblp010402a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010402) + getString(R.string.spblp01sub2), Toast.LENGTH_SHORT).show();
                spblp010402a.setError("This data is Required!");
                spblp010402a.requestFocus();
                Log.i(TAG, "spblp010402a: This data is Required!");
                return false;
            } else {
                spblp010402a.setError(null);
            }

            if (Integer.valueOf(spblp010402a.getText().toString()) < 0 || Integer.valueOf(spblp010402a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp010402), Toast.LENGTH_SHORT).show();
                spblp010402a.setError("Range is 0 - 7 days");
                Log.i(TAG, "spblp010402a: This data is Required!");
                return false;
            } else {
                spblp010402a.setError(null);
            }

            if (Integer.valueOf(spblp010402a.getText().toString()) > 0) {
                if (spblp010402b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010402) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                    spblp010402bj.setError("This data is Required!");
                    spblp010402bj.setFocusableInTouchMode(true);
                    spblp010402bj.setFocusable(true);
                    spblp010402bj.requestFocus();
                    Log.i(TAG, "spblp010402b: This data is Required!");
                    return false;
                } else {
                    spblp010402bj.setError(null);
                }

            }

            //======================= Q 4.3 ===============
            if (spblp010403a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010403) + getString(R.string.spblp01sub2), Toast.LENGTH_SHORT).show();
                spblp010403a.setError("This data is Required!");
                spblp010403a.requestFocus();
                Log.i(TAG, "spblp010403a: This data is Required!");
                return false;
            } else {
                spblp010403a.setError(null);
            }

            if (Integer.valueOf(spblp010403a.getText().toString()) < 0 || Integer.valueOf(spblp010403a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp010403), Toast.LENGTH_SHORT).show();
                spblp010403a.setError("Range is 0 - 7 days");
                Log.i(TAG, "spblp010403a: This data is Required!");
                return false;
            } else {
                spblp010403a.setError(null);
            }

            if (Integer.valueOf(spblp010403a.getText().toString()) > 0) {
                if (spblp010403b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010403) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                    spblp010403bj.setError("This data is Required!");
                    spblp010403bj.setFocusableInTouchMode(true);
                    spblp010403bj.setFocusable(true);
                    spblp010403bj.requestFocus();
                    Log.i(TAG, "spblp010403b: This data is Required!");
                    return false;
                } else {
                    spblp010403bj.setError(null);
                }

            }

            //======================= Q 4.4 ===============
            if (spblp010404a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010404) + getString(R.string.spblp01sub2), Toast.LENGTH_SHORT).show();
                spblp010404a.setError("This data is Required!");
                spblp010404a.requestFocus();
                Log.i(TAG, "spblp010404a: This data is Required!");
                return false;
            } else {
                spblp010404a.setError(null);
            }

            if (Integer.valueOf(spblp010404a.getText().toString()) < 0 || Integer.valueOf(spblp010404a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp010404), Toast.LENGTH_SHORT).show();
                spblp010404a.setError("Range is 0 - 7 days");
                Log.i(TAG, "spblp010404a: This data is Required!");
                return false;
            } else {
                spblp010404a.setError(null);
            }

            if (Integer.valueOf(spblp010404a.getText().toString()) > 0) {
                if (spblp010404b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010404) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                    spblp010404bj.setError("This data is Required!");
                    Log.i(TAG, "spblp010404b: This data is Required!");
                    return false;
                } else {
                    spblp010404bj.setError(null);
                }

            }

        }

        //======================= Q 0105 ===============
        if (spblp0105a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0105), Toast.LENGTH_SHORT).show();
            spblp0105a.setError("This data is Required!");
            spblp0105a.requestFocus();
            Log.i(TAG, "spblp0105a: This data is Required!");
            return false;
        } else {
            spblp0105a.setError(null);
        }

        if (Integer.valueOf(spblp0105a.getText().toString()) < 0 || Integer.valueOf(spblp0105a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0105), Toast.LENGTH_SHORT).show();
            spblp0105a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0105a: This data is Required!");
            return false;
        } else {
            spblp0105a.setError(null);
        }

        if (Integer.valueOf(spblp0105a.getText().toString()) > 0) {
            if (spblp0105b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0105) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0105bj.setError("This data is Required!");
                Log.i(TAG, "spblp0105b: This data is Required!");
                return false;
            } else {
                spblp0105bj.setError(null);
            }


            //======================= Q 5.1 ===============
            if (spblp010501a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010501) + getString(R.string.spblp01sub2), Toast.LENGTH_SHORT).show();
                spblp010501a.setError("This data is Required!");
                spblp010501a.requestFocus();
                Log.i(TAG, "spblp010501a: This data is Required!");
                return false;
            } else {
                spblp010501a.setError(null);
            }

            if (Integer.valueOf(spblp010501a.getText().toString()) < 0 || Integer.valueOf(spblp010501a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp010501), Toast.LENGTH_SHORT).show();
                spblp010501a.setError("Range is 0 - 7 days");
                Log.i(TAG, "spblp010501a: This data is Required!");
                return false;
            } else {
                spblp010501a.setError(null);
            }

            if (Integer.valueOf(spblp010501a.getText().toString()) > 0) {
                if (spblp010501b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010501) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                    spblp010501bj.setError("This data is Required!");
                    Log.i(TAG, "spblp010501b: This data is Required!");
                    return false;
                } else {
                    spblp010501bj.setError(null);
                }

            }

            //======================= Q 5.2 ===============
            if (spblp010502a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010502) + getString(R.string.spblp01sub2), Toast.LENGTH_SHORT).show();
                spblp010502a.setError("This data is Required!");
                spblp010502a.requestFocus();
                Log.i(TAG, "spblp010502a: This data is Required!");
                return false;
            } else {
                spblp010502a.setError(null);
            }

            if (Integer.valueOf(spblp010502a.getText().toString()) < 0 || Integer.valueOf(spblp010502a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp010402), Toast.LENGTH_SHORT).show();
                spblp010502a.setError("Range is 0 - 7 days");
                Log.i(TAG, "spblp010502a: This data is Required!");
                return false;
            } else {
                spblp010502a.setError(null);
            }

            if (Integer.valueOf(spblp010502a.getText().toString()) > 0) {
                if (spblp010502b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010502) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                    spblp010502bj.setError("This data is Required!");
                    Log.i(TAG, "spblp010502b: This data is Required!");
                    return false;
                } else {
                    spblp010502bj.setError(null);
                }

            }

        }

        //======================= Q 0106 ===============
        if (spblp0106a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0106), Toast.LENGTH_SHORT).show();
            spblp0106a.setError("This data is Required!");
            spblp0106a.requestFocus();
            Log.i(TAG, "spblp0106a: This data is Required!");
            return false;
        } else {
            spblp0106a.setError(null);
        }

        if (Integer.valueOf(spblp0106a.getText().toString()) < 0 || Integer.valueOf(spblp0106a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0106), Toast.LENGTH_SHORT).show();
            spblp0106a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0106a: This data is Required!");
            return false;
        } else {
            spblp0106a.setError(null);
        }

        if (Integer.valueOf(spblp0106a.getText().toString()) > 0) {
            if (spblp0106b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0106) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0106bj.setError("This data is Required!");
                Log.i(TAG, "spblp0106b: This data is Required!");
                return false;
            } else {
                spblp0106bj.setError(null);
            }


            //======================= Q 6.1 ===============
            if (spblp010601a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010601) + getString(R.string.spblp01sub2), Toast.LENGTH_SHORT).show();
                spblp010601a.setError("This data is Required!");
                spblp010601a.requestFocus();
                Log.i(TAG, "spblp010601a: This data is Required!");
                return false;
            } else {
                spblp010601a.setError(null);
            }

            if (Integer.valueOf(spblp010601a.getText().toString()) < 0 || Integer.valueOf(spblp010601a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp010601), Toast.LENGTH_SHORT).show();
                spblp010601a.setError("Range is 0 - 7 days");
                Log.i(TAG, "spblp010601a: This data is Required!");
                return false;
            } else {
                spblp010601a.setError(null);
            }

            if (Integer.valueOf(spblp010601a.getText().toString()) > 0) {
                if (spblp010601b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp010601) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                    spblp010601bj.setError("This data is Required!");
                    Log.i(TAG, "spblp010601b: This data is Required!");
                    return false;
                } else {
                    spblp010601bj.setError(null);
                }

            }
        }

        //======================= Q 0108 ===============
        if (spblp0108a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0108), Toast.LENGTH_SHORT).show();
            spblp0108a.setError("This data is Required!");
            spblp0108a.requestFocus();
            Log.i(TAG, "spblp0108a: This data is Required!");
            return false;
        } else {
            spblp0108a.setError(null);
        }

        if (Integer.valueOf(spblp0108a.getText().toString()) < 0 || Integer.valueOf(spblp0108a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0108), Toast.LENGTH_SHORT).show();
            spblp0108a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0108a: This data is Required!");
            return false;
        } else {
            spblp0108a.setError(null);
        }

        if (Integer.valueOf(spblp0108a.getText().toString()) > 0) {
            if (spblp0108b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0108) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0108bj.setError("This data is Required!");
                Log.i(TAG, "spblp0108b: This data is Required!");
                return false;
            } else {
                spblp0108bj.setError(null);
            }
        }

        //======================= Q 0109 ===============
        if (spblp0109a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0109), Toast.LENGTH_SHORT).show();
            spblp0109a.setError("This data is Required!");
            spblp0109a.requestFocus();
            Log.i(TAG, "spblp0109a: This data is Required!");
            return false;
        } else {
            spblp0109a.setError(null);
        }

        if (Integer.valueOf(spblp0109a.getText().toString()) < 0 || Integer.valueOf(spblp0109a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.spblp0109), Toast.LENGTH_SHORT).show();
            spblp0109a.setError("Range is 0 - 7 days");
            Log.i(TAG, "spblp0109a: This data is Required!");
            return false;
        } else {
            spblp0109a.setError(null);
        }

        if (Integer.valueOf(spblp0109a.getText().toString()) > 0) {
            if (spblp0109b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0109) + getString(R.string.spblp01sub3), Toast.LENGTH_SHORT).show();
                spblp0109bj.setError("This data is Required!");
                Log.i(TAG, "spblp0109b: This data is Required!");
                return false;
            } else {
                spblp0109bj.setError(null);
            }
        }

        //======================= Q 0201 ===============
        if (spblp0201.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0201), Toast.LENGTH_SHORT).show();
            spblp0201g.setError("This data is Required!");
            spblp0201g.requestFocus();
            Log.i(TAG, "spblp0201: This data is Required!");
            return false;
        } else {
            spblp0201g.setError(null);
        }

        //======================= Q 0202 ===============
        if (spblp0202.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0202), Toast.LENGTH_SHORT).show();
            spblp0202g.setError("This data is Required!");
            Log.i(TAG, "spblp0202: This data is Required!");
            return false;
        } else {
            spblp0202g.setError(null);
        }

        //======================= Q 0203 ===============
        if (spblp0203.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0203), Toast.LENGTH_SHORT).show();
            spblp0203g.setError("This data is Required!");
            Log.i(TAG, "spblp0203: This data is Required!");
            return false;
        } else {
            spblp0203g.setError(null);
        }

        //======================= Q 0204 ===============
        if (spblp0204.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0204), Toast.LENGTH_SHORT).show();
            spblp0204g.setError("This data is Required!");
            Log.i(TAG, "spblp0204: This data is Required!");
            return false;
        } else {
            spblp0204g.setError(null);
        }

        //======================= Q 0205 ===============
        if (spblp0205.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0205), Toast.LENGTH_SHORT).show();
            spblp0205g.setError("This data is Required!");
            Log.i(TAG, "spblp0205: This data is Required!");
            return false;
        } else {
            spblp0205g.setError(null);
        }

        //======================= Q 0301 ===============
        if (spblp0301.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0301), Toast.LENGTH_SHORT).show();
            spblp0301d.setError("This data is Required!");
            Log.i(TAG, "spblp0301: This data is Required!");
            return false;
        } else {
            spblp0301d.setError(null);
        }

        //======================= Q 0302 ===============
        if (spblp0302.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0302), Toast.LENGTH_SHORT).show();
            spblp0302d.setError("This data is Required!");
            Log.i(TAG, "spblp0302: This data is Required!");
            return false;
        } else {
            spblp0302d.setError(null);
        }

        //======================= Q 0303 ===============
        if (spblp0303.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.spblp0303), Toast.LENGTH_SHORT).show();
            spblp0303d.setError("This data is Required!");
            Log.i(TAG, "spblp0303: This data is Required!");
            return false;
        } else {
            spblp0303d.setError(null);
        }


        return true;

    }

}



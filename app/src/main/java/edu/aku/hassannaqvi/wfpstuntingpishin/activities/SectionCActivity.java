package edu.aku.hassannaqvi.wfpstuntingpishin.activities;

import android.app.Activity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.wfpstuntingpishin.R;
import edu.aku.hassannaqvi.wfpstuntingpishin.core.MainApp;

import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.CheckBox;
import android.widget.TextView;

public class SectionCActivity extends Activity {

    @BindView(R.id.spblc01)
    RadioGroup spblc01;
    @BindView(R.id.spblc01a)
    RadioButton spblc01a;
    @BindView(R.id.spblc01b)
    RadioButton spblc01b;
    @BindView(R.id.spblc01c)
    RadioButton spblc01c;
    @BindView(R.id.spblc01d)
    RadioButton spblc01d;
    @BindView(R.id.spblc01e)
    RadioButton spblc01e;
    @BindView(R.id.spblc01f)
    RadioButton spblc01f;
    @BindView(R.id.spblc0188)
    RadioButton spblc0188;
    @BindView(R.id.spblc0188x)
    EditText spblc0188x;
    @BindView(R.id.spblc02)
    RadioGroup spblc02;
    @BindView(R.id.spblc02a)
    RadioButton spblc02a;
    @BindView(R.id.spblc02b)
    RadioButton spblc02b;
    @BindView(R.id.spblc02c)
    RadioButton spblc02c;
    @BindView(R.id.spblc02d)
    RadioButton spblc02d;
    @BindView(R.id.spblc02e)
    RadioButton spblc02e;
    @BindView(R.id.spblc02f)
    RadioButton spblc02f;
    @BindView(R.id.spblc02g)
    RadioButton spblc02g;
    @BindView(R.id.spblc02h)
    RadioButton spblc02h;
    @BindView(R.id.spblc02i)
    RadioButton spblc02i;
    @BindView(R.id.spblc02j)
    RadioButton spblc02j;
    @BindView(R.id.spblc02k)
    RadioButton spblc02k;
    @BindView(R.id.spblc02l)
    RadioButton spblc02l;
    @BindView(R.id.spblc02o)
    RadioButton spblc02o;
    @BindView(R.id.spblc02n)
    RadioButton spblc02n;
    @BindView(R.id.spblc02m)
    RadioButton spblc02m;
    @BindView(R.id.spblc0288)
    RadioButton spblc0288;
    @BindView(R.id.spblc0288x)
    EditText spblc0288x;
    @BindView(R.id.spblc03)
    RadioGroup spblc03;
    @BindView(R.id.spblc03a)
    RadioButton spblc03a;
    @BindView(R.id.spblc03b)
    RadioButton spblc03b;
    @BindView(R.id.fldGrpspblc01)
    LinearLayout fldGrpspblc01;
    @BindView(R.id.spblc04)
    RadioGroup spblc04;
    @BindView(R.id.spblc04a)
    RadioButton spblc04a;
    @BindView(R.id.spblc04b)
    RadioButton spblc04b;
    @BindView(R.id.spblc04c)
    RadioButton spblc04c;
    @BindView(R.id.spblc04d)
    RadioButton spblc04d;
    @BindView(R.id.spblc04e)
    RadioButton spblc04e;
    @BindView(R.id.spblc04f)
    RadioButton spblc04f;
    @BindView(R.id.spblc0488)
    RadioButton spblc0488;
    @BindView(R.id.spblc0488x)
    EditText spblc0488x;
    @BindView(R.id.spblc05)
    RadioGroup spblc05;
    @BindView(R.id.spblc05a)
    RadioButton spblc05a;
    @BindView(R.id.spblc05b)
    RadioButton spblc05b;
    @BindView(R.id.spblc05c)
    RadioButton spblc05c;
    @BindView(R.id.spblc05d)
    RadioButton spblc05d;
    @BindView(R.id.spblc05e)
    RadioButton spblc05e;
    @BindView(R.id.spblc05f)
    RadioButton spblc05f;
    @BindView(R.id.spblc05g)
    RadioButton spblc05g;
    @BindView(R.id.spblc05h)
    RadioButton spblc05h;
    @BindView(R.id.spblc05i)
    RadioButton spblc05i;
    @BindView(R.id.spblc05j)
    RadioButton spblc05j;
    @BindView(R.id.spblc0588)
    RadioButton spblc0588;
    @BindView(R.id.spblc0588x)
    EditText spblc0588x;
    @BindView(R.id.spblc06)
    RadioGroup spblc06;
    @BindView(R.id.spblc06a)
    RadioButton spblc06a;
    @BindView(R.id.spblc06b)
    RadioButton spblc06b;
    @BindView(R.id.fldGrpspblc02)
    LinearLayout fldGrpspblc02;
    @BindView(R.id.spblc07)
    EditText spblc07;
    @BindView(R.id.spblc0799)
    CheckBox spblc0799;
    @BindView(R.id.spblc08a)
    RadioGroup spblc08a;
    @BindView(R.id.spblc08aa)
    RadioButton spblc08aa;
    @BindView(R.id.spblc08ab)
    RadioButton spblc08ab;
    @BindView(R.id.spblc08b)
    RadioGroup spblc08b;
    @BindView(R.id.spblc08ba)
    RadioButton spblc08ba;
    @BindView(R.id.spblc08bb)
    RadioButton spblc08bb;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.spblc08c)
    RadioGroup spblc08c;
    @BindView(R.id.spblc08ca)
    RadioButton spblc08ca;
    @BindView(R.id.spblc08cb)
    RadioButton spblc08cb;
    @BindView(R.id.spblc08d)
    RadioGroup spblc08d;
    @BindView(R.id.spblc08da)
    RadioButton spblc08da;
    @BindView(R.id.spblc08db)
    RadioButton spblc08db;
    @BindView(R.id.spblc08e)
    RadioGroup spblc08e;
    @BindView(R.id.spblc08ea)
    RadioButton spblc08ea;
    @BindView(R.id.spblc08eb)
    RadioButton spblc08eb;
    @BindView(R.id.spblc08f)
    RadioGroup spblc08f;
    @BindView(R.id.spblc08fa)
    RadioButton spblc08fa;
    @BindView(R.id.spblc08fb)
    RadioButton spblc08fb;
    @BindView(R.id.spblc08g)
    RadioGroup spblc08g;
    @BindView(R.id.spblc08ga)
    RadioButton spblc08ga;
    @BindView(R.id.spblc08gb)
    RadioButton spblc08gb;
    @BindView(R.id.spblc08h)
    RadioGroup spblc08h;
    @BindView(R.id.spblc08ha)
    RadioButton spblc08ha;
    @BindView(R.id.spblc08hb)
    RadioButton spblc08hb;
    @BindView(R.id.spblc08i)
    RadioGroup spblc08i;
    @BindView(R.id.spblc08ia)
    RadioButton spblc08ia;
    @BindView(R.id.spblc08ib)
    RadioButton spblc08ib;
    @BindView(R.id.spblc08j)
    RadioGroup spblc08j;
    @BindView(R.id.spblc08ja)
    RadioButton spblc08ja;
    @BindView(R.id.spblc08jb)
    RadioButton spblc08jb;
    @BindView(R.id.spblc08k)
    RadioGroup spblc08k;
    @BindView(R.id.spblc08ka)
    RadioButton spblc08ka;
    @BindView(R.id.spblc08kb)
    RadioButton spblc08kb;
    @BindView(R.id.spblc08l)
    RadioGroup spblc08l;
    @BindView(R.id.spblc08la)
    RadioButton spblc08la;
    @BindView(R.id.spblc08lb)
    RadioButton spblc08lb;
    @BindView(R.id.spblc08m)
    RadioGroup spblc08m;
    @BindView(R.id.spblc08ma)
    RadioButton spblc08ma;
    @BindView(R.id.spblc08mb)
    RadioButton spblc08mb;
    @BindView(R.id.spblc08n)
    RadioGroup spblc08n;
    @BindView(R.id.spblc08na)
    RadioButton spblc08na;
    @BindView(R.id.spblc08nb)
    RadioButton spblc08nb;
    @BindView(R.id.spblc08o)
    RadioGroup spblc08o;
    @BindView(R.id.spblc08oa)
    RadioButton spblc08oa;
    @BindView(R.id.spblc08ob)
    RadioButton spblc08ob;
    @BindView(R.id.spblc08p)
    RadioGroup spblc08p;
    @BindView(R.id.spblc08pa)
    RadioButton spblc08pa;
    @BindView(R.id.spblc08pb)
    RadioButton spblc08pb;
    @BindView(R.id.spblc08q)
    RadioGroup spblc08q;
    @BindView(R.id.spblc08qa)
    RadioButton spblc08qa;
    @BindView(R.id.spblc08qb)
    RadioButton spblc08qb;
    @BindView(R.id.spblc08r)
    RadioGroup spblc08r;
    @BindView(R.id.spblc08ra)
    RadioButton spblc08ra;
    @BindView(R.id.spblc08rb)
    RadioButton spblc08rb;
    @BindView(R.id.spblc09)
    RadioGroup spblc09;
    @BindView(R.id.spblc09a)
    RadioButton spblc09a;
    @BindView(R.id.spblc09b)
    RadioButton spblc09b;
    @BindView(R.id.spblc09c)
    RadioButton spblc09c;
    @BindView(R.id.spblc09d)
    RadioButton spblc09d;
    @BindView(R.id.spblc09e)
    RadioButton spblc09e;
    @BindView(R.id.spblc09f)
    RadioButton spblc09f;
    @BindView(R.id.spblc09g)
    RadioButton spblc09g;
    @BindView(R.id.spblc09h)
    RadioButton spblc09h;
    @BindView(R.id.spblc09i)
    RadioButton spblc09i;
    @BindView(R.id.spblc09j)
    RadioButton spblc09j;
    @BindView(R.id.spblc0988)
    RadioButton spblc0988;
    @BindView(R.id.spblc0988x)
    EditText spblc0988x;
    @BindView(R.id.spblc10)
    RadioGroup spblc10;
    @BindView(R.id.spblc10a)
    RadioButton spblc10a;
    @BindView(R.id.spblc10b)
    RadioButton spblc10b;
    @BindView(R.id.spblc10c)
    RadioButton spblc10c;
    @BindView(R.id.spblc1088)
    RadioButton spblc1088;
    @BindView(R.id.spblc1088x)
    EditText spblc1088x;
    @BindView(R.id.spblc11)
    RadioGroup spblc11;
    @BindView(R.id.spblc11a)
    RadioButton spblc11a;
    @BindView(R.id.spblc11b)
    RadioButton spblc11b;
    @BindView(R.id.spblc12)
    RadioGroup spblc12;
    @BindView(R.id.spblc12a)
    RadioButton spblc12a;
    @BindView(R.id.spblc12b)
    RadioButton spblc12b;
    @BindView(R.id.spblc12c)
    RadioButton spblc12c;
    @BindView(R.id.spblc12d)
    RadioButton spblc12d;
    @BindView(R.id.spblc12e)
    RadioButton spblc12e;
    @BindView(R.id.spblc12f)
    RadioButton spblc12f;
    @BindView(R.id.spblc12g)
    RadioButton spblc12g;
    @BindView(R.id.spblc12h)
    RadioButton spblc12h;
    @BindView(R.id.spblc12i)
    RadioButton spblc12i;
    @BindView(R.id.spblc12j)
    RadioButton spblc12j;
    @BindView(R.id.spblc12k)
    RadioButton spblc12k;
    @BindView(R.id.spblc12l)
    RadioButton spblc12l;
    @BindView(R.id.spblc12m)
    RadioButton spblc12m;
    @BindView(R.id.spblc1288)
    RadioButton spblc1288;
    @BindView(R.id.spblc1288x)
    EditText spblc1288x;
    @BindView(R.id.spblc13)
    RadioGroup spblc13;
    @BindView(R.id.spblc13a)
    RadioButton spblc13a;
    @BindView(R.id.spblc13b)
    RadioButton spblc13b;
    @BindView(R.id.spblc13c)
    RadioButton spblc13c;
    @BindView(R.id.spblc13d)
    RadioButton spblc13d;
    @BindView(R.id.spblc13e)
    RadioButton spblc13e;
    @BindView(R.id.spblc13f)
    RadioButton spblc13f;
    @BindView(R.id.spblc13g)
    RadioButton spblc13g;
    @BindView(R.id.spblc13h)
    RadioButton spblc13h;
    @BindView(R.id.spblc13i)
    RadioButton spblc13i;
    @BindView(R.id.spblc13j)
    RadioButton spblc13j;
    @BindView(R.id.spblc13k)
    RadioButton spblc13k;
    @BindView(R.id.spblc13l)
    RadioButton spblc13l;
    @BindView(R.id.spblc13m)
    RadioButton spblc13m;
    @BindView(R.id.spblc13n)
    RadioButton spblc13n;
    @BindView(R.id.spblc1388)
    RadioButton spblc1388;
    @BindView(R.id.spblc1388x)
    EditText spblc1388x;
    @BindView(R.id.spblc14)
    RadioGroup spblc14;
    @BindView(R.id.spblc14a)
    RadioButton spblc14a;
    @BindView(R.id.spblc14b)
    RadioButton spblc14b;
    @BindView(R.id.spblc14c)
    RadioButton spblc14c;
    @BindView(R.id.spblc14d)
    RadioButton spblc14d;
    @BindView(R.id.spblc14e)
    RadioButton spblc14e;
    @BindView(R.id.spblc14f)
    RadioButton spblc14f;
    @BindView(R.id.spblc14g)
    RadioButton spblc14g;
    @BindView(R.id.spblc14h)
    RadioButton spblc14h;
    @BindView(R.id.spblc14i)
    RadioButton spblc14i;
    @BindView(R.id.spblc14j)
    RadioButton spblc14j;
    @BindView(R.id.spblc14k)
    RadioButton spblc14k;
    @BindView(R.id.spblc14l)
    RadioButton spblc14l;
    @BindView(R.id.spblc14m)
    RadioButton spblc14m;
    @BindView(R.id.spblc14n)
    RadioButton spblc14n;
    @BindView(R.id.spblc14o)
    RadioButton spblc14o;
    @BindView(R.id.spblc14p)
    RadioButton spblc14p;
    @BindView(R.id.spblc14q)
    RadioButton spblc14q;
    @BindView(R.id.spblc14r)
    RadioButton spblc14r;
    @BindView(R.id.spblc14s)
    RadioButton spblc14s;
    @BindView(R.id.spblc14t)
    RadioButton spblc14t;
    @BindView(R.id.spblc14u)
    RadioButton spblc14u;
    @BindView(R.id.spblc1488)
    RadioButton spblc1488;
    @BindView(R.id.spblc1488x)
    EditText spblc1488x;
    @BindView(R.id.spblc15)
    EditText spblc15;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.spblc16a)
    RadioGroup spblc16a;
    @BindView(R.id.spblc16aa)
    RadioButton spblc16aa;
    @BindView(R.id.spblc16ab)
    RadioButton spblc16ab;
    @BindView(R.id.spblc16b)
    RadioGroup spblc16b;
    @BindView(R.id.spblc16ba)
    RadioButton spblc16ba;
    @BindView(R.id.spblc16bb)
    RadioButton spblc16bb;
    @BindView(R.id.spblc16c)
    RadioGroup spblc16c;
    @BindView(R.id.spblc16ca)
    RadioButton spblc16ca;
    @BindView(R.id.spblc16cb)
    RadioButton spblc16cb;
    @BindView(R.id.spblc16d)
    RadioGroup spblc16d;
    @BindView(R.id.spblc16da)
    RadioButton spblc16da;
    @BindView(R.id.spblc16db)
    RadioButton spblc16db;
    @BindView(R.id.spblc16e)
    RadioGroup spblc16e;
    @BindView(R.id.spblc16ea)
    RadioButton spblc16ea;
    @BindView(R.id.spblc16eb)
    RadioButton spblc16eb;
    @BindView(R.id.spblc16f)
    RadioGroup spblc16f;
    @BindView(R.id.spblc16fa)
    RadioButton spblc16fa;
    @BindView(R.id.spblc16fb)
    RadioButton spblc16fb;
    @BindView(R.id.spblc16g)
    RadioGroup spblc16g;
    @BindView(R.id.spblc16ga)
    RadioButton spblc16ga;
    @BindView(R.id.spblc16gb)
    RadioButton spblc16gb;
    @BindView(R.id.spblc16h)
    RadioGroup spblc16h;
    @BindView(R.id.spblc16ha)
    RadioButton spblc16ha;
    @BindView(R.id.spblc16hb)
    RadioButton spblc16hb;
    @BindView(R.id.spblc16i)
    RadioGroup spblc16i;
    @BindView(R.id.spblc16ia)
    RadioButton spblc16ia;
    @BindView(R.id.spblc16ib)
    RadioButton spblc16ib;
    @BindView(R.id.spblc17)
    RadioGroup spblc17;
    @BindView(R.id.spblc17a)
    RadioButton spblc17a;
    @BindView(R.id.spblc17b)
    RadioButton spblc17b;
    @BindView(R.id.fldGrpspblc03)
    LinearLayout fldGrpspblc03;
    @BindView(R.id.spblc18)
    RadioGroup spblc18;
    @BindView(R.id.spblc18a)
    RadioButton spblc18a;
    @BindView(R.id.spblc18ac)
    EditText spblc18ac;
    @BindView(R.id.spblc18b)
    RadioButton spblc18b;
    @BindView(R.id.spblc18kn)
    EditText spblc18kn;
    @BindView(R.id.spblc18c)
    RadioButton spblc18c;
    @BindView(R.id.spblc1ckn)
    EditText spblc1ckn;
    @BindView(R.id.spblc1899)
    RadioButton spblc1899;
    @BindView(R.id.spblc19)
    RadioGroup spblc19;
    @BindView(R.id.spblc19a)
    RadioButton spblc19a;
    @BindView(R.id.spblc19b)
    RadioButton spblc19b;
    @BindView(R.id.fldGrpspblc04)
    LinearLayout fldGrpspblc04;
    @BindView(R.id.spblc20a)
    EditText spblc20a;
    @BindView(R.id.spblc20b)
    EditText spblc20b;
    @BindView(R.id.spblc20c)
    EditText spblc20c;
    @BindView(R.id.spblc20d)
    EditText spblc20d;
    @BindView(R.id.spblc20e)
    EditText spblc20e;
    @BindView(R.id.spblc20f)
    EditText spblc20f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        MainApp.endActivity(this,this);
    }

}


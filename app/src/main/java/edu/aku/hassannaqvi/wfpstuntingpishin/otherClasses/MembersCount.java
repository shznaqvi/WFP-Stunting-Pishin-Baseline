package edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by ali.azaz on 10/27/17.
 */

public class MembersCount {

    int count = 0;

    Map<Integer,Map<Integer,String>> children;

    Map<Integer,String> women;

    public int getCount() {
        return count;
    }

    public Map<Integer, Map<Integer, String>> getChildren() {
        return children;
    }

    public Map<Integer, String> getWomen() {
        return women;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setChildren(Map<Integer, Map<Integer, String>> children) {
        this.children = children;
    }

    public void setWomen(Map<Integer, String> women) {
        this.women = women;
    }

    public MembersCount(int count, Map<Integer, Map<Integer, String>> children, Map<Integer, String> women) {
        this.count = count;
        this.children = children;
        this.women = women;
    }

    public MembersCount(int count, Map<Integer, Map<Integer, String>> children) {
        this.count = count;
        this.children = children;
    }
}

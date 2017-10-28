package edu.aku.hassannaqvi.wfpstuntingpishin.otherClasses;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by ali.azaz on 10/27/17.
 */

public class MembersCount {

    int count;

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

    public MembersCount(int count, Map<Integer, Map<Integer, String>> children, Map<Integer, String> women) {
        this.count = count;
        this.children = children;
        this.women = women;
    }
}

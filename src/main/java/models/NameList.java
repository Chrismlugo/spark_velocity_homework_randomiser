package models;

import java.util.ArrayList;
import java.util.Collections;

public class NameList {
    private ArrayList<String> names;

    public NameList() {
        names = new ArrayList<String>();
        names.add("Chris");
        names.add("Seth");
        names.add("Kevin");
        names.add("Bradley");
        names.add("Taha");
    }

    public String getName(){

        Collections.shuffle(names);
        return names.get(0);

    }

    public ArrayList<String> getPairOfNames() {
        ArrayList<String> results = new ArrayList<>();
       String name1 =  getName();
       results.add(name1);
       String name2 = getName();
       results.add(name2);
       return results;
    }
}

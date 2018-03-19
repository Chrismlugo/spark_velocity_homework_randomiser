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
        names.add("Brogan");
        names.add("Taha");
        names.add("Julian");
        names.add("Beth");
        names.add("Jayne");
        names.add("Sophie");
        names.add("Grace");
        names.add("Joanna");
        names.add("Joseph");
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

    public ArrayList<String> getThreeNames(){
        ArrayList<String> results = new ArrayList<>();
        String name1 = getName();
        results.add(name1);
        String name2 = getName();
        results.add(name2);
        String name3 = getName();
        results.add(name3);
        return results;
    }

    public ArrayList<String> getFourNames() {
        ArrayList<String> results = new ArrayList<>();
        String name1 = getName();
        results.add(name1);
        String name2 = getName();
        results.add(name2);
        String name3 = getName();
        results.add(name3);
        String name4 = getName();
        results.add(name4);
        return results;
    }
}

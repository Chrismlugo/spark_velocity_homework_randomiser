package models;

import java.util.ArrayList;
import java.util.Collections;

public class NameList {
    public String getName(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Chris");
        names.add("Seth");
        names.add("Kevin");
        names.add("Bradley");
        names.add("Taha");

        Collections.shuffle(names);
        return names.get(0);

    }
}

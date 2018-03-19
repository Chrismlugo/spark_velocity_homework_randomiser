package models;

import java.util.ArrayList;
import java.util.Collections;

public class NameList {
    public String getNames(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("chris");
        names.add("Seth");
        names.add("Kevin");
        names.add("Bradley");
        names.add("Taha");

        Collections.shuffle(names);
        return names.get(0);

    }
}

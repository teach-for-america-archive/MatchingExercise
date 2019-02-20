package org.tfa.test.matching;

import java.util.ArrayList;
import java.util.HashMap;

public class DataLoader {

    public ArrayList<HashMap> getData() {

        ArrayList people = new ArrayList();

        HashMap<String,String> peterValues = new HashMap();
        peterValues.put("id","1");
        peterValues.put("name","Peter");
        peterValues.put("color","Blue");
        peterValues.put("gender","Male");
        peterValues.put("state","NY");
        peterValues.put("field","Advertising");
        people.add(peterValues);

        HashMap<String,String> steveValues = new HashMap();
        steveValues.put("id","2");
        steveValues.put("name","Steve");
        steveValues.put("color","Red");
        steveValues.put("gender","Male");
        steveValues.put("state","NY");
        steveValues.put("field","Medicine");
        people.add(steveValues);

        HashMap<String,String> janeValues = new HashMap();
        janeValues.put("id","3");
        janeValues.put("name","Jane");
        janeValues.put("color","Blue");
        janeValues.put("gender","Female");
        janeValues.put("state","NJ");
        janeValues.put("field","Advertising");
        people.add(janeValues);

        HashMap<String,String> annValues = new HashMap();
        annValues.put("id","4");
        annValues.put("name","Ann");
        annValues.put("color","Purple");
        annValues.put("gender","Female");
        annValues.put("state","NC");
        annValues.put("field","Psychology");
        people.add(annValues);

        return people;
    }
}

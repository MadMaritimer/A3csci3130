package com.acme.A4;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Business implements Serializable {

    public  String bID;
    public  String name;
    public  String bType;
    public  String address;
    public  String prov;

    public Business() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Business(String bID, String name, String bType, String address, String prov){
        this.bID = bID;
        this.name = name;
        this.bType = bType;
        this.address = address;
        this.prov = prov;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("bID", bID);
        result.put("name", name);
        result.put("bType", bType);

        return result;
    }
}

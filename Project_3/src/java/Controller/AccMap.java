/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Account;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @hanh
 */
public class AccMap {
    private static AccMap instance;
    static Map<Integer, Account> mapAcc;
    static{
        instance = new AccMap();
        mapAcc = new HashMap<Integer, Account>();
    }
    public AccMap() {
    }

    public static AccMap getInstance() {
        return instance;
    }
    
    public Map<Integer, Account> getMapAcc() {
          mapAcc.put(1, new Account("system", "123"));
//          mapAcc.put(2, new Account("haibatcom123", "123"));
//        mapAcc.put(3, new Account("mrbmrbmrb", "passW0rd@123"));
//        mapAcc.put(4, new Account("mrcmrcmrc", "passW0rd@123"));

        //abcadeawww@1N
        return mapAcc;
    }

}

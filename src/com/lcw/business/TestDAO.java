package com.lcw.business;

/**
 * Data Source Object
 */
public class TestDAO {
    CacheOP cacheOP = new CacheOP();
    DataBaseOP dataBaseOP = new DataBaseOP();

    public boolean isExist(String ctx) {
        if(cacheOP.get(ctx) != null) {
            return true;
        }
        if(dataBaseOP.get(ctx) != null) {
            return true;
        }
        return false;
    }
}

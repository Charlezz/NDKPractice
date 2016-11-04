package com.maxst.www.ndkpractice;

/**
 * Created by Charles on 11/4/16.
 */
public class NativeManager {
    static {
        System.loadLibrary("native-lib");
    }

    private static NativeManager ourInstance = new NativeManager();

    public static NativeManager getInstance() {
        return ourInstance;
    }

    private NativeManager() {
    }
    public native String getSomething();
    public native String getSomething2();
}

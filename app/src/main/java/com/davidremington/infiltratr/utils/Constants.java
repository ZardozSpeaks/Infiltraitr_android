package com.davidremington.infiltratr.utils;

import com.davidremington.infiltratr.BuildConfig;

public class Constants {
    public static final String PREFERENCES_LOCATION_KEY = "location";
    public static final String FIREBASE_URL = BuildConfig.FIREBASE_ROOT_URL;
    public static final String GOOGLE_API_KEY = BuildConfig.GOOGLE_API_KEY;
    public static final String FIREBASE_COORDINATES_SAVED_LOCATION = "coordinatesLocation";
    public static final String FIREBASE_URL_SAVED_LOCATION = FIREBASE_URL + "/" +FIREBASE_COORDINATES_SAVED_LOCATION;
}

//TODO: add Java Docs
package com.example.tom.backendless;

import android.app.Application;

import com.backendless.Backendless;

public class BackEndLessApplication extends Application
{
    //KEYS FROM BACKENDLESS.COM
    public static final String APPLICATION_ID = "F9735390-B29D-1003-FF68-C34E0A9C2800";
    public static final String API_KEY = "3C3E90EF-67D8-F61B-FF9E-1E2AAD3F7A00";
    public static final String SERVER_URL = "https://api.backendless.com";




    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL); //SETS THE URL as defined in the SERVER_URL var
        Backendless.initApp(getApplicationContext(), APPLICATION_ID, API_KEY);


    }
}

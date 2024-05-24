package ru.mirea.fursovgs.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final static String YANDEX_MAP_API_KEY = "e75e81b0-3f3c-49c8-934f-bb00b7ed30a4";

    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey(YANDEX_MAP_API_KEY);
    }
}

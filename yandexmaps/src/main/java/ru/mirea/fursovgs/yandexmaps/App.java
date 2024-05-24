package ru.mirea.fursovgs.yandexmaps;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

//e75e81b0-3f3c-49c8-934f-bb00b7ed30a4
public class App extends Application {
    private final String MAPKIT_API_KEY = "e75e81b0-3f3c-49c8-934f-bb00b7ed30a4";
    @Override
    public void onCreate() {
        super.onCreate();
// Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
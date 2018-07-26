package ua.artlite.satrino.core;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.artlite.bslibrary.core.BSInstance;
import com.artlite.sqlib.core.SQDatabase;

/**
 * Class which provide the current application functional
 */
public final class CurrentApplication extends MultiDexApplication {

    /**
     * Method which provide the action when the base {@link Context} was attached
     *
     * @param base instance of the {@link Context}
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    /**
     * Method which provide the on create functional for the {@link CurrentApplication}
     */
    @Override
    public void onCreate() {
        super.onCreate();
        BSInstance.init(this);
        SQDatabase.init(this);
    }

}

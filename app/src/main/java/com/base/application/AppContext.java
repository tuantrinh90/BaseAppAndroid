package com.base.application;

import android.content.Context;
import android.support.annotation.Nullable;

import com.bon.application.ExtApplication;
import com.bon.logger.Logger;
import com.base.di.AppComponent;
import com.base.di.AppModule;
import com.base.di.DaggerAppComponent;
import com.base.ui.BuildConfig;

import java8.util.function.Consumer;


public class AppContext extends ExtApplication {
    private static final String TAG = AppContext.class.getSimpleName();

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        // dagger
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);

        //  logger
        Logger.setEnableLog(BuildConfig.DEBUG);
    }

    /**
     * @param context
     * @return
     */
    @Nullable
    public static AppComponent getComponentFromContext(@Nullable Context context) {
        if (context == null) return null;

        AppComponent component;
        if (context instanceof AppContext) {
            component = ((AppContext) context).getComponent();
        } else {
            component = ((AppContext) context.getApplicationContext()).getComponent();
        }

        return component;
    }

    /**
     * @param context
     * @return
     */
    @Nullable
    public static AppContext from(@Nullable Context context) {
        if (context == null) return null;

        if (context instanceof AppContext) {
            return (AppContext) context;
        }

        return (AppContext) context.getApplicationContext();
    }

    /**
     * @param context
     * @param contextConsumer
     */
    public static void ifPresent(@Nullable Context context, Consumer<AppContext> contextConsumer) {
        if (context == null || contextConsumer == null) return;

        if (context instanceof AppContext) {
            contextConsumer.accept((AppContext) context);
            return;
        }

        contextConsumer.accept((AppContext) context.getApplicationContext());
    }

    /**
     * get app component
     *
     * @return
     */
    public AppComponent getComponent() {
        return component;
    }
}

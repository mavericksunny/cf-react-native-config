
package com.reactlibrary;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CFReactNativeConfigModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public CFReactNativeConfigModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "CFReactNativeConfig";
  }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();

        try {
            Context context = getReactApplicationContext();
            int resId = context.getResources().getIdentifier("build_config_package", "string", context.getPackageName());
            String className;
            try {
                className = context.getString(resId);
            } catch (Resources.NotFoundException e) {
                className = getReactApplicationContext().getApplicationContext().getPackageName();
            }
            Class clazz = Class.forName(className + ".BuildConfig");
            Field[] fields = clazz.getDeclaredFields();
            for(Field f: fields) {
                try {
                    constants.put(f.getName(), f.get(null));
                }
                catch (IllegalAccessException e) {
                    Log.d("ReactNative", "ReactConfig: Could not access BuildConfig field " + f.getName());
                }
            }
        }
        catch (ClassNotFoundException e) {
            Log.d("ReactNative", "ReactConfig: Could not find BuildConfig class");
        }

        return constants;
    }
}


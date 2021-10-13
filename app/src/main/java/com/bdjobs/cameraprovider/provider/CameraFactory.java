package com.bdjobs.cameraprovider.provider;

import android.os.Build;

import com.bdjobs.cameraprovider.model.Camera;
import com.bdjobs.cameraprovider.model.CameraX;

public class CameraFactory {

    public static CameraProvider getProvider(Camera camera, CameraX cameraX, CameraProvider.CameraOutputCallback cameraOutputCallback){
        if (Build.VERSION.SDK_INT > 22){
            return new CameraXProvider(cameraX, cameraOutputCallback);
        } else {
            return new CameraViewProvider(camera, cameraOutputCallback);
        }
    }

}

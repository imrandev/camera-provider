package com.bdjobs.cameraprovider.provider;

import com.bdjobs.cameraprovider.model.CameraX;
import com.bdjobs.cameraprovider.provider.CameraProvider;

import java.io.File;

public class CameraXProvider extends CameraProvider {

    private CameraX cameraX;
    private CameraProvider.CameraOutputCallback cameraOutputCallback;

    public CameraXProvider(CameraX cameraX) {
        this.cameraX = cameraX;
    }

    public CameraXProvider(CameraX cameraX, CameraOutputCallback cameraOutputCallback) {
        this.cameraX = cameraX;
        this.cameraOutputCallback = cameraOutputCallback;
    }

    @Override
    public void init() {
    }

    @Override
    public void stop() {
        cameraOutputCallback.outputFile(new File(""));
    }
}

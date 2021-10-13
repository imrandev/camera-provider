package com.bdjobs.cameraprovider.provider;

import com.bdjobs.cameraprovider.model.Camera;

import java.io.File;

public class CameraViewProvider extends CameraProvider {

    private Camera camera;
    private CameraProvider.CameraOutputCallback cameraOutputCallback;

    public CameraViewProvider(Camera camera) {
        this.camera = camera;
    }

    public CameraViewProvider(Camera camera, CameraOutputCallback cameraOutputCallback) {
        this.camera = camera;
        this.cameraOutputCallback = cameraOutputCallback;
    }

    @Override
    public void init() {
        // init
    }

    @Override
    public void stop() {
        cameraOutputCallback.outputFile(new File(""));
    }
}

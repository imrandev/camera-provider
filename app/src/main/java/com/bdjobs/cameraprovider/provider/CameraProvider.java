package com.bdjobs.cameraprovider.provider;

import java.io.File;

public abstract class CameraProvider {
    public abstract void init();
    public abstract void stop();

    public interface CameraOutputCallback {
        void outputFile(File file);
    }
}

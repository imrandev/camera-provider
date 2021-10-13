package com.bdjobs.cameraprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bdjobs.cameraprovider.model.Camera;
import com.bdjobs.cameraprovider.model.CameraX;
import com.bdjobs.cameraprovider.provider.CameraFactory;
import com.bdjobs.cameraprovider.provider.CameraProvider;

import java.io.File;

public class MainActivity extends AppCompatActivity implements CameraProvider.CameraOutputCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CameraProvider provider = CameraFactory
                .getProvider(new Camera(), new CameraX(), this);
        provider.stop();
    }

    @Override
    public void outputFile(File file) {
        // upload file over network
    }
}
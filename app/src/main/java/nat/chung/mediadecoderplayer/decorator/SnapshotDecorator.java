package nat.chung.mediadecoderplayer.decorator;

import android.graphics.Bitmap;
import android.media.MediaFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import nat.chung.mediadecoderplayer.IPlayer;

/**
 * Created by Nat on 2017/1/29.
 */

public class SnapshotDecorator extends PlayerDecorator {

    public SnapshotDecorator(IPlayer iPlayer) {
        super(iPlayer);
    }

    public void snapshot(String pathname){

        try {
            FileOutputStream out = new FileOutputStream(new File ("/sdcard", "haha3.jpg"));
            super.getTextureView().getBitmap().compress(Bitmap.CompressFormat.PNG, 90, out);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addVideoFrame(byte[] data, long timestamp) {
        super.addVideoFrame(data, timestamp);
    }

    @Override
    public void setup(String mineType, MediaFormat format) throws IOException {
        super.setup(mineType, format);
    }

    @Override
    public void stop() {
        super.stop();
    }

}
package examples.com.customtouch;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import examples.com.customtouch.widget.RotateZoomImageView;

/**
 * Created by Dave Smith
 * Double Encore, Inc.
 * Date: 9/24/12
 * MultitouchActivity
 */
public class MultitouchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RotateZoomImageView iv = new RotateZoomImageView(this);

        Bitmap image;
        image = BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher);
        iv.setImageBitmap(image);

        setContentView(iv);
    }
}

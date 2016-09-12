package examples.com.customtouch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by Dave Smith
 * Double Encore, Inc.
 * Date: 9/25/12
 * TouchListenerActivity
 */
public class TouchListenerActivity extends Activity implements View.OnTouchListener {

    private static final String TAG = "touch";
    /* Views to display last seen touch event */
    CheckBox mLockBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_listener);

        mLockBox = (CheckBox) findViewById(R.id.checkbox_lock);

        findViewById(R.id.selection_first).setOnTouchListener(this);
        findViewById(R.id.selection_second).setOnTouchListener(this);
        findViewById(R.id.selection_third).setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        /*
         * Consume the events here so the buttons cannot process them
         * if the CheckBox in the UI is checked
         */
        Log.d(TAG, "onTouch: "+getNameForEvent(event));
        return mLockBox.isChecked();
    }

    private String getNameForEvent(MotionEvent event) {
        String action = "";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                Toast.makeText(getApplicationContext(),"Touched",Toast.LENGTH_SHORT).show();
                break;
            default:
                return null;
        }

        return String.format("%s\n%.1f, %.1f", action, event.getX(), event.getY());
    }
}

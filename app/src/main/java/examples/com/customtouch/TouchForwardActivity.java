/*
 * Copyright (c) 2012 Wireless Designs, LLC
 *
 * See the file license.txt for copying permission.
 */
package examples.com.customtouch;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;

import examples.com.customtouch.widget.TouchForwardLayout;

public class TouchForwardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TouchForwardLayout layout = new TouchForwardLayout(this);
		
		Button button = new Button(this);
		button.setText("You Can't Miss Me!");
		
		FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT, Gravity.CENTER);
		layout.addView(button, lp);
		setContentView(layout);
	}
}

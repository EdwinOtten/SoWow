package sowow.edwinotten.sowow;

import sowow.edwinotten.sowow.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {

    Stack hidden;

    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * If set, will toggle the system UI visibility upon interaction. Otherwise,
     * will show the system UI visibility upon interaction.
     */
    private static final boolean TOGGLE_ON_CLICK = true;

    /**
     * The flags to pass to {@link SystemUiHider#getInstance}.
     */
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        final Button button = (Button) findViewById(R.id.dummy_button);
        final TextView text1 = (TextView) findViewById(R.id.textView);
        final TextView text2 = (TextView) findViewById(R.id.textView2);
        final TextView text3 = (TextView) findViewById(R.id.textView4);
        final TextView text4 = (TextView) findViewById(R.id.textView5);
        final TextView text5 = (TextView) findViewById(R.id.textView6);

        hidden = new Stack();
        hidden.add(text1);
        hidden.add(text2);
        hidden.add(text3);
        hidden.add(text4);
        hidden.add(text5);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (hidden.size() >= 1) {
                    TextView test = (TextView) hidden.get(0);
                    test.setVisibility(View.VISIBLE);
                    hidden.remove(0);
                }
            }
        });

    }


}

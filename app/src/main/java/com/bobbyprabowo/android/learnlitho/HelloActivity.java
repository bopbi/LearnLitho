package com.bobbyprabowo.android.learnlitho;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;

/**
 * Created by bobbyadiprabowo on 11/05/17.
 */

public class HelloActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext c = new ComponentContext(this);

        final LithoView lithoView = LithoView.create(
                this /* context */,
                Text.create(c)
                        .text("Hello, World!")
                        .textSizeDip(50)
                        .build());

        setContentView(lithoView);
    }
}

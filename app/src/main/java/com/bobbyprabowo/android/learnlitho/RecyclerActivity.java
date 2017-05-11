package com.bobbyprabowo.android.learnlitho;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.OrientationHelper;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.Recycler;
import com.facebook.litho.widget.RecyclerBinder;

/**
 * Created by bobbyadiprabowo on 11/05/17.
 */

public class RecyclerActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext context = new ComponentContext(this);

        final RecyclerBinder recyclerBinder = new RecyclerBinder(
                context,
                new LinearLayoutInfo(this, OrientationHelper.VERTICAL, false));

        final Component component = Recycler.create(context)
                .binder(recyclerBinder)
                .build();

        addContent(recyclerBinder, context);

        setContentView(LithoView.create(context, component));
    }

    private void addContent(
            RecyclerBinder recyclerBinder,
            ComponentContext context) {
        for (int i = 0; i < 32; i++) {
            ComponentInfo.Builder componentInfoBuilder = ComponentInfo.create();
            componentInfoBuilder.component(
                    ListItem.create(context)
                            .color(i % 2 == 0 ? Color.WHITE : Color.LTGRAY)
                            .sender(i % 4 == 0)
                            .title("Hello, world!")
                            .subtitle("Litho tutorial")
                            .build());
            recyclerBinder.insertItemAt(i, componentInfoBuilder.build());
        }
    }

}

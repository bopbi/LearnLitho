package com.bobbyprabowo.android.learnlitho;

import android.graphics.Color;

import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaAlign;

import static com.facebook.yoga.YogaEdge.ALL;

/**
 * Created by bobbyadiprabowo on 11/05/17.
 */

@LayoutSpec
public class ListItemSpec {

    @OnCreateLayout
    static ComponentLayout onCreateLayout(
            ComponentContext c,
            @Prop boolean sender,
            @Prop int color,
            @Prop String title,
            @Prop String subtitle) {
        if (sender) {
            return Column.create(c)
                    .paddingDip(ALL, 16)
                    .alignItems(YogaAlign.FLEX_START)
                    .backgroundColor(color)
                    .child(
                            Text.create(c)
                                    .text(title)
                                    .textSizeSp(40))
                    .child(
                            Text.create(c)
                                    .text(subtitle)
                                    .textSizeSp(20))
                    .build();
        }
        return Column.create(c)
                .paddingDip(ALL, 16)
                .alignItems(YogaAlign.FLEX_END)
                .backgroundColor(color)
                .child(
                        Text.create(c)
                                .text(title)
                                .textSizeSp(40))
                .child(
                        Text.create(c)
                                .text(subtitle)
                                .textSizeSp(20))
                .build();
    }
}

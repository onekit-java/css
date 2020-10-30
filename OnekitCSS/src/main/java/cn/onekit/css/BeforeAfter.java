package cn.onekit.css;

import android.content.Context;

import androidx.appcompat.widget.AppCompatTextView;

import cn.onekit.core.BeforeAfter_;
import cn.onekit.css.core.CssLayoutParams;

public   class BeforeAfter extends AppCompatTextView implements BeforeAfter_ {
    public BeforeAfter(Context context) {
        super(context);
    }

    public void run() {
        CssLayoutParams layoutParams = (CssLayoutParams) this.getLayoutParams();
        String content = layoutParams.computedStyle.content;
        content = content.substring(1, content.length() - 1);
        this.setText(content);
    }
}
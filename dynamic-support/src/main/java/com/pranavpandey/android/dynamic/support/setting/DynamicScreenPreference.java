/*
 * Copyright 2018 Pranav Pandey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pranavpandey.android.dynamic.support.setting;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.pranavpandey.android.dynamic.support.theme.DynamicColorType;
import com.pranavpandey.android.dynamic.support.widget.DynamicTextView;

/**
 * A DynamicSimplePreference to provide the functionality of a
 * {@link android.preference.PreferenceScreen} with a icon, title,
 * summary, description, value and an action button. It can be
 * extended to modify according to the need.
 */
public class DynamicScreenPreference extends DynamicSimplePreference {

    public DynamicScreenPreference(@NonNull Context context) {
        super(context);
    }

    public DynamicScreenPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DynamicScreenPreference(@NonNull Context context,
                                   @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onInflate() {
        super.onInflate();

        ((DynamicTextView) getValueView()).setColorType(DynamicColorType.ACCENT);
    }
}

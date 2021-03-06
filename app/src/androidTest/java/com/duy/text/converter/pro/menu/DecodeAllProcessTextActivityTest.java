/*
 * Copyright (c) 2018 by Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.text.converter.pro.menu;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import com.duy.text.converter.R;
import com.duy.text.converter.core.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.duy.text.converter.pro.CodecAllFragmentTest.hasData;


/**
 * Created by Duy on 2/18/2018.
 */
public class DecodeAllProcessTextActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void decode() {
        Intent intent = new Intent(mRule.getActivity(), DecodeAllProcessTextActivity.class);
        intent.putExtra(Intent.EXTRA_PROCESS_TEXT, "Hello android");
        mRule.getActivity().startActivity(intent);

        onView(withId(R.id.recycler_view))
                .check(matches(isDisplayed()))
                .check(matches(hasData()));
    }
}
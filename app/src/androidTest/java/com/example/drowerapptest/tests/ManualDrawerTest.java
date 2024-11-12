package com.example.drowerapptest.tests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.drowerapptest.MainActivity;
import com.example.drowerapptest.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ManualDrawerTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void menuBtnTest() {

        onView(withContentDescription("Abrir panel lateral de navegación")).perform(ViewActions.click());
        onView((ViewMatchers.withId(R.id.nav_home))).check(matches(isDisplayed()));

        onView(withId(R.id.nav_gallery)).perform(ViewActions.click());
        onView(withId(R.id.text_gallery)).check(matches(isDisplayed()));

        onView(withContentDescription("Abrir panel lateral de navegación")).perform(ViewActions.click());
        onView(withId(R.id.nav_slideshow)).perform(ViewActions.click());
        onView(withId(R.id.text_slideshow)).check(matches(isDisplayed()));

        onView(withContentDescription("Abrir panel lateral de navegación")).perform(ViewActions.click());
        onView(withId(R.id.nav_home)).perform(ViewActions.click());
        onView(withId(R.id.text_home)).check(matches(isDisplayed()));
        
    }
}

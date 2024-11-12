package com.example.drowerapptest.pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

import com.example.drowerapptest.R;

public class SlideShowScreen {
    public void tapOnSlideShow(){
        onView(withContentDescription("Abrir panel lateral de navegación")).perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.nav_slideshow)).perform(ViewActions.click());
        onView(withId(R.id.text_slideshow)).check(matches(isDisplayed()));
    }
}
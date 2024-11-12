package com.example.drowerapptest.pages;


import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.drowerapptest.MainActivity;

import org.junit.Rule;


public class BaseTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

}

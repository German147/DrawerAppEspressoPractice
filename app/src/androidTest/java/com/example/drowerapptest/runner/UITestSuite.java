package com.example.drowerapptest.runner;

import com.example.drowerapptest.tests.DrawerTests;
import com.example.drowerapptest.tests.GalleryButtonTest;
import com.example.drowerapptest.tests.HomeButtonTest;
import com.example.drowerapptest.tests.ManualDrawerTest;
import com.example.drowerapptest.tests.SlideShowButtonTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ManualDrawerTest.class,
        DrawerTests.class,
        HomeButtonTest.class,
        GalleryButtonTest.class,
        SlideShowButtonTest.class})
public class UITestSuite {
}

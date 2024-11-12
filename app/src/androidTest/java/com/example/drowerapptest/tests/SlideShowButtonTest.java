package com.example.drowerapptest.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.drowerapptest.pages.BaseTest;
import com.example.drowerapptest.pages.SlideShowScreen;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SlideShowButtonTest extends BaseTest {

    SlideShowScreen slideShowScreen = new SlideShowScreen();

    @Test
    public void tapOnSlidesShowBtn(){
        slideShowScreen.tapOnSlideShow();
    }
}

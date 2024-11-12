package com.example.drowerapptest.tests;

import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.drowerapptest.pages.BaseTest;
import com.example.drowerapptest.pages.GalleryScreen;
import com.example.drowerapptest.pages.HomeScreen;
import com.example.drowerapptest.pages.SlideShowScreen;
import com.example.drowerapptest.utils.SmokeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DrawerTests extends BaseTest {
    HomeScreen homeScreen = new HomeScreen();
    GalleryScreen galleryScreen = new GalleryScreen();
    SlideShowScreen slideShowScreen = new SlideShowScreen();

    @Test
    @SmokeTest
    public void burgerButtonTest(){
        homeScreen.tapMenuOption();
        galleryScreen.tapAndAssertGalleryScreen();
        slideShowScreen.tapOnSlideShow();
    }

    @Test
    public void tapHomeBtnTest() {
    homeScreen.tapMenuOption();
    }

    @Test
    public void tapGalleryBtnTest(){
        galleryScreen.tapAndAssertGalleryScreen();
    }

    @Test
    public void tapSlideShowBtnTest(){
        slideShowScreen.tapOnSlideShow();
    }

}

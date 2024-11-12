package com.example.drowerapptest.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.drowerapptest.pages.BaseTest;
import com.example.drowerapptest.pages.HomeScreen;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HomeButtonTest extends BaseTest {
    HomeScreen homeScreen = new HomeScreen();

    @Test
    public void tapHomeBtnTest(){
        homeScreen.tapMenuOption();
    }
}

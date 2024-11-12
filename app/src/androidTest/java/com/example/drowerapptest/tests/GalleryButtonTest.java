package com.example.drowerapptest.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.drowerapptest.pages.BaseTest;
import com.example.drowerapptest.pages.GalleryScreen;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GalleryButtonTest extends BaseTest {

    GalleryScreen galleryScreen = new GalleryScreen();

    @Test
    public void tapGalleryBtnTest(){
        galleryScreen.tapAndAssertGalleryScreen();
    }
}

package com.knoldus.springsecurityjpa.unit;

import com.knoldus.springsecurityjpa.HomeResource;
import org.junit.Assert;
import org.junit.Test;

public class HomeResourceTest {

    @Test
    public void getHomeTest() {
        HomeResource homeResource = new HomeResource();
        String result = homeResource.home();
        Assert.assertEquals(result, "<h1>Welcome</h1>");
    }

    @Test
    public void getUserTest() {
        HomeResource homeResource = new HomeResource();
        String result = homeResource.user();
        Assert.assertEquals(result, "<h1>Welcome User</h1>");
    }

    @Test
    public void getAdminTest() {
        HomeResource homeResource = new HomeResource();
        String result = homeResource.admin();
        Assert.assertEquals(result, "<h1>Welcome Admin</h1>");
    }
}

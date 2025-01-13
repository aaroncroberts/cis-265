package org.csu.test.services;

import org.junit.Assert;
import org.junit.Test;
import org.csu.services.WorldService;

public class WorldServiceTests {
    
    private WorldService CreateWorld() {
        return new WorldService();
    }
    
    @Test
    public void Can_CreateTheWorld() {
        // Call our service and get a message
        WorldService service = this.CreateWorld();
        Assert.assertNotNull(service);
    }
    
    @Test
    public void Can_SayHello() {
        WorldService service = this.CreateWorld();
        String actual = service.Hello("World");
        String expected = "Hello, World!";

        // 
        // Check the response
        Assert.assertEquals(expected, actual);
    }
}

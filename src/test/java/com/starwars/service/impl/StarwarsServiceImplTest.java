package com.starwars.service.impl;


import com.starwars.helper.Helper;
import com.starwars.helper.RequestValidator;
import com.starwars.planet.messages.StarwarsResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.ws.rs.core.Response;

@RunWith(MockitoJUnitRunner.class)
public class StarwarsServiceImplTest {

    @InjectMocks
    private StarwarsServiceImpl starwarsService;

    @Mock
    private RequestValidator validator;
    @Mock
    private Helper helper;


    @Test
    public void testGetValue(){
        StarwarsResponse response= new StarwarsResponse("test", 12,"test", null);
        Mockito.when(validator.validate(Mockito.anyString(),Mockito.anyString())).thenReturn(null);
        Mockito.when(helper.getAllSWAPIResponseByTypeName("test","test")).thenReturn(response);
        Response actualResponse = starwarsService.getValue("test","test");
        Assert.assertEquals(200, actualResponse.getStatus());

    }
}

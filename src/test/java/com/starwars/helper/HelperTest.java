package com.starwars.helper;

import com.starwars.planet.messages.Result;
import com.starwars.planet.messages.SwapiResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class HelperTest {

        @InjectMocks
        private Helper helper;

        @Mock
        private Helper helper2;

        @Mock
        private RestTemplate restTemplate;


        @Test
        public void testGetAllSWAPIResponseByTypeAndName(){
            ArrayList<Result> results = new ArrayList<>();
            results.add(new Result("ABCD", null));
            results.add(new Result("XYZ", null));
            SwapiResponse response = new SwapiResponse(2,null,results);
        }


    }

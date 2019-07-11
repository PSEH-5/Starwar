package com.starwars.helper;


import com.starwars.planet.messages.Result;
import com.starwars.planet.messages.StarwarsResponse;
import com.starwars.planet.messages.SwapiResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


@Component
public class Helper {

    public static final String BASE_URL = "https://swapi.co/api/";

    public SwapiResponse getAllSWAPIResponseByType(String type) throws RestClientException {

        RestTemplate restTemplate = new RestTemplate();

        SwapiResponse swapiResponse = restTemplate.getForObject(BASE_URL + type, SwapiResponse.class);
        int count = swapiResponse.getCount();
        String next = swapiResponse.getNext();
        for (int i = 1; i < (count - 1) / 10; i++) {
            SwapiResponse swapiResponseTmp = restTemplate.getForObject(next, SwapiResponse.class);
            next = swapiResponseTmp.getNext();
            swapiResponse.getResults().addAll(swapiResponseTmp.getResults());
        }

        return swapiResponse;

    }


    public StarwarsResponse getAllSWAPIResponseByTypeName(String type, String name) throws RestClientException{
        SwapiResponse swapiResponse = getAllSWAPIResponseByType(type);
        StarwarsResponse response = null;
        for (Result result : swapiResponse.getResults()){
            if(name.equals(result.getName())){
                response = new StarwarsResponse(type,swapiResponse.getCount(),name,result.getFilms());
                break;
            }
        }
        return response;
    }

}

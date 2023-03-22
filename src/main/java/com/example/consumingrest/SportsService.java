package com.example.consumingrest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SportsService {
    RestTemplate restTemplate = new RestTemplate();
    public SportsQuote[] getSportsQuote(){
        SportsQuote[] sportsQuotes = restTemplate.getForObject(
                "https://analisi.transparenciacatalunya.cat/resource/nw5s-4ixa.json", SportsQuote[].class);
        return sportsQuotes;
    }
}
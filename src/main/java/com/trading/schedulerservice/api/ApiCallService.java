package com.trading.schedulerservice.api;

import com.trading.schedulerservice.config.ApiConfig;
import com.trading.schedulerservice.pojo.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

import static org.hibernate.id.SequenceGenerator.PARAMETERS;


@Service
@Slf4j
@RequiredArgsConstructor
public class ApiCallService {

    private final RestTemplate yahooRestTemplate;
    private final ApiConfig apiConfig;

    public ApiResponse call() {
        UriComponentsBuilder uriComponentsBuilder =
                //http://test.lisuns.com:4531/GetHistory/?accessKey=c0140bb8-018c-444c-a1d9-0ee86d1dd536&exchange=NSE_IDX&instrumentIdentifier=NIFTY%20BANK&periodicity=Minute&period=1&max=1
                UriComponentsBuilder.fromUriString("http://test.lisuns.com:4531/GetHistory/")
                .queryParam("accessKey", "c0140bb8-018c-444c-a1d9-0ee86d1dd536")
                        .queryParam("exchange", "NSE_IDX")
                        .queryParam("instrumentIdentifier", "NIFTY BANK")
                        .queryParam("periodicity", "Minute")
                        .queryParam("period", "1")
                        .queryParam("max", "1");

       ResponseEntity<ApiResponse> responseEntity = yahooRestTemplate.exchange(uriComponentsBuilder.toUriString(), HttpMethod.GET, createEntity(), new ParameterizedTypeReference<>(){});
       log.info("The response is {}", responseEntity.getBody());
       return responseEntity.getBody();
    }

    private HttpEntity<String> createEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType( MediaType.APPLICATION_JSON );
        headers.setAccept( Arrays.asList( MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN) );
        return new HttpEntity<>( PARAMETERS, headers );
    }
}

package com.example.Contoller;

import com.example.DTO.ApiDto;
import com.example.Service.ApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ApiController {

    private final ApiService apiService;

    @GetMapping("/")
    public ResponseEntity<String> apiTest(@RequestBody String test) {

        log.info("값이 잘 찍히나?" + test);

        return ResponseEntity.ok().body("정상 작동합니다.");
    }

    @PostMapping("/apiPost")
    public ResponseEntity<String> apiPost(@RequestBody ApiDto apiDto) {

        log.info("값이 전달");
        int res = apiService.ApiPost(apiDto);
        log.info("값이 전달되냐?");

        if (res == 1) {
            return ResponseEntity.status(HttpStatus.OK).body("값이 잘 들어왔어");
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body("값이 잘 안들어왔어");
    }

    




    /*
    api의 기본 원칙

    POST -> CREATE
    GET -> READ
    PUT -> UPDATE
    DELETE -> DELETE
     */
}

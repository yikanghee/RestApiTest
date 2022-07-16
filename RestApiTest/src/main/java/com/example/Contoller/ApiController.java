package com.example.Contoller;

import com.example.DTO.LuckyDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ApiController {

    LuckyDto luckyDto;

    @GetMapping("lucky")
    public String test() {

        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            lotto[i] = num;
        }

        for (int j = 0; j < 6; j++) {
            int num = lotto[j];
            log.info(String.valueOf(num));
        }

//        luckyDto.setOne(lotto[0]);
//        luckyDto.setTwo(lotto[1]);
//        luckyDto.setThree(lotto[2]);
//        luckyDto.setFour(lotto[3]);
//        luckyDto.setFive(lotto[4]);
//        luckyDto.setSix(lotto[5]);

        return "성공";
    }

    /*
    api의 기본 원칙

    POST -> CREATE
    GET -> READ
    PUT -> UPDATE
    DELETE -> DELETE
     */
}

//package com.example.Service.ServiceImpl;
//
//import com.example.DTO.LuckyDto;
//import com.example.Service.LuckyService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//@Service
//@Slf4j
//public class LuckyServiceImpl implements LuckyService {
//
//
//    @Override
//    public int lucky(LuckyDto luckyDto) {
//
//        int lotto[] = new int[6];
//
//        for (int i = 0; i < 6; i++) {
//            int num = (int)(Math.random() * 45) + 1;
//            lotto[i] = num;
//        }
//
//        luckyDto.setOne(lotto[0]);
//        luckyDto.setTwo(lotto[1]);
//        luckyDto.setThree(lotto[2]);
//        luckyDto.setFour(lotto[3]);
//        luckyDto.setFive(lotto[4]);
//        luckyDto.setSix(lotto[5]);
//
//
//        return 0;
//    }
//}

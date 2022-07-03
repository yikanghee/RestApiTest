package com.example.Service.ServiceImpl;

import com.example.DTO.ApiDto;
import com.example.Service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ApiServiceImpl implements ApiService {

    @Override
    public int ApiPost(ApiDto apiDto) {

        if (apiDto.getName() == null) {
            return 0;
        }

        log.info(apiDto.getName());
        log.info(apiDto.getPassword());

        return 1;
    }

}

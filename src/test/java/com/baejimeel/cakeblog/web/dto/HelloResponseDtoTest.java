package com.baejimeel.cakeblog.web.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
    String name = "test";
    int amount = 1000;

    HelloResponseDto dto = new HelloResponseDto(name, amount);

    Assertions.assertEquals(name,dto.getName());
    Assertions.assertEquals(dto.getAmount(),amount);
    }

}
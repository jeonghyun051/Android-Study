package com.example.myapplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private Integer id;
    private String title;
    private Integer pic;
    // 10개 - (1) 테이블이랑 똑같이 만든다.

}

package com.example.hamberger;

import lombok.Getter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
public class Response {

    private Long id;      // PK
    private String title; // 제목
    private String status;// 내용
    private int max_members;// 작성자
    private int current_members;// 조회 수
    private Date recruitment_start_date;// 공지글 여부
    private Date recruitment_end_date;   // 삭제 여부
    private Timestamp created_at;    // 생성일시
    private Timestamp updated_at;     // 최종 수정일시

}
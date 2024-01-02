package com.example.hamberger;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudyCollect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(nullable = false, length = 200)// PK
    private String title;
    @Column(nullable = false, length = 200)// 제목
    private String status;
    @Column(nullable = false, length = 200)//  상태
    private int max_members;
    @Column(nullable = false, length = 200)// 작성자
    private int current_members;
    @Column(nullable = false, length = 200)// 작성자
    private Date recruitment_start_date;
    @Column(nullable = false, length = 200)// 작성자
    private Date recruitment_end_date;
    @Column(nullable = false, length = 200)// 작성자
    private Timestamp created_at;
    @Column(nullable = false, length = 200)// 공지글 여부
    private Timestamp updated_at;    // 공지글 여부

}

package com.example.study01.dto;
import com.example.study01.entity.MakeEntity;
import com.example.study01.entity.MediaInfo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@Log4j2
@ToString
@Valid
public class MakeDTO {

    private Long sid;

    @NotBlank(message = "스터디명은 필수 입력 값입니다.")
    @Size(min = 3, max = 100)
    private String studyName;

    @NotBlank(message = "번호는 필수 입력 값입니다.")
    private String phoneNumber;

    @NotBlank(message = "이메일은 필수 입력 값입니다.")
    private String email;


    private String post;


    private String persons;

    @NotBlank(message = "진행방식은 필수 입력 값입니다.")
    private String progressMethod;

    private String closeDate;




}

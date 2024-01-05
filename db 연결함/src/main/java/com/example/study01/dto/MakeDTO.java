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
public class MakeDTO {

    private Long sid;


    @Size(min = 3, max = 100)
    private String studyName;
    @NotEmpty
    private String phoneNumber;
    @NotEmpty
    private String email;

    private String intro;

    private String post;

    @NotEmpty
    private String persons;

    private String progressMethod;

    private String closeDate;




}

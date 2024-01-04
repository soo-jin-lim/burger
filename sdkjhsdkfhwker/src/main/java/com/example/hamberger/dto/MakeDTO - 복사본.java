package com.example.hamberger.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MakeDTO {

    private Long sid;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String studyName;

    @NotEmpty
    private String phoneNumber;
    @NotEmpty
    private String email;
    @NotEmpty
    private String post;
    @NotEmpty
    private String persons;

    @NotEmpty
    private String progressMethod;

    private String closeDate;


}

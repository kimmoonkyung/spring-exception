package com.example.exception.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
public class User {

    @NotEmpty
    @Size(min = 2, max = 10)
    private String name;

    @Min(1)
    @NotNull
    private Integer age;

}

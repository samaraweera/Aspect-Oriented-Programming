package com.commonexception.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class BaseResponse {
    private String executionCode;
    private String executionDesc;
}

package com.redofmaple.common.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ApiResult<T> implements Serializable {

    private T data;
    private List<ApiError> error;

}

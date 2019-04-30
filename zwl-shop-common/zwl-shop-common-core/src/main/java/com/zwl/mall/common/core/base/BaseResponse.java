package com.zwl.mall.common.core.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 二师兄
 * @Title: BaseResponse
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/309:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {
    private Integer code;
    private String msg;
    private T data;

}

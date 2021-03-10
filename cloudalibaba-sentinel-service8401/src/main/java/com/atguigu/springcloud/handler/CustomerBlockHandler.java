package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.dto.CommonResult;

/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author hike97
 * @Date 2021/3/5 17:12
 * @Version 1.0
 **/
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler version2");
    }
}

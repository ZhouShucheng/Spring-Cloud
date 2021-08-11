package com.zhoushucheng.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhoushucheng.springcloud.entities.CommonResult;

public class CustomerBlockHandler
{
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2021,"自定义的限流处理信息......CustomerBlockHandler");
    }
}

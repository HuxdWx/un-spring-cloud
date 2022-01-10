package org.huxd.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.huxd.domain.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.huxd.service.OrderService;
import org.huxd.vo.Result;

import javax.annotation.Resource;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 16:21
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/list")
    public Result<?> queryPageList(){
        Page<Order> page = new Page<Order>(1, 10);
        IPage<Order> pageList = orderService.page(page);
        return Result.OK(pageList);
    }
}

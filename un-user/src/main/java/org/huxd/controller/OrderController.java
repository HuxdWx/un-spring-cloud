package org.huxd.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.huxd.domain.Product;
import org.huxd.service.ProductService;
import org.huxd.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 16:21
 */
@RestController
@RequestMapping("/user")
public class OrderController {

    @Resource
    private ProductService productService;

    @GetMapping(value = "/list")
    public Result<?> queryPageList(){
        Page<Product> page = new Page<Product>(1, 10);
        IPage<Product> pageList = productService.page(page);
        return Result.OK(pageList);
    }
}

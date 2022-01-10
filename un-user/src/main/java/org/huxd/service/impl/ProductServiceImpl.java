package org.huxd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.huxd.domain.Product;
import org.huxd.mapper.ProductMapper;
import org.huxd.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/10 14:01
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}

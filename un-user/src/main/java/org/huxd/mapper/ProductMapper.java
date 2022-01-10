package org.huxd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.huxd.domain.Product;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}

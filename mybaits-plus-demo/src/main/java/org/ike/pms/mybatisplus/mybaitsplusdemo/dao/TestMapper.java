package org.ike.pms.mybatisplus.mybaitsplusdemo.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.ike.pms.mybatisplus.mybaitsplusdemo.config.mapper.WithTableMapper;
import org.ike.pms.mybatisplus.mybaitsplusdemo.config.provider.SqlProviderGenerator;
import org.ike.pms.mybatisplus.mybaitsplusdemo.entity.TUser;
import org.ike.pms.mybatisplus.mybaitsplusdemo.provider.UserProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface TestMapper extends WithTableMapper<TUser> {

    @SelectProvider(type = UserProvider.class, method = "selectProvider")
    Map test(QueryWrapper<TUser> wrapper);

    /**
     * 测试模板sql
     */
//    List<TUser> listWithTable(@Param("table")String table);
//
//    List<TUser> listWithTable(@Param("table") String table, @Param(Constants.WRAPPER) QueryWrapper<TUser> queryWrapper);
//
//    int saveWithTable(@Param("table")String table,@Param("obj") TUser tUser);
//
//    int saveBatchWithTable(@Param("table")String table,@Param("list") Collection<TUser> list);
//
//    int removeByIdWithTable(@Param("table")String table, @Param("id")Serializable id);
//
//    int removeByIdsWithTable(@Param("table")String table,@Param("list")Collection<? extends Serializable> list);
//
//    int removeWithTable(@Param("table")String table, @Param(Constants.WRAPPER) QueryWrapper<TUser> queryWrapper);
//
//    int updateWithTable(@Param("table")String table, @Param("obj")TUser tUser);
//
//    int updateWithTable(@Param("table")String table, @Param("obj")TUser tUser, @Param(Constants.WRAPPER) UpdateWrapper<TUser> updateWrapper);
//
//    int updateBatchByIdWithTable(@Param("table")String table, @Param("list")Collection<TUser> list);
//
//    int saveOrUpdateWithTable(@Param("table")String table, @Param("obj")TUser tUser);
//
//    int saveOrUpdateBatchWithTable(@Param("table")String table, @Param("list")Collection<TUser> list);
    Page<Map> listWithTable(Page<Map> page, @Param("table") String table);

    int updateWrapper(@Param("table") String table, @Param(Constants.WRAPPER) UpdateWrapper<TUser> updateWrapper);

    @SelectProvider(type = UserProvider.class, method = "testWrapper")
    List<TUser> testWrapper(Page page, @Param("table") String table, @Param("ew") QueryWrapper<TUser> wrapper);

    @SelectProvider(type = SqlProviderGenerator.class, method = "list")
    List<Map> ikeList(@Param("table") String table, @Param("ew") Wrapper<TUser> wrapper);

    List<TUser> wtList(@Param(Constants.WRAPPER) Wrapper<TUser> queryWrapper);

}

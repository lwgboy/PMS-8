package org.ike.pms.mybatisplus.mybaitsplusdemo.config.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.mapper.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface WithTableMapper<T> extends BaseMapper<T> {

    Integer deleteAll();

    T getByIdWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.ID) Serializable id);

    T getOneWithTable(@Param(WTConstants.TABLE) String table);

    T getOneWithTable(@Param(WTConstants.TABLE) String table, @Param(WTConstants.WRAPPER) Wrapper<T> queryWrapper);

    List<T> wtList();

    List<T> listWithTable(@Param(WTConstants.TABLE)String table);

    List<T> listWithTable(@Param(WTConstants.TABLE) String table, @Param(WTConstants.WRAPPER) Wrapper<T> queryWrapper);

    int countWithTable(@Param(WTConstants.TABLE) String table);

    int countWithTable(@Param(WTConstants.TABLE) String table, @Param(WTConstants.WRAPPER) Wrapper<T> queryWrapper);

    int saveWithTable(@Param(WTConstants.TABLE)String table,@Param(WTConstants.OBJ) T entity);

    int saveBatchWithTable(@Param(WTConstants.TABLE)String table,@Param(WTConstants.COLLECTION) Collection<T> list);

    int removeByIdWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.ID) Serializable id);

    int removeByIdsWithTable(@Param(WTConstants.TABLE)String table,@Param(WTConstants.COLLECTION)Collection<? extends Serializable> list);

    int removeWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.WRAPPER) Wrapper<T> queryWrapper);

    int removeWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.OBJ) T entity);

    int updateWithTable(@Param(WTConstants.TABLE) String table, @Param(WTConstants.OBJ) T entity);


    int updateWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.OBJ)T entity, @Param(WTConstants.WRAPPER) Wrapper<T> updateWrapper);

    int updateBatchByIdWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.COLLECTION)Collection<T> list);

    int saveOrUpdateWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.OBJ)T entity);

    int saveOrUpdateBatchWithTable(@Param(WTConstants.TABLE)String table, @Param(WTConstants.COLLECTION)Collection<T> list);


}

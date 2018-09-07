package com.ibs.clearing.org.common;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import com.github.pagehelper.PageInfo;
import com.ibs.clearing.org.utils.PageBean;

public interface IBaseDao<T> extends Serializable {

    public int insert(T param);

    public int insertSelective(T param);

    public int updateByPrimaryKey(T param);

    public int updateByPrimaryKeySelective(T param);
    
    public T selectByPrimaryKey(Serializable id);
    
    public int deleteByPrimaryKey(Serializable id);
    
    public PageInfo<T> pageFind(String statementKey, PageBean pageBean, Object parameter,
			Boolean isSimplePage) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;
}

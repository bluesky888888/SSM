package com.ibs.clearing.org.common;

import java.lang.reflect.InvocationTargetException;

import com.github.pagehelper.PageInfo;
import com.ibs.clearing.org.utils.PageBean;

public interface BaseService<T,Serializable>{
	
    public int insert(T param);

    public int insertSelective(T param);

    public int updateByPrimaryKey(T param);

    public int updateByPrimaryKeySelective(T param);
    
    public T selectByPrimaryKey(Integer id);
    
    public int deleteByPrimaryKey(Integer id);
    
    public PageInfo<T> pageFind(String statementKey, PageBean pageBean, Object parameter,
			Boolean isSimplePage) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;
}
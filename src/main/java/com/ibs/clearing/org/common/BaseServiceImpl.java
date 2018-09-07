package com.ibs.clearing.org.common;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.ibs.clearing.org.utils.PageBean;

@Service
public abstract class BaseServiceImpl<T> implements BaseService<T, Serializable>{
	
//	@Autowired
//	private BaseDao<T, Serializable> baseDao;
//
//	public BaseDao<T, Serializable> getBaseDao() {
//		return baseDao;
//	}
//
//	public void setBaseDao(BaseDao<T, Serializable> baseDao) {
//		this.baseDao = baseDao;
//	}
//	
//	@Transactional
//	public int insert(T entity) {
//		return baseDao.insert(entity);
//	}
//
//	@Transactional
//	public int insertSelective(T record) {
//		return baseDao.insertSelective(record);
//	}
//
//	@Transactional
//	public T selectByPrimaryKey(Integer id) {
//		return baseDao.selectByPrimaryKey(id);
//	}
//
//	@Transactional
//	public int updateByPrimaryKey(T record) {
//		return baseDao.updateByPrimaryKey(record);
//	}
//
//	@Transactional
//	public int updateByPrimaryKeySelective(T record) {
//		return baseDao.updateByPrimaryKeySelective(record);
//	}
//
//	@Transactional
//	public int deleteByPrimaryKey(Integer id) {
//		return baseDao.deleteByPrimaryKey(id);
//	}
//	
//	public PageInfo<T> pageFind(String statementKey, PageBean pageBean, Object parameter,
//			Boolean isSimplePage) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
//		return baseDao.pageFind(statementKey, pageBean, parameter, isSimplePage);
//	}	
	
	
	
	@Autowired
	private IBaseDao<T> iBaseDao;

	public IBaseDao<T> getIBaseDao() {
		return iBaseDao;
	}

	public void setIBaseDao(IBaseDao<T> iBaseDao) {
		this.iBaseDao = iBaseDao;
	}

	@Transactional
	public int insert(T entity) {
		return iBaseDao.insert(entity);
	}

	@Transactional
	public int insertSelective(T record) {
		return iBaseDao.insertSelective(record);
	}

	@Transactional
	public T selectByPrimaryKey(Integer id) {
		return iBaseDao.selectByPrimaryKey(id);
	}

	@Transactional
	public int updateByPrimaryKey(T record) {
		return iBaseDao.updateByPrimaryKey(record);
	}

	@Transactional
	public int updateByPrimaryKeySelective(T record) {
		return iBaseDao.updateByPrimaryKeySelective(record);
	}

	@Transactional
	public int deleteByPrimaryKey(Integer id) {
		return iBaseDao.deleteByPrimaryKey(id);
	}
	
	public PageInfo<T> pageFind(String statementKey, PageBean pageBean, Object parameter,
			Boolean isSimplePage) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		return iBaseDao.pageFind(statementKey, pageBean, parameter, isSimplePage);
	}	
}






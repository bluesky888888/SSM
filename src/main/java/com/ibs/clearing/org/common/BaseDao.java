package com.ibs.clearing.org.common;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ibs.clearing.org.utils.GenericsUtils;
import com.ibs.clearing.org.utils.PageBean;

@Repository("baseDao")
public abstract class BaseDao<T,ID> extends SqlSessionDaoSupport implements IBaseDao<T>{

	private static final long serialVersionUID = 7963228702877200050L;
	
	private final String POSTFIX= "Dao";
	
	private final String _INSERT = ".insert";
	
	private final String _INSERTSELECTIVE = ".insertSelective";
	
	private final String _SELECTBYPRIMARYKEY = ".selectByPrimaryKey";
	
	private final String _UPDATEBYPRIMARYKEY = ".updateByPrimaryKey";
	
	private final String _UPDATEBYPRIMARYKEYSELECTIVE = ".updateByPrimaryKeySelective";
	
	private final String _DELETEBYPRIMARYKEY = ".deleteByPrimaryKey";
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public String getNameSpace() {
		@SuppressWarnings("unchecked")
		Class<T> clazz = GenericsUtils.getSuperClassGenricType(this.getClass());
		String simpleName = clazz.getSimpleName() + POSTFIX;
		return simpleName;
	}	
	
	public int insert(T entity) {
		return this.getSqlSession().insert(this.getNameSpace() + _INSERT, entity);
	}
	
	public int insertSelective(T entity) {
		return this.getSqlSession().insert(this.getNameSpace() + _INSERTSELECTIVE, entity);
	}
	
	public T selectByPrimaryKey(ID id) {
		return this.getSqlSession().selectOne(this.getNameSpace() + _SELECTBYPRIMARYKEY, id);
	}
	
	public int updateByPrimaryKey(T record) {
		return this.getSqlSession().update(this.getNameSpace() + _UPDATEBYPRIMARYKEY, record);
	}
	
	public int updateByPrimaryKeySelective(T record) {
		return this.getSqlSession().update(this.getNameSpace() + _UPDATEBYPRIMARYKEYSELECTIVE, record);
	}
	
	public int deleteByPrimaryKey(ID id) {
		return this.getSqlSession().delete(this.getNameSpace() + _DELETEBYPRIMARYKEY, id);
	}	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PageInfo<T> pageFind(String statementKey, PageBean pageBean, Object parameter,
			Boolean isSimplePage) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Map params = new HashMap();
		if (parameter != null) {
			if (parameter instanceof Map) {
				params.putAll((Map) parameter);
			} else {
				Map parameterObject = PropertyUtils.describe(parameter);
				params.putAll(parameterObject);
			}
		}
		PageHelper.startPage(pageBean.getCurrentPage(), pageBean.getPageSize());
		List<T> list = getSqlSession().selectList(statementKey, params);
		PageInfo<T> pageInfo = new PageInfo(list);
 
		return pageInfo;
	}
}

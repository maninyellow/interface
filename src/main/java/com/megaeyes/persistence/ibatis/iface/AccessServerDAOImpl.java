package com.megaeyes.persistence.ibatis.iface;

import com.megaeyes.persistence.ibatis.model.AccessServer;
import com.megaeyes.persistence.ibatis.model.AccessServerExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


public class AccessServerDAOImpl extends SqlMapClientDaoSupport implements AccessServerDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public AccessServerDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public void insert(AccessServer record) {
		getSqlMapClientTemplate().insert(
				"ACCESS_SERVER.abatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public int updateByPrimaryKey(AccessServer record) {
		int rows = getSqlMapClientTemplate()
				.update("ACCESS_SERVER.abatorgenerated_updateByPrimaryKey",
						record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public int updateByPrimaryKeySelective(AccessServer record) {
		int rows = getSqlMapClientTemplate()
				.update("ACCESS_SERVER.abatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public List selectByExample(AccessServerExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"ACCESS_SERVER.abatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public AccessServer selectByPrimaryKey(String id) {
		AccessServer key = new AccessServer();
		key.setId(id);
		AccessServer record = (AccessServer) getSqlMapClientTemplate()
				.queryForObject(
						"ACCESS_SERVER.abatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public int deleteByExample(AccessServerExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"ACCESS_SERVER.abatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public int deleteByPrimaryKey(String id) {
		AccessServer key = new AccessServer();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"ACCESS_SERVER.abatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public int countByExample(AccessServerExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"ACCESS_SERVER.abatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public int updateByExampleSelective(AccessServer record,
			AccessServerExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"ACCESS_SERVER.abatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	public int updateByExample(AccessServer record, AccessServerExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"ACCESS_SERVER.abatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table DL25.ACCESS_SERVER
	 * @abatorgenerated  Mon Jan 21 16:25:21 CST 2013
	 */
	private static class UpdateByExampleParms extends AccessServerExample {
		private Object record;

		public UpdateByExampleParms(Object record, AccessServerExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}
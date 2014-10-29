/**
 * 
 */
package com.acom.dfile.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.acom.dfile.dao.FileDAO;
import com.acom.dfile.model.FileBean;

/**
 * @author hungdt
 * 
 */
public class FileDAOImpl implements FileDAO {

	private Logger logger = Logger.getLogger(FileDAOImpl.class);

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<FileBean> findByFileAlias(String alias) {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<FileBean> lst = new ArrayList<FileBean>();

		try {
			String sql = "select f.*, m.alias_ from filedownload f inner join merchantEntry m "
					+ "	on f.merchantId = m.merchantId "
					+ "where f.filename = ? and f.status = 0";
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, alias);
			rs = stmt.executeQuery();
			FileBean bean = null;
			while (rs.next()) {
				bean = new FileBean();
				bean.setCreateDate(rs.getTimestamp("CREATEDATE"));
				bean.setFiledesc(rs.getString("FILEDESC"));
				bean.setFilelengh(rs.getLong("LENGTH"));
				bean.setFilename(rs.getString("FILENAME"));
				bean.setFilepath(rs.getString("FILEPATH"));
				bean.setId(rs.getLong("ID"));
				bean.setMerchantId(rs.getLong("merchantId"));
				bean.setMerchantName(rs.getString("alias_"));
				bean.setPlatform(rs.getString("platform"));
				bean.setStatus(rs.getInt("Status"));
				lst.add(bean);

			}

			stmt.close();
			rs.close();
		} catch (Exception e) {
			logger.debug("Error findByFileAlias: " + e.toString());
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

		return lst;
	}
}

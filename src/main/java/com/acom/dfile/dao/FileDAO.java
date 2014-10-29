/**
 * 
 */
package com.acom.dfile.dao;

import java.util.List;

import com.acom.dfile.model.FileBean;

/**
 * @author hungdt
 *
 */
public interface FileDAO {
	public List<FileBean> findByFileAlias(String alias);
}

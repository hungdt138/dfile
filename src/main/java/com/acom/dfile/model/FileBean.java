/**
 * 
 */
package com.acom.dfile.model;

import java.util.Date;

/**
 * @author hungdt
 * 
 */
public class FileBean {
	private long id = 0;
	private Date createDate;
	private String filename = "";
	private String filepath = "";
	private String filedesc = "";
	private long filelengh = 0;
	private long merchantId = 0;
	private int status = 0;
	private String platform = "";
	private String merchantName = "";

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFiledesc() {
		return filedesc;
	}

	public void setFiledesc(String filedesc) {
		this.filedesc = filedesc;
	}

	public long getFilelengh() {
		return filelengh;
	}

	public void setFilelengh(long filelengh) {
		this.filelengh = filelengh;
	}

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}

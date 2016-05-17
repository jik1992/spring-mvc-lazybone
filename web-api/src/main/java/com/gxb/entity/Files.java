package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName(value = "files")
public class Files implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/**  */
	private String filepath;

	/**  */
	private String filename;

	/**  */
	private String newfilename;

	/**  */
	private Long filesize;

	/**  */
	private String fileext;

	/**  */
	private Integer picwidth;

	/**  */
	private Integer picheight;

	/**  */
	@TableField(value = "create_date")
	private Date createDate;

	/**  */
	private Long accesscount;

	/**  */
	private String user;

	/**  */
	private String moduleandkey;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getNewfilename() {
		return this.newfilename;
	}

	public void setNewfilename(String newfilename) {
		this.newfilename = newfilename;
	}

	public Long getFilesize() {
		return this.filesize;
	}

	public void setFilesize(Long filesize) {
		this.filesize = filesize;
	}

	public String getFileext() {
		return this.fileext;
	}

	public void setFileext(String fileext) {
		this.fileext = fileext;
	}

	public Integer getPicwidth() {
		return this.picwidth;
	}

	public void setPicwidth(Integer picwidth) {
		this.picwidth = picwidth;
	}

	public Integer getPicheight() {
		return this.picheight;
	}

	public void setPicheight(Integer picheight) {
		this.picheight = picheight;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getAccesscount() {
		return this.accesscount;
	}

	public void setAccesscount(Long accesscount) {
		this.accesscount = accesscount;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getModuleandkey() {
		return this.moduleandkey;
	}

	public void setModuleandkey(String moduleandkey) {
		this.moduleandkey = moduleandkey;
	}

}

package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {
	@Id
	@GeneratedValue
	private Integer id;
	private String fileName;
	@Lob
	private byte[] file;
	public Document() {
		super();
	}
	public Document(Integer id) {
		super();
		this.id = id;
	}
	public Document(Integer id, String fileName, byte[] file) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.file = file;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", fileName=" + fileName + ", file=" + Arrays.toString(file) + "]";
	}
	
}
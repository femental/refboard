package com.emopicture.domain;

import java.sql.Date;

public class BoardVO {

	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;
	private Integer viewcnt;
	private Integer replycnt;
	private String nickname;
	private Integer attyn;
	
	
	
	
	public Integer getAttyn() {
		return attyn;
	}
	public void setAttyn(Integer attyn) {
		this.attyn = attyn;
	}
	public Integer getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(Integer viewcnt) {
		this.viewcnt = viewcnt;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getReplycnt() {
		return replycnt;
	}
	public void setReplycnt(Integer replycnt) {
		this.replycnt = replycnt;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", updatedate=" + updatedate + ", viewcnt=" + viewcnt + ", replycnt=" + replycnt
				+ ", nickname=" + nickname + ", attyn=" + attyn + "]";
	}
	
	
	
	

	
	
}

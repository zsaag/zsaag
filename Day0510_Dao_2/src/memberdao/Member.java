package memberdao;

import java.sql.Date;

public class Member {
	private int mnum;
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	private Date mreDate;
	
	public Date getMreDate() {
		return mreDate;
	}
	public void setMreDate(Date mreDate) {
		this.mreDate = mreDate;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	@Override
	public String toString() {
		return "Member [mnum=" + mnum + ", mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", memail=" + memail
				+ ", mreDate=" + mreDate + "]";
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	
}
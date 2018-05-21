package memberdao2;

import java.sql.Date;
import java.sql.Timestamp;

public class Member {
	private int mnum;
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	private Date mreDate;
	private Timestamp mretime;
	
	public Timestamp getMreTime() {
		return mretime;
	}
	public void setMreTime(Timestamp mretime) {
		this.mretime = mretime;
	}
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
				+ ", mreDate=" + mreDate + ", mretime=" + mretime + "]";
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
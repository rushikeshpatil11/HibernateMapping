package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PFAccount {
	@Id
	private int UANno;
	private String nominee;
	public PFAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PFAccount(int uANno, String nominee) {
		super();
		UANno = uANno;
		this.nominee = nominee;
	}
	public int getUANno() {
		return UANno;
	}
	public void setUANno(int uANno) {
		UANno = uANno;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	@Override
	public String toString() {
		return "PFAccount [UANno=" + UANno + ", nominee=" + nominee + "]";
	}
	

}

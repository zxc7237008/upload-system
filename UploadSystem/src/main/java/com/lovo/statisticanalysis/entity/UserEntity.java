package com.lovo.statisticanalysis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Table(name="t_user")
@Entity
public class UserEntity{
	@Id
	@GenericGenerator(name = "user", strategy = "uuid")
	@GeneratedValue(generator = "user")
	@Column(name="u_id",unique = true,nullable=false,length=32)
	private String Uid;

	public String getUid() {
		return Uid;
	}

	public void setUid(String uid) {
		Uid = uid;
	}
	
	
	

}

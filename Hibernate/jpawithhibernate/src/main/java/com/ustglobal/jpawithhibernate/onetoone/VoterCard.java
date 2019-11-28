package com.ustglobal.jpawithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table
public class VoterCard {

	@Id
	@Column
	private int vid;
	
	@Column
	private String vname;
	
	@Exclude
	@OneToOne(mappedBy="votercard")
	private Person person;
}

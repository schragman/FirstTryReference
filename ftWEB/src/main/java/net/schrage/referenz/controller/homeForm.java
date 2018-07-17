package net.schrage.referenz.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import net.schrage.referenz.data.MockingDataEJB;

@SessionScoped
@Named
public class homeForm implements Serializable{
	private final static long serialVersionUID=1L;
	private String beispielWert = "Testausgabe";

	@EJB
	private MockingDataEJB mockingData;

	public String getMeinenEJBSatz() {
		return mockingData.getMeinSatz();
	}

	public String getBeispielWert() {
		return beispielWert;
	}



}

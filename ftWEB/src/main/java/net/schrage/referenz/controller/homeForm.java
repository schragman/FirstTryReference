package net.schrage.referenz.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class homeForm implements Serializable{
	private final static long serialVersionUID=1L;
	private String beispielWert = "Testausgabe";

	public String getBeispielWert() {
		return beispielWert;
	}

	public void setBeispielWert(String beispielWert) {
		this.beispielWert = beispielWert;
	}


}

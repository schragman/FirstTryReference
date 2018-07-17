package net.schrage.referenz.data;

import java.io.Serializable;

import javax.ejb.Remote;

@Remote
public interface MockingDataEJB extends Serializable{

	String getMeinSatz();

}

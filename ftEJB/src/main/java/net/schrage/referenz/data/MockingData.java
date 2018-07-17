package net.schrage.referenz.data;


import javax.ejb.Stateless;

@Stateless
public class MockingData implements MockingDataEJB{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	private String meinSatz;


	public MockingData() {
		meinSatz="Das ist mein Satz!";
	}

	@Override
	public String getMeinSatz() {
		return meinSatz;
	}

	public void setMeinSatz(String meinSatz) {
		this.meinSatz = meinSatz;
	}

}

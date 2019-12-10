package smolucha_AUSCustomer;

import java.io.Serializable;

public class Customer implements Serializable {

	private int customerid;
	private String customername;
	private int creditlimit;
	private String businessline;
	private String salesregion;
	
	
	public Customer(int customerid, String customername, int creditlimit,
					String businessline, String salesregion) {
		
		this.customerid = customerid;
		this.customername = customername;
		this.creditlimit = creditlimit;
		this.businessline = businessline;
		this.salesregion = salesregion;
		
	}

	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public int getCreditlimit() {
		return creditlimit;
	}


	public void setCreditlimit(int creditlimit) {
		this.creditlimit = creditlimit;
	}


	public String getBusinessline() {
		return businessline;
	}


	public void setBusinessline(String businessline) {
		this.businessline = businessline;
	}


	public String getSalesregion() {
		return salesregion;
	}


	public void setSalesregion(String salesregion) {
		this.salesregion = salesregion;
	}
	
	@Override
	public String toString(){
		   return getCustomerid()+" "
				    + ""+ getCustomername() +" "
		   			+ ""+ getCreditlimit() +" "
		   			+ ""+ getBusinessline() +" "
		   			+ ""+ getSalesregion() +
		   			"\n";
		
	}

	
	
}

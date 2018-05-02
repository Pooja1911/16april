package com.cg.model;

public class Retailer {
	
	public String retailerName;
	public String retailerAddress;
	/**
	 * @return the retailerName
	 */
	public String getRetailerName() {
		return retailerName;
	}
	/**
	 * @param retailerName the retailerName to set
	 */
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	/**
	 * @return the retailerAddress
	 */
	public String getRetailerAddress() {
		return retailerAddress;
	}
	/**
	 * @param retailerAddress the retailerAddress to set
	 */
	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((retailerName == null) ? 0 : retailerName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retailer other = (Retailer) obj;
		if (retailerName == null) {
			if (other.retailerName != null)
				return false;
		} else if (!retailerName.equals(other.retailerName))
			return false;
		return true;
	}

	
	
}

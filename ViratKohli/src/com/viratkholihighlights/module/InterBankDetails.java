package com.viratkholihighlights.module;

public class InterBankDetails implements BankDetails{

	@Override
	public void sbi() {
		// TODO Auto-generated method stub
		System.out.println("sbi bank");
	}

	@Override
	public void hdf() {
		// TODO Auto-generated method stub
		System.out.println("hdf bank");
	}

	@Override
	public void kvb() {
		// TODO Auto-generated method stub
		System.out.println("kvb bank");
	}
	
	public static void main(String[] args) {
		
		InterBankDetails ib = new InterBankDetails();
		
		ib.sbi();
		ib.hdf();
		ib.kvb();
		
				
	}

}

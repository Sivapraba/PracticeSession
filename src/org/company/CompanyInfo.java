package org.company;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("Company Name: Entrust InfoTech");

	}

	private void companyId() {
		System.out.println("Company Id: E1544");
	}
	
	private void companyAddress() {
		System.out.println("Comapny Address: GKS- DLF Ramapuram");

	}
	
	public static void main(String[] args) {
		//classname objname=new classname();
		CompanyInfo z=new CompanyInfo();
		//objname.methodname;
		z.companyName();
		z.companyId();
		z.companyAddress();
	}
}

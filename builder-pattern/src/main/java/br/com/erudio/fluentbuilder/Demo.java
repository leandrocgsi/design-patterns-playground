package br.com.erudio.fluentbuilder;

public class Demo {
	
	public static void main(String[] args) {
		EmployeeBuilder eb = new EmployeeBuilder()
			.withName("Leandro")
			.worksAs("Back-end Developer");
		
		System.out.println(eb.build());
	}
}

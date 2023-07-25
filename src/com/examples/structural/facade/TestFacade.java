package com.examples.structural.facade;

public class TestFacade {
	
	public static void main(String[] args) throws Exception
	  {
	    ReportGeneratorFacade.generateReport(ReportType.HTML);
	     
	    ReportGeneratorFacade.generateReport(ReportType.PDF);
	  }

}

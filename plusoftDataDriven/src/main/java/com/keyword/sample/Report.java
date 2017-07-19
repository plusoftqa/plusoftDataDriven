package com.keyword.sample;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


import com.relevantcodes.extentreports.Chart;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Report {

	static KeyWordExecution exeKey = new KeyWordExecution();
	static ExtentReports extent = ExtentReports.get(KeyWordExecution.class);
	static String caso = "omni";
	

	
	
	
<<<<<<< HEAD
	public static void Reports(String evidencias) throws IOException {
	
			        
		

		
		Date now = new Date();
		DateFormat diaf = new SimpleDateFormat("dd");
		DateFormat mesf = new SimpleDateFormat("MM");
		DateFormat anof = new SimpleDateFormat("yyyy");
		String diaF = diaf.format(now);
		String mesF = mesf.format(now);
		String anoF = anof.format(now);
		String dataPasta = diaF + "_" + mesF + "_" + anoF;
		Random numero = new Random();
        int id = 0001 + numero.nextInt(9999);
        System.out.println(id);
        File diretorio = new File("C:\\Automacao\\GithubQA\\PlusoftQA\\Datadriven\\Evidencias\\"+dataPasta+"\\"); // ajfilho é uma pasta!  
        if (!diretorio.exists()) {  
           diretorio.mkdirs(); //mkdir() cria somente um diretório, mkdirs() cria diretórios e subdiretórios.  
        } else {  
           System.out.println("Diretório já existente");
        }  
    
        extent.init("C:\\Automacao\\GithubQA\\PlusoftQA\\Datadriven\\Evidencias\\"+dataPasta+"\\"+evidencias+".html", true);
		extent.startTest(evidencias);
=======
	public static void Reports(String teste) throws IOException {
	
			        
		

		
		Date now = new Date();
		DateFormat diaf = new SimpleDateFormat("dd");
		DateFormat mesf = new SimpleDateFormat("MM");
		DateFormat anof = new SimpleDateFormat("yyyy");
		String diaF = diaf.format(now);
		String mesF = mesf.format(now);
		String anoF = anof.format(now);
		String dataPasta = diaF + "_" + mesF + "_" + anoF;
		Random numero = new Random();
        int id = 0001 + numero.nextInt(9999);
        System.out.println(id);
        File diretorio = new File("C:\\Automacao\\Evidencias\\"+dataPasta+"\\"); // ajfilho é uma pasta!  
        if (!diretorio.exists()) {  
           diretorio.mkdirs(); //mkdir() cria somente um diretório, mkdirs() cria diretórios e subdiretórios.  
        } else {  
           System.out.println("Diretório já existente");
        }  
    
        extent.init("C:\\Automacao\\Evidencias\\"+dataPasta+"\\"+teste+".html", true);
		extent.startTest(caso);
>>>>>>> refs/remotes/origin/master
		extent.config().displayCallerClass(false);
		extent.config()
	    .chartTitle(Chart.TEST, "Caso")
	    .chartTitle(Chart.STEP, "Passo a Passo");
		extent.config().useExtentFooter(false);
        
	    }
		
	
	
	public static void pass (String metodo,String parametro, String imgPG ) {
		
		Report.extent.log(LogStatus.PASS,metodo+"<span class='label success'>OK</span>", parametro, imgPG);			
		
		//extent.log(LogStatus.INFO, metodo+":"+ " <span class='label success'>success</span>");
		

	
}

	public static void fail (String metodo,String parametro, String imgPG ) {
		
		Report.extent.log(LogStatus.FAIL,metodo+"<span class='label failure'>NOK</span>", parametro, imgPG);		
	//	extent.log(LogStatus.INFO, metodo+":"+ "<span class='label failure'>fail</span>");

}
	 
	
	
}

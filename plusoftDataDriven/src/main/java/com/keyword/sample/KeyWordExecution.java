package com.keyword.sample;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.keyword.sample.Report;

import jxl.write.WritableSheet;

public class KeyWordExecution {
	
	public static String descricao;
	public static WebDriver driver;
	public static Configuracao inicio = new Configuracao();

	public void runReflectionMethod(String strClassName, String strMethodName,

			Object... inputArgs) throws Exception {

		Class<?> params[] = new Class[inputArgs.length];
		KeyWordExample keysd = new KeyWordExample();

		for (int i = 0; i < inputArgs.length; i++) {
			if (inputArgs[i] instanceof String) {
				params[i] = String.class;
			}
		}
		try {
			Class<?> cls = Class.forName(strClassName);
			Object _instance = cls.newInstance();
			Method myMethod = cls.getDeclaredMethod(strMethodName, params);
			myMethod.invoke(_instance, inputArgs);

		} catch (ClassNotFoundException e) {

			System.err.format(strClassName + ":- Class not found%n");
			Report.fail(KeyWordExecution.descricao, strMethodName, KeyWordExample.imgPg(Report.caso));

		} catch (IllegalArgumentException e) {
			System.err.format("Method invoked with wrong number of arguments%n" + strMethodName);
			Report.fail(KeyWordExecution.descricao, strMethodName, KeyWordExample.imgPg(Report.caso));

		} catch (NoSuchMethodException e) {
			System.err.format("In Class " + strClassName + "::" + strMethodName + ":- method does not exists%n");
			Report.fail(KeyWordExecution.descricao, strMethodName, KeyWordExample.imgPg(Report.caso));

		} catch (InvocationTargetException e) {
			System.out.println(e);
			System.err.format("Exception thrown by an invoked method%n" + strMethodName);
			Report.fail(KeyWordExecution.descricao, strMethodName, KeyWordExample.imgPg(Report.caso));

		} catch (IllegalAccessException e) {
			System.err.format("Can not access a member of class with modifiers private%n");
			e.printStackTrace();
			Report.fail(KeyWordExecution.descricao, strMethodName, KeyWordExample.imgPg(Report.caso));

		} catch (InstantiationException e) {
			System.err.format("Object cannot be instantiated for the specified class using the newInstance method%n");
			Report.fail(KeyWordExecution.descricao, strMethodName, KeyWordExample.imgPg(Report.caso));

		}
	}

	// static String caso = "INT_2_11";

	@Test
	public static void main() throws Exception {
		// for (int i= 1; i<= 3; i++) {
		KeyWordExecution exeKey = new KeyWordExecution();
		readExcel excelSheet = new readExcel();
		KeyWordExample keysd =  new KeyWordExample();
		Report r = new Report();
		

		File arquivos[];
<<<<<<< HEAD
		File diretorio = new File("C:\\Automacao\\GithubQA\\PlusoftQA\\Datadriven\\Casos\\Executar\\");
		//File diretorio = new File("C:\\Automacao\\Cadastro\\");
		//C:\Automacao\Cadastro
		arquivos = diretorio.listFiles();
		
		
		
		
		for (int i = 0; i < arquivos.length; i++) {
			
			System.out.println(arquivos[i].toString());
			String evidencias = arquivos[i].toString().substring(58).replace(".xls", "");
			r.Reports(evidencias);
=======
		File diretorio = new File("/Datadriven/Casos/Executar/");
		//File diretorio = new File("C:\\Automacao\\Cadastro\\");
		//C:\Automacao\Cadastro
		arquivos = diretorio.listFiles();
		
		
		
		
		for (int i = 0; i < arquivos.length; i++) {
			
			System.out.println(arquivos[i].toString());
			String teste = arquivos[i].toString().substring(29).replace(".xls", "");
			r.Reports(teste);
>>>>>>> refs/remotes/origin/master
			inicio.config();
			excelSheet.openSheet(arquivos[i].toString());

			for (int row = 1; row < excelSheet.getRowCount(); row++) {
				descricao = excelSheet.getValueFromCell(2, row);
				List<Object> myParamList = new ArrayList<Object>();
				
				String methodName = excelSheet.getValueFromCell(3, row);
				String teste2 = excelSheet.getValueFromCell(0, row);
				//if(teste2.equals("1")){
					 
				
					
				for (int col = 4; col < excelSheet.getColumnCount(); col++) {
					// System.out.println(col);
					if (!excelSheet.getValueFromCell(col, row).isEmpty()
							& !excelSheet.getValueFromCell(col, row).equals("null")) {
						myParamList.add(excelSheet.getValueFromCell(col, row));
					} 
				}

				Object[] paramListObject = new String[myParamList.size()];
				paramListObject = myParamList.toArray(paramListObject);

				exeKey.runReflectionMethod("com.keyword.sample.KeyWordExample", methodName, paramListObject);

				// String[] t = myParamList.toArray(new
				// String[myParamList.size()]);
				// Report.pass(methodName,myParamList.toString(),
				// KeyWordExample.imgPg(Report.caso, methodName));
				// myParamList.toString();
				System.out.println(descricao +" - "+ methodName);
				// KeyWordExample.imgPg("AUDITOR" , methodName);
				
				
			//}else {
			//	System.out.println("Fim da Execução");
				//keysd.close_Browser();
			
			}
			keysd.close_Browser();
			//driver.quit();
			}
		}
		
 
	}


// }

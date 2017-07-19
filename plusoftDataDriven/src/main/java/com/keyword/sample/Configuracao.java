//teste teste teste
package com.keyword.sample;

import org.openqa.selenium.WebDriver;

public class Configuracao {
	//teste teste teste tetse
	public static WebDriver driver;
	public static KeyWordExample teste = new KeyWordExample();
	
	public static String Navegador = "chrome";
	public static String URL = "https://omni-qa3.plusoftomni.com.br";
	public static String Usuario = "TesteQA";
	public static String Senha = "Qa1234567";
	public static String Menu = "TESTE QA";
	
	
	public static void config () throws Exception{
		teste.open_Browser(Navegador);
		teste.URL(URL);
		teste.Digitar("id", "login__username", Usuario);
		teste.Digitar("id", "login__password", Senha);
		teste.Clicar("css", "button[type=button]");
		teste.Esperar("5000");
		teste.Clicar("linkText", Menu);
		teste.Clicar("partialLinkText", "Administrador");	
		
		
	}

}





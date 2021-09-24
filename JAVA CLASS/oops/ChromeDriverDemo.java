package com.voya.oops;

public class ChromeDriverDemo implements WebDriverDemo {
	
	//constructor
	public ChromeDriverDemo()
	{
		System.out.println("launch chrome browser!!");
	}
	
	
	public void click()
	{
		System.out.println("click");
	}



	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}

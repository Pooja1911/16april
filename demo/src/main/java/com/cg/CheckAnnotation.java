package com.cg;

import com.cg.myAnnotation.Pooja;

public class CheckAnnotation {
	
	@Pooja(value=10)
	public void demo()
	{
		System.out.println("Check for my annotation");
	}

}

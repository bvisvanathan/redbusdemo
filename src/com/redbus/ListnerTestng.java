package com.redbus;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class ListnerTestng implements ITestListener {
	
	public void onFinish(ITestContext Result) {
        System.out.println(Result.getName()+"case finished");    
        
    }

}

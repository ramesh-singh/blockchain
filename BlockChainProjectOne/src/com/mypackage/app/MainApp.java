package com.mypackage.app;

import com.mypackage.block.Block;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("Creating Genesis block.");
		
		String []transactions= {"Satoshi gave 10 BTC to Ramesh", "Hal Finey gave 10 BTC to Ramesh"};
		
		Block genesisBlock= new Block(0, transactions);
		
		System.out.println("HashCode for Genesis block. "+genesisBlock.getCurrentHash());
		
		String []transactions1= {"Ramesh gave 10 BTC to Mahesh"};
		
		Block one= new Block(genesisBlock.getCurrentHash(), transactions1);
		
		System.out.println("HashCode for block one. "+one.getCurrentHash());
	}

}

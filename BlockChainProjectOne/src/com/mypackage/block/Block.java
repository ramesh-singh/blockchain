package com.mypackage.block;

import java.util.Arrays;

public class Block {
	private int previousHash;
	private int currentHash;
	private String [] transactions;
	
	public Block(int previousHash, String [] transactions){
		this.previousHash= previousHash;
		this.transactions= transactions;
		Object [] contents={Arrays.hashCode(transactions), previousHash};
		currentHash=  Arrays.hashCode(contents);
				
	}


	public int getCurrentHash() {
		return currentHash;
	}

	public String[] getTransactions() {
		return transactions;
	}
	
	

}

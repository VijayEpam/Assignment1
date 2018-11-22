package com.vvb.myPack;

public class ConveterMain {

	public static void main(String[] args) {
			Converter con;
			con=ConverterManager.getInchFeetConverter();
			System.out.println(con.doConvert());
			System.exit(0);
			}
	}

package com.ERP.testscripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.jboss.netty.handler.queue.BufferedWriteHandler;

import com.ERP.master.library;
import com.google.common.io.FileWriteMode;

public class notepad {

	private static String catname;

	public static void main(String[] args) throws IOException {
		
		library li=new library();
		String Res=li.appopen("http://webapp.qedgetech.com");
		System.out.println(Res);
		Res=li.login("admin","master");
		System.out.println(Res);
	
		
		String Fpath="H:\\Anitha\\ERP\\src\\com\\ERP\\testdata\\UOM.txt";		
		String Rpath="H:\\Anitha\\ERP\\src\\com\\ERP\\results\\UOMnotepad.txt";

		String F1path="H:\\Anitha\\ERP\\src\\com\\ERP\\testdata\\STOCK.txt";		
		String R1path="H:\\Anitha\\ERP\\src\\com\\ERP\\results\\stocknotepad.txt";
		String SD,ST;
		
		FileReader Fr=new FileReader(Fpath);
		BufferedReader Br=new BufferedReader(Fr);
		String Sread= Br.readLine();
        System.out.println(Sread);	
        
        
        FileWriter Fw=new FileWriter(Rpath);
        BufferedWriter Bw=new BufferedWriter(Fw);
		Bw.write(Sread+"%%%"+"Results");
		Bw.newLine();
		
		
		FileReader Fr1=new FileReader(F1path);
		BufferedReader Br1=new BufferedReader(Fr1);
		String S1read= Br1.readLine();
        System.out.println(S1read);	
        
        
        FileWriter Fw1=new FileWriter(R1path);
        BufferedWriter Bw1=new BufferedWriter(Fw1);
		Bw1.write(S1read+"%%%"+"Results");
		Bw1.newLine();
		
	
		while((SD=Br.readLine())!= null)

{
	System.out.println(SD);
			String SR[]=SD.split("###");
			String Uid=SR[0];
			System.out.println(Uid);
			String Udesc=SR[1];
			System.out.println(Udesc);
			
			Res=li.uom(Uid, Udesc);
			System.out.println(Res);
			
			Bw.write(Uid+"^^^"+Udesc+"@@@"+Res);
			Bw.newLine();
		
		}
		
		
		while((ST=Br1.readLine())!= null)

		{
			System.out.println(ST);
					String SR1[]=ST.split("###");
					String catname=SR1[0];
					System.out.println(catname);
					String Search=SR1[1];
					System.out.println(Search);
					
					Res=li.stockitem(catname, Search);
					//Res=li.uom(Uid, Udesc);
					System.out.println(Res);
					
					Bw1.write(catname+"^^^"+Search+"@@@"+Res);
					Bw1.newLine();
		}
			Bw.close();
			Br.close();
			Bw1.close();
			Br1.close();
		
		
		
		
	}}



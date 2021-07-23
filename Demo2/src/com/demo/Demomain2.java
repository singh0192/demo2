package com.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Demomain2 {

	public static void main(String[] args) {
		
		InputStream ins = null; // raw byte-stream
		Reader r = null; // cooked reader
		BufferedReader br = null; // buffered for readLine()
		try {
		    String s;
		    ins = new FileInputStream("textfile.txt");
		    r = new InputStreamReader(ins, "UTF-8"); // leave charset out for default
		    br = new BufferedReader(r);
		    while ((s = br.readLine()) != null) {
		        System.out.println(s);
		    }
		}
		catch (Exception e)
		{
		   e.printStackTrace(); // handle exception
		}
		finally {
		   /* if (br != null) { try { br.close(); } catch(Throwable t) {  ensure close happens  } }
		    if (r != null) { try { r.close(); } catch(Throwable t) {  ensure close happens  } }
		    if (ins != null) { try { ins.close(); } catch(Throwable t) {  ensure close happens  } }*/
		}
	}

}

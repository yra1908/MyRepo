package javaconvention.codexample;

import edu.stedwards.psi.PsiException;
import edu.stedwards.theta.ParentClass;
import edu.stedwards.theta.AlphaInterface;

import com.omega.foobar.BetaInterface;
import com.omega.foobar.GammaInterface;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Class description goes here…
 *
 * @author      Chikh Yuriy
 * @author      Another Yuriy
 * @version     $Revision: 1 $, $Date: 2015/07/03 22:34:36 $ 
 */

public abstract class DerivedClass extends ParentClass
	implements AlphaInterface, BetaInterface, GammaInterface {
	// class implementation comments go here…
	
	public static final int SOME_CONSTANT = 42;
	public int level; // indentation level
	public int level2; 
	public int level3; 	
	private int level4; // indentation level
	private int level5; 
	private int level6; // indentation level
	private Object fRef = null;	
	protected int level7; // indentation level
	protected int level8; 
	protected int level9; // indentation level
	
	/**
	* Constructor documentation comments go here…
	*/
	public DerivedClass(const String aName) {
		
		super();
		
		String uppercaseName = null;
		int updatedCount = 0;
		
		uppercaseName = aName.toUpperCase();
		this.setName(uppercaseName);
		
		// TODO: Comments to do later.
		
		updatedCount = DerivedClass.getCount();
		updatedCount++;
	
		DerivedClass.setCount(aCount);
	}
	
	/**
	* Method documentation comments go here…
	*/
	public String getName() {
		// method implementation comments go here…
	    	
		for (i=0; i<anArray.length; i++) {			// for loop example...
			…
			if (anArray[i] == z) {
				break;					// special comment
			}
	    	    …
		}
    	
		while (condition) {					// while example...
			statements;
		}
	    	
		do {								// do while example...
			 statements;
		}
		while (condition);
	    	    	
		if ((x < 5) || (x>2)) {					// if statement example...	
			finalValue = -1;
		}
		else if (y == 15) {
			finalValue = 10;
		}
		else {
			finalValue = 0;
		}
	    	
		switch (variable) {					// switch example...
			case ABC:
				statements;
				// XXX falls through
			 case DEF:
				statements;
				break;
			case XYZ:
		    	        statements;
		    	        break;
			default:
				statements;
				break;
		}
	    	
		try (Scanner in = new Scanner (file);  	// try catch example..
			PrintWriter out = new PrintWriter(file2);) {
					
			String s = in.nextLine();
			System.out.println(s); 
			out.println(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    	
		return this.fName;        
	}
    
	private static staticMethod() {
		// do smth
	}
	    
	    
	private class InnerClass {
		// class implementation comments go here…
	    	
		public int level2; 
		public int level3;     	
		private Object fRef = null;
	    	
		/**
		* Constructor documentation comments go here…
		*/
		public InnerClass() {
			…
		} 
	        
	} // InnerClass
    
} // DerivedClass



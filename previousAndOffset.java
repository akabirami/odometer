mport java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
		{
				// your code goes here
						Integer num=1239;
								Integer offset=5;
										Integer num1=1234,num2=1239;
												ArrayList<Integer> digits=getdigits(num);
													    for(int i=0;i<offset;i++)
													    		   digits=getPrevious(digits);
															   		
																			System.out.println("After Conversion\n");
																				    for(int i=0;i<digits.size();i++){
																				    	        System.out.print(digits.get(i));
																							    }
																							    	     ArrayList<Integer> digits1=new ArrayList<Integer>();
																								     	     ArrayList<Integer> digits2=new ArrayList<Integer>();
																									     	     
																										     	    if(num2>num1){
																											    		     digits1=getdigits(num2);
																													     		     digits2=getdigits(num1);
																															     	    }
																																    	    else{
																																	    	        digits1=getdigits(num1);
																																					    digits2=getdigits(num2);
																																					    	    }
																																						    		
																																										Integer count=0;
																																											    do{
																																											    	        digits1=getPrevious(digits1);
																																														        count++;
																																																    }while(!(digits2.equals(digits1)));
																																																    	    
																																																	    	    System.out.println("OFFSET : "+count);
																																																		    	}
																																																				public static ArrayList<Integer> getPrevious(ArrayList<Integer> digits){
																																																					
																																																						    int replace=9;
																																																						    	    for(int i=digits.size()-1;i>=0;){
																																																							    	        if(i==0)
																																																										        {
																																																												            if(digits.get(i)==1)
																																																													    	                digits.set(i,10-digits.size());
																																																																	            else
																																																																		    	                digits.set(i,(digits.get(i)-1));
																																																																						            i--;
																																																																							    	        }
																																																																										        else if(digits.get(i)-digits.get(i-1)==1){
																																																																												            digits.set(i,replace);
																																																																													    	            i--;
																																																																															    	            replace--;
																																																																																	    	        } 
																																																																																				        else{
																																																																																						            digits.set(i,(digits.get(i)-1));
																																																																																							    	            break;
																																																																																									    	        }
																																																																																												    }
																																																																																												    	   
																																																																																													   	    return digits;
																																																																																														    	    
																																																																																															    	} 
																																																																																																	public static ArrayList<Integer> getdigits(Integer num){
																																																																																																		    ArrayList<Integer> digits=new ArrayList<Integer>();
																																																																																																		    	    do
																																																																																																			    	    {
																																																																																																				    	        digits.add(num%10);
																																																																																																							        num=num/10;
																																																																																																									    }while(num>0);
																																																																																																									    	    
																																																																																																										    	    Collections.reverse(digits);
																																																																																																											    	    return digits;
																																																																																																												    	}
																																																																																																													}


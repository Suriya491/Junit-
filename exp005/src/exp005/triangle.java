package exp005;

import java.util.*;
public class triangle {
	public String check (int a, int b, int c){
		while(true){
			if(a>=1 && a<=200 && b>=1 && b<=200 && c>=1 && c<=200){
				if((a < b+c) && (b < a+c) && (c < b+a)){
					if(a == b && b == c)
						return ("Given dimensions form an equilateral triangle!");
					else if(a==b || b==c || c==a)
						return("Given dimensions form an isosceles triangle!");
					else
						return("Given dimensions form a scalene triangle!");
				}
				else {
					return("Given dimensions do not form a triangle!");
				}
			}
			else{
				return("Enter a valid input!");
			}
		}
	}
}

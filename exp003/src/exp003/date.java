package exp003;

import java.util.*;
public class date {
	public String nextDate (int d, int m, int y) {
		int nd, nm, ny;
		if(d>31 || d<1 || m>12 || m <1 || y<1821 || y>2021){
			return ("Invalid date!");
		}
		else if(m==2 || m==4 || m==6 || m==9 || m==11 ){
			if(d==31)
				return("Invalid date!");
			else if(m==2){
				if(checkLeapYear(y)){
					if(d>29){
						return("Invalid date!");
					}
					if(d == 29) {
						nd = 1;
						nm = 3;
					}
					else {
						nd = ++d;
						nm = 2;
					}
				}
				else {
					if(d>28){
						return("Invalid date!");
					}
					if(d == 28) {
						nd = 1;
						nm = 3;
					}
					else {
						nd = ++d;
						nm = 2;
					}
				}
				ny = y;
			}
			else {
				if (d == 30){
					nd = 1;
					nm = ++m;
				}
				else{
					nd = ++d;
					nm = m;
				}
				ny = y;
			}
		}
		else {
			if (d == 31 && m != 12){
				nd = 1;
				nm = ++m;
				ny = y;
			}
			else if (d == 31 && m == 12){
				nd = 1;
				nm = 1;
				ny = ++y;
			}
			else{
				nd = ++d;
				nm = m;
				ny = y;
			}
		}
		return("The next date is: "+nd+"-"+nm+"-"+ny);
	}
	
	public static boolean checkLeapYear(int year){
		if(year % 400 == 0)
			return true;
		else if(year % 100 == 0)
			return false;
		else if(year % 4 == 0)
			return true;
		else
			return false;
	}
	
}
package exp1;

import java.util.*;
public class exp1
{
public static void main(String[] args) {
int mpin = 1234;
int savbal = 10000;
int currbal = 5000;
Scanner sc = new Scanner(System.in);
int attempt = 0;
do {
if(attempt == 0) {
System.out.println("ATM system - 1NH19CS135\nHello, please enter your PIN");
}
else {
System.out.println("Try again");
}
int pin = sc.nextInt();
if(pin == mpin) {
System.out.println("1) Savings\n2) Current");
int c = sc.nextInt();
switch(c) {
case 1:
int s = 0;
do {
System.out.println("\n1) Check balance\n2) Deposit\n3) Withdraw\n4) Exit\n");
s = sc.nextInt();
switch(s) {
case 1: System.out.println("Balance = Rs. "+savbal);
break;
case 2: System.out.println("Enter amount to deposit: ");
int d = sc.nextInt();
savbal+=d;
System.out.println("Updated balance = Rs. "+savbal);
break;
case 3: System.out.println("Enter amount to withdraw: ");
int w = sc.nextInt();
if(w>savbal) {
System.out.println("Insufficient funds");
}
else {
savbal-=w;
System.out.println("Updated balance = Rs. "+savbal);
}
break;
case 4: System.exit(0);
break;
}
}while(s!=4);
break;
case 2:
int curr = 0;
do {
System.out.println("\n1) Check balance\n2) Deposit\n3) Withdraw\n4) Exit\n");
s = sc.nextInt();
switch(s) {
case 1: System.out.println("Balance = Rs. "+currbal);
break;
case 2: System.out.println("Enter amount to deposit: ");
int d = sc.nextInt();
currbal+=d;
System.out.println("Updated balance = Rs. "+currbal);
break;
case 3: System.out.println("Enter amount to withdraw: ");
int w = sc.nextInt();
if(w>currbal) {
System.out.println("Insufficient funds");
}
else {
currbal-=w;
System.out.println("Updated balance = Rs. "+currbal);
}
break;
case 4: System.exit(0);
break;
}
}while(curr!=4);
break;
}
}attempt++;
}while(attempt<3);
if(attempt==3) {
System.out.println("Invalid PIN entered 3 times, please reinsert your card to proceed");
}
}}

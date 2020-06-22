package Helpers;

public class BankCard_Lesson_4_3 {
Passport_Lesson_4_3 owner;
String cardType;
int[] number;

public BankCard_Lesson_4_3(RandomNumber_Lesson_4_3 genNumber){
  this.number = genNumber.generateNumber();
}

public void assign (Passport_Lesson_4_3 passport, String cardName){
  this.owner = passport;
  this.cardType = cardName;
  System.out.println("Card " + number[3] + " assigned to " + this.owner.firstN);
  System.out.println();
}

public void print (){
System.out.println("Card name: "+  cardType);
System.out.println("Name: "+  owner.firstN + " " + owner.lastN + " " + owner.age );
System.out.print("Number: ");
  for(int q = 0; q < number.length; q++) {
    System.out.print(number[q] + " "); // printing each array element
  }
  System.out.println();
  System.out.println();
  }
}

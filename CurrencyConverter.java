import static java.lang.System.out;
import java.util.Scanner;

public class CurrencyConverter{
  private int choice;
  private String currency;
  private double amount;
  private double dollar;
  private double pound;
  private double euro;
  private double yen;
  private double ringgit;
  private double rupee;

  CurrencyConverter(int choice, double amount){
    this.choice = choice;
    this.amount = amount;
    switch(choice){
      case 1: //Dollar Conversion
              currency = "Dollar";
              pound = amount * 0.78;
              euro = amount * 0.87;
              yen = amount * 111.087;
              ringgit = amount * 4.17;
              rupee = amount * 70;
              break;
      case 2: //Pound Conversion
              dollar = amount * 1.26;
              currency = "Pound";
              euro = amount * 1.10;
              yen = amount * 140.93;
              ringgit = amount * 5.29;
              rupee = amount * 88;
              break;
      case 3: //Euro Conversion
              dollar = amount * 1.14;
              pound = amount * 0.90;
              currency = "Euro";
              yen = amount * 127.32;
              ringgit = amount * 4.78;
              rupee = amount * 80;
              break;
      case 4: // Yen Conversion
              dollar = amount * 0.008;
              pound = amount * 0.007;
              euro = amount * 0.007;
              currency = "Yen";
              ringgit = amount * 0.037;
              rupee = amount * 0.63;
              break;
      case 5: //Ringgit Conversion
              dollar = amount * 0.239;
              pound = amount * 0.188;
              euro = amount * 0.209;
              yen = amount * 26.63;
              currency = "Ringgit";
              rupee = amount * 16.8;
              break;
      case 6: //Rupee Conversion
              dollar = amount / 70;
              pound = amount / 88;
              euro = amount / 80;
              yen = amount / 0.63;
              ringgit = amount / 16;
              currency = "Rupee";
              break;
    }

  }
  void print(){
    if(choice != 1)
      out.printf("Your %.2f %s is : %.2f in Dollar\n", amount, currency, dollar);
    if(choice != 2)
      out.printf("Your %.2f %s is : %.2f in Pound\n", amount, currency, pound);
    if(choice != 3)
      out.printf("Your %.2f %s is : %.2f in Euro\n", amount, currency, euro);
    if(choice != 4)
      out.printf("Your %.2f %s is : %.2f in Yen\n", amount, currency, yen);
    if(choice != 5)
      out.printf("Your %.2f %s is : %.2f in Ringgit\n", amount, currency, ringgit);
    if(choice != 6)
      out.printf("Your %.2f %s is : %.2f in Rupee\n", amount, currency, rupee);
  }

  public static void main(String[] args){
    int choice;
    double amount;
    Scanner sc = new Scanner(System.in);
    out.println("Hi, Welcome to the Currency Converter!");
    out.println("Which currency You want to Convert ?");
    out.println("1:Dollar \t2:Pound \t3:Euro \n4:yen \t5:Ringgit \t6:Rupee");
    out.print("Enter your choice : ");
    choice = sc.nextInt();
    if(choice <=0 || choice > 6){
      out.println("Wrong Choice !!!");
      return;
    }
    System.out.print("How much Money you want to convert ? : ");
    amount = sc.nextDouble();
    new CurrencyConverter(choice, amount).print();
  }
}

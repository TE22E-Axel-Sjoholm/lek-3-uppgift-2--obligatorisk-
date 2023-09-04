public class Kalkylering{

    public static void main(String[] args) {
      int tal1= 23;
      int tal2= 45;
      double tal3= 234232;
      double tal4= 2434;
      int summa;
      double produkt;
      double tal5= 10;
      double tal6= 3;
      double kvot;
      summa=tal1+tal2;
      System.out.println(tal1+"+"+tal2+"="+summa);
      summa=tal1-tal2;
      System.out.println(tal1+"-"+tal2+"="+summa);
      produkt=tal3*tal4;
      System.out.println(tal3+"*"+tal4+"="+produkt);
      produkt=tal2*tal3*tal4;
      System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt);
      kvot=tal1/tal2;
      System.out.println(tal1+"/"+tal2+"="+kvot);
      kvot=tal6/tal3;
      System.out.println(tal6+"/"+tal3+"="+kvot);
      kvot=tal5%tal6;
      System.out.println(tal5+"%"+tal6+"="+kvot);
      kvot=12%4;
      System.out.println("12%4="+kvot);
  }
}
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


//1a


//public class main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}


//1b


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nWpisz 1 liczbe: ");
//        wynik = scan.nextInt();
//        for(int i =2;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik*=y;
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}


//1c


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=abs(y);
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}


//1d


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        double y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = sqrt(abs(scan.nextInt()));
//            wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}


//1e


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nWpisz 1 liczbe: ");
//        wynik = abs(scan.nextInt());
//        for(int i =2;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik*=abs(y);
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}


//1f


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=pow(y,2);
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}


//1g


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik1 = 0;
//        int wynik2 = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nWpisz 1 liczbe: ");
//        y = scan.nextInt();
//        wynik1+=y;
//        wynik2+=y;
//        for(int i =2;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik1+=y;
//            wynik2*=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik1+", a wynik mnożenia to: "+wynik2);
//    }
//}


//1h


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i%2==0)wynik-=y;
//            else wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}


//1i


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        int silnia = 1;
//        for(int i =1;i <= x;i++){
//            silnia*=i;
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i%2==0)wynik+=y/silnia;
//            else wynik-=y/silnia;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}


//1.2


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        int tab[] = new int[x];
//        for(int i =0;i < x;i++){
//            System.out.print("\nWpisz "+(i+1)+" liczbe: ");
//            y = scan.nextInt();
//            tab[i]=y;
//        }
//        for(int i = 1;i<x;i++){
//            System.out.print(tab[i]+"\n");
//        }
//        System.out.print(tab[0]);
//    }
//}


//2.1 a


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if (y % 2 == 1) wynik+=1;
//        }
//        System.out.print("Występuje liczb nieparzystych: "+wynik);
//    }
//}


//2b


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if (y % 3 == 0 && y % 5 != 0) wynik+=1;
//        }
//        System.out.print("Występuje liczb nieparzystych: "+wynik);
//    }
//}


//2c


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(sqrt(y) %2 == 0) wynik++;
//        }
//        System.out.print("wynik: "+wynik);
//    }
//}


//2d


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int tab[] = new int[x];
//        for(int i = 1;i < x - 1;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            tab[i] = scan.nextInt();
//            if(tab[i] < (tab[i-1]+tab[i+1])/2)wynik++;
//        }
//        System.out.print("wynik: "+wynik);
//    }
//}


//2f


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i%2==1 && y%2==0)wynik++;
//        }
//        System.out.print("wynik: "+wynik);
//    }
//}


//2g


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(y%2==1 && y>=0)wynik++;
//        }
//        System.out.print("wynik: "+wynik);
//    }
//}


//2h


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(abs(y) < pow(i, 2))wynik++;
//        }
//        System.out.print("wynik: "+wynik);
//    }
//}


//2.2


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(y>=0)wynik+=y;
//        }
//        System.out.print("wynik: "+wynik*2);
//    }
//}


//2.3


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik0 = 0;
//        int wynik1 = 0;
//        int wynik2 = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(y==0)wynik0++;
//            if(y>0)wynik1++;
//            if(y<0)wynik2++;
//        }
//        System.out.print("dodatnie: "+wynik1+"\nujemne: "+wynik2+"\nrówne zero: "+wynik0);
//    }
//}


//2.4


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int najw = 0;
//        int najm = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i==1){ najm=y;najw=2;}
//            if(y>najw)najw=y;
//            if(y<najm)najm=y;
//        }
//        System.out.print("największa: "+najw+"\nnajmniejsza: "+najm);
//    }
//}


//2.5


//public class Zadania_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        int y[] = new int[x];
//        for(int i = 1;i <= x;i++){
//            System.out.print("\nWpisz "+i+" liczbe: ");
//            y[i-1] = scan.nextInt();
//            if(i!=1){
//                if(y[i-2]>0 && y[i-1]>0)wynik++;
//            }
//        }
//        System.out.print("wynik: "+wynik);
//    }
//}

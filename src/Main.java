public class Main {
    public static void main(String[] args) {
        //дз1
        // задача 1
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
        // задача 2
        for (int i = 10; i>=1; i--){
            System.out.println(i);
        }
        // задача 3
        for (int i= 0; i<17; i = i+2){
            System.out.println(i);
        }
        // задача 4
        for( int i= 10; i>=-10; i--){
            System.out.println(i);
        }
        // дз 2
        // задача 1
        for( int year  = 1904; year <= 2096; year ++){
            if(year % 4==0 && year % 100 !=0 || year % 400 == 0){
                System.out.println(year + " год является вескосным");
            }
        }
        // задача 2
        for ( int i = 7; i <= 98; i = i+7){
            System.out.println(i);
        }
        // задача 3
        for( int i = 1; i<= 512; i= i*2){
            System.out.print(i + " ");
        }
          // дз 3
        // задача 1
        int part = 29_000;
        int sum = 0;
        for(int i = 1; i<= 12; i++){
            sum += part;
            System.out.println("Месяц " + i + " сумма накопления равна " + sum + " рублей");
        }
        // задача 2
         double sumPerson = 0;
        double percent = 0.01;
        for( int i =1; i<= 12; i++){
            sumPerson = (sumPerson+ part)*(1+percent);
            System.out.println("Месяц " + i + " сумма накопления равна " + sumPerson + " рублей");
        }
        // циклы часть 2
        // дз1
        int partMoney = 15_000;
        int sumPerson1 = 0;
        int i = 0;
        while (sumPerson1 < 2_459_000) {
            i++;
            sumPerson1 = sumPerson1 + sumPerson1/100;
            sumPerson1 = sumPerson1 + partMoney;
            System.out.println("Месяц " + i + " Итого "+ sumPerson1);
        }
        // дз2
        int num = 0;
        int a = 10;
        while (num<10){
            num ++;
            System.out.print(num +" ");

        }
        System.out.println(" ");
        for (; a>= 1; a--){
            System.out.print(a+" ");

        }

        // дз3
       int population = 12_000_000;
        int fertility = 84_000;
       int y = 0;
       for(; y<=10; y++){
           population = population+fertility;
           System.out.println("Год " + y + " численость населения составляет " + population);
       }
      // дз3-4
        int vasilySum = 15_000;

       int m = 1;
       while ( vasilySum < 12_000_000){
           m++;
           vasilySum = (vasilySum * 7 /100) + vasilySum;
            if (m % 6 ==0) {
                System.out.println("Месяц " + m + " сумма накопления " + vasilySum);
            }
       }

    }
}

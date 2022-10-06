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

    }
}

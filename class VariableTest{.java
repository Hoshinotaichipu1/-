import java.util.Scanner;
class Date{
    public static void main(String[] args){
        int sumDay = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:year");
        int year = scan.nextInt();

        System.out.println("Input:month");
        int month = scan.nextInt();
        
        System.out.println("Input:day");
        int day = scan.nextInt();

        switch(month){
            case 12:
                   sumDay += 30;
                case 11:
                    sumDay += 31;
                case 10:
                    sumDay += 30;
                case 9 :
                    sumDay += 31;
                case 8 :
                    sumDay += 31;
                case 7 :
                    sumDay += 30;
                case 6 :
                    sumDay += 31;
                case 5 :
                    sumDay += 30;
                case 4 :
                    sumDay += 31;
                case 3 :
                    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        sumDay += 29;
                    else
                        sumDay += 28;
                case 2 :

                    sumDay += 31;
                case 1 :
                    sumDay += day;
                    break;

                    
            }
      
        System.out.println(year + "年" + month + "月" + day + "日" + "是"
        + year + "的第" + sumDay + "天");


    }
}
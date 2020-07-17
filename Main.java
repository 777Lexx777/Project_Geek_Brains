package geek;

public class Main {

    public static void main(String[] args) {

        //String result = first(name);\
        String year = year(2001);
        System.out.println(year);
    }
        static String year (int a){
            if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
                return " Високосный";
            else
                return "Неа! НЕ високосный";
        }
}

//System.out.println(((GregorianCalendar) Calendar.getInstance()).isLeapYear(new Scanner(System.in).nextInt()));
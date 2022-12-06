package courses.javabasic2;

public class ModuleNumber {
    public static void main(String[] args) {
        //System.out.println(equalNum(-1));
        //square(1);
        //leftTriangle(2);
        //rightTriangle(5);
        guessGame();
    }
    //Циклы#10
    public static void guessGame() {
        int count = 0;
        int x;
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);


        System.out.println("What number am I thinking (0 to 9)? :");
        do {

            x = sc.nextInt();
            count++;
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
        }
        while ( x != randomNum);
        System.out.println("Количество попыток равно " + count);
    }
    //Циклы9
    public static void rightTriangle(int x) {
        for ( int i = 0; i < x; i++) {
            for ( int j = 0; j < x; j++ ) {
                if ( i + j >= x - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    //Циклы#8
    public static void leftTriangle(int x) {
        for ( int i = 0; i < x; i++) {
            for ( int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //Циклы#7
    public static void square(int x) {
        for ( int i = 0; i < x; i++) {
            for ( int j = 0; j < x; j++) {
                //System.out.println("*");
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //Циклы#6
    public static boolean equalNum(int x) {
        if ( x < 0 ) {
            x *= -1;
        }
        int rem = x % 10;
        for ( ; x > 0; x /= 10) {
            if ( x % 10 != rem) {
                return false;
            }
        }
        return true;
    }
    //Циклы#5
    public static int numLen(long x) {
        int res = 0;
        if ( x == 0) {
            return 1;
        }
        if ( x < 0 ) {
            x *= -1;
        }
        for ( ; x > 0; x /= 10) {
            res++;
        }
        return res;
    }
    //Циклы#4
    public static int pow(int x, int y) {
        int res = 1;
        for ( ; y > 0; y--) {
            res *= x;
        }
        return res;
    }
    //Циклы#3
    public static String chet(int x) {
        if ( x < 0) {
            return "ошибка";
        }
        String res = "";
        for ( int y = 0; y <= x; y+=2){
           res += y + " ";
        }
        return res.substring( 0, res.length() - 1);
    }
    //Циклы#2
    public static String reverseListNums(int x) {
        if ( x < 0) {
            return "ошибка";
        }
        String res = "";
        for ( int y = x; y >= 0; y--) {
            res += y;
            if ( y > 0 ) {
                res += " ";
            }
        }
        return res;
    }
    //Циклы#1
    public static String listNums(int x) {
        if ( x < 0) {
            return "ошибка";
        }
        String res = "";
        for ( int y = 0; y <= x; y++) {
            res += y;
            if ( y < x ) {
                res += " ";
            }
        }
        return res;
    }
    //Условия#12
    public static void printDays(String x) {
        switch (x) {
            case "понедельник": System.out.println("понедельник");
            case "вторник": System.out.println("вторник");
            case "среда": System.out.println("среда");
            case "четверг": System.out.println("четверг");
            case "пятница": System.out.println("пятница");
            case "суббота": System.out.println("суббота");
            case "воскресенье": System.out.println("воскресенье");
            break;
            default: System.out.println("это не день недели");
        }
    }
    //Условия#11
    public static String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    //Условия#10
    public static String age(int x) {
        if ( x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        }
        if (( x % 10 == 2 && x % 100 != 12 ) || ( x % 10 == 3 && x % 100 != 13 ) || (  x % 10 == 4 && x % 100 != 14 )) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }
    //Услвоия#9
    public static boolean magic6(int x, int y) {
        boolean res = false;
        if ( x == 6 || y == 6) {
            res = true;
        }
        if ( x + y == 6) {
            res = true;
        }
        if ( x - y == 6 || y - x == 6) {
            res = true;
        }
        return res;
    }
    //Условия#8
    public static boolean is35(int x) {
        boolean res = false;
        if ( x % 3 == 0 || x % 5 == 0) {
            res = true;
        }
        if ( x % 3 == 0 && x % 5 == 0) {
            res = false;
        }
        return res;
    }
    //Условия#7
    public static int sum2(int x, int y) {
        int res = x + y;
        if ( res >= 10 && res <= 19)  {
            return 20;
        } else {
            return res;
        }
    }
    //Условия#6
    public static boolean sum3(int x, int y, int z){
        boolean res = false;
        if ( x + y == z) {
            res = true;
        }
        if ( x + z == y) {
            res = true;
        }
        if ( z + y == x) {
            res = true;
        }
        return res;
    }
    //Условия#5
    public static int max3(int x, int y, int z) {
        if ( x >= y && x >= z) {
            return x;
        }
        if ( y >= x && y >= z ) {
            return y;
        } else {
            return z;
        }
    }
    //Услвоия#4
    public static String makeDecision(int x, int y) {
        if ( x > y ) {
            return x + " > " + y;
        }
        if ( x < y ) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }
    //Условия#3
    public static int max(int x, int y) {
        if ( x > y) {
            return x;
        } else {
            return y;
        }
    }
    //Условия#2
    public static int safeDiv(int x, int y) {
        if ( y == 0) {
            return 0;
        } else {
            return x / y;
        }
    }
    //Условия#1
    public static int abs(int x) {
        if (x < 0) {
            return x * -1;
        } else {
            return x;
        }
    }
}

import java.util.Scanner;

class IfTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 >> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println(">");
        } else if(num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}

class IfTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 0 && score <= 100) {
            if(score >= 90) {
                System.out.println("A");
            } else if(score < 90 && score >= 80) {
                System.out.println("B");
            } else if(score < 80 && score >= 70) {
                System.out.println("C");
            } else if(score < 70 && score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}

class IfTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("판별할 연도를 입력하세요 >> ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

class IfTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X좌표를 입력하세요 >> ");
        int xPos = sc.nextInt();
        System.out.print("Y좌표를 입력하세요 >> ");
        int yPos = sc.nextInt();

        if(xPos == 0 || yPos == 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            if(xPos > 0 && yPos > 0) {
                System.out.println("1");
            } else if(xPos < 0 && yPos > 0) {
                System.out.println("2");
            } else if(xPos < 0 && yPos < 0) {
                System.out.println("3");
            } else if(xPos > 0 && yPos < 0) {
                System.out.println("4");
            }
        }
    }
}

class IfTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 설정 >> ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int temp;
        if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
            minute -= 45;
            if(hour == 0) {
                hour = 23;
                if(minute < 0) {
                    temp = -minute;
                    minute = 60 - temp;
                }
            }
            if(minute < 0) {
                temp = -minute;
                minute = 60 - temp;
                hour -= 1;
            }
        }
        System.out.println(hour + " " + minute);
    }
}

class IfTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 시각을 입력하세요 >> ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        System.out.print("타이머를 설정하세요 >> ");
        int timer = sc.nextInt();


        if(hour >= 0 && hour < 24 && minute >= 0 && minute < 60) {
            hour += (minute + timer) / 60;
            minute += timer;
            if(hour >= 24) {
                hour -= 24;
            }
            if(minute % 60 == 0) {
                minute = 0;
            } else if (minute >= 60) {
                minute -= 60;
            }
        }

        System.out.println(hour + " " + minute);
    }
}

class IfTest7 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 >> ");
        int num1, num2, num3;
    }
}
package condition;

public class condition {
    public static void main(String[] args) {

    }

    //ใช้ if else เพื่อคำนวณคะแนนออกมาเป็นเกรด เช่น A, B, F
    public static char gradeCal(int score) {
        char grade;

        if (score >= 80) {
            grade = 'A';
        } else if (score > 70 && score < 80) {
            grade = 'B';
        } else {
            grade = 'F';
        }
        return grade;
    }

    //variable = (condition) ? expressionTrue :  expressionFalse;
    // if ในรูปแบบ short statement
    public static String isStatus(int status) {
        String result = (status == 0) ? "Device turn off" : "Device turn on";
        System.out.println(result);
        return result;

    }

    //ใช้ switch case เพื่อหาเกรดที่ตรงตามเคส และแสดงผลออกมา
    public static String showGrade(char grade) {
        String myGrade;

        switch (grade) {
            case 'A':
                myGrade = "Your grade is A";
                break;

            case 'B':
                myGrade = "Your grade is B";
                break;

            case 'F':
                myGrade = "Your grade is F";
                break;

            default:
                myGrade = "Invalid grade";
                break;
        }

        System.out.println(myGrade); // Print the grade message
        return myGrade;
    }


}
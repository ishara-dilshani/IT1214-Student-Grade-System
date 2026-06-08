public class GradeCalculator {

    // Method to calculate grade based on marks
    public static String calculateGrade(double marks) {
        if (marks >= 75) {
            return "A";
        } else if (marks >= 65) {
            return "B";
        } else if (marks >= 55) {
            return "C";
        } else if (marks >= 35) {
            return "S";
        } else {
            return "F";
        }
    }

    // Method to check pass/fail
    public static boolean isPass(double marks) {
        return marks >= 35;
    }
}
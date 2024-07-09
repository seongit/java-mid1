package enumeration.test;

public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] authGrade = AuthGrade.values();

        for (AuthGrade grade : authGrade) {
            System.out.println("grade=" + grade.name() + ", level=" + grade.level + "설명=" + grade.description);
        }
    }
}

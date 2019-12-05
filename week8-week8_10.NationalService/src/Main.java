
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        
        CivilService cv = new CivilService();
        System.out.println(cv.getDaysLeft());
        cv.work();
        cv.work();
        cv.work();
        System.out.println(cv.getDaysLeft());
        
        MilitaryService ms = new MilitaryService(1);
        ms.work();
        ms.work();
        ms.work();
        ms.work();
        System.out.println(ms.getDaysLeft());
        
    }
}

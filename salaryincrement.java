
public class salaryincrement {

    public static void main(String[] args) {
        double salary = 6000;
        double rating = 3;
        if (rating >= 1 && rating <= 3) {
            salary = salary + ((0.1 * salary));
        } else if (rating > 3 && rating <= 4) {
            salary = salary + ((0.25 * salary));
        } else if (rating > 4 && rating <= 5) {
            salary = salary + ((0.3 * salary));
        } else {
            System.out.println("invalid input");
        }
        System.out.println("Salary:" + salary);
    }

}

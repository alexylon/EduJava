package discountcard;

import java.util.Arrays;
import java.util.Date;

public class DiscountCardTest {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Dimitar");
        Customer customer2 = new Customer("Ivan");
        Customer customer3 = new Customer("Petia");
        customer1.setMemberType("premium");
        customer2.setMemberType("silver");
        customer3.setMemberType(null);

        Date today = new Date();

        Visit visit1 = new Visit(customer1, today);
        Visit visit2 = new Visit(customer2, today);
        Visit visit3 = new Visit(customer3, today);
        visit1.setServiceExpense(10.0);
        visit1.setProductExpense(20.0);
        visit2.setServiceExpense(10.0);
        visit3.setServiceExpense(10.0);

        Visit[] visits = new Visit[3];
        visits[0] = visit1;
        visits[1] = visit2;
        visits[2] = visit3;
        double sum = 0.0;
        for (int i = 0; i < visits.length; i++)
            sum += visits[i].getTotalExpense();

        System.out.println(visit1);
        System.out.println(visit2);
        System.out.println(visit3);
        System.out.println("\n" + Arrays.toString(visits));
        System.out.println("\nThe total expenses of all customers are: $" + sum);

    }
}

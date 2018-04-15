package discountcard;

import java.util.*;

public class Visit {

    private Customer customer;

    private Date date;

    private double serviceExpense;

    private double productExpense;


    public Visit(Customer name, Date date) {
        this.customer = name;
        this.date = date;

    }

    public String getName() {
        return this.customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex
                * (1 - DiscountRate.getServiceDiscountRate(this.customer.getMemberType()));

    }


    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex
                * (1 - DiscountRate.getProductDiscountRate(this.customer.getMemberType()));

    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public String memberType() {
        if (customer.isMember())
            return "a " + customer.getMemberType() + " member";
        return "not a member";
    }

    public String toString() {
        return this.customer.getName() + " is "
                + memberType()
                + " and has service expenses $"
                + serviceExpense + " and product expenses $" + productExpense
                + " (total $" + getTotalExpense() + ")"
                + " at " + date;
    }

}
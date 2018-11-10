
package me.alexandroff.maxplus.discountcard;

public class Customer {

    public Customer() {
    }

    private String name;

    private boolean member = false;

    private String memberType;


    public Customer(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public boolean isMember() {
        if (memberType == "premium"
                || memberType == "gold" || memberType == "silver")
            return true;
        return false;
    }

    public void setMember(boolean member) {

    }

    public String getMemberType() {
        return this.memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String toString() {
        // TODO implement here
        return "";
    }

}
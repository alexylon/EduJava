
package discountcard;

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
        if (memberType.equals("premium")
                || memberType.equals("gold") || memberType.equals("silver"))
            this.member = true;
        this.member = false;
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
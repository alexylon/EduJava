package me.alexandroff.maxplus.discountcard;

public class DiscountRate {


    private static double serviceDiscountPremium = 0.2;

    private static double serviceDiscountGold = 0.15;

    private static double serviceDiscountSilver = 0.1;

    private static double productDiscountPremium = 0.1;

    private static double productDiscountGold = 0.1;

    private static double productDiscountSilver = 0.1;


    public static double getServiceDiscountRate(String type) {
        if (type == "premium")
            return serviceDiscountPremium;
        if (type == "gold")
            return serviceDiscountGold;
        if (type == "silver")
            return serviceDiscountSilver;
        return 0.0;
    }

    public static double getProductDiscountRate(String type) {
        if (type == "premium")
            return productDiscountPremium;
        if (type == "gold")
            return productDiscountGold;
        if (type == "silver")
            return productDiscountSilver;
        return 0.0d;
    }

}
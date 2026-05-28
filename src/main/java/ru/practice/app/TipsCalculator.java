package ru.practice.app;

public class TipsCalculator {
    public static TipResult calculateTips(Bill bill) {
        if (bill == null || bill.getAmount() <= 0) {
            return new TipResult(0.0, 0.0, 0.0);
        }
        double tipRate;
        switch (bill.getServiceQuality()){
            case ServiceQuality.EXCELLENT -> tipRate = 0.15;
            case ServiceQuality.BAD -> tipRate = 0.05;
            default -> tipRate = 0.10;
        }

        if(bill.getGuestsCount() >= 10) {
            tipRate += 0.05;
        }

        Double tipsAmount = Math.ceil(bill.getAmount() * tipRate * 100) / 100;

        return new TipResult(bill.getAmount(), tipsAmount, bill.getAmount() + tipsAmount);
    }
}

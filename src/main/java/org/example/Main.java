package org.example;

public class Main {
    public static void main(String[] args) {
        String[] result = {"Джо", "Роберт", "Макс","Стинг"};
        String finalRes = createDailyPlan(result);
        System.out.println(finalRes);
    }
    public static String createDailyPlan(String[] plans) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < plans.length; i++) {
            builder.append(i + 1).append(".").append(")").append(" ").append(plans[i]).append(";").append("\n");
        }
        String name = String.valueOf(builder);
        return "My plans:" + "\n"  + name;
    }
}
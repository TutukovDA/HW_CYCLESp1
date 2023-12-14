package ru.netology.javaqa.hw_cyclesp1.services;
public class JobOrVacation {
    public static int countVacationMonth(int deposit, int income, int expenses, int threshold) {
        int count = 0;
        for (int i = 0; i < 12; i++) {
            System.out.print("Денег " + deposit + ". ");
            if (deposit >= threshold) {
                deposit = deposit - expenses;
                System.out.println("Можно отдыхать. " + "Потратил - " + expenses + " А затем еще " + ((deposit / 3) - deposit));
                deposit = deposit / 3;
                count++;
            } else {
                deposit = deposit + income - expenses;
                System.out.println("Придется работать. Заработал +" + income + ". Потратил -" + expenses);
            }
        }
        return count;
    }
}

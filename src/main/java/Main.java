import ru.netology.javaqa.hw_cyclesp1.services.JobOrVacation;

public class Main {
    public static void main(String[] args) {
        JobOrVacation count = new JobOrVacation();
        int actual = count.countVacationMonth(0, 100000, 60000, 150000);
        System.out.println("Фрилансер может отдыхать " + actual + " месяцев/ца");
    }
}

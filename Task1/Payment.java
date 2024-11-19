public class Payment {
    // Поля класу
    private String lastName;          // Прізвище
    private String firstName;         // Ім'я
    private double salary;            // Оклад
    private int yearOfEmployment;     // Рік поступлення на роботу
    private double bonusPercentage;   // Відсоток надбавки
    private double taxPercentage;     // Податок (як відсоток)
    private int workedDays;           // Кількість відпрацьованих днів в місяць
    private int daysInMonth;          // Кількість днів у місяці

    // Конструктор для ініціалізації полів
    public Payment(String lastName, String firstName, double salary, int yearOfEmployment,
                   double bonusPercentage, double taxPercentage, int workedDays, int daysInMonth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.yearOfEmployment = yearOfEmployment;
        this.bonusPercentage = bonusPercentage;
        this.taxPercentage = taxPercentage;
        this.workedDays = workedDays;
        this.daysInMonth = daysInMonth;
    }

    // Метод для обчислення нарахованої суми
    public double calculateAccruedAmount() {
        double dailySalary = salary / daysInMonth;  // денна ставка
        double accrued = dailySalary * workedDays;  // нарахована сума без бонусу
        // Додаємо бонус до нарахованої суми
        return accrued + accrued * (bonusPercentage / 100);
    }

    // Метод для обчислення утриманої суми (податок)
    public double calculateWithheldAmount() {
        return calculateAccruedAmount() * (taxPercentage / 100);
    }

    // Метод для обчислення стажу роботи
    public int calculateYearsOfExperience(int currentYear) {
        return currentYear - yearOfEmployment;
    }

    // Виведення даних
    public void printPaymentDetails(int currentYear) {
        double accruedAmount = calculateAccruedAmount();
        double withheldAmount = calculateWithheldAmount();
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Tax Percentage: " + taxPercentage + "%");
        System.out.println("Worked Days: " + workedDays + "/" + daysInMonth);
        System.out.println("Accrued Amount: " + accruedAmount);
        System.out.println("Withheld Amount: " + withheldAmount);
        System.out.println("Years of Experience: " + calculateYearsOfExperience(currentYear));
    }
}

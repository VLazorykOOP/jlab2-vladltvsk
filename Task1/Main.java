public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу Payment
        Payment payment = new Payment("Ivanov", "Ivan", 5000, 2015, 10, 18, 22, 30);

        // Виведення всіх даних
        payment.printPaymentDetails(2024); // Поточний рік 2024
    }
}

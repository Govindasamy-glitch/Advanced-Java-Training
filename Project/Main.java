import java.util.*;

// 🔹 Abstract Class (Abstraction)
abstract class Expense {
    private double amount;
    private String description;

    public Expense(double amount, String description) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive!");
        }
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public abstract String getCategory(); // Polymorphism
}

// 🔹 Food Expense (Inheritance)
class FoodExpense extends Expense {
    public FoodExpense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getCategory() {
        return "Food";
    }
}

// 🔹 Travel Expense (Inheritance)
class TravelExpense extends Expense {
    public TravelExpense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getCategory() {
        return "Travel";
    }
}

// 🔹 User Class (Encapsulation)
class User {
    private String name;
    private List<Expense> expenses;

    public User(String name) {
        this.name = name;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public String getName() {
        return name;
    }
}

// 🔹 Manager Class (Business Logic)
class ExpenseManager {

    // Calculate total expense
    public static double calculateTotal(User user) {
        double total = 0;
        for (Expense e : user.getExpenses()) {
            total += e.getAmount();
        }
        return total;
    }

    // Show all expenses
    public static void showAllExpenses(User user) {
        for (Expense e : user.getExpenses()) {
            System.out.println(e.getCategory() + ": ₹" + e.getAmount() + " - " + e.getDescription());
        }
    }

    // Extra Feature: Filter by category
    public static void showByCategory(User user, String category) {
        for (Expense e : user.getExpenses()) {
            if (e.getCategory().equalsIgnoreCase(category)) {
                System.out.println(e.getCategory() + ": ₹" + e.getAmount() + " - " + e.getDescription());
            }
        }
    }
}

// 🔹 Custom Exception (Advanced)
class InvalidExpenseException extends Exception {
    public InvalidExpenseException(String message) {
        super(message);
    }
}

// 🔹 Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User("Govind");

        try {
            System.out.println("Enter number of expenses:");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter expense type (Food/Travel):");
                String type = sc.nextLine();

                System.out.println("Enter amount:");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter description:");
                String desc = sc.nextLine();

                Expense expense;

                // Polymorphism in action
                if (type.equalsIgnoreCase("Food")) {
                    expense = new FoodExpense(amount, desc);
                } else if (type.equalsIgnoreCase("Travel")) {
                    expense = new TravelExpense(amount, desc);
                } else {
                    throw new InvalidExpenseException("Invalid expense type!");
                }

                user.addExpense(expense);
            }

            System.out.println("\n--- All Expenses ---");
            ExpenseManager.showAllExpenses(user);

            System.out.println("\nTotal Expense: ₹" + ExpenseManager.calculateTotal(user));

            System.out.println("\n--- Food Expenses ---");
            ExpenseManager.showByCategory(user, "Food");

        } catch (InvalidExpenseException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        sc.close();
    }
}
import java.util.Scanner;

class TollBoothRevenueManager {
    
    double carTollRate;
    double truckTollRate;
    double motorcycleTollRate;
    int carCount;
    int truckCount;
    int motorcycleCount;

    void setTollRates(double carRate, double truckRate, double motorcycleRate) {
        carTollRate = carRate;
        truckTollRate = truckRate;
        motorcycleTollRate = motorcycleRate;
    }

    void acceptRecord(int carCount, int truckCount, int motorcycleCount) {
        this.carCount = carCount;
        this.truckCount = truckCount;
        this.motorcycleCount = motorcycleCount;
    }

    double calculateRevenue() {
        return (carCount * carTollRate) + (truckCount * truckTollRate) + (motorcycleCount * motorcycleTollRate);
    }

    void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;
        double totalRevenue = calculateRevenue();
        System.out.println("Total Vehicles: " + totalVehicles);
        System.out.println("Total Revenue Collected: ₹" + totalRevenue);
    }
}

public class TollBoothTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBoothRevenueManager manager = new TollBoothRevenueManager();

        System.out.println("Enter toll rate for Car:");
        manager.carTollRate = scanner.nextDouble();
        
        System.out.println("Enter toll rate for Truck:");
        manager.truckTollRate = scanner.nextDouble();
        
        System.out.println("Enter toll rate for Motorcycle:");
        manager.motorcycleTollRate = scanner.nextDouble();

        System.out.println("Enter the number of Cars:");
        int cars = scanner.nextInt();
        
        System.out.println("Enter the number of Trucks:");
        int trucks = scanner.nextInt();
        
        System.out.println("Enter the number of Motorcycles:");
        int motorcycles = scanner.nextInt();
        
        manager.acceptRecord(cars, trucks, motorcycles);
        manager.printRecord();
        scanner.close();
    }
}

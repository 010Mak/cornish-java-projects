
class zeitems {
  String name;
  double cost;

  zeitems(String name, double cost) {
      this.name = name;
      this.cost = cost;
  }
}


public class Main {
  public static void main(String[] args) {
      // Step 2: Create a list of grocery items
      zeitems[] items = {
          new zeitems("Apples", 3.50),
          new zeitems("Bread", 2.50),
          new zeitems("Milk", 1.50),
          new zeitems("Cheese", 4.00),
          new zeitems("Eggs", 2.00)
      };

      double purchasingThreshold = 3.00; 
      double totalCost = 0.0; 


      for (zeitems item : items) {
          if (item.cost <= purchasingThreshold) {
              System.out.println("Purchased: " + item.name + " for $" + item.cost);
              totalCost += item.cost; // Adding cost to total
          } else {
              System.out.println("Did not purchase: " + item.name + " (Cost: $" + item.cost + ")");
          }
      }

    
      System.out.println("total cost" + totalCost);
  }
}

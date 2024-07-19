
    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.Map;
    import java.util.Scanner;
    import java.util.Set;
    
    /**
     * laptopMain
     */
    public class LaptopMain {
        public static void main(String[] args) {
            Laptop laptop1 = new Laptop(8, 512, "Windows 10", "black");
            Laptop laptop2 = new Laptop(12, 256, "Windows 11", "white");
            Laptop laptop3 = new Laptop(16, 1024, "Windows 11", "yellow");
            Laptop laptop4 = new Laptop(8, 512, "Windows 10", "grey");
            Laptop laptop5 = new Laptop(2, 124, "linux", "white");
            Laptop laptop6 = new Laptop(32, 2048, "Windows 11", "yellow");
            Laptop laptop7 = new Laptop(64, 2048, "linux", "brown");
            Laptop laptop8 = new Laptop(12, 1024, "MacOS", "white");
            Laptop laptop9 = new Laptop(4, 256, "Windows 8.1", "pink");
            Laptop laptop10 = new Laptop(6, 512, "Windows 10", "blue");
    
            Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9, laptop10));
    
            Set<Laptop> filteredLaptopsAll = new HashSet<>();
            filteredLaptopsAll = filteredLaptopsAll(makeMapForFilteringAll(), laptops);   
            for (Laptop laptop : filteredLaptopsAll) {
                System.out.println(laptop);
                System.out.println();
            }
        }
            public static Map<String, String> makeMapForFilteringAll() {
                Scanner scan = new Scanner(System.in);
                Map<String, String> valuesForFiltering = new HashMap<>();
                System.out.println("Write your value for each category");
        
                System.out.println("1 - RAM (gb):");
                String rAM = scan.nextLine();
                valuesForFiltering.put("RAM", rAM);
        
                System.out.println("2 - Hard Drive Capacity (gb): ");
                String hDC = scan.nextLine();
                valuesForFiltering.put("Hard Drive Capacity", hDC);
        
                System.out.println("3 - Operation System: ");
                String os = scan.nextLine();
                valuesForFiltering.put("Operation System", os);
        
                System.out.println("4 - Color: ");
                String color = scan.nextLine();
                valuesForFiltering.put("Color", color);
        
                scan.close();
                return valuesForFiltering;
            }
        
            public static Set<Laptop> filteredLaptopsAll(Map<String, String> valuesForFiltering, Set<Laptop> laptops) {
                Set<Laptop> filteredLaptops = new HashSet<>();
                String rAM = valuesForFiltering.get("RAM");
                int memory = Integer.parseInt(rAM);
                String hDC = valuesForFiltering.get("Hard Drive Capacity");
                int hardMemory = Integer.parseInt(hDC);
                String os = valuesForFiltering.get("Operation System");
                String color = valuesForFiltering.get("Color");
        
                for (Laptop laptop : laptops) {
                    if (laptop.getrAM() >= memory && laptop.getHardDriveCapacity() >= hardMemory
                            && laptop.getOperationSystem().equals(os) && laptop.getColor().equals(color)) {
                        filteredLaptops.add(laptop);
                    }
                }
                return filteredLaptops;
        
            }
}

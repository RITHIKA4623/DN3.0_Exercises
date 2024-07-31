public class BuilderPatternExample {

    public static void main(String[] args) {
        // Create different configurations of Computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setMotherboard("ASUS ROG")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setPowerSupply("500W")
                .setMotherboard("Gigabyte")
                .build();

        // Create and display components for gamingComputer
        CPU gamingCPU = new CPU("Gaming CPU", "Intel i9", 8);
        RAM gamingRAM = new RAM("Gaming RAM", 32, "DDR4");
        Storage gamingStorage = new Storage("Gaming Storage", 1000, "SSD");
        GraphicsCard gamingGraphics = new GraphicsCard("Gaming Graphics Card", "NVIDIA RTX 3080", 10);
        PowerSupply gamingPower = new PowerSupply("Gaming Power Supply", 750);
        Motherboard gamingMotherboard = new Motherboard("Gaming Motherboard", "ASUS ROG");

        System.out.println("Gaming Computer Configuration:");
        gamingCPU.displayDetails();
        gamingRAM.displayDetails();
        gamingStorage.displayDetails();
        gamingGraphics.displayDetails();
        gamingPower.displayDetails();
        gamingMotherboard.displayDetails();

        // Create and display components for officeComputer
        CPU officeCPU = new CPU("Office CPU", "Intel i5", 6);
        RAM officeRAM = new RAM("Office RAM", 16, "DDR4");
        Storage officeStorage = new Storage("Office Storage", 512, "SSD");
        PowerSupply

public abstract class ComputerComponent {
    protected String name;

    public ComputerComponent(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}

class CPU extends ComputerComponent {
    private String model;
    private int cores;

    public CPU(String name, String model, int cores) {
        super(name);
        this.model = model;
        this.cores = cores;
    }

    @Override
    public void displayDetails() {
        System.out.println("CPU: " + name + ", Model: " + model + ", Cores: " + cores);
    }
}

class RAM extends ComputerComponent {
    private int size; // in GB
    private String type;

    public RAM(String name, int size, String type) {
        super(name);
        this.size = size;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        System.out.println("RAM: " + name + ", Size: " + size + "GB, Type: " + type);
    }
}

class Storage extends ComputerComponent {
    private int capacity; // in GB
    private String type;

    public Storage(String name, int capacity, String type) {
        super(name);
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        System.out.println("Storage: " + name + ", Capacity: " + capacity + "GB, Type: " + type);
    }
}

class GraphicsCard extends ComputerComponent {
    private String model;
    private int memory; // in GB

    public GraphicsCard(String name, String model, int memory) {
        super(name);
        this.model = model

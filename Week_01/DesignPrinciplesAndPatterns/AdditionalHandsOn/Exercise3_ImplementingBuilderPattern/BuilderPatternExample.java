class Computer {
    private String cpu;
    private String ram;
    private String storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }
    
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void printSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {

        Computer normal = new Computer.Builder()
                .setCpu("Intel Core i3")
                .setRam("4GB")
                .build(); //without storage

        Computer gaming = new Computer.Builder()
                .setCpu("Intel Core i7")
                .setRam("16GB")
                .setStorage("512GB")
                .build();

        System.out.println("Normal Computer:");
        normal.printSpecs();

        System.out.println("\nGaming Computer:");
        gaming.printSpecs();
    }
}

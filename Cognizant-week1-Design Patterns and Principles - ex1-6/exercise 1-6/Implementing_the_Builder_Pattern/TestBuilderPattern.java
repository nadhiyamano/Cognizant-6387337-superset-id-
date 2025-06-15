package Implementing_the_Builder_Pattern;

public class TestBuilderPattern {
    public static void main(String[] args) {

        Computer basicPC = new Computer.Builder("Intel i3", "4GB")
                .build();

        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        Computer workstation = new Computer.Builder("AMD Ryzen 9", "64GB")
                .setStorage("2TB SSD")
                .setOperatingSystem("Linux")
                .build();

        System.out.println("Basic PC Configuration:");
        basicPC.displayConfiguration();

        System.out.println("Gaming PC Configuration:");
        gamingPC.displayConfiguration();

        System.out.println("Workstation Configuration:");
        workstation.displayConfiguration();
    }
}


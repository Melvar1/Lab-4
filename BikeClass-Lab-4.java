class Bike { // The base class for all bikes
    class Bike {
        private String type;
    
        public Bike() {
            this.type = "Generic Bike";
        }
    
        // A method to display bike details
        public void displayBikeDetails() {
            System.out.println("Type of bike: " + type);
        }
    
        // A method that can be overridden
        public void pedal() {
            System.out.println("This bike can be pedaled at a normal speed.");
        }
    }
    
    // Subclass for MountainBike
    class MountainBike extends Bike {
    
        public MountainBike() {
            super(); // Call the constructor of the superclass Bike
        }
    
        // Overriding the pedal method
        @Override
        public void pedal() {
            super.pedal(); // Call the pedal method of the superclass Bike
            System.out.println("This mountain bike can also be pedaled on rough terrain.");
        }
    }
    
    // Subclass for RoadBike
    class RoadBike extends Bike {
    
        public RoadBike() {
            super(); // Call the constructor of the superclass Bike
        }
    
        // Overriding the pedal method
        @Override
        public void pedal() {
            System.out.println("This road bike is designed for high speed on paved roads.");
        }
    }
    
    // Subclass for ElectricBike
    class ElectricBike extends Bike {
    
        public ElectricBike() {
            super(); // Call the constructor of the superclass Bike
        }
    
        // Overriding the pedal method
        @Override
        public void pedal() {
            // Note: We are not calling super.pedal() here because we want different behavior
            System.out.println("This electric bike can be pedaled, but also has an electric motor assist.");
        }
    }
    
    // Main class to demonstrate the program
    public class Main {
        public static void main(String[] args) {
            Bike genericBike = new Bike();
            MountainBike mountainBike = new MountainBike();
            RoadBike roadBike = new RoadBike();
            ElectricBike electricBike = new ElectricBike();
    
            // Demonstrate method overriding and use of 'super'
            genericBike.displayBikeDetails();
            genericBike.pedal();
    
            mountainBike.displayBikeDetails();
            mountainBike.pedal();
    
            roadBike.displayBikeDetails();
            roadBike.pedal();
    
            electricBike.displayBikeDetails();
            electricBike.pedal();
        }
    }
    
    private String type;

    public Bike() {
        this.type = "Generic Bike";
    }

    // A method to display bike details
    public void displayBikeDetails() {
        System.out.println("Type of bike: " + type);
    }

    // A method that can be overridden
    public void pedal() {
        System.out.println("This bike can be pedaled at a normal speed.");
    }
}

// Subclass for MountainBike
class MountainBike extends Bike {

    public MountainBike() {
        super(); // Call the constructor of the superclass Bike
    }

    // Overriding the pedal method
    @Override
    public void pedal() {
        super.pedal(); // Call the pedal method of the superclass Bike
        System.out.println("This mountain bike can also be pedaled on rough terrain.");
    }
}

// Subclass for RoadBike
class RoadBike extends Bike {

    public RoadBike() {
        super(); // Call the constructor of the superclass Bike
    }

    // Overriding the pedal method
    @Override
    public void pedal() {
        System.out.println("This road bike is designed for high speed on paved roads.");
    }
}

// Subclass for ElectricBike
class ElectricBike extends Bike {

    public ElectricBike() {
        super(); // Call the constructor of the superclass Bike
    }

    // Overriding the pedal method
    @Override
    public void pedal() {
        System.out.println("This electric bike can be pedaled, but also has an electric motor assist.");
    }
}

// Main class to demonstrate the program
public class Main {
    public static void main(String[] args) {
        Bike genericBike = new Bike();
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        ElectricBike electricBike = new ElectricBike();

        // Demonstrate method overriding and use of 'super'
        genericBike.displayBikeDetails();
        genericBike.pedal();

        mountainBike.displayBikeDetails();
        mountainBike.pedal();

        roadBike.displayBikeDetails();
        roadBike.pedal();

        electricBike.displayBikeDetails();
        electricBike.pedal();
    }
}


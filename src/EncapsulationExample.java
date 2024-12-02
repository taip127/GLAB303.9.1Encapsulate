// Class definition for HumanBeing
class HumanBeing {
    private float weight;
    private float height;
    private float bmi;

    // Constructor with parameters
    public HumanBeing(float weight, float height, float bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    // Default constructor
    public HumanBeing() {
    }

    // Getter and Setter for weight
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Getter and Setter for height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Getter and Setter for bmi
    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
}

// Main class for demonstration
public class EncapsulationExample {
    public static void main(String[] args) {
        // Create an instance of HumanBeing
        HumanBeing h1 = new HumanBeing();

        // Using setters of HumanBeing
        h1.setHeight(1.65f);
        h1.setWeight(68);
        h1.setBmi(calculateBmi(h1));

        // Using getters of HumanBeing
        System.out.println("Person has " + h1.getWeight() + " kgs and is " + h1.getHeight() +
                " meters in height, which results in BMI of " + h1.getBmi());
    }

    // Method to calculate BMI
    public static float calculateBmi(HumanBeing h1) {
        return h1.getWeight() / (h1.getHeight() * h1.getHeight());
    }
}

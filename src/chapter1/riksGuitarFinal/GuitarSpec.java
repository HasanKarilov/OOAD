package chapter1.riksGuitarFinal;


public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (this.builder != otherSpec.builder)
            return false;
        if ((this.model != null) && (!this.model.equals("")) &&
                (!this.model.toLowerCase().equals(otherSpec.model.toLowerCase())))
            return false;
        if (this.type != otherSpec.type)
            return false;
        if (this.numStrings != otherSpec.numStrings)
            return false;
        if (this.backWood != otherSpec.backWood)
            return false;
        if (this.topWood != otherSpec.topWood)
            return false;
        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
package chapter1.riksGuitarEncapsulation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood, Wood topWood) {

        guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
    }
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(Guitar searchGuitar) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            if (searchGuitar.getSpec().getBuilder() != guitar.getSpec().getBuilder())
                continue;
            String model = searchGuitar.getSpec().getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equalsIgnoreCase(guitar.getSpec().getModel())))
                continue;
            if (searchGuitar.getSpec().getType() != guitar.getSpec().getType())
                continue;
            if (searchGuitar.getSpec().getBackWood() != guitar.getSpec().getBackWood())
                continue;
            if (searchGuitar.getSpec().getTopWood() != guitar.getSpec().getTopWood())
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
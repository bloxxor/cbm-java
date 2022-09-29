package Uebungen.ElecronicsVendor;

public class ElectronicDevices {

    private String name;
    private String category;
    private String specifications;

    public ElectronicDevices(String name, String category, String specifications) {
        this.name = name;
        this.category = category;
        this.specifications = specifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public void displayDevices() {
        System.out.println(name);
        System.out.println(category);
        System.out.println(specifications);
    }

}

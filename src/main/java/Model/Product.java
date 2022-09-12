package Model;

import java.util.Objects;

public class Product {

    private int id;
    private String name;


    // Constructor
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter und Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Equals und HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product ) o;

        if (id != that.id) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    // toString
    @Override
    public String toString() {
        return "ProductRepo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}

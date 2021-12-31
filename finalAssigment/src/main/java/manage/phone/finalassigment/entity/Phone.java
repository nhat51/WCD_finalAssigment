package manage.phone.finalassigment.entity;

import manage.phone.finalassigment.annotation.Column;
import manage.phone.finalassigment.annotation.Entity;
import manage.phone.finalassigment.annotation.ForeignKey;
import manage.phone.finalassigment.annotation.Id;
import manage.phone.finalassigment.util.SQLDataTypes;

@Entity(tableName = "phones")
public class Phone {
    @Id(autoIncrement = true)
    @Column(name = "id",type = SQLDataTypes.INTEGER)
    private int id;
    @Column(name = "name",type = SQLDataTypes.VARCHAR255)
    private String name;
    @Column(name = "brandId",type = SQLDataTypes.INTEGER)
    @ForeignKey(referenceTable = "brands",referenceColumn = "id")
    private int brandId;
    @Column(name = "price",type = SQLDataTypes.DOUBLE)
    private Double price;
    @Column(name = "description",type = SQLDataTypes.TEXT)
    private String description;

    public Phone() {
    }

    public Phone(String name, int brandId, Double price, String description) {
        this.name = name;
        this.brandId = brandId;
        this.price = price;
        this.description = description;
    }

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

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

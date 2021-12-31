package manage.phone.finalassigment.entity;

import manage.phone.finalassigment.annotation.Column;
import manage.phone.finalassigment.annotation.Entity;
import manage.phone.finalassigment.annotation.Id;
import manage.phone.finalassigment.util.SQLDataTypes;

@Entity(tableName = "brands")
public class Brand {
    @Id(autoIncrement = true)
    @Column(name = "id",type = SQLDataTypes.INTEGER)
    private int id;
    @Column(name = "name", type = SQLDataTypes.VARCHAR50)
    private String name;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
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
}

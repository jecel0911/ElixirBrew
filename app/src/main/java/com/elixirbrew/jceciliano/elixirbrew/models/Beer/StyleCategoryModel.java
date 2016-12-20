package com.elixirbrew.jceciliano.elixirbrew.models.Beer;

import org.parceler.Parcel;

/**
 * Created by jceciliano on 20/12/16.
 */


/**
 * Style Categories
 */
@Parcel(Parcel.Serialization.BEAN)
public class StyleCategoryModel {
    private int id;
    private String name;
    private String createDate;

    /**
     * Empty constructor
     */
    public StyleCategoryModel() {
    }

    /**
     * Full constructor
     * @param id
     * @param name
     * @param createDate
     */
    public StyleCategoryModel(int id, String name, String createDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}

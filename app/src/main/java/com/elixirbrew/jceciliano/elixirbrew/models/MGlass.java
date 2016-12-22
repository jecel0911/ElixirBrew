package com.elixirbrew.jceciliano.elixirbrew.models;

import org.parceler.Parcel;

/**
 * Created by jceciliano on 20/12/16.
 */

/**
 * Contains the details about the assigned glass (id, name). The name of the glass is the type of glass in which the beer is best served.
 */
@Parcel(Parcel.Serialization.BEAN)
public class MGlass {
    private int id;
    private String name;
    private String createDate;

    /**
     * empty constructor
     */
    public MGlass() {
    }

    /**
     * Full constructor
     * @param id
     * @param name
     * @param createDate
     */
    public MGlass(int id, String name, String createDate) {
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


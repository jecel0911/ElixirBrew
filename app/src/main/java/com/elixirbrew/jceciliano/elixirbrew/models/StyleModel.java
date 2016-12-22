package com.elixirbrew.jceciliano.elixirbrew.models;

import org.parceler.Parcel;

/**
 * Created by jceciliano on 20/12/16.
 */

/**
 * The style object contains details about the assigned style: id, categoryId, category (id, name), name, description, ibuMin, ibuMax, abvMax, srmMin, srmMax, ogMin, fgMin, fgMax).
 */
@Parcel(Parcel.Serialization.BEAN)
public class StyleModel {
    private int id;
    private int categoryId;
    private StyleCategoryModel category;
    private String name;
    private String shortName;
    private String description;
    private int ibuMin;
    private int ibuMax;
    private int abvMin;
    private int abvMax;
    private int srmMin;
    private int srmMax;
    private int ogMin;
    private int fgMin;
    private int fgMax;
    private String createDate;
    private String updateDate;

    /**
     * empty constructor
     */
    public StyleModel() {
    }

    /**
     * Full constructor
     * @param id
     * @param categoryId
     * @param category
     * @param name
     * @param shortName
     * @param description
     * @param ibuMin
     * @param ibuMax
     * @param abvMin
     * @param abvMax
     * @param srmMin
     * @param srmMax
     * @param ogMin
     * @param fgMin
     * @param fgMax
     * @param createDate
     * @param updateDate
     */
    public StyleModel(int id, int categoryId, StyleCategoryModel category, String name, String shortName, String description, int ibuMin, int ibuMax, int abvMin, int abvMax, int srmMin, int srmMax, int ogMin, int fgMin, int fgMax, String createDate, String updateDate) {
        this.id = id;
        this.categoryId = categoryId;
        this.category = category;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.ibuMin = ibuMin;
        this.ibuMax = ibuMax;
        this.abvMin = abvMin;
        this.abvMax = abvMax;
        this.srmMin = srmMin;
        this.srmMax = srmMax;
        this.ogMin = ogMin;
        this.fgMin = fgMin;
        this.fgMax = fgMax;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public StyleCategoryModel getCategory() {
        return category;
    }

    public void setCategory(StyleCategoryModel category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIbuMin() {
        return ibuMin;
    }

    public void setIbuMin(int ibuMin) {
        this.ibuMin = ibuMin;
    }

    public int getIbuMax() {
        return ibuMax;
    }

    public void setIbuMax(int ibuMax) {
        this.ibuMax = ibuMax;
    }

    public int getAbvMin() {
        return abvMin;
    }

    public void setAbvMin(int abvMin) {
        this.abvMin = abvMin;
    }

    public int getAbvMax() {
        return abvMax;
    }

    public void setAbvMax(int abvMax) {
        this.abvMax = abvMax;
    }

    public int getSrmMin() {
        return srmMin;
    }

    public void setSrmMin(int srmMin) {
        this.srmMin = srmMin;
    }

    public int getSrmMax() {
        return srmMax;
    }

    public void setSrmMax(int srmMax) {
        this.srmMax = srmMax;
    }

    public int getOgMin() {
        return ogMin;
    }

    public void setOgMin(int ogMin) {
        this.ogMin = ogMin;
    }

    public int getFgMin() {
        return fgMin;
    }

    public void setFgMin(int fgMin) {
        this.fgMin = fgMin;
    }

    public int getFgMax() {
        return fgMax;
    }

    public void setFgMax(int fgMax) {
        this.fgMax = fgMax;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}

package com.elixirbrew.jceciliano.elixirbrew.models;

import org.parceler.Parcel;

/**
 * Created by jceciliano on 20/12/16.
 */

/**
 * Beer model, stores each beer object
 */
@Parcel(Parcel.Serialization.BEAN)
public class MBeer {
    private String id;
    private String name;
    private String nameDisplay;
    private String description;
    private int abv;
    private int glasswareId;
    private int styleId;
    private Character isOrganic;
    private String status;
    private String statusDisplay;
    private String createDate;
    private String updateDate;
    private MGlass glass;
    private MStyle style;

    /**
     * empty constructor
     */
    public MBeer() {
    }

    /**
     * Complete constructor
     * @param id
     * @param name
     * @param nameDisplay
     * @param description
     * @param abv
     * @param glasswareId
     * @param styleId
     * @param isOrganic
     * @param status
     * @param statusDisplay
     * @param createDate
     * @param updateDate
     * @param glass
     * @param style
     */
    public MBeer(String id, String name, String nameDisplay, String description, int abv, int glasswareId, int styleId, Character isOrganic, String status, String statusDisplay, String createDate, String updateDate, MGlass glass, MStyle style) {
        this.id = id;
        this.name = name;
        this.nameDisplay = nameDisplay;
        this.description = description;
        this.abv = abv;
        this.glasswareId = glasswareId;
        this.styleId = styleId;
        this.isOrganic = isOrganic;
        this.status = status;
        this.statusDisplay = statusDisplay;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.glass = glass;
        this.style = style;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDisplay() {
        return nameDisplay;
    }

    public void setNameDisplay(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAbv() {
        return abv;
    }

    public void setAbv(int abv) {
        this.abv = abv;
    }

    public int getGlasswareId() {
        return glasswareId;
    }

    public void setGlasswareId(int glasswareId) {
        this.glasswareId = glasswareId;
    }

    public int getStyleId() {
        return styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    public Character getIsOrganic() {
        return isOrganic;
    }

    public void setIsOrganic(Character isOrganic) {
        this.isOrganic = isOrganic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDisplay() {
        return statusDisplay;
    }

    public void setStatusDisplay(String statusDisplay) {
        this.statusDisplay = statusDisplay;
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

    public MGlass getGlass() {
        return glass;
    }

    public void setGlass(MGlass glass) {
        this.glass = glass;
    }

    public MStyle getStyle() {
        return style;
    }

    public void setStyle(MStyle style) {
        this.style = style;
    }
}

package com.elixirbrew.jceciliano.elixirbrew.models.Beer;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by jceciliano on 21/12/16.
 */

@Parcel(Parcel.Serialization.BEAN)
public class BeersSearch {
    private int currentPage;
    private int numberOfPages;
    private int totalResults;
    private List<BeerModel> data;
    private String status;

    /**
     * Empty constructor
     */
    public BeersSearch() {
    }

    /**
     * Complete constructor
     * @param currentPage
     * @param numberOfPages
     * @param totalResults
     * @param data
     * @param status
     */
    public BeersSearch(int currentPage, int numberOfPages, int totalResults, List<BeerModel> data, String status) {
        this.currentPage = currentPage;
        this.numberOfPages = numberOfPages;
        this.totalResults = totalResults;
        this.data = data;
        this.status = status;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<BeerModel> getData() {
        return data;
    }

    public void setData(List<BeerModel> data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

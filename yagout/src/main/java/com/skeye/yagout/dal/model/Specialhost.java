package com.skeye.yagout.dal.model;

public class Specialhost {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specialhost.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specialhost.HostName
     *
     * @mbggenerated
     */
    private String hostname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specialhost.Description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column specialhost.BeCount
     *
     * @mbggenerated
     */
    private Integer becount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column specialhost.ID
     *
     * @return the value of specialhost.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column specialhost.ID
     *
     * @param id the value for specialhost.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column specialhost.HostName
     *
     * @return the value of specialhost.HostName
     *
     * @mbggenerated
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column specialhost.HostName
     *
     * @param hostname the value for specialhost.HostName
     *
     * @mbggenerated
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column specialhost.Description
     *
     * @return the value of specialhost.Description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column specialhost.Description
     *
     * @param description the value for specialhost.Description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column specialhost.BeCount
     *
     * @return the value of specialhost.BeCount
     *
     * @mbggenerated
     */
    public Integer getBecount() {
        return becount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column specialhost.BeCount
     *
     * @param becount the value for specialhost.BeCount
     *
     * @mbggenerated
     */
    public void setBecount(Integer becount) {
        this.becount = becount;
    }
}
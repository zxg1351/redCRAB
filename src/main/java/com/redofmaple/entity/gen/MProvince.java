package com.redofmaple.entity.gen;

import java.io.Serializable;

public class MProvince implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_province.id
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_province.province_id
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    private String provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_province.m_province_name
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    private String mProvinceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_province
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_province.id
     *
     * @return the value of m_province.id
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_province.id
     *
     * @param id the value for m_province.id
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_province.province_id
     *
     * @return the value of m_province.province_id
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_province.province_id
     *
     * @param provinceId the value for m_province.province_id
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_province.m_province_name
     *
     * @return the value of m_province.m_province_name
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    public String getmProvinceName() {
        return mProvinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_province.m_province_name
     *
     * @param mProvinceName the value for m_province.m_province_name
     *
     * @mbggenerated Sat Oct 21 16:21:25 CST 2017
     */
    public void setmProvinceName(String mProvinceName) {
        this.mProvinceName = mProvinceName == null ? null : mProvinceName.trim();
    }
}
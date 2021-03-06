package com.jzh.news.entity;

import com.jzh.news.entity.tb_domain;
import com.jzh.news.entity.tb_domainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tb_domainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    long countByExample(tb_domainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int deleteByExample(tb_domainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String domainid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int insert(tb_domain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int insertSelective(tb_domain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    List<tb_domain> selectByExampleWithBLOBs(tb_domainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    List<tb_domain> selectByExample(tb_domainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    tb_domain selectByPrimaryKey(String domainid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") tb_domain record, @Param("example") tb_domainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") tb_domain record, @Param("example") tb_domainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") tb_domain record, @Param("example") tb_domainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(tb_domain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(tb_domain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_domain
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(tb_domain record);
}
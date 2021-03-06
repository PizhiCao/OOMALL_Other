package cn.edu.xmu.other.mapper;

import cn.edu.xmu.other.model.po.FootPrintPo;
import cn.edu.xmu.other.model.po.FootPrintPoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FootPrintPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    long countByExample(FootPrintPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int deleteByExample(FootPrintPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int insert(FootPrintPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int insertSelective(FootPrintPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    List<FootPrintPo> selectByExample(FootPrintPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    FootPrintPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FootPrintPo record, @Param("example") FootPrintPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FootPrintPo record, @Param("example") FootPrintPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FootPrintPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table foot_print
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FootPrintPo record);
}
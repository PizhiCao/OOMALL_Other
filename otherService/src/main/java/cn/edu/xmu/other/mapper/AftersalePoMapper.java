package cn.edu.xmu.other.mapper;

import cn.edu.xmu.other.model.po.AftersalePo;
import cn.edu.xmu.other.model.po.AftersalePoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AftersalePoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    long countByExample(AftersalePoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int deleteByExample(AftersalePoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int insert(AftersalePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int insertSelective(AftersalePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    List<AftersalePo> selectByExample(AftersalePoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    AftersalePo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AftersalePo record, @Param("example") AftersalePoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AftersalePo record, @Param("example") AftersalePoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AftersalePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aftersale_service
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AftersalePo record);
}
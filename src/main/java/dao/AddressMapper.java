package dao;

import pojo.Address;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librecmall_address
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librecmall_address
     *
     * @mbggenerated
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librecmall_address
     *
     * @mbggenerated
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librecmall_address
     *
     * @mbggenerated
     */
    Address selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librecmall_address
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table librecmall_address
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Address record);
}
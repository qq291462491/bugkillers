package org.bugkillers.core.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bugkillers.core.domain.CommentDO;

public interface CommentDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Delete({
        "delete from bk_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Insert({
        "insert into bk_comment (id, question_id, ",
        "user_id, comment_text, ",
        "create_time, update_time, ",
        "bk_create, bk_modified, ",
        "dr)",
        "values (#{id,jdbcType=INTEGER}, #{questionId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{commentText,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{bkCreate,jdbcType=TIMESTAMP}, #{bkModified,jdbcType=TIMESTAMP}, ",
        "#{dr,jdbcType=TINYINT})"
    })
    int insert(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    int insertSelective(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Select({
        "select",
        "id, question_id, user_id, comment_text, create_time, update_time, bk_create, ",
        "bk_modified, dr",
        "from bk_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CommentDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    int updateByPrimaryKeySelective(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_comment
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Update({
        "update bk_comment",
        "set question_id = #{questionId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "comment_text = #{commentText,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "bk_create = #{bkCreate,jdbcType=TIMESTAMP},",
          "bk_modified = #{bkModified,jdbcType=TIMESTAMP},",
          "dr = #{dr,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommentDO record);
}
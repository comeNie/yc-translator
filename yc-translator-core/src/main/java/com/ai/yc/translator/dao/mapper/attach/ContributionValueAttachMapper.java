package com.ai.yc.translator.dao.mapper.attach;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

public interface ContributionValueAttachMapper {
	
	
    @Result(property = "sumValue", column = "sumValue", javaType = Integer.class)
	@Select("select sum(contribution_value) as sumValue from usr_contribution_value where user_id = #{userId}")
	int getContributionValueSum(@Param("userId") String userId);
}

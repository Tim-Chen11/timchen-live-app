package org.timchen.live.id.generate.provider.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.timchen.live.id.generate.provider.dao.po.IdGeneratePO;

import java.util.List;

/**
 * @Author: Tim Chen
 * @Date: 13:37 2024-07-15
 * @Description:
 */
@Mapper
public interface IdGenerateMapper extends BaseMapper<IdGeneratePO> {

    @Update("update t_id_generate_config set next_threshold=next_threshold+step, current_start=current_start+step, version=version+1 where id=#{id} and version=#{version}")
    int updateNewIdCountAndVersion(@Param("id") int id, @Param("version") int version);

    @Select("select * from t_id_generate_config")
    List<IdGeneratePO> selectAll();

}

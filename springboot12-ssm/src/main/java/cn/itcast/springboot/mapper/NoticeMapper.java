package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.itcast.springboot.pojo.Notice;

@Mapper
public interface NoticeMapper {
	List<Notice> findAll();

	List<Notice> findByPage(@Param("start")int start, @Param("pageSize") Integer pageSize);

	Long countRcord();
}

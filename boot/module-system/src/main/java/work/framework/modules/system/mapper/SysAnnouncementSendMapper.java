package work.framework.modules.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import work.framework.modules.system.entity.SysAnnouncementSend;
import work.framework.modules.system.model.AnnouncementSendModel;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @Description: 用户通告阅读标记表
 * @Author: wang-yan
 * @Date:  2019-02-21
 * @Version: V1.0
 */
public interface SysAnnouncementSendMapper extends BaseMapper<SysAnnouncementSend> {

	public List<String> queryByUserId(@Param("userId") String userId);

	/**
	 * @功能：获取我的消息
	 * @param announcementSendModel
	 * @param pageSize 
	 * @param pageNo 
	 * @return
	 */
	public List<AnnouncementSendModel> getMyAnnouncementSendList(Page<AnnouncementSendModel> page,AnnouncementSendModel announcementSendModel);

}

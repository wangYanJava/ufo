package work.framework.modules.demo.test.service.impl;

import java.util.List;

import work.framework.modules.demo.test.entity.JeecgOrderTicket;
import work.framework.modules.demo.test.mapper.JeecgOrderTicketMapper;
import work.framework.modules.demo.test.service.IJeecgOrderTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 订单机票
 * @Author: wang-yan
 * @Date:  2019-02-15
 * @Version: V1.0
 */
@Service
public class JeecgOrderTicketServiceImpl extends ServiceImpl<JeecgOrderTicketMapper, JeecgOrderTicket> implements IJeecgOrderTicketService {
	@Autowired
	private JeecgOrderTicketMapper jeecgOrderTicketMapper;
	
	@Override
	public List<JeecgOrderTicket> selectTicketsByMainId(String mainId) {
		return jeecgOrderTicketMapper.selectTicketsByMainId(mainId);
	}

}

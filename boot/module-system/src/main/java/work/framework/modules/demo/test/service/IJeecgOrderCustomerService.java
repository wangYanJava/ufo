package work.framework.modules.demo.test.service;

import java.util.List;

import work.framework.modules.demo.test.entity.JeecgOrderCustomer;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 订单客户
 * @Author: wang-yan
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderCustomerService extends IService<JeecgOrderCustomer> {
	
	public List<JeecgOrderCustomer> selectCustomersByMainId(String mainId);
}

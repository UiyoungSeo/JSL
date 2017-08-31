package interceptor;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.TimerInterceptor;

public class OneInterceptor extends AbstractInterceptor {
	private static Log log = LogFactory.getLog(TimerInterceptor.class);
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Date toDay = new Date();
		log.info("OneInterceptor�� ��ó�� : ���೯¥ : " + toDay+" ms");
		
		long startTime= System.currentTimeMillis();
		String result = invocation.invoke();
		long executeTime= System.currentTimeMillis()-startTime;
		log.info("OneInterceptor�� ��ó�� : ����ð� " + executeTime+"ms");
		
		return result;
	}
}
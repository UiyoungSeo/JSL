package interceptor;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.TimerInterceptor;

public class TwoInterceptor extends AbstractInterceptor {
	private static Log log = LogFactory.getLog(TimerInterceptor.class);
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Date toDay = new Date();
		log.info("TwoInterceptor�� ��ó�� : ���೯¥ : "+toDay+" ms");
		
		long startTime=System.currentTimeMillis();
		String result = invocation.invoke();
		long executeTime=System.currentTimeMillis()-startTime;
		log.info("TwoInterceptor�� ��ó�� : ����ð� : "+executeTime+" ms");
		
		return result;
	}
}

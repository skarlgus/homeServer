package egovframework.home.cmmn.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class quartzController extends QuartzJobBean {
	
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
 				
 		int random = (int)(Math.random()*100+1);
 		
 		System.out.println("====================================");
 		System.out.println("exampleJob......" + random);
 		System.out.println("mail 수신자 조회 로직 실행");
 		System.out.println("mail 전송 로직 실행");
 		System.out.println("====================================");
 		 		
 	}

}

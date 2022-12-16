package pe.gob.config.client.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyRefreshEventListener implements ApplicationListener<RefreshScopeRefreshedEvent> {

	@Override
	public void onApplicationEvent(RefreshScopeRefreshedEvent event) {		
		log.info("/refresh is called..");
	}

}

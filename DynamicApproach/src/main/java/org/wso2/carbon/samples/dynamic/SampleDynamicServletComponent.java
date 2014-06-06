package org.wso2.carbon.samples.dynamic;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

import javax.servlet.ServletException;

/**
 * Created by jayanga on 6/4/14.
 *
 * The Declarative Service Component for AdminService, ServerConfigurationService and ConfigurationContextService
 *
 * @scr.component name="org.wso2.carbon.samples.dynamic.SampleDynamicServletComponent"
 *                immediate="true"
 * @scr.reference name="http.service" interface="org.osgi.service.http.HttpService"
 *                cardinality="1..1" policy="dynamic"  bind="setHttpService" unbind="unsetHttpService"
 */
public class SampleDynamicServletComponent {
    private HttpService httpService = null;

    protected void activate(ComponentContext componentContext){
        System.out.println("=== SampleDynamicServletComponent activate ===");

        try {
            httpService.registerServlet("/sampledynamicservlet", new SampleDynamicServlet(), null, null);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (NamespaceException e) {
            e.printStackTrace();
        }
    }

    protected void setHttpService(HttpService httpService) {
        this.httpService = httpService;
    }

    protected void unsetHttpService(HttpService httpService) {
        this.httpService = null;
    }

}

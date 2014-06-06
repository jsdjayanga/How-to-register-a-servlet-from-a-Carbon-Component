package org.wso2.carbon.samples.xmlbased;

import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.utils.ConfigurationContextService;
import javax.servlet.ServletContext;


/**
 * Created by jayanga on 6/4/14.
 *
 * The Declarative Service Component for AdminService, ServerConfigurationService and ConfigurationContextService
 *
 * @scr.component name="org.wso2.carbon.samples.xmlbased.SampleServletComponent" immediate="true"
 * @scr.reference name="servlet.context.service"
 * interface="javax.servlet.ServletContext"
 * cardinality="1..1"
 * policy="dynamic"
 * bind="setServletContextService"
 * unbind="unsetServletContextService"
 * @scr.reference name="config.context.service"
 * interface="org.wso2.carbon.utils.ConfigurationContextService"
 * cardinality="1..1"
 * policy="dynamic"
 * bind="setConfigurationContextService"
 * unbind="unsetConfigurationContextService"
 */
public class SampleServletComponent {

    private static ServletContext servletCtx = null;
    protected static final String INJECTOR_ATTRIBUTE = "guice-injector";

    protected void activate(ComponentContext componentContext){
        System.out.println("=== SampleServletComponent activate ===");

    }

    protected void setServletContextService(ConfigurationContextService configCtx) {

    }

    protected void unsetServletContextService(ConfigurationContextService configCtx) {

    }protected void setServletContextService(ServletContext servletContext) {
        this.servletCtx = servletContext;
    }

    protected void unsetServletContextService(ServletContext servletContext) {
        servletContext.removeAttribute(INJECTOR_ATTRIBUTE);
    }

    protected void setConfigurationContextService(ConfigurationContextService configCtx) {
        //DashboardUiContext.setConfigContextService(configCtx);
    }

    protected void unsetConfigurationContextService(ConfigurationContextService configCtx) {
        //DashboardUiContext.setConfigContextService(null);
    }
}

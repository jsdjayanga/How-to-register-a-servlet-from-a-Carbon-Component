package org.wso2.carbon.samples.dynamic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jayanga on 6/4/14.
 */
public class SampleDynamicServlet extends HttpServlet {
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        System.out.println("=== SampleDynamicServlet : doGet ===");
    }

    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws javax.servlet.ServletException, java.io.IOException {
        System.out.println("=== SampleDynamicServlet : doPost ===");
    }
}

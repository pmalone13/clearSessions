package com.elliott.stash.servlet;


import javax.servlet.http.Cookie;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
		Cookie cookie = new Cookie("BITBUCKETSESSIONID", "");
		cookie.setMaxAge(0);
		cookie.setPath("/");
        resp.addCookie(cookie);
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>Session Cleared</body></html>");
    }
}
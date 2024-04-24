<%-- 
    Document   : mostrarUsuarios
    Created on : 24 abr 2024, 9:23:49
    Author     : crist
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
        <%
        List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
        int count = 1;
        for(Usuario usu: listaUsuarios){
        %>
        
        <p><b>Usuario No <%=count%></b></p>
        <p>Nombre: <%=usu.getNombre()%></p>
        <p>Correo: <%=usu.getCorreo()%></p>
        <p>Rol: <%=usu.getRol()%></p>
        <p>----------------------------</p>
        
        <%= count+= 1%>
        
        
        <% } %>
    </body>
</html>

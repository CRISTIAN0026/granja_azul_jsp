/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlladores;

import Logica.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author crist
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Cristian","cristianpaez009@gmail.com","con54eña123","admin"));
        listaUsuarios.add(new Usuario("Ramon","ramon009@gmail.com","contIIeña123","cliente"));
        listaUsuarios.add(new Usuario("Enrique","enrique009@gmail.com","coneña123","cliente"));
        listaUsuarios.add(new Usuario("Juan","juan009@gmail.com","contraseñaKl","cliente"));
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaUsuarios",listaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contraseña = request.getParameter("contraseña");
        String rol = request.getParameter("rol");
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Nombre: "+correo);
        System.out.println("Nombre: "+rol);
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

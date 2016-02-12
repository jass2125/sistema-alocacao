/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.sistema.alocacao.controller;

import io.github.jass2125.sistema.alocacao.core.actions.Action;
import io.github.jass2125.sistema.alocacao.core.util.ActionFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Classe front controladora da aplicação
 * @author Anderson Souza
 * @since 2015
 */

@WebServlet(name = "controller", urlPatterns = {"/front"})
public class FrontController extends HttpServlet {
    
    /**
     * Método que é responsável por receber e responder a todas as solicitações da aplicação
     * @param request Requisição
     * @param response Resposta
     * @throws ServletException FrontController
     * @throws IOException FrontController
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            Action action = ActionFactory.getAction(request);
            String view = action.execute(request, response);
//            request.getRequestDispatcher("").forward(request, response);
            response.sendRedirect(view);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    

}

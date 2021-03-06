/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.sistema.alocacao.core.dao;

import io.github.jass2125.sistema.alocacao.core.business.Holiday;
import java.sql.SQLException;
import java.util.List;

/**
 * Interface do DAO de feriado
 *
 * @author Anderson Souza
 * @since 2015
 */
public interface HolidayDao {

    /**
     * Metodo abstrato que adiciona um feriado
     *
     * @param holiday Holiday
     * @throws SQLException Erro de conexão com o banco de dados
     * @throws java.lang.ClassNotFoundException
     */
    public void add(Holiday holiday) throws SQLException, ClassNotFoundException;

    /**
     * Metodo abstrato que exclui um feriado pelo seu identificador
     *
     * @param idFeriado Id de feriado
     * @throws SQLException IFeriadoDao
     * @throws java.lang.ClassNotFoundException
     */
    public void delete(Long idFeriado) throws SQLException, ClassNotFoundException;

    /**
     * Metodo abstrato que edita um feriado
     *
     * @param holiday Feriado
     * @throws SQLException IFeriadoDao
     * @throws java.lang.ClassNotFoundException
     */
    public void edit(Holiday holiday) throws SQLException, ClassNotFoundException;

    /**
     * Metodo abstrato que retorna um Set de feriados
     *
     * @return list Set de feriado
     * @throws SQLException IFeriadoDao
     * @throws java.lang.ClassNotFoundException
     */
    public List<Holiday> list() throws SQLException, ClassNotFoundException;

    /**
     * Metodo abstrato que busca um feriado pelo seu identificador
     *
     * @param idHoliday Id de feriado
     * @return Feriado feriado
     * @throws SQLException IFeriadoDao
     * @throws java.lang.ClassNotFoundException
     */
    public Holiday findById(Long idHoliday) throws SQLException, ClassNotFoundException;

    /**
     *
     * @param date
     * @return
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    Holiday findByDate(String date) throws SQLException, ClassNotFoundException;

}

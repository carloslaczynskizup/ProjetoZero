package org.example.a_versaoMinima;

import java.time.LocalDate;

public class DadosVendas {
    private DadosClientes dadosClientes;
    private DadosVendedores dadosVendedores;
    private double valorTotal;
    private LocalDate dataVenda;

    public DadosVendas(DadosClientes dadosClientes, DadosVendedores dadosVendedores, double valorTotal, LocalDate dataVenda) {
        this.dadosClientes = dadosClientes;
        this.dadosVendedores = dadosVendedores;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public DadosClientes getDadosClientes() {
        return dadosClientes;
    }

    @Override
    public String toString(){

        return "DadosVendas{" +
                "dadosClientes=" + dadosClientes +
                ", dadosVendedores=" + dadosVendedores +
                ", valorTotal=" + valorTotal +
                ", dataVenda=" + dataVenda +
                '}';
    }

    public void setDadosClientes(DadosClientes dadosClientes) {
        this.dadosClientes = dadosClientes;
    }

    public DadosVendedores getDadosVendedores() {
        return dadosVendedores;
    }

    public void setDadosVendedores(DadosVendedores dadosVendedores) {
        this.dadosVendedores = dadosVendedores;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
}

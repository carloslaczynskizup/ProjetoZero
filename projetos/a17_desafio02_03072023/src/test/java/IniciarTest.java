package org.example.b_versaoMedia;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


@RunWith(MockitoJUnitRunner.class)
public class IniciarTest {

    @Mock
    private List<DadosVendas> dadosVendas;
    @InjectMocks
    private List<DadosClientes> dadosClientes;
    @InjectMocks
    private List<DadosVendedores> dadosVendedores;


    public IniciarTest() {
        Locale.setDefault(Locale.US);
        dadosVendas = new ArrayList<>();
        dadosClientes = new ArrayList<>();
        dadosVendedores = new ArrayList<>();

    }
    @Before
    public void executar() {
        MockitoAnnotations.openMocks(this);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("======= SISTEMA DE VENDAS E CADASTROS =======");
            System.out.println("1 - Iniciar Vendas");
            System.out.println("2 - Listar Vendas Realizadas");
            System.out.println("3 - Cadastro de Vendedor(a)");
            System.out.println("4 - Listar Vendedores(as)");
            System.out.println("5 - Cadastro de Clientes");
            System.out.println("6 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.println("=========================");
            System.out.println("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVenda(scanner);
                    break;
                case 2:
                    listarVendas();
                    break;
                case 3:
                    cadastrarVendedor(scanner);
                    break;
                case 4:
                    listarVendedores();
                    break;
                case 5:
                    cadastrarCliente(scanner);
                    break;
                case 6:
                    listarClientes();
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println();

        } while (opcao != 9);

        scanner.close();
    }
    @Test
    public void cadastrarVenda(Scanner scanner) {
        System.out.println("++++++++ Iniciar Venda ++++++++");
        System.out.println("Entre com o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        DadosClientes cliente = encontrarCliente(cpfCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }
        System.out.println("Entre com o CPF do vendedor: ");
        String cpfVendedor = scanner.nextLine();

        DadosVendedores vendedor = encontrarVendedor(cpfVendedor);
        if (vendedor == null) {
            System.out.println("Vendedor não encontrado!");
            return;
        }

        System.out.println("Valor da venda R$: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        LocalDate dataVenda = LocalDate.now();

        try {
            DadosVendas dadosVendas = new DadosVendas(cliente, vendedor, valor, dataVenda);
            dadosVendas.getValorTotal();
//            dadosVendas.getDadosVendedores().getCpf();
            System.out.println("Venda cadastrada!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar venda: " + e.getMessage());
        }
    }
    @Test
    private void listarVendas() {
        System.out.println("++++++++ Listar Vendas ++++++++");

        if (dadosVendas.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada!");
            return;
        }
        for (DadosVendas venda : dadosVendas) {
            System.out.println(dadosVendas.toString());
            System.out.println(venda.toString() + " - " + venda.getDataVenda() + " - " + venda.getValorTotal() + " - " + venda.getDadosClientes() + " - " + venda.getDadosVendedores());
        }
    }
    @Test
    private DadosClientes encontrarCliente(String cpf) {
        for (DadosClientes cliente : dadosClientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Test
    private DadosVendedores encontrarVendedor(String cpf) {
        for (DadosVendedores vendedor : dadosVendedores) {
            if (vendedor.getCpf().equals(cpf)) {
                return vendedor;
            }
        }
        return null;
    }

    private void cadastrarVendedor(Scanner scanner) {
        System.out.println("++++++++ Iniciar Vendedor +++++++");
        System.out.println("Entre com o Nome Completo do vendedor: ");
        String nome = scanner.nextLine();
        System.out.println("Entre com o Email do vendedor: ");
        String email = scanner.nextLine();
        System.out.println("Entre com o CPF do vendedor: ");
        String cpf = scanner.nextLine();

        try {

            if (!emailValido(email)) {
                throw new IllegalArgumentException("Email inválido!");
            }

            DadosVendedores vendedor = new DadosVendedores(nome, email, cpf);

            if (vendedorExistente(vendedor)) {
                throw new IllegalArgumentException("CPF ou e-mail já cadastrado!");
            }
            dadosVendedores.add(vendedor);
            System.out.println("Vendedor cadastrado!");


        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar vendedor: " + e.getMessage());
        }
    }
    @Test
    private boolean vendedorExistente(DadosVendedores vendedor) {
        for (DadosVendedores vendedorExistente : dadosVendedores) {
            if (vendedorExistente.getCpf().equals(vendedor.getCpf()) || vendedorExistente.getEmail().equals(vendedor.getEmail())) {
                return true;
            }
        }
        return false;
    }

    private void listarVendedores() {
        System.out.println("++++++++ Listar Vendedores ++++++");
        for (DadosVendedores vendedor : dadosVendedores) {
            System.out.println("Nome: " + vendedor.getNomeCompleto() + " - Email:  " + vendedor.getEmail() + " - CPF: " + vendedor.getCpf());
        }
    }

    private void cadastrarCliente(Scanner scanner) {

        System.out.println("++++++++ Iniciar Cliente ++++++");
        System.out.println("Entre com o Nome Completo do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Entre com o Email do cliente: ");
        String email = scanner.nextLine();
        System.out.println("Entre com o CPF do cliente: ");
        String cpf = scanner.nextLine();

        try {
            if (!emailValido(email)) {
                throw new IllegalArgumentException("Email inválido!");
            }

            DadosClientes cliente = new DadosClientes(nome, email, cpf);

            if (clienteExistente(cliente)) {
                throw new IllegalArgumentException("CPF ou e-mail já cadastrado!");
            }

            dadosClientes.add(cliente);
            System.out.println("Cliente cadastrado!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    private boolean emailValido(String email) {
        return email.contains("@");
    }

    private boolean clienteExistente(DadosClientes cliente) {
        for (DadosClientes clienteExistente : dadosClientes) {
            if (clienteExistente.getCpf().equals(cliente.getCpf()) || clienteExistente.getEmail().equals(cliente.getEmail())) {
                return true;
            }
        }
        return false;
    }


    private void listarClientes() {

        System.out.println("++++++++ Listar Clientes ++++++");
        for (DadosClientes cliente : dadosClientes) {
            System.out.println("Nome: " + cliente.getNomeCompleto() + " - Email: " + cliente.getEmail() + " - CPF: " + cliente.getCpf());
        }
    }
}

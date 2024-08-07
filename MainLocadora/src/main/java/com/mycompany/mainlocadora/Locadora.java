/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */
import java.util.ArrayList;
import java.util.Scanner;

class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Emprestimo> emprestimos;

    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;  
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarEmprestimo(Cliente cliente, Veiculo veiculo) {
        if (veiculo.isDisponivel() && (cliente instanceof PessoaJuridica || !((PessoaFisica) cliente).isTemEmprestimo())) {
            Emprestimo emprestimo = new Emprestimo(cliente, veiculo);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Não é possível realizar o empréstimo.");
        }
    }

    public void finalizarEmprestimo(Emprestimo emprestimo) {
        double valorTotal = emprestimo.finalizar();
        System.out.println("Valor total do empréstimo: R$ " + valorTotal);
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void listarVeiculos() {
        System.out.println("Veículos disponíveis:");
        for (Veiculo veiculo : veiculos) {
            if (veiculo.isDisponivel()) {
                System.out.println(veiculo);
            }
        }
    }

    public void listarClientes() {
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarEmprestimos() {
        System.out.println("Empréstimos ativos:");
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.isAtivo()) {
                System.out.println(emprestimo);
            }
        }
    }

    public void cadastrarVeiculo(Scanner scanner) {
        System.out.println("1. Popular");
        System.out.println("2. SUV");
        System.out.println("3. Luxo");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Valor da Locação: ");
        double valorLocacao = scanner.nextDouble();
        System.out.print("Valor da Multa: ");
        double valorMulta = scanner.nextDouble();

        switch (tipo) {
            case 1:
                System.out.print("Possui ar-condicionado (true/false): ");
                boolean arCondicionado = scanner.nextBoolean();
                Veiculo popular = new Popular(marca, modelo, placa, ano, valorLocacao, valorMulta, arCondicionado);
                adicionarVeiculo(popular);
                break;
            case 2:
                System.out.print("Tamanho do porta-malas: ");
                int tamanhoPortaMalasSUV = scanner.nextInt();
                scanner.nextLine();  
                System.out.print("Tipo de tração: ");
                String tipoTracao = scanner.nextLine();
                System.out.print("Tipo de combustível: ");
                String tipoCombustivel = scanner.nextLine();
                Veiculo suv = new SUV(marca, modelo, placa, ano, valorLocacao, valorMulta, tamanhoPortaMalasSUV, tipoTracao, tipoCombustivel);
                adicionarVeiculo(suv);
                break;
            case 3:
                System.out.print("Quantidade de airbags: ");
                int quantidadeAirbags = scanner.nextInt();
                System.out.print("Tamanho do porta-malas: ");
                int tamanhoPortaMalasLuxo = scanner.nextInt();
                System.out.print("Possui GPS integrado (true/false): ");
                boolean gpsIntegrado = scanner.nextBoolean();
                Veiculo luxo = new Luxo(marca, modelo, placa, ano, valorLocacao, valorMulta, quantidadeAirbags, tamanhoPortaMalasLuxo, gpsIntegrado);
                adicionarVeiculo(luxo);
                break;
            default:
                System.out.println("Tipo de veículo inválido!");
        }
    }

    public void cadastrarCliente(Scanner scanner) {
        System.out.println("1. Pessoa Física");
        System.out.println("2. Pessoa Jurídica");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                Cliente pessoaFisica = new PessoaFisica(nome, telefone, endereco, cpf);
                adicionarCliente(pessoaFisica);
                break;
            case 2:
                System.out.print("CNPJ: ");
                String cnpj = scanner.nextLine();
                System.out.print("Nome do Representante: ");
                String nomeRepresentante = scanner.nextLine();
                Cliente pessoaJuridica = new PessoaJuridica(nome, telefone, endereco, cnpj, nomeRepresentante);
                adicionarCliente(pessoaJuridica);
                break;
            default:
                System.out.println("Tipo de cliente inválido!");
        }
    }

    public void realizarEmprestimo(Scanner scanner) {
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Placa do veículo: ");
        String placaVeiculo = scanner.nextLine();

        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getNome().equals(nomeCliente)) {
                cliente = c;
                break;
            }
        }

        Veiculo veiculo = null;
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placaVeiculo) && v.isDisponivel()) {
                veiculo = v;
                break;
            }
        }

        if (cliente != null && veiculo != null) {
            realizarEmprestimo(cliente, veiculo);
        } else {
            System.out.println("Cliente ou veículo não encontrado, ou veículo não está disponível.");
        }
    }

    public void finalizarEmprestimo(Scanner scanner) {
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Placa do veículo: ");
        String placaVeiculo = scanner.nextLine();

        Emprestimo emprestimo = null;
        for (Emprestimo e : emprestimos) {
            if (e.getCliente().getNome().equals(nomeCliente) && e.getVeiculo().getPlaca().equals(placaVeiculo) && e.isAtivo()) {
                emprestimo = e;
                break;
            }
        }

        if (emprestimo != null) {
            finalizarEmprestimo(emprestimo);
        } else {
            System.out.println("Empréstimo não encontrado ou já finalizado.");
        }
    }
}

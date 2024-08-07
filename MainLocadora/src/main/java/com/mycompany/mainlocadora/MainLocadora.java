/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainlocadora;

/**
 *
 * @author joanp
 */

import java.util.Scanner;

public class MainLocadora {

     public static void main(String[] args) {
        Locadora locadora = new Locadora("Picanha Free Multimarcas", "Rua Cervejinha, 13", "1313-2222");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Finalizar empréstimo");
            System.out.println("5. Listar veículos disponíveis");
            System.out.println("6. Listar clientes cadastrados");
            System.out.println("7. Listar empréstimos ativos");
            System.out.println("8. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    locadora.cadastrarVeiculo(scanner);
                    break;
                case 2:
                    locadora.cadastrarCliente(scanner);
                    break;
                    
                case 3:
                    locadora.realizarEmprestimo(scanner);
                    break;
                case 4:
                    locadora.finalizarEmprestimo(scanner);
                    break;
                case 5:
                    locadora.listarVeiculos();
                    break;
                case 6:
                    locadora.listarClientes();
                    break;
                case 7:
                    locadora.listarEmprestimos();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}     


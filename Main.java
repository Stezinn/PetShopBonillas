import collections.Animal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            Petshop petshop = new Petshop();

            String opcao = "";
            List<Animal> animals = new ArrayList<>();
            List<Dono> donos = new ArrayList<>();
            d

            while (!opcao.equals("6")){
                opcao = JOptionPane.showInputDialog("Selecione uma opção:\n\n" +
                        "1 - Cadastrar Animal\n" +
                        "2 - Cadastrar Dono\n" +
                        "3 - Banho ou Tosa\n" +
                        "4- Calcular total ganho"+
                        "5 - Mostrar todos os animais de um Dono\n" +
                        "6 - Sair" +
                         "\n\n");

                switch (opcao) {
                    case "1":
                        String nome = JOptionPane.showInputDialog("Digite o nome:");
                        String id= JOptionPane.showInputDialog("Digite a id:");
                        String raca = JOptionPane.showInputDialog("Digite a raça:");
                        String porte= JOptionPane.showInputDialog("Digite o porte do animal (pequeno/medio/grande):");
                        String tipo = JOptionPane.showInputDialog("Digite o tipo do animal (cachorro/gato):");

                        Animal animal = new Animal(nome,raca,Integer.parseInt(id));
                        animals.add(animal);

                        break;
                    case "2":
                        nome = JOptionPane.showInputDialog("Digite o nome:");
                        id= JOptionPane.showInputDialog("Digite a id:");

                        Dono dono = new Dono(nome,Integer.parseInt(id));
                        donos.add(dono);

//                        break;
//                    case "3":
//
//                        break;
                  case "4":
                      Petshop.calcularTotalGanho(animals);
                       break;
//
//                        }
//                        String nomeRemover = JOptionPane.showInputDialog("Digite o nome de quem você irá remover: ");
//                        boolean achei = false;
//                        for (Pessoa pessoa1 : animal){
//                            if(pessoa1.getNome().equals(nomeRemover)){
//                                achei = true;
//                                animal.remove(pessoa1);
//                                JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso.");
//                                break;
//                            }
//                        }
//                        if(!achei){
//                            JOptionPane.showMessageDialog(null, "Não encontramos nenhuma pessoa com esse nome.");
//                        }
//                        break;
//                    case "5":
//                        JOptionPane.showMessageDialog(null, animal);
//                        break;
                    case "6":
                        System.out.println("Obrigado, volte sempre!");
                        System.exit(0);
                    default:
                    System.out.println("Opção inválida. Tente novamente.");

//                    default:
//                        JOptionPane.showMessageDialog(null,
//                                "Você digitou uma opção inválida!");
                        break;
                }
            }
        }
}
//            petshop.inicializarSistema();

//    ENUNCIADO DA PROVA
//    OKKKKKKK---Tenho um petshop e preciso de um sistema para ajudar na organização dos meus processos. Meu petshop precisa gerenciar informações dos pets e de seus respectivos donos, bem como os banhos e tosas que realizo.
//    Meu petshop realiza banho e tosa em cachorros e gatos. OKKKKKKK
//   OKKKKKKK --- Deve ser possível cadastrar um id e um nome para o pet. Além disso, se o pet for cachorro, poderemos cadastrar a raça e o porte dele (pequeno, médio ou grande). Já se o pet for gato, deve ser possível registrar se ele solta pelos ou não.
//    Sobre os donos, preciso cadastrar um id, um nome e uma lista dos seus pets.   ESTOU NESSA PARTE
//    Um dono pode ter vários pets, mas um pet deve pertencer a apenas um dono.
//    Deve ser possível listar todos os donos de pet do meu petshop.LISTAR TODOS OS DONOS  Também preciso listar todos os pets de um determinado dono pelo id do dono. Listar todos os pets de todos os donos não é necessário.
//    Preciso cadastrar os banhos e tosas que realizo.  O banho e tosa de um cachorro custa de acordo com o porte dele. Porte pequeno custa 20 reais, porte médio custa 40 reais e porte grande custa 60 reais. Se o cachorro for da raça pitbull, eu cobro um adicional de 10 reais, por causa do risco que ele me oferece. Já o banho e tosa de um gato, se ele não solta pelos, custa 20 reais, e se ele soltar pelos custa 30 reais, pois tenho que usar um shampoo anti-queda que é mais caro.
//    Por fim, preciso conseguir ver quantos reais eu ganhei com todos os banhos e tosas que realizei.
//    Preciso ter um menu para poder acessar as funcionalidades.
//    NãO PRECISA USAR BANCO DE DADOS, MAS SE QUISEREM PODEM USAR



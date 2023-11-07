import collections.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Petshop {

    private int banho;
    private int tosa;




        public void ListaDeanimais (){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
    }

    static void calcularTotalGanho(List<Animal> animais) {
        double totalGanho = 0;

        for (Animal animal : animais) {
            double precoBase = 0;
            if (animal != null && animal.getTipo() != null)
            if (animal.getTipo().equalsIgnoreCase("cachorro")) {
                if (animal.porte.equalsIgnoreCase("pequeno")) {
                    precoBase = 20;
                } else if (animal.porte.equalsIgnoreCase("medio")) {
                    precoBase = 40;
                } else if (animal.porte.equalsIgnoreCase("grande")) {
                    precoBase = 60;
                }

                if (animal.getRaca().equalsIgnoreCase("pitbull")) {
                    precoBase += 10;
                }
            } else if (animal.getTipo().equalsIgnoreCase("gato")) {
                if (animal.getRaca().equalsIgnoreCase("pelos")) {
                    precoBase = 30;
                } else {
                    precoBase = 20;
                }
            }

            totalGanho += precoBase;
        }

        System.out.println("Total ganho com banhos e tosas: R$" + totalGanho);
    }


     public int getBanho() {
        return banho;
    }

    public void setBanho(int banho) {
        this.banho = banho;
    }

    public int getTosa() {
        return tosa;
    }

    public void setTosa(int tosa) {
        this.tosa = tosa;
    }



//        }
//    ENUNCIADO DA PROVA
//    OKKKKKKK---Tenho um petshop e preciso de um sistema para ajudar na organização dos meus processos. Meu petshop precisa gerenciar informações dos pets e de seus respectivos donos, bem como os banhos e tosas que realizo.
//    Meu petshop realiza banho e tosa em cachorros e gatos. OKKKKKKK
//   OKKKKKKK --- Deve ser possível cadastrar um id e um nome para o pet. Além disso, se o pet for cachorro, poderemos cadastrar a raça e o porte dele (pequeno, médio ou grande). Já se o pet for gato, deve ser possível registrar se ele solta pelos ou não.
//    Sobre os donos, preciso cadastrar um id, um nome e uma lista dos seus pets.
//    Um dono pode ter vários pets, mas um pet deve pertencer a apenas um dono.
//    Deve ser possível listar todos os donos de pet do meu petshop. Também preciso listar todos os pets de um determinado dono pelo id do dono. Listar todos os pets de todos os donos não é necessário.
//    Preciso cadastrar os banhos e tosas que realizo. O banho e tosa de um cachorro custa de acordo com o porte dele. Porte pequeno custa 20 reais, porte médio custa 40 reais e porte grande custa 60 reais. Se o cachorro for da raça pitbull, eu cobro um adicional de 10 reais, por causa do risco que ele me oferece. Já o banho e tosa de um gato, se ele não solta pelos, custa 20 reais, e se ele soltar pelos custa 30 reais, pois tenho que usar um shampoo anti-queda que é mais caro.
//    Por fim, preciso conseguir ver quantos reais eu ganhei com todos os banhos e tosas que realizei.
//    Preciso ter um menu para poder acessar as funcionalidades.
//    NãO PRECISA USAR BANCO DE DADOS, MAS SE QUISEREM PODEM USAR
}


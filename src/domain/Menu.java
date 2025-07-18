package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();

    public void menuText() {
        boolean i = true;

        while (i) {
            System.out.println("--- Gerenciador de Produtos ---");
            System.out.println("1. Cadastrar um produto \n2. Listar todos os produtos \n3. Atualizar dados de um produto \n4. Deletar um produto \n5. Sair");
            System.out.println("Digite sua escolha: ");
            int choice = scanner.nextInt();

            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    listAllProducts();
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public void addProduct(){
        System.out.println("Digite o nome do produto: ");
        String name = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double price = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);
        products.add(product);
    }

    public void listAllProducts(){
        for (Product product : products){
            System.out.println("ID: " + product.getProductId() + " " + "Nome: " + product.getName() + " " + "Preço: " + product.getPrice() + " " + "Quantidade: " + product.getQuantity());
        }
    }

    public void updateProductData(){
        listAllProducts();
        System.out.println("Qual o ID do produto que quer atualizar?");
        int choice = scanner.nextInt();
        scanner.nextLine();

        for (Product product : products){
            if (choice == product.getProductId()){
                System.out.println("Digite o novo nome: ");
                String name = scanner.nextLine();

                System.out.println("Digite o novo preço: ");
                double price = scanner.nextDouble();

                System.out.println("Digite a nova quantidade: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);

                System.out.println("Produto atualizado com sucesso!");
            }

            System.out.println("Produto com ID" + choice + "não encontrado");
        }
    }
}
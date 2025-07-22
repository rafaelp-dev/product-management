package domain;

import java.util.ArrayList;
import java.util.Iterator;
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

                case 3:
                    updateProductData();
                    break;

                case 4:
                    deleteProduct();
                    break;

                case 5:
                    System.out.println("Encerrado o programa...");
                    i = false;
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

        System.out.println("Produto adicionado com sucesso!");
    }

    public void listAllProducts(){
        for (Product product : products){
            System.out.println("ID: " + product.getProductId() + "\n" + "Nome: " + product.getName() + "\n" + "Preço: " + product.getPrice() + "\n" + "Quantidade: " + product.getQuantity());
        }
    }

    public void findProductId(){
        System.out.println("Digite o ID do produto: ");
        int choice = scanner.nextInt();

        for (Product product : products){
            if (product.getProductId() == choice){
                System.out.println("ID: " + product.getProductId() + "\n" + "Nome: " + product.getName() + "\n" + "Preço: " + product.getPrice() + "\n" + "Quantidade: " + product.getQuantity());
            }
        }
    }

    public void updateProductData(){
        listAllProducts();
        System.out.println("Qual o ID do produto que quer atualizar?");
        int choice = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Product product : products){
            if (product.getProductId() == choice){
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
                found = true;
                break;
            }

            if (!found){
                System.out.println("Produto com ID " + choice + " não encontrado");
            }
        }
    }

    public void deleteProduct() {
        listAllProducts();
        System.out.println("Digite o ID do produto que deseja deletar: ");
        int choice = scanner.nextInt();

        boolean removed = false;

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId() == choice) {
                iterator.remove(); // forma segura de remover durante iteração
                System.out.println("Produto removido com sucesso.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Produto com ID " + choice + " não encontrado.");
        }
    }

}
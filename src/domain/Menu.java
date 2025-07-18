package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();

    public void menuText(){
        System.out.println("--- Gerenciador de Produtos ---");
        System.out.println("1. Cadastrar um produto \n2. Listar todos os produtos \n3. Atualizar dados de um produto \n4. Deletar um produto \n5. Sair");
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
            System.out.println(product.getProductId() + " " + product.getName() + " " + product.getPrice() + " " + product.getQuantity());
        }
    }

}
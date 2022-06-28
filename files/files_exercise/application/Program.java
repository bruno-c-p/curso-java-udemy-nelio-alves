package files.files_exercise.application;

import files.files_exercise.model.entities.Product;
import utils.Messages;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        /*
        Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, prego unitario e quantidade, separados por virgula. Vocé
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (pregco unitdrio multiplicado pela ¢guantidade),
conforme exemplo.
         */

        List<Product> products = new ArrayList<>();
        String path = "C:\\estudo\\JAVA - UDEMY - NELIO ALVES\\files\\products.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {

                String[] productInfo = line.split(",");
                products.add(new Product(productInfo[0], Double.parseDouble(productInfo[1]), Double.parseDouble(productInfo[2])));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        File filePath = new File(path);
        new File(filePath.getParent() + "\\out").mkdir();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath.getParent() + "\\out\\summary.csv"))) { //true to add

            for (Product product : products) {
                bw.write(product.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

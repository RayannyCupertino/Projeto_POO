package br.inatel.cdg.database.helpers;
import br.inatel.cdg.database.create.Create;
import br.inatel.cdg.database.exceptions.InvalidPriceException;

import java.util.Objects;
import java.util.Scanner;

public class CreateItem {

    public void createBrownie(){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Entre com as informações do brownie: Nome, preço, tipo, quantidade" +
                    " separando cada uma por espaço");
            String brownieName = scanner.nextLine();
            String brownieValue = scanner.nextLine();
            String brownieType = scanner.nextLine();
            String brownieQuantity = scanner.nextLine();
            System.out.println(brownieValue);
            if(!Objects.equals(brownieValue, "0")) {
                Create criar = new Create(brownieName, Double.parseDouble(brownieValue), brownieType,
                        Integer.parseInt(brownieQuantity));
                criar.getInfo();
            }
            else {
                throw new InvalidPriceException("O preço do produto não pode ser 0");
            }
        } catch (InvalidPriceException e){
            System.out.println(e.getMessage());
        }
    }
}

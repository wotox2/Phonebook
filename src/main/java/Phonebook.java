import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    private final ArrayList<Person> contracts;

    public Phonebook() {
        this.contracts = new ArrayList<>();
    }

    /**
     * A Simple function to add a new contract
     * @param contract is the Person that we created and just adding it
     */
    public void addContract(Person contract){
        contracts.add(contract);
    }

    /**
     * @param name is The name of the contract who we are looking for
     * if we found the contract who we were looking for, we show the information
     * @return 1 if we found contract and 0 if we couldn't find it
    */
    public int readContract(String name){
        for (Person contract : contracts) {
            if (contract == null)
                return 0;
            else if (Objects.equals(contract.getName(), name)) {
                System.out.println(contract);
                return 1;
            }
        }
        return 0;
    }

    /**
     * A simple function to update our contract name
     * @param name is the name of the contract who we want to change
     * @param newName is the new name of that contract
     * @return 1 if changing was successful and 0 if it missed
     */
    public int updateContractName(String name, String newName){
        for (Person contract : contracts) {
            if (contract == null)
                return 0;
            else if (Objects.equals(contract.getName(), name)) {
                contract.setName(newName);
                return 1;
            }
        }
        return 0;
    }
    /**
     * A simple function to update our contract name
     * @param name is the name of the contract who we want to change
     * @param newPhone is the new phone number of that contract
     * @return 1 if changing was successful and 0 if it missed
     */
    public int updateContractPhoneNumber(String name, String newPhone){
        for (Person contract : contracts) {
            if (contract == null)
                return 0;
            else if (Objects.equals(contract.getName(), name)) {
                contract.setPhone(newPhone);
                return 1;
            }
        }
        return 0;
    }

    /**
     * A function to delete a specific contract from phonebook
     * @param name is the name of that contract
     * @return 1 if deleting was successful and 0 if it wasn't
     */
    public int deleteContract(String name){
        for (Person contract: contracts) {
            if (contract == null)
                return 0;
            if(Objects.equals(contract.getName(), name)){
                contracts.remove(contract);
                return 1;
            }
        }
        return 0;
    }

    /**
     * As a security part of this phonebook, we created this function
     * here we can hide all contracts at once
     */
    public void setAllContractsHidden(){
        for (Person contract: contracts) {
            if(contract == null)
                return;
            contract.setHidden();
        }

    }
    /**
     * As a security part of this phonebook, we created this function
     * here we can make all contracts unhidden at once
     */
    public void setAllContractsUnHidden(){
        for (Person contract: contracts){
            if(contract == null)
                return;
            contract.setUnHidden();
        }
    }
}

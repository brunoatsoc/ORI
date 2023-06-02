import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        List<String> strSet = new ArrayList<String>();
        List<String> strInconsiderate = new ArrayList<String>();
        List<String> strQuery = new ArrayList<String>();
        int countFilesSet = readFile(strSet, "conjunto.txt");
        int countFilesinconsiderate = readFile(strInconsiderate, "desconsideradas.txt");
        int coutFilesQuery = readFile(strQuery, "consulta.txt");

        for(int i = 0; i < strSet.size(); i++){
            System.out.printf("%s\n", strSet.get(i));
        }

        for(int i = 0; i < strInconsiderate.size(); i++){
            System.out.println(strInconsiderate.get(i));
        }

        for(int i = 0; i < strQuery.size(); i++){
            System.out.println(strQuery.get(i));
        }
    }

    //Faz a leitura do arquivo e retorna a quantidade de linhas que ele tem
    public static int readFile(List<String> str, String fileName) throws IOException{
        Scanner scn = new Scanner(new FileReader(fileName));
        String string;
        int i = 0;

        while(scn.hasNext()){
            string = removeSpace(scn.next());
            str.add(string);
            i++;
        }

        return i;
    }//Fim readFile

    public static String removeSpace(String S){
        return S.replace(" ", "");
    }
}
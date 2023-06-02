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

        List<List<String>> strBaseFile = new ArrayList<List<String>>();

        for(int i = 0; i < countFilesSet; i++){
            List<String> s = new ArrayList<String>();
            readFile(s, strSet.get(i));
            strBaseFile.add(s);
        }

        for(List l : strBaseFile){
            for()
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

    //Remove os espaços da String
    public static String removeSpace(String S){
        return S.replace(" ", "");
    }//Fim removeSpace
}
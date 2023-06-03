//Importa as Classes que vamos usar no programa
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

//Classe Principal
public class Main{
    //Metodo main
    public static void main(String[] args) throws IOException{
        List<String> strSet = new ArrayList<String>(); //Lista para guardar os dados do arquivo de conjuntos(conjunto.txt)
        List<String> strInconsiderate = new ArrayList<String>(); //Lista para guardadar os dados do arquivo desconsiderados(desconsideradas.txt)
        List<String> strQuery = new ArrayList<String>(); //Lista para guardar os dados do arquivo de consulta(consulta.txt)
        int countFilesSet = readFile(strSet, "conjunto.txt"); //Faz a leitura dos arquivo conjunto.txt
        int countFilesinconsiderate = readFile(strInconsiderate, "desconsideradas.txt"); //Faz a leitura dos arquivo desconsideradas.txt
        int coutFilesQuery = readFile(strQuery, "consulta.txt"); //Faz a leitura dos arquivo desconsideradas.txt
        int[] count = new int[countFilesSet]; //Array para guardar a quantidade de palavras dos arquivos do arquivo conjunto.txt

        List<List<String>> strBaseFile = new ArrayList<List<String>>(); //Lista para guardar os arquivos que estão na lista conjunto.txt

        //faz a leitura do aqruivo conjunto.txt
        for(int i = 0; i < countFilesSet; i++){
            List<String> s = new ArrayList<String>();
            count[i] = readFile(s, strSet.get(i)); //Aqui o algoritmo lê um arquivo e salva o numero de palavras dele novetor count
            strBaseFile.add(s); //Adicio na lista de listas
        }

        //Imprime todas as palavras dos arquivos que estão em conjunto.txt
        for(int i = 0; i < countFilesSet; i++){
            for(int j = 0; j < count[i]; j++){
                System.out.printf("%s\n", strBaseFile.get(i).get(j)); //Desse jeito podemos acessar os indices da lista de listas, get(i) é um arquivo e get(j) é uma palavra do arquivo
            }
            System.out.printf("\n");
        }
    }//Fim main

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

        return i; //Retorna o numero de palavras do arquivo
    }//Fim readFile

    //Remove os espaços da String
    public static String removeSpace(String S){
        return S.replace(" ", "");
    }//Fim removeSpace

    //Metodo para remover caracteres especiais(replace() remove um caractere da string)
    public static String removeSpecialCharacter(String S){
        S = S.replace(".", "");
        S = S.replace(",", "");
        
        return S;
    }//Fim removeSpecialCharacter
}//Fim Classe Principal
// Sort the Words Starter      A+CR
import java.util.ArrayList;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

class Main {
  
	static ArrayList<String> wordList;	

  //add the 3 methods from the MergeSort program and change the methods to work for an ArrayList of Strings instead of int values




	
	// loadData() imports the data from 'data.txt' and adds each word to the ArrayList, wordList
	public static void loadData(){
		try{
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null){
				wordList.add(line);
				line = br.readLine();
			}
			br.close();
			fr.close();
		}catch(IOException e2){}
	}



	public static void main(String[] args) {
		// wordList is the data structure to be sorted
		wordList = new ArrayList<String>();

		// loadData() imports the data.txt to the wordList
		loadData();

    // call mergeSort() method with appropriate argument



    //print the first 50 words in the sorted ArrayList


  }
}
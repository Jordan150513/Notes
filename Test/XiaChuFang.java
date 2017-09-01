import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class XiaChuFang{
	public static void main(String args[]){
		System.out.println("count ingredient:");
		countIngredient();

	}

	public static void countIngredient(){
        String fileName = "Ingredients.txt";
        try (FileReader fr = new FileReader(fileName)) {
            try (BufferedReader bfr = new BufferedReader(fr)) {

                String line = null;

                Set<String> ingredientSet = new HashSet<String>();
                HashMap<String,Integer> ingredientMap = new HashMap<String,Integer>();

                while ((line = bfr.readLine()) != null) {
                	System.out.println(line);

                    String[] ingredientArr = line.split(" ");
                    System.out.println(ingredientArr.toString()+" "+ingredientArr.length);
                    
                    for (int i = 0;i<ingredientArr.length;i++){

                        ingredientSet.add(ingredientArr[i]);

                        Integer count = 0;
                        if (ingredientMap.size()>0) {
                        	System.out.println(ingredientMap.size());
                        	
                        	try{
                        		// count == null Exception 
                        		count =  ingredientMap.get(ingredientArr[i]);
                        		System.out.println("count :"+count);
                        		count = count==null?0:count;
                        	}catch(Exception e){
                        		count = 0;
                        	}
                        	
                        }
                       // map Exception
                        ingredientMap.put(ingredientArr[i],count+1);
                        System.out.println("ingredientMap.size:");
                        System.out.println(ingredientMap.size());
                    }

                }
                System.out.println("result:");

                System.out.println("ingredientSet.size:"+ingredientSet.size());
                System.out.println(ingredientSet.toString());
                
                System.out.println("ingredientMap.size:"+ingredientMap.size());
                System.out.println(ingredientMap);

            }catch (Exception e){
        	System.out.println("Exception 1");
            System.out.println(e.getMessage());
        }

        }catch (Exception e){
        	System.out.println("Exception 2");
            System.out.println(e.getMessage());
        }

}
}
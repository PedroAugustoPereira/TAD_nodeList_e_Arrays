public class App{
    public static void main(String[] args){
        long startTime, endTime, elapsed;
        int intValue = 0;
        boolean booleanValue = false;
        ListArrayOfIntegers listArray;
        LinkedListOfIntegers listOfIntegers;
        
        
        /*
         * método que constrói uma lista de tamanho size.
         * ListArrayOfIntegers (int size):
         */
        System.out.println("=== MÉTODO CONSTRUTOR ===");
        //ListArrayOfIntegers:
        startTime = System.nanoTime();
        listArray =  new ListArrayOfIntegers(5000);
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)));
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        listOfIntegers = new LinkedListOfIntegers();
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)));
        /*=============================================================================== */


        /*
         * método que adiciona um elemento no final lista
         * void add (int element):
         */
        System.out.println("\n=== MÉTODO ADD ===");
        //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            listArray.add(5);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)));
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            listOfIntegers.add(5);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)));


        /*=============================================================================== */


        //Acicionando mais valores:
        addElements(listArray, listOfIntegers);

        
        /*=============================================================================== */


        /*
         * método que adiciona um elemento na lista naposição indicada por index.
         * void add (int index , int element):
         */
        System.out.println("\n=== MÉTODO ADD COM INDEX ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            listArray.add(100, 111);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)));
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            listOfIntegers.add(100, 111);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)));
      

        /*=============================================================================== */


        /*
         * retorna o elemento da posição indicada por index
         * int get (int index):
         */
        System.out.println("\n=== MÉTODO GET ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            intValue = listArray.get(100);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);
        //LinkedListOfInteger
        startTime = System.nanoTime();
        try{
            intValue = listOfIntegers.get(100);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);

        
        /*=============================================================================== */


        /*
         * substitui o valor na posição index pelo elemento passado por parâmetro e retorna o valor antigo
         * int set (int index, int element): 
         */
        System.out.println("\n=== MÉTODO SET ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            intValue = listArray.set(50, 555);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            intValue = listOfIntegers.set(50, 555);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);

        
        /*=============================================================================== */


        /*
         * remove a primeira ocorrência do elemento passado por parâmetro e retorna true se conseguiu remover e falso caso contrário.
         * boolean remove (int element):
         */
        System.out.println("\n=== MÉTODO REMOVE ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            booleanValue = listArray.remove(555);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            booleanValue = listOfIntegers.remove(555);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);
        
        
        /*=============================================================================== */
        
        
        /*
         * remove todas as ocorrência do elemento passado por parâmetro e retorna true se conseguiu remover e falso caso contrário
         * boolean removeAll(int element)
         */
        System.out.println("\n=== MÉTODO REMOVEALL ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            booleanValue = listArray.removeAll(111);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            booleanValue = listOfIntegers.removeAll(111);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);
        
        
        /*=============================================================================== */
        

        /*
         * remove o elemento indicado por index e retorna este valor.
         * int removeByIndex (int index )
         */
        System.out.println("\n=== MÉTODO REMOVEBYINDEX ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            intValue = listArray.removeByIndex(78);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            intValue = listOfIntegers.removeByIndex(78);;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);


        /*=============================================================================== */
        

        /*
         * retorna true se a lista está vazia e false caso contrário
         * boolean isEmpty ( )
         */
        System.out.println("\n=== MÉTODO ISEMPTY ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            booleanValue = listArray.isEmpty();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            booleanValue = listOfIntegers.isEmpty();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);


        /*=============================================================================== */
                

        /*
         * retorno a tamanho (quantidade de itens) da lista.
         * int getSize ( )
         */
        System.out.println("\n=== MÉTODO GETSIZE ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            intValue = listArray.getSize();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            intValue = listOfIntegers.getSize();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);


        /*=============================================================================== */
                        

        /*
         * retorna true se o elemento está na lista e false caso contrário.
         * boolean contains (int element):
         */
        System.out.println("\n=== MÉTODO CONTAINS ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            booleanValue = listArray.contains(125);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            booleanValue = listOfIntegers.contains(125);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + booleanValue);


        /*=============================================================================== */
                                

        /*
         * retorna o índice da primeira ocorrência do elemento
         * int indexOf (int element)
         */
        System.out.println("\n=== MÉTODO INDEXOF ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            intValue = listArray.indexOf(125);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            intValue = listOfIntegers.indexOf(125);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)) + "\tRetorno: " + intValue);


        /*=============================================================================== */
                                        
        
        /*
         * limpa a lista.
         * void clear ( )
         */
        System.out.println("\n=== MÉTODO CLEAR ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            listArray.clear();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)));
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{
            listOfIntegers.clear();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)));


        /*=============================================================================== */
       

        //Acicionando mais valores:
        listArray.add(0);
        listOfIntegers.add(0);
        addElements(listArray, listOfIntegers);
        

        /*=============================================================================== */

        
        /*
         * ordena a lista do maior para o menor elemento
         * void sort()
         */
        System.out.println("\n=== MÉTODO SORT ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            listArray.sort();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)));
        //LinkedListOfInteger:
        startTime = System.nanoTime();
        try{  
            listOfIntegers.sort();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)));

        
        /*=============================================================================== */


        /*
         * inverte a ordem da lista.
         * void reverse()
         */
        System.out.println("\n=== MÉTODO REVERSE ===");
         //ListArrayOfIntegers:
        startTime = System.nanoTime();
        try{
            listArray.reverse();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)));
        //LinkedListOfInteger:
         startTime = System.nanoTime();
        try{  
            listOfIntegers.reverse();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)));

        
        /*=============================================================================== */


        /*
         *  retorna um ListArrayOfIntegers apenas com os itens entre start(inclusive) e end(exclusive).
         * ListArrayOfIntegers getSubset(int start, int end):
         */
        System.out.println("\n=== MÉTODOS LISTARRAYOFINTERGERS E LINKEDLISTOFINTEGERS ===");
         //ListArrayOfIntegers:
        ListArrayOfIntegers response = null;
        startTime = System.nanoTime();
        try{
            response = listArray.getSubset(100, 199);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("ListArrayOfIntegers: " + ((double)(elapsed / 1000.0)));
        //LinkedListOfInteger:
        LinkedListOfIntegers responseLinked = null;
        startTime = System.nanoTime();
        try{  
            responseLinked = listOfIntegers.getSubset(100, 199);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();
        elapsed = (endTime - startTime);
        System.out.println("LinkedListOfIntegers: " + ((double)(elapsed / 1000.0)));
    
    }



    public static void addElements(ListArrayOfIntegers listArray, LinkedListOfIntegers listOfIntegers) {
        for(int i = 1 ; i < 200 ; i++){
            listArray.add(i);
            listOfIntegers.add(i);
        }
    }
}
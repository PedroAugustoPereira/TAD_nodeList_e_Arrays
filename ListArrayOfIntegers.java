public class ListArrayOfIntegers{
    private static final Integer INITIAL_SIZE = 5;
    private Integer[] data;
    private Integer count;

    /**
     * Construtor da lista.
     */
    public ListArrayOfIntegers() {
        this(INITIAL_SIZE);
    }

    /**
     * Construtor da lista.
     * @param tam tamanho inicial a ser alocado para data[]
     */
    public ListArrayOfIntegers(int tam) {
        if (tam <= 0) {
            tam = INITIAL_SIZE;
        }
        this.data = new Integer[tam];
        this.count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista.
     * @param e elemento a ser adicionado
     */
    public void add(Integer e){
        if(this.count == this.data.length){
            throw new ArrayIndexOutOfBoundsException("Array está cheio");
        }

        this.data[count] = e;
        this.count++;
    }

    /**
     * Adiciona um valor indicado por parametro em um indice também indicado por parametro, a lista deve empurar os elementos para frente
     * @param e elemento a ser adicionado
     * @param index indice do novo elemento
     */
    public void add(int index, Integer e){
        if(index < 0 || index >= this.count){
            throw new ArrayIndexOutOfBoundsException("Indice inválido");
        }

        if(this.count == this.data.length){
            throw new ArrayIndexOutOfBoundsException("Array está cheio");
        }

        if(index == this.count){
            this.data[index] = e;
            return;
        }

        for(Integer i = count -1 ; i >= index ; i--){
            this.data[i + 1] = this.data[i];
        }

        this.data[index] = e;
        this.count++;
    }


    /**
     * Método retorna um valor correspondente ao indice indicado por parametro, e dispara um erro caso o indice não exista na lista
     * @param index indice do elemento a ser retornado
     */
    public Integer get(int index){
        if(index < 0 || index >= this.count){
            throw new ArrayIndexOutOfBoundsException("Indice inválido");
        }
        
        return this.data[index];
    }


    /**
     * Método que coloca um novo valor em um indice especifico da lista, caso o indice exista
     * @param index indice do elemento a ser editado
     * @param element novo valor para o indice da lista
     */
    public int set(int index, Integer element){
        if(index < 0 || index >= this.count){
            throw new ArrayIndexOutOfBoundsException("Indice inválido");
        }

        int aux = this.data[index];
        this.data[index] = element;

        return aux;
    }


    /**
     * Método que verifica se o valor existe na lista, remove sua primeira aparição, e reorganiza a lista, retornando true ou false
     * @param element element a ser removido da lista
     */
    public boolean remove(Integer element){
        for(int i = 0 ; i < this.count ; i++){
            if(element.equals(this.data[i])){
                for(int j = i ; j < count -1 ; j++){
                    this.data[j] = data[j + 1];
                }
                
                this.data[this.count - 1] = null;
                this.count--;
                return true;
            }
        }

        return false;
    }


     /**
     * Método que verifica se o valor existe na lista, remove todas as suas aparições, e reorganiza a lista, retornando true ou false
     * @param element element a ser removido da lista
     */
    public boolean removeAll(Integer element){
        boolean searched = false;
        int validIndex = 0;
        int newCount = 0;


        for(int i = 0 ; i < this.count ; i++){
            if(!element.equals(this.data[i])){
               this.data[validIndex] = this.data[i];
               validIndex++; 
            }
            else{
                searched = true;
                newCount++;
            }
        }

        count -= newCount;

        return searched;
    }

    /**
    * Método que verifica o index, e remove o elemento da lista, retornando o mesmo
    * @param index indice do elemento a ser removido
    */
    public int removeByIndex(int index){
        if(index < 0 || index >= this.count){
            throw new ArrayIndexOutOfBoundsException("Indice inválido");
        }
        int element = data[index];

        for(int i = index ; i < this.count ; i++){
           data[i] = data[i + 1];
        }

        count--;
        return element;
    }

    /**
    * Método que retorna false caso o Array esteja vázio, e true caso tenha algo
    */
    public boolean isEmpty() {
        return this.count == 0 ? true : false;
    }

    /**
    * Método que retorna o tamanho de espaços ocupados no array
    */
    public int getSize(){
        return count;
    }

    /**
    * Método que verifica se o elemento está presente no array, retornando true caso esteja, e false caso não
    * @param element  - elemento a ser verificado
    */
    public boolean contains(Integer element){
        for(int i = 0; i < count; i++){
            if(element.equals(data[i])){
                return true;
            }
        }

        return false;
    }


    /**
    * Método que retorna o indice da primeira ocorrência de um elemento desejado, ou um erro caso não seja encontrado
    * @param element  - elemento que é procurado dentro do array
    */
    public int indexOf(Integer element){
        for(int i = 0 ; i < count ; i++){
            if(element.equals(data[i])){
                return i;
            }
        }

        throw new ArrayIndexOutOfBoundsException("O elemento não está na lista");
    }


    /**
    * Método que limpa a lista
    */
    public void clear(){
        int  length = this.data.length;
        this.data = null;
        data = new Integer[length];
        count = 0;
    }


    /**
    * Método que reorganiza a lista do maior para o menor elemento
    */
    public void sort(){
        if(this.count == 0){
            throw new ArrayIndexOutOfBoundsException("O array não possui nenhum elemento");
        }
        else if(count == 1){
            return;
        }

        for(int i = 0; i < count ; i++){
            for(int j = 0 ; j < count - 1 ; j++){
                if(data[j] < data[j + 1]){
                    int aux = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = aux;
                }
            }
        }
    }


    /**
    * Inverte a ordem dos elementos da lista
    */
    public void reverse(){
        int aux;  
        int maxIndex = count -1; 

        for(int i = 0 ; i < count / 2 ; i++){ 
            aux = this.data[maxIndex - i]; 
            this.data[maxIndex - i] = this.data[i];
            this.data[i] = aux; 
        }
    }


    /**
    * Método que retorna uma nova lista de inteiros com array, apartir de um indice inical e um final
    * @param start  - indice onde a lista inicia, inclusive ele
    * @param end - indice onde a lista termina, sem ser incluido
    */
    public ListArrayOfIntegers getSubset(int start, int end){
        if(start < 0 || start > count || end < 0 || end > count){
            throw new ArrayIndexOutOfBoundsException("Indices inválidos");
        }

        if(end < start){
            throw new ArrayIndexOutOfBoundsException("O indice final é menor que o inicial");
        }

        if(count == 0){
            throw new ArrayIndexOutOfBoundsException("A lista está vázia");
        }

        ListArrayOfIntegers response = new ListArrayOfIntegers(end - start);

        for(int i = start ; i < end; i++){
            response.add(this.data[i]);
        }

        return response;
    }
}
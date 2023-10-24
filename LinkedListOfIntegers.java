  public class LinkedListOfIntegers {

  private Node tail;
  private Node head;
  private int count = 0;
  
  /**
   * Construtor da lista de nós 
   */
  public LinkedListOfIntegers() {
    this.head = null;
    this.tail = null;
    this.count = 0;
  }

  /**
   * Adiciona um elemento ao final da lista
   * @param element elemento a ser adicionado 
   */
  public void add(int element) {
    Node aux = new Node(element);

    if (this.head == null) {
      this.head = aux;
    } else {
      this.tail.next = aux;
    }
    
    this.tail = aux;
    this.count++;
  }

  /**
   * Adiciona um elemento na lista com base no indice passado
   * @param index posição escolhida na lista
   * @param element elemento a ser adicionado
   */
  public void add(int index, int element) {
    if (index < 0 || index > this.count) {
      throw new IndexOutOfBoundsException("Fora dos limites da lista");
    }

    Node newNode = new Node(element);

    if (index == 0) {
      newNode.next = this.head;
      this.head = newNode;
    } else {
      Node previousNode = this.head;
      for (int i = 0; i < index-1; i++) {
        previousNode = previousNode.next;
      }

      newNode.next = previousNode.next;
      previousNode.next = newNode;
      
      if (index == count) {
        tail = newNode;
      }
    }

    this.count++;
  }

  /**
   * Retorna um elemento da lista com base no índice do mesmo
   * @param index posição do elemento na lista
   */
  public int get(int index) {
    if (index < 0 || index >= this.count) {
      throw new IndexOutOfBoundsException("Fora dos limites da lista");
    }

    Node aux = this.head;

    int c = 0;
    while (c < index) {
      aux = aux.next;
      c++;
    }

    return aux.element;
  }

  /**
   * Substitui o valor antigo que está na posição index, e retorna o valor antigo
   * @param index posição do elemento que será editado
   * @param element elemento que irá substituir o antigo
   */
  public int set(int index, int element) {
    if (index < 0 || index >= this.count) {
      throw new IndexOutOfBoundsException("Fora dos limites da lista");
    }

    Node aux = this.head;

    int c = 0;
    while (c < index) {
      aux = aux.next;
      c++;
    }

    int oldElement = aux.element;
    aux.element = element;

    return oldElement;
  }

  /**
   * Remove a primeira ocorrência a se encontrada de um elemento específico da lista, e retorna um status de sucesso
   * @param element elemento que será removido
   */
  public boolean remove(int element) {
    if (this.count == 0) return false;

    Node currentNode = this.head;
    Node previousNode = null;

    while (currentNode != null) {
      if (currentNode.element == element) {
        if (previousNode == null) {
          this.head = currentNode.next;
          if (this.head == null) {
            this.tail = null;
          }
        } else {
          previousNode.next = currentNode.next;
          if (currentNode == this.tail) {
            this.tail = previousNode;
          }
        }
        
        this.count--;
        return true; 
      }

      previousNode = currentNode;
      currentNode = currentNode.next;
    }

    return false;
  }

  /**
   * Remove todas as ocorrências de um elemento na lista, e retorna um status de sucesso
   * @param element elemento para remover as ocorrências na lista
   */
  public boolean removeAll(int element) {
    boolean toRemove = true;
    int removed = 0;

    while(toRemove) {
      toRemove = this.remove(element);
      if (toRemove) removed++;
    }

    return (removed > 0);
  }

  /**
   * Remove umm elemento com base no seu indice e o retorna
   * @param index indice do elemento a ser removido
   */
  public int removeByIndex(int index) {
    if (index < 0 || index >= this.count) {
      throw new IndexOutOfBoundsException("Fora dos limites da lista");
    }

    int element = this.get(index);

    boolean removed = this.remove(element);
    if (!removed) return -1;
    
    return element;
  }

  /**
   * Retorna um valor boleando referente a lista estar vazia ou não
   */
  public boolean isEmpty() {
    return (this.count == 0);
  }

  /**
   * Retorna o tamanho da lista, com base na quantidade de elementoos atuais
   */
  public int getSize() {
    return this.count;
  }


  /**
   * Verifica se o elemento está presente na lista, retorna um boleano como resposta
   * @param element elemento para procurar na lista
   */
  public boolean contains(int element){
    if(count == 0){
        throw new ArrayIndexOutOfBoundsException("Erro: a lista está vázia");
    }

    if(this.tail.element == element){
        return true;
    }

    Node aux = head;

    while(aux != null) {
        if (aux.element.equals(element)) {
            return true;
        }
        aux = aux.next;
    }
    return false;   
}

/**
 * Retorna o índice da primeira ocorrência do elemento
 * @param element elemento para buscar índice
 */
public int indexOf(Integer element){
    if(count == 0){
        throw new ArrayIndexOutOfBoundsException("Erro: a lista está vázia");
    }
    
    Node aux = head;

    for(int i = 0 ; i < count ; i++){
        if(aux.element.equals(element)){
            return i; 
        }

        aux = aux.next;
    }

    return -1;
}

/**
 * Esvazia a lista
 */
public void clear(){
    head = null;
    tail = null;
    count = 0;
}

/**
 * Ordena a lista do maior para o menor valor
 */
public void sort(){
    if (count <= 1) {
        return;
    }

    Node current = head;

    while (current != null) {
        Node minNode = current;
        Node temp = current.next;

        while (temp != null) {
            if (temp.element > minNode.element) {
                minNode = temp;
            }
            temp = temp.next;
        }

        int tempValue = current.element;
        current.element = minNode.element;
        minNode.element = tempValue;

        current = current.next;
    }
}

/**
 * Inverte a ordem dos elementos na lista
 */
public void reverse(){
    if(this.count == 0){
        throw new ArrayIndexOutOfBoundsException("O array não possui nenhum elemento");
    }
    else if(count == 1){
        return;
    }

    Node prev = null;
    Node aux = head;
    Node next;

    tail = head; 

    while (aux != null) {
        next = aux.next; 
        aux.next = prev;
        prev = aux;
        aux = next;
    }

    head = prev; 
}

/**
 * Retorna um nova lista encadeada com os elementos de uma faixa selecionada
 * @param start índice do inicio de corte da lista
 * @param end índice do fim de corte da lista
 */
public LinkedListOfIntegers getSubset(int start, int end){
    if(this.count == 0){
        throw new ArrayIndexOutOfBoundsException("O array não possui nenhum elemento");
    }

    if(end < start){
        throw new ArrayIndexOutOfBoundsException("O indice final é menor que o inicial");
    }

    if(count == 0){
        throw new ArrayIndexOutOfBoundsException("A lista está vázia");
    }

    LinkedListOfIntegers response = new LinkedListOfIntegers();
    int countIndex = 0;
    Node aux = head;

    while(aux != null){
        if(countIndex >= start && countIndex < end){
            response.add(aux.element);
        }
        countIndex++;
        aux = aux.next;
    }

    return response;
}

/**
 * Classe que represena os nós(node) da lista encadeada   
 */
private class Node {
    public Integer element;
    public Node next;

    public Node(int element, Node next) {
      this.element = element;
      this.next = next;
    }

    public Node(int element) {
      this(element, null);
    }
  }

}
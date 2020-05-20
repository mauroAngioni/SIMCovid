public class Umani {
    private Umano head;
    private Umano tail;

//Proprietà lista
    public void HeadInsert(bool malato) {
        Umano n = new Umano(malato);
        if (head != null) {
            n.setLink(head);
            head = n;
        }
        else {
            head = n;
            head = tail;
        }
    }
    public void TailInsert(bool malato) {
        Umano n = new Umano(malato);
        if (tail != null) {
            tail.setLink(n);
            tail = n;
        }
        else {
            tail = n;
            head = tail;
        }
    }
    public void PositionInsert(String malato,int i) {
        Umano a = head;
        int j = 0;
        while(j <i-1) {
            a = a.getLink();
            j++;
        }
        Umano n = new Umano(malato);
        n.setLink(a.getLink());
        a.setLink(n);
    }
    public void Stampa(){
        Umano a = head;
        System.out.println(a.getmalato());
    }
//Proprietà umani
}

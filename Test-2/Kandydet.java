

public class Kandydet implements Cloneable, Comparable<Kandydet>{

            private String nazwa;
            private int wiek;
            private String wyksztalcenie;
            private int latadoswiadczenia;


        public String getNazwa() { return nazwa; }
        public int getWiek() { return wiek;}
        public String getWyksztalcenie() {return wyksztalcenie;}
        public int getLatadoswiadczenia() {return latadoswiadczenia;}

        public void setNazwa(String nazwa) {this.nazwa = nazwa;}
        public void setWiek(int wiek) {this.wiek = wiek;}
        public void setWyksztalcenie(String wyksztalcenie) {this.wyksztalcenie = wyksztalcenie;}
        public void setLatadoswiadczenia(int latadoswiadczenia) {this.latadoswiadczenia = latadoswiadczenia;}



    public Kandydet(String nazwa, int wiek, String wyksztalcenie, int lataDoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcenie = wyksztalcenie;
        this.latadoswiadczenia = lataDoswiadczenia;
    }
    public int compareTo(Kandydet k) {
        int compared = 0;

        if(this.wyksztalcenie.equals("mistrzowie") ){
            if(k.wyksztalcenie.equals("licencjat"))
                compared+=1000;
        }


        if(this.wyksztalcenie.equals("licencjat")){
            if(k.wyksztalcenie.equals("mistrzowie")){
                compared-=500;
            }
        }


        if(this.wiek > k.wiek)
            compared+=100;

        if(this.wiek < k.wiek)
            compared-=100;

        if(this.latadoswiadczenia > k.latadoswiadczenia)
            compared+=10;

        if(this.latadoswiadczenia < k.latadoswiadczenia)
            compared -=10;


        return compared;
    }



}






public class Movie {
        private String title;
        private String studio;
        private String rating;
        public Movie(String title,String studio,String rating){
            this.title=title;
            this.studio=studio;
            this.rating=rating;
        }

        public Movie(String title,String studio){
            this.title=title;
            this.studio=studio;
            this.rating="PG";
        }
     public  static Movies[] getPg(Movies[] movies){
            Movies[] pdRatedMoies=new Movies[movies.length];
            int i=0;
            for(Movies m:movies){
        if(m.rating.equals("PG")){
            pgRatedMOvies[i]=m;
            i=i+1;
        }
        }
    }
        public static void main(String args[]){
            Movie m=new Movie("Casino Royale","Eon Productions","PG-13");
            System.out.println(m.title);
    }
}
